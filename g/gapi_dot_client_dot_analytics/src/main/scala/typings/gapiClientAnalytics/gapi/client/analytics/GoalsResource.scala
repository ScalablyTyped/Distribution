package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonGoalId
import typings.gapiClientAnalytics.AnonProfileId
import typings.gapiClientAnalytics.AnonStartindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalsResource extends js.Object {
  /** Gets a goal to which the user has access. */
  def get(request: AnonGoalId): Request_[Goal]
  /** Create a new goal. */
  def insert(request: AnonProfileId): Request_[Goal]
  /** Lists goals to which the user has access. */
  def list(request: AnonStartindex): Request_[Goals]
  /** Updates an existing goal. This method supports patch semantics. */
  def patch(request: AnonGoalId): Request_[Goal]
  /** Updates an existing goal. */
  def update(request: AnonGoalId): Request_[Goal]
}

object GoalsResource {
  @scala.inline
  def apply(
    get: AnonGoalId => Request_[Goal],
    insert: AnonProfileId => Request_[Goal],
    list: AnonStartindex => Request_[Goals],
    patch: AnonGoalId => Request_[Goal],
    update: AnonGoalId => Request_[Goal]
  ): GoalsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[GoalsResource]
  }
}

