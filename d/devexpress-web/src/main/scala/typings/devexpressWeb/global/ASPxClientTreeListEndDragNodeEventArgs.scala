package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.EndDragNode event.
  */
@JSGlobal("ASPxClientTreeListEndDragNodeEventArgs")
@js.native
open class ASPxClientTreeListEndDragNodeEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListEndDragNodeEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides access to the parameters associated with the ASPxClientTreeList.NodeClick and ASPxClientTreeList.NodeDblClick events.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
  /**
    * Gets the processed node's key value.
    */
  /* CompleteClass */
  var nodeKey: String = js.native
  
  /**
    * Gets the target element.
    */
  /* CompleteClass */
  var targetElement: Any = js.native
}
