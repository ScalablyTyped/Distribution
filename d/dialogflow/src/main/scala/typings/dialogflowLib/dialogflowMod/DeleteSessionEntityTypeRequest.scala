package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSessionEntityTypeRequest extends js.Object {
  var name: java.lang.String
}

object DeleteSessionEntityTypeRequest {
  @scala.inline
  def apply(name: java.lang.String): DeleteSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DeleteSessionEntityTypeRequest]
  }
}

