package typings.gapiDotClientDotStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  /** The action to take. */
  var action: js.UndefOr[Anon_StorageClass] = js.undefined
  /** The condition(s) under which the action will be taken. */
  var condition: js.UndefOr[Anon_Age] = js.undefined
}

object Anon_Action {
  @scala.inline
  def apply(action: Anon_StorageClass = null, condition: Anon_Age = null): Anon_Action = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Action]
  }
}

