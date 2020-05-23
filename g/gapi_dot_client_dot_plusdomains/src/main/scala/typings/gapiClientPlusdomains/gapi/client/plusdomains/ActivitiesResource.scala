package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlusdomains.anon.ActivityId
import typings.gapiClientPlusdomains.anon.Alt
import typings.gapiClientPlusdomains.anon.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: ActivityId): Request[Activity]
  /** Create a new activity for the authenticated user. */
  def insert(request: Alt): Request[Activity]
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: Collection): Request[ActivityFeed]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: ActivityId => Request[Activity],
    insert: Alt => Request[Activity],
    list: Collection => Request[ActivityFeed]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ActivitiesResource]
  }
}

