package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the SelectionChanged event.
  */
trait ASPxClientDiagramSelectionChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets an array of the selected items (DiagramShape or DiagramConnector objects).
    */
  var items: js.Array[DiagramItem]
}
object ASPxClientDiagramSelectionChangedEventArgs {
  
  inline def apply(items: js.Array[DiagramItem]): ASPxClientDiagramSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramSelectionChangedEventArgs]
  }
  
  extension [Self <: ASPxClientDiagramSelectionChangedEventArgs](x: Self) {
    
    inline def setItems(value: js.Array[DiagramItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DiagramItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
