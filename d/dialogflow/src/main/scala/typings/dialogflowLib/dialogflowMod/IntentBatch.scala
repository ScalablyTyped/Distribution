package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntentBatch extends js.Object {
  var intents: js.Array[Intent]
}

object IntentBatch {
  @scala.inline
  def apply(intents: js.Array[Intent]): IntentBatch = {
    val __obj = js.Dynamic.literal(intents = intents)
  
    __obj.asInstanceOf[IntentBatch]
  }
}

