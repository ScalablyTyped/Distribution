package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeFieldListActions event.
  */
trait ASPxClientReportDesignerCustomizeFieldListActionsEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the current item's available actions.
    */
  var Actions: js.Array[_]
  /**
    * Specifies the Field List's item that is currently being processed.
    */
  var Item: js.Any
}

object ASPxClientReportDesignerCustomizeFieldListActionsEventArgs {
  @scala.inline
  def apply(Actions: js.Array[_], Item: js.Any): ASPxClientReportDesignerCustomizeFieldListActionsEventArgs = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeFieldListActionsEventArgs]
  }
}

