package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlus.AnonActivityId
import typings.gapiClientPlus.AnonAlt
import typings.gapiClientPlus.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /** Get an activity. */
  def get(request: AnonActivityId): Request_[Activity]
  /** List all of the activities in the specified collection for a particular user. */
  def list(request: AnonAlt): Request_[ActivityFeed]
  /** Search public activities. */
  def search(request: AnonFields): Request_[ActivityFeed]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    get: AnonActivityId => Request_[Activity],
    list: AnonAlt => Request_[ActivityFeed],
    search: AnonFields => Request_[ActivityFeed]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[ActivitiesResource]
  }
}

