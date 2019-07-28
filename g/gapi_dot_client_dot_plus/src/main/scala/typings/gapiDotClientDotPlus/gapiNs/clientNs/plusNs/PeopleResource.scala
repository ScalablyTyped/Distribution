package typings.gapiDotClientDotPlus.gapiNs.clientNs.plusNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPlus.Anon_ActivityIdAltCollection
import typings.gapiDotClientDotPlus.Anon_AltCollection
import typings.gapiDotClientDotPlus.Anon_AltFieldsKey
import typings.gapiDotClientDotPlus.Anon_AltFieldsKeyLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. If your app uses scope https://www.googleapis.com/auth/plus.login, this method is guaranteed to return ageRange and language. */
  def get(request: Anon_AltFieldsKey): Request[Person]
  /** List all of the people in the specified collection. */
  def list(request: Anon_AltCollection): Request[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: Anon_ActivityIdAltCollection): Request[PeopleFeed]
  /** Search all public profiles. */
  def search(request: Anon_AltFieldsKeyLanguage): Request[PeopleFeed]
}

object PeopleResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKey => Request[Person],
    list: Anon_AltCollection => Request[PeopleFeed],
    listByActivity: Anon_ActivityIdAltCollection => Request[PeopleFeed],
    search: Anon_AltFieldsKeyLanguage => Request[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[PeopleResource]
  }
}

