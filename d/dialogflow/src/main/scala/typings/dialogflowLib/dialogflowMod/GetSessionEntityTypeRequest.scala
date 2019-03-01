package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSessionEntityTypeRequest extends js.Object {
  var name: java.lang.String
}

object GetSessionEntityTypeRequest {
  @scala.inline
  def apply(name: java.lang.String): GetSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetSessionEntityTypeRequest]
  }
}

