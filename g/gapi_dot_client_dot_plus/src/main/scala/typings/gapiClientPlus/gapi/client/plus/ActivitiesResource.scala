package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlus.anon.ActivityId
import typings.gapiClientPlus.anon.Alt
import typings.gapiClientPlus.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: ActivityId): Request[Activity]
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: Alt): Request[ActivityFeed]
  /** Search public activities. */
  def search(request: Fields): Request[ActivityFeed]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: ActivityId => Request[Activity],
    list: Alt => Request[ActivityFeed],
    search: Fields => Request[ActivityFeed]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[ActivitiesResource]
  }
}

