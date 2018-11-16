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
  
  val After: After with java.lang.String = js.native
  val Before: Before with java.lang.String = js.native
  val Center: Center with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.Alignment with java.lang.String
  ] = js.native
}

