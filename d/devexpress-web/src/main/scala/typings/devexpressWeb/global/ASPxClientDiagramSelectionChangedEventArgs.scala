package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the SelectionChanged event.
  */
@JSGlobal("ASPxClientDiagramSelectionChangedEventArgs")
@js.native
class ASPxClientDiagramSelectionChangedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramSelectionChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramSelectionChangedEventArgs class with specified settings.
    * @param items An array of item objects.
    */
  def this(items: js.Array[typings.devexpressWeb.DiagramItem]) = this()
  
  /**
    * Gets an array of the selected items (shapes or connectors).
    */
  /* CompleteClass */
  var items: js.Array[typings.devexpressWeb.DiagramItem] = js.native
}
