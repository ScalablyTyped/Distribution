package typings
package dialogflowLib.dialogflowMod.longrunningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessfulOperation
  extends BaseOperation
     with Operation {
  @JSName("done")
  var done_SuccessfulOperation: dialogflowLib.dialogflowLibNumbers.`true`
  var response: js.Any
}

object SuccessfulOperation {
  @scala.inline
  def apply(
    done: dialogflowLib.dialogflowLibNumbers.`true`,
    metadata: js.Any,
    name: java.lang.String,
    response: js.Any
  ): SuccessfulOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[SuccessfulOperation]
  }
}

