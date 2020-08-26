package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.GoalId
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.Startindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoalsResource extends js.Object {
  /** Gets a goal to which the user has access. */
  def get(request: GoalId): Request[Goal] = js.native
  /** Create a new goal. */
  def insert(request: ProfileId): Request[Goal] = js.native
  /** Lists goals to which the user has access. */
  def list(request: Startindex): Request[Goals] = js.native
  /** Updates an existing goal. This method supports patch semantics. */
  def patch(request: GoalId): Request[Goal] = js.native
  /** Updates an existing goal. */
  def update(request: GoalId): Request[Goal] = js.native
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
  @scala.inline
  implicit class GoalsResourceOps[Self <: GoalsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: GoalId => Request[Goal]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: ProfileId => Request[Goal]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Startindex => Request[Goals]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: GoalId => Request[Goal]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: GoalId => Request[Goal]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

