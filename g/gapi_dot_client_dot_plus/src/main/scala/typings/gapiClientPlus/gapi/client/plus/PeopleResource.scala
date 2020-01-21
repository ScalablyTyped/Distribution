package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlus.AnonActivityIdAltCollection
import typings.gapiClientPlus.AnonAltCollection
import typings.gapiClientPlus.AnonAltFieldsKey
import typings.gapiClientPlus.AnonAltFieldsKeyLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. If your app uses scope https://www.googleapis.com/auth/plus.login, this method is guaranteed to return ageRange and language. */
  def get(request: AnonAltFieldsKey): Request_[Person]
  /** List all of the people in the specified collection. */
  def list(request: AnonAltCollection): Request_[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: AnonActivityIdAltCollection): Request_[PeopleFeed]
  /** Search all public profiles. */
  def search(request: AnonAltFieldsKeyLanguage): Request_[PeopleFeed]
}

object PeopleResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsKey => Request_[Person],
    list: AnonAltCollection => Request_[PeopleFeed],
    listByActivity: AnonActivityIdAltCollection => Request_[PeopleFeed],
    search: AnonAltFieldsKeyLanguage => Request_[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[PeopleResource]
  }
}

