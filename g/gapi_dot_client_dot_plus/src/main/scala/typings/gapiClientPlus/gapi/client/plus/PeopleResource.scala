package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlus.anon.Collection
import typings.gapiClientPlus.anon.Language
import typings.gapiClientPlus.anon.MaxResults
import typings.gapiClientPlus.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeopleResource extends js.Object {
  /** Get a person's profile. If your app uses scope https://www.googleapis.com/auth/plus.login, this method is guaranteed to return ageRange and language. */
  def get(request: Oauthtoken): Request[Person] = js.native
  /** List all of the people in the specified collection. */
  def list(request: Collection): Request[PeopleFeed] = js.native
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: MaxResults): Request[PeopleFeed] = js.native
  /** Search all public profiles. */
  def search(request: Language): Request[PeopleFeed] = js.native
}

object PeopleResource {
  @scala.inline
  def apply(
    get: Oauthtoken => Request[Person],
    list: Collection => Request[PeopleFeed],
    listByActivity: MaxResults => Request[PeopleFeed],
    search: Language => Request[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[PeopleResource]
  }
  @scala.inline
  implicit class PeopleResourceOps[Self <: PeopleResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Oauthtoken => Request[Person]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Collection => Request[PeopleFeed]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setListByActivity(value: MaxResults => Request[PeopleFeed]): Self = this.set("listByActivity", js.Any.fromFunction1(value))
    @scala.inline
    def setSearch(value: Language => Request[PeopleFeed]): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}

