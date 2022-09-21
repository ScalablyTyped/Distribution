package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
@JSGlobal("ASPxClientDiagramDeleteShapeEventArgs")
@js.native
open class ASPxClientDiagramDeleteShapeEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDiagramDeleteShapeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientDiagramDeleteShapeEventArgs class with specified settings.
    * @param shape The shape object.
    */
  def this(shape: typings.devexpressWeb.DiagramShape) = this()
  
  /**
    * The processed shape.
    */
  /* CompleteClass */
  var shape: typings.devexpressWeb.DiagramShape = js.native
}
