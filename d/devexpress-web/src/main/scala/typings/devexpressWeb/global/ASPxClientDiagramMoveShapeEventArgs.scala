package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
@JSGlobal("ASPxClientDiagramMoveShapeEventArgs")
@js.native
open class ASPxClientDiagramMoveShapeEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramMoveShapeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramMoveShapeEventArgs class with specified settings.
    * @param shape The processed shape.
    * @param newPosition The new shape position (x- and y-coordinates).
    * @param oldPosition The previous shape position (x- and y-coordinates).
    */
  def this(shape: typings.devexpressWeb.DiagramShape, newPosition: Any, oldPosition: Any) = this()
  
  /**
    * The new shape position (x- and y-coordinates).
    */
  /* CompleteClass */
  var newPosition: Any = js.native
  
  /**
    * The previous shape position (x- and y-coordinates).
    */
  /* CompleteClass */
  var oldPosition: Any = js.native
  
  /**
    * The processed shape.
    */
  /* CompleteClass */
  var shape: typings.devexpressWeb.DiagramShape = js.native
}
