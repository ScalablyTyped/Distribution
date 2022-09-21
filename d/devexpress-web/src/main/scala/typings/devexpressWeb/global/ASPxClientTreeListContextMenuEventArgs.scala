package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.ContextMenu event.
  */
@JSGlobal("ASPxClientTreeListContextMenuEventArgs")
@js.native
open class ASPxClientTreeListContextMenuEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientTreeListContextMenuEventArgs {
  
  /**
    * Gets or sets whether to invoke the browser's context menu.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
  /**
    * Gets a value that identifies the right-clicked object.
    */
  /* CompleteClass */
  var objectKey: Any = js.native
  
  /**
    * Identifies which tree list element has been right-clicked.
    */
  /* CompleteClass */
  var objectType: String = js.native
}
