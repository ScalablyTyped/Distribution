package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeFieldListActions event.
  */
@JSGlobal("ASPxClientReportDesignerCustomizeFieldListActionsEventArgs")
@js.native
open class ASPxClientReportDesignerCustomizeFieldListActionsEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientReportDesignerCustomizeFieldListActionsEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerCustomizeFieldListActionsEventArgs class with the specified settings.
    * @param item An object that specifies the item that is currently being processed. This object is assigned to the Item property.
    * @param actions Specifies the collection that contains the current item's available actions. This object is assigned to the Actions property.
    */
  def this(item: Any, actions: js.Array[Any]) = this()
  
  /**
    * Provides access to the current item's available actions.
    */
  /* CompleteClass */
  var Actions: js.Array[Any] = js.native
  
  /**
    * Specifies the Field List's item that is currently being processed.
    */
  /* CompleteClass */
  var Item: Any = js.native
}
