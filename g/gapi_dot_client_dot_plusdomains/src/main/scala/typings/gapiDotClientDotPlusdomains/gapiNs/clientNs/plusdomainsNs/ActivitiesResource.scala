package typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPlusdomains.Anon_ActivityId
import typings.gapiDotClientDotPlusdomains.Anon_Alt
import typings.gapiDotClientDotPlusdomains.Anon_AltCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: Anon_ActivityId): Request[Activity]
  /** Create a new activity for the authenticated user. */
  def insert(request: Anon_Alt): Request[Activity]
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: Anon_AltCollection): Request[ActivityFeed]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: Anon_ActivityId => Request[Activity],
    insert: Anon_Alt => Request[Activity],
    list: Anon_AltCollection => Request[ActivityFeed]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ActivitiesResource]
  }
}

