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
    val __obj = js.Dynamic.literal(done = done, metadata = metadata, name = name, response = response)
  
    __obj.asInstanceOf[SuccessfulOperation]
  }
}

