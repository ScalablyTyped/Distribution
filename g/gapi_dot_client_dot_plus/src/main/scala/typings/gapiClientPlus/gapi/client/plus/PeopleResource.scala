package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlus.AnonCollection
import typings.gapiClientPlus.AnonLanguage
import typings.gapiClientPlus.AnonMaxResults
import typings.gapiClientPlus.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. If your app uses scope https://www.googleapis.com/auth/plus.login, this method is guaranteed to return ageRange and language. */
  def get(request: AnonOauthtoken): Request_[Person]
  /** List all of the people in the specified collection. */
  def list(request: AnonCollection): Request_[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: AnonMaxResults): Request_[PeopleFeed]
  /** Search all public profiles. */
  def search(request: AnonLanguage): Request_[PeopleFeed]
}

object PeopleResource {
  @scala.inline
  def apply(
    get: AnonOauthtoken => Request_[Person],
    list: AnonCollection => Request_[PeopleFeed],
    listByActivity: AnonMaxResults => Request_[PeopleFeed],
    search: AnonLanguage => Request_[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[PeopleResource]
  }
}

