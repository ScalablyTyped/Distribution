package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.StartDragNode event.
  */
@JSGlobal("ASPxClientTreeListStartDragNodeEventArgs")
@js.native
class ASPxClientTreeListStartDragNodeEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListStartDragNodeEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides access to the parameters associated with the ASPxClientTreeList.NodeClick and ASPxClientTreeList.NodeDblClick events.
    */
  /* CompleteClass */
  var htmlEvent: js.Any = js.native
  
  /**
    * Gets the processed node's key value.
    */
  /* CompleteClass */
  var nodeKey: String = js.native
  
  /**
    * Gets an array of targets where a node can be dragged.
    */
  /* CompleteClass */
  var targets: js.Array[js.Any] = js.native
}
