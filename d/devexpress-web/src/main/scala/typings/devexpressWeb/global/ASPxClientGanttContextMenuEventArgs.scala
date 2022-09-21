package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the ContextMenu event.
  */
@JSGlobal("ASPxClientGanttContextMenuEventArgs")
@js.native
open class ASPxClientGanttContextMenuEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttContextMenuEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGanttContextMenuEventArgs class with specified settings.
    * @param objectInfo Information about the right-clicked object.
    * @param htmlEvent The DHTML event object related to the processed event.
    */
  def this(objectInfo: Any, htmlEvent: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the DHTML event object that contains information about the processed event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
  /**
    * Gets information about the right-clicked object.
    */
  /* CompleteClass */
  var objectInfo: Any = js.native
}
