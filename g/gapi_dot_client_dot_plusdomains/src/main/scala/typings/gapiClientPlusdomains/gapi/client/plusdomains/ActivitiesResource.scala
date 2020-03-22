package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlusdomains.AnonActivityId
import typings.gapiClientPlusdomains.AnonAlt
import typings.gapiClientPlusdomains.AnonCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: AnonActivityId): Request_[Activity]
  /** Create a new activity for the authenticated user. */
  def insert(request: AnonAlt): Request_[Activity]
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: AnonCollection): Request_[ActivityFeed]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: AnonActivityId => Request_[Activity],
    insert: AnonAlt => Request_[Activity],
    list: AnonCollection => Request_[ActivityFeed]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ActivitiesResource]
  }
}

