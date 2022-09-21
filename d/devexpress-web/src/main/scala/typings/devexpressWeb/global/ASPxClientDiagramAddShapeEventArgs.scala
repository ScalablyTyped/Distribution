package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
@JSGlobal("ASPxClientDiagramAddShapeEventArgs")
@js.native
open class ASPxClientDiagramAddShapeEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramAddShapeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramAddShapeEventArgs class with specified settings.
    * @param shape The shape object.
    * @param position An object that contains the shape coordinates.
    */
  def this(shape: typings.devexpressWeb.DiagramShape, position: Any) = this()
  
  /**
    * A position (x- and y-coordinates) where the shape is being added.
    */
  /* CompleteClass */
  var position: Any = js.native
  
  /**
    * The processed shape.
    */
  /* CompleteClass */
  var shape: typings.devexpressWeb.DiagramShape = js.native
}
