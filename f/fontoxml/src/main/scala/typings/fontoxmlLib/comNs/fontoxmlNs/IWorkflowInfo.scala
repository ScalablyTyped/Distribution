package typings
package fontoxmlLib.comNs.fontoxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflowInfo extends js.Object {
  var displayName: java.lang.String
  var id: java.lang.String
}

object IWorkflowInfo {
  @scala.inline
  def apply(displayName: java.lang.String, id: java.lang.String): IWorkflowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[IWorkflowInfo]
  }
}

