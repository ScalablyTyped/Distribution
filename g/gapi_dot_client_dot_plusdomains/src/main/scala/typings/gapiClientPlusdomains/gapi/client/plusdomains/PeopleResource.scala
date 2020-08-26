package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlusdomains.anon.Oauthtoken
import typings.gapiClientPlusdomains.anon.OrderBy
import typings.gapiClientPlusdomains.anon.PageToken
import typings.gapiClientPlusdomains.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeopleResource extends js.Object {
  /** Get a person's profile. */
  def get(request: Oauthtoken): Request[Person] = js.native
  /** List all of the people in the specified collection. */
  def list(request: OrderBy): Request[PeopleFeed] = js.native
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: PageToken): Request[PeopleFeed] = js.native
  /** List all of the people who are members of a circle. */
  def listByCircle(request: QuotaUser): Request[PeopleFeed] = js.native
}

object PeopleResource {
  @scala.inline
  def apply(
    get: Oauthtoken => Request[Person],
    list: OrderBy => Request[PeopleFeed],
    listByActivity: PageToken => Request[PeopleFeed],
    listByCircle: QuotaUser => Request[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), listByCircle = js.Any.fromFunction1(listByCircle))
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
    def setList(value: OrderBy => Request[PeopleFeed]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setListByActivity(value: PageToken => Request[PeopleFeed]): Self = this.set("listByActivity", js.Any.fromFunction1(value))
    @scala.inline
    def setListByCircle(value: QuotaUser => Request[PeopleFeed]): Self = this.set("listByCircle", js.Any.fromFunction1(value))
  }
  
}

