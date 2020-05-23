package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlus.anon.Collection
import typings.gapiClientPlus.anon.Language
import typings.gapiClientPlus.anon.MaxResults
import typings.gapiClientPlus.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. If your app uses scope https://www.googleapis.com/auth/plus.login, this method is guaranteed to return ageRange and language. */
  def get(request: Oauthtoken): Request[Person]
  /** List all of the people in the specified collection. */
  def list(request: Collection): Request[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: MaxResults): Request[PeopleFeed]
  /** Search all public profiles. */
  def search(request: Language): Request[PeopleFeed]
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
}

