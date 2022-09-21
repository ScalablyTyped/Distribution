package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the CustomShapeCreateTemplate event.
  */
@JSGlobal("ASPxClientDiagramCustomShapeCreateTemplateEventArgs")
@js.native
open class ASPxClientDiagramCustomShapeCreateTemplateEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramCustomShapeCreateTemplateEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramCustomShapeCreateTemplateEventArgs class with specified settings.
    * @param container A container for the template.
    * @param item The diagram shape object.
    */
  def this(container: Any, item: typings.devexpressWeb.DiagramShape) = this()
  
  /**
    * Returns the template's container.
    */
  /* CompleteClass */
  var container: Any = js.native
  
  /**
    * Gets the currently processed diagram item.
    */
  /* CompleteClass */
  var item: typings.devexpressWeb.DiagramShape = js.native
}
