package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /** The action to take. */
  var action: js.UndefOr[StorageClass] = js.undefined
  /** The condition(s) under which the action will be taken. */
  var condition: js.UndefOr[Age] = js.undefined
}

object Action {
  @scala.inline
  def apply(action: StorageClass = null, condition: Age = null): Action = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

