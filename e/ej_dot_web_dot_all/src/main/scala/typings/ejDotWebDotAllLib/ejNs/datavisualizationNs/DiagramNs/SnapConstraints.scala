package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SnapConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.SnapConstraints")
@js.native
object SnapConstraints extends js.Object {
  //Enable all the constraints
  @js.native
  sealed trait All
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SnapConstraints
  
  //Enables node to be snapped to horizontal gridlines
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SnapConstraints
  
  //Enable horizontal lines
  @js.native
  sealed trait ShowHorizontalLines
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SnapConstraints
  
  //Enable both horizontal and vertical lines
  @js.native
  sealed trait ShowLines
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SnapConstraints
  
  //Enable vertical lines
  @js.native
  sealed trait ShowVerticalLines
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SnapConstraints
  
  //Enables node to be snapped to vertical gridlines
  @js.native
  sealed trait SnapToHorizontalLines
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SnapConstraints
  
  //Enables node to be snapped to gridlines
  @js.native
  sealed trait SnapToLines
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SnapConstraints
  
  //Enables node to be snapped to horizontal gridlines
  @js.native
  sealed trait SnapToVerticalLines
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SnapConstraints
  
  /* 7 */ val All: All with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val ShowHorizontalLines: ShowHorizontalLines with scala.Double = js.native
  /* 6 */ val ShowLines: ShowLines with scala.Double = js.native
  /* 5 */ val ShowVerticalLines: ShowVerticalLines with scala.Double = js.native
  /* 1 */ val SnapToHorizontalLines: SnapToHorizontalLines with scala.Double = js.native
  /* 3 */ val SnapToLines: SnapToLines with scala.Double = js.native
  /* 2 */ val SnapToVerticalLines: SnapToVerticalLines with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SnapConstraints with scala.Double
  ] = js.native
}

