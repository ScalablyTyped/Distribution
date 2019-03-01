package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEntityTypeRequest extends js.Object {
  var name: java.lang.String
}

object DeleteEntityTypeRequest {
  @scala.inline
  def apply(name: java.lang.String): DeleteEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DeleteEntityTypeRequest]
  }
}

