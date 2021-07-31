package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client events concerned with node processing, and that allow the event's processing to be passed to the server side.
  */
@JSGlobal("ASPxClientTreeViewNodeProcessingModeEventArgs")
@js.native
class ASPxClientTreeViewNodeProcessingModeEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeViewNodeProcessingModeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeViewNodeProcessingModeEventArgs class with the specified setting.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param node An ASPxClientTreeViewNode object representing the node related to the event.
    */
  def this(processOnServer: Boolean, node: typings.devexpressWeb.ASPxClientTreeViewNode) = this()
  
  /**
    * Gets a node object related to the event.
    */
  /* CompleteClass */
  var node: typings.devexpressWeb.ASPxClientTreeViewNode = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}
