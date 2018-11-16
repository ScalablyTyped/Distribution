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
  
  val SegmentBounds: SegmentBounds with java.lang.String = js.native
  val SegmentPath: SegmentPath with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.LabelRelativeMode with java.lang.String
  ] = js.native
}

