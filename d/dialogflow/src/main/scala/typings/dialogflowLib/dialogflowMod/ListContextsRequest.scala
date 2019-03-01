package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContextsRequest extends js.Object {
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var parent: java.lang.String
}

object ListContextsRequest {
  @scala.inline
  def apply(parent: java.lang.String, pageSize: scala.Int | scala.Double = null): ListContextsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parent")(parent)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContextsRequest]
  }
}

