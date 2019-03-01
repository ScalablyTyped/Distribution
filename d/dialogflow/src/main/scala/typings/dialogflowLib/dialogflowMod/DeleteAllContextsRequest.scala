package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAllContextsRequest extends js.Object {
  var parent: java.lang.String
}

object DeleteAllContextsRequest {
  @scala.inline
  def apply(parent: java.lang.String): DeleteAllContextsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[DeleteAllContextsRequest]
  }
}

