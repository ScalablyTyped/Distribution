package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientReportDesignerCustomizeFieldListActionsEventArgs extends ASPxClientEventArgs {
  var Actions: js.Array[js.Object]
  var Item: js.Object
}

object ASPxClientReportDesignerCustomizeFieldListActionsEventArgs {
  @scala.inline
  def apply(Actions: js.Array[js.Object], Item: js.Object): ASPxClientReportDesignerCustomizeFieldListActionsEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Actions")(Actions)
    __obj.updateDynamic("Item")(Item)
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeFieldListActionsEventArgs]
  }
}

