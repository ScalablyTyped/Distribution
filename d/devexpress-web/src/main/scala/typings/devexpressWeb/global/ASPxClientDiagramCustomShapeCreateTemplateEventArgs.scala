package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the CustomShapeCreateTemplate event.
  */
@JSGlobal("ASPxClientDiagramCustomShapeCreateTemplateEventArgs")
@js.native
class ASPxClientDiagramCustomShapeCreateTemplateEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramCustomShapeCreateTemplateEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramCustomShapeCreateTemplateEventArgs class with specified settings.
    * @param container A container for the template.
    * @param item The diagram shape object.
    */
  def this(container: js.Any, item: typings.devexpressWeb.DiagramShape) = this()
  
  /**
    * Returns a container for an instance of the template.
    */
  /* CompleteClass */
  var container: js.Any = js.native
  
  /**
    * Gets the currently processed diagram item.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.DiagramShape = js.native
}
