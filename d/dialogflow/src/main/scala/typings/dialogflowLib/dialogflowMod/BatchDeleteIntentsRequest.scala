package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteIntentsRequest extends js.Object {
  var intents: js.Array[Intent]
  var parent: java.lang.String
}

object BatchDeleteIntentsRequest {
  @scala.inline
  def apply(intents: js.Array[Intent], parent: java.lang.String): BatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal(intents = intents, parent = parent)
  
    __obj.asInstanceOf[BatchDeleteIntentsRequest]
  }
}

