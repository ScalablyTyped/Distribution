package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverflowType extends js.Object

@JSGlobal("ej.datavisualization.Diagram.OverflowType")
@js.native
object OverflowType extends js.Object {
  //Set overflow Type  as Clip
  @js.native
  sealed trait Clip
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.OverflowType
  
  //Set overflow Type as ellipsis
  @js.native
  sealed trait Ellipsis
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.OverflowType
  
  /* 1 */ val Clip: Clip with scala.Double = js.native
  /* 0 */ val Ellipsis: Ellipsis with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.OverflowType with scala.Double
  ] = js.native
}

