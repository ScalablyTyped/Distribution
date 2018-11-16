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
  
  val All: All with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val ShowHorizontalLines: ShowHorizontalLines with java.lang.String = js.native
  val ShowLines: ShowLines with java.lang.String = js.native
  val ShowVerticalLines: ShowVerticalLines with java.lang.String = js.native
  val SnapToHorizontalLines: SnapToHorizontalLines with java.lang.String = js.native
  val SnapToLines: SnapToLines with java.lang.String = js.native
  val SnapToVerticalLines: SnapToVerticalLines with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.SnapConstraints with java.lang.String
  ] = js.native
}

