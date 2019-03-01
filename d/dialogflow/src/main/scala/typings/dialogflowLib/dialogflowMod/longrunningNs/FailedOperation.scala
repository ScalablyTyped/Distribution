package typings
package dialogflowLib.dialogflowMod.longrunningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedOperation
  extends BaseOperation
     with Operation {
  @JSName("done")
  var done_FailedOperation: dialogflowLib.dialogflowLibNumbers.`true`
  var error: Status
}

object FailedOperation {
  @scala.inline
  def apply(
    done: dialogflowLib.dialogflowLibNumbers.`true`,
    error: Status,
    metadata: js.Any,
    name: java.lang.String
  ): FailedOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FailedOperation]
  }
}

