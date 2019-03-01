package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSessionEntityTypesRequest extends js.Object {
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var parent: java.lang.String
}

object ListSessionEntityTypesRequest {
  @scala.inline
  def apply(parent: java.lang.String, pageSize: scala.Int | scala.Double = null): ListSessionEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parent")(parent)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSessionEntityTypesRequest]
  }
}

