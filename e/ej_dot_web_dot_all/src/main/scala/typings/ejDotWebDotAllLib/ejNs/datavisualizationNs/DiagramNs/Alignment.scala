package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.Alignment")
@js.native
object Alignment extends js.Object {
  //Used to align the label either bottom or right(after) of the connector segment
  @js.native
  sealed trait After
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Alignment
  
  //Used to align the label either top or left(before) of the connector segment
  @js.native
  sealed trait Before
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Alignment
  
  //Used to align the label at center of the connector segment
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Alignment
  
  /* 2 */ val After: After with scala.Double = js.native
  /* 0 */ val Before: Before with scala.Double = js.native
  /* 1 */ val Center: Center with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Alignment with scala.Double] = js.native
}

