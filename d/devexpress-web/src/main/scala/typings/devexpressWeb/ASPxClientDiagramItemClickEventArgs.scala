package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ItemClick and ItemDblClick events.
  */
trait ASPxClientDiagramItemClickEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets an object that provides information about an item (DiagramShape or DiagramConnector) related to the event.
    */
  var item: DiagramItem
}
object ASPxClientDiagramItemClickEventArgs {
  
  inline def apply(item: DiagramItem): ASPxClientDiagramItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramItemClickEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDiagramItemClickEventArgs] (val x: Self) extends AnyVal {
    
    inline def setItem(value: DiagramItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
