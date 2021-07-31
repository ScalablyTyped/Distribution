package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.NodeClick and ASPxClientTreeList.NodeDblClick events.
  */
@JSGlobal("ASPxClientTreeListNodeEventArgs")
@js.native
class ASPxClientTreeListNodeEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListNodeEventArgs {
  
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
}
