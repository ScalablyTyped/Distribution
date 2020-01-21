package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlusdomains.AnonActivityIdAltCollection
import typings.gapiClientPlusdomains.AnonAltCircleIdFieldsKey
import typings.gapiClientPlusdomains.AnonAltCollectionFieldsKey
import typings.gapiClientPlusdomains.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  /** Get a person's profile. */
  def get(request: AnonAltFieldsKey): Request_[Person]
  /** List all of the people in the specified collection. */
  def list(request: AnonAltCollectionFieldsKey): Request_[PeopleFeed]
  /** List all of the people in the specified collection for a particular activity. */
  def listByActivity(request: AnonActivityIdAltCollection): Request_[PeopleFeed]
  /** List all of the people who are members of a circle. */
  def listByCircle(request: AnonAltCircleIdFieldsKey): Request_[PeopleFeed]
}

object PeopleResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsKey => Request_[Person],
    list: AnonAltCollectionFieldsKey => Request_[PeopleFeed],
    listByActivity: AnonActivityIdAltCollection => Request_[PeopleFeed],
    listByCircle: AnonAltCircleIdFieldsKey => Request_[PeopleFeed]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listByActivity = js.Any.fromFunction1(listByActivity), listByCircle = js.Any.fromFunction1(listByCircle))
  
    __obj.asInstanceOf[PeopleResource]
  }
}

