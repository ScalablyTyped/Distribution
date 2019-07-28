package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

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
  sealed trait SegmentBounds extends LabelRelativeMode
  
  //Sets the relativeMode as SegmentPath
  @js.native
  sealed trait SegmentPath extends LabelRelativeMode
  
  /* 1 */ val SegmentBounds: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.LabelRelativeMode.SegmentBounds with Double = js.native
  /* 0 */ val SegmentPath: typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs.LabelRelativeMode.SegmentPath with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelRelativeMode with Double] = js.native
}

