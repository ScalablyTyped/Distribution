package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSessionEntityTypeRequest extends js.Object {
  var parent: java.lang.String
  var sessionEntityType: SessionEntityType
}

object CreateSessionEntityTypeRequest {
  @scala.inline
  def apply(parent: java.lang.String, sessionEntityType: SessionEntityType): CreateSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal(parent = parent, sessionEntityType = sessionEntityType)
  
    __obj.asInstanceOf[CreateSessionEntityTypeRequest]
  }
}

