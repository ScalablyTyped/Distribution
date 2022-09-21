package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
@JSGlobal("ASPxClientDiagramResizeShapeEventArgs")
@js.native
open class ASPxClientDiagramResizeShapeEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramResizeShapeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramResizeShapeEventArgs class with specified settings.
    * @param shape The shape object.
    * @param newSize An object that contains the new shape size.
    * @param oldSize An object that contains the previous shape size.
    */
  def this(shape: typings.devexpressWeb.DiagramShape, newSize: Any, oldSize: Any) = this()
  
  /**
    * The new shape size in units.
    */
  /* CompleteClass */
  var newSize: Any = js.native
  
  /**
    * The previous shape size in units.
    */
  /* CompleteClass */
  var oldSize: Any = js.native
  
  /**
    * The processed shape.
    */
  /* CompleteClass */
  var shape: typings.devexpressWeb.DiagramShape = js.native
}
