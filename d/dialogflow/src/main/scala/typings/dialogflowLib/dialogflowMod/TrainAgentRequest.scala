package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainAgentRequest extends js.Object {
  var parent: java.lang.String
}

object TrainAgentRequest {
  @scala.inline
  def apply(parent: java.lang.String): TrainAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[TrainAgentRequest]
  }
}

