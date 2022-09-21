package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ItemClick and ItemDblClick events.
  */
@JSGlobal("ASPxClientDiagramItemClickEventArgs")
@js.native
open class ASPxClientDiagramItemClickEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramItemClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramItemClickEventArgs class with specified settings.
    * @param item An item object related to the event.
    */
  def this(item: typings.devexpressWeb.DiagramItem) = this()
  
  /**
    * Gets an object that provides information about an item (DiagramShape or DiagramConnector) related to the event.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.DiagramItem = js.native
}
