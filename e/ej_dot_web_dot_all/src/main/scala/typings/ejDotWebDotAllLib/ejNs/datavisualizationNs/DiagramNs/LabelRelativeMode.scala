package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelRelativeMode extends js.Object

@JSGlobal("ej.datavisualization.Diagram.LabelRelativeMode")
@js.native
object LabelRelativeMode extends js.Object {
  //Sets the relativeMode as SegmentBounds
  @js.native
  sealed trait SegmentBounds
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelRelativeMode
  
  //Sets the relativeMode as SegmentPath
  @js.native
  sealed trait SegmentPath
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelRelativeMode
  
  /* 1 */ val SegmentBounds: SegmentBounds with scala.Double = js.native
  /* 0 */ val SegmentPath: SegmentPath with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelRelativeMode with scala.Double
  ] = js.native
}

