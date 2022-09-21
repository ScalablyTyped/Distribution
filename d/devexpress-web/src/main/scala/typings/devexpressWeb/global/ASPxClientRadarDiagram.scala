package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the RadarDiagram class.
  */
@JSGlobal("ASPxClientRadarDiagram")
@js.native
open class ASPxClientRadarDiagram ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRadarDiagram {
  
  /**
    * Converts the diagram coordinates of a point into screen coordinates. An ASPxClientControlCoordinates object, containing information about the point's X and Y coordinates, its visibility state, and the associated pane.
    * @param argument An object, representing the point's argument.
    * @param value An object, representing the point's value.
    */
  /* CompleteClass */
  override def DiagramToPoint(argument: Any, value: Any): typings.devexpressWeb.ASPxClientControlCoordinates = js.native
  
  /**
    * Converts the display coordinates into a diagram coordinates object. An ASPxClientDiagramCoordinates object, containing information about the point's argument and value, their scale types, associated axes and pane.
    * @param x An integer value, representing the X-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    * @param y An integer value, representing the Y-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    */
  /* CompleteClass */
  override def PointToDiagram(x: Double, y: Double): typings.devexpressWeb.ASPxClientDiagramCoordinates = js.native
  
  /**
    * Gets the X-axis.
    */
  /* CompleteClass */
  var axisX: typings.devexpressWeb.ASPxClientAxisBase = js.native
  
  /**
    * Gets the Y-axis.
    */
  /* CompleteClass */
  var axisY: typings.devexpressWeb.ASPxClientAxisBase = js.native
  
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
}
