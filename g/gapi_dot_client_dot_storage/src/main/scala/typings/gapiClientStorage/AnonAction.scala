package typings.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  /** The action to take. */
  var action: js.UndefOr[AnonStorageClass] = js.undefined
  /** The condition(s) under which the action will be taken. */
  var condition: js.UndefOr[AnonAge] = js.undefined
}

object AnonAction {
  @scala.inline
  def apply(action: AnonStorageClass = null, condition: AnonAge = null): AnonAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
}

