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
    val __obj = js.Dynamic.literal(done = done, error = error, metadata = metadata, name = name)
  
    __obj.asInstanceOf[FailedOperation]
  }
}

