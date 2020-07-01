package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  var action: js.UndefOr[StorageClass] = js.native
  var condition: js.UndefOr[Age] = js.native
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

