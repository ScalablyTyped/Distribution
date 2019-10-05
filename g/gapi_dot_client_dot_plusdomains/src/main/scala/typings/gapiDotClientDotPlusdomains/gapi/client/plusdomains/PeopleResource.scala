package typings.gapiDotClientDotPlusdomains.gapi.client.plusdomains

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPlusdomains.Anon_ActivityIdAltCollection
import typings.gapiDotClientDotPlusdomains.Anon_AltCircleIdFieldsKey
import typings.gapiDotClientDotPlusdomains.Anon_AltCollectionFieldsKey
import typings.gapiDotClientDotPlusdomains.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. */
  def get(request: Anon_AltFieldsKey): Request[Person]
  /** List all of the people in the specified collection. */
  def list(request: Anon_AltCollectionFieldsKey): Request[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: Anon_ActivityIdAltCollection): Request[PeopleFeed]
  /** List all of the people who are members of a circle. */
  def listByCircle(request: Anon_AltCircleIdFieldsKey): Request[PeopleFeed]
}

object PeopleResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKey => Request[Person],
    list: Anon_AltCollectionFieldsKey => Request[PeopleFeed],
    listByActivity: Anon_ActivityIdAltCollection => Request[PeopleFeed],
    listByCircle: Anon_AltCircleIdFieldsKey => Request[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), listByCircle = js.Any.fromFunction1(listByCircle))
  
    __obj.asInstanceOf[PeopleResource]
  }
}

