package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the CustomShapeCreateTemplate event.
  */
trait ASPxClientDiagramCustomShapeCreateTemplateEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Returns the template's container.
    */
  var container: Any
  
  /**
    * Gets the currently processed diagram item.
    */
  var item: DiagramShape
}
object ASPxClientDiagramCustomShapeCreateTemplateEventArgs {
  
  inline def apply(container: Any, item: DiagramShape): ASPxClientDiagramCustomShapeCreateTemplateEventArgs = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramCustomShapeCreateTemplateEventArgs]
  }
  
  extension [Self <: ASPxClientDiagramCustomShapeCreateTemplateEventArgs](x: Self) {
    
    inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setItem(value: DiagramShape): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
