package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.GoalId
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.Startindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalsResource extends js.Object {
  /** Gets a goal to which the user has access. */
  def get(request: GoalId): Request[Goal]
  /** Create a new goal. */
  def insert(request: ProfileId): Request[Goal]
  /** Lists goals to which the user has access. */
  def list(request: Startindex): Request[Goals]
  /** Updates an existing goal. This method supports patch semantics. */
  def patch(request: GoalId): Request[Goal]
  /** Updates an existing goal. */
  def update(request: GoalId): Request[Goal]
}

object GoalsResource {
  @scala.inline
  def apply(
    get: GoalId => Request[Goal],
    insert: ProfileId => Request[Goal],
    list: Startindex => Request[Goals],
    patch: GoalId => Request[Goal],
    update: GoalId => Request[Goal]
  ): GoalsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[GoalsResource]
  }
}

