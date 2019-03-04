package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContextRequest extends js.Object {
  var context: Context[java.lang.String, _]
  var updatemask: js.UndefOr[js.Any] = js.undefined
}

object UpdateContextRequest {
  @scala.inline
  def apply(context: Context[java.lang.String, _], updatemask: js.Any = null): UpdateContextRequest = {
    val __obj = js.Dynamic.literal(context = context)
    if (updatemask != null) __obj.updateDynamic("updatemask")(updatemask)
    __obj.asInstanceOf[UpdateContextRequest]
  }
}

