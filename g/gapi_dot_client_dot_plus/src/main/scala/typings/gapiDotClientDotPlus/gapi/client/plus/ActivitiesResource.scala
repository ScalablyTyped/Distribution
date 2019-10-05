package typings.gapiDotClientDotPlus.gapi.client.plus

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPlus.Anon_ActivityId
import typings.gapiDotClientDotPlus.Anon_Alt
import typings.gapiDotClientDotPlus.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: Anon_ActivityId): Request[Activity]
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: Anon_Alt): Request[ActivityFeed]
  /** Search public activities. */
  def search(request: Anon_AltFields): Request[ActivityFeed]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: Anon_ActivityId => Request[Activity],
    list: Anon_Alt => Request[ActivityFeed],
    search: Anon_AltFields => Request[ActivityFeed]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ActivitiesResource]
  }
}

