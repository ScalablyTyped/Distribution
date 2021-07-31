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
    * Returns a container for an instance of the template.
    */
  var container: js.Any
  
  /**
    * Gets the currently processed diagram item.
    */
  var item: DiagramShape
}
object ASPxClientDiagramCustomShapeCreateTemplateEventArgs {
  
  @scala.inline
  def apply(container: js.Any, item: DiagramShape): ASPxClientDiagramCustomShapeCreateTemplateEventArgs = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramCustomShapeCreateTemplateEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDiagramCustomShapeCreateTemplateEventArgsMutableBuilder[Self <: ASPxClientDiagramCustomShapeCreateTemplateEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: DiagramShape): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
