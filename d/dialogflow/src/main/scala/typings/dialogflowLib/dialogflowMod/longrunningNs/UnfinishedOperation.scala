package typings
package dialogflowLib.dialogflowMod.longrunningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnfinishedOperation
  extends BaseOperation
     with Operation {
  @JSName("done")
  var done_UnfinishedOperation: dialogflowLib.dialogflowLibNumbers.`false`
}

object UnfinishedOperation {
  @scala.inline
  def apply(done: dialogflowLib.dialogflowLibNumbers.`false`, metadata: js.Any, name: java.lang.String): UnfinishedOperation = {
    val __obj = js.Dynamic.literal(done = done, metadata = metadata, name = name)
  
    __obj.asInstanceOf[UnfinishedOperation]
  }
}

