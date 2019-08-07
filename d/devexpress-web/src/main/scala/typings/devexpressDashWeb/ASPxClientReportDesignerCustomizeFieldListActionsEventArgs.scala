package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeFieldListActions event.
  */
@JSGlobal("ASPxClientReportDesignerCustomizeFieldListActionsEventArgs")
@js.native
class ASPxClientReportDesignerCustomizeFieldListActionsEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerCustomizeFieldListActionsEventArgs class with the specified settings.
    * @param item An object that specifies the item that is currently being processed. This object is assigned to the Item property.
    * @param actions Specifies the collection that contains the current item's available actions. This object is assigned to the Actions property.
    */
  def this(item: js.Any, actions: js.Array[_]) = this()
  /**
    * Provides access to the current item's available actions.
    */
  var Actions: js.Array[_] = js.native
  /**
    * Specifies the Field List's item that is currently being processed.
    */
  var Item: js.Any = js.native
}

