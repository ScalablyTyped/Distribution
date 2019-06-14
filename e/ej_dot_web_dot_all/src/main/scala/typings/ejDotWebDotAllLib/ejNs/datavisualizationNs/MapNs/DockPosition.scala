package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DockPosition extends js.Object

@JSGlobal("ej.datavisualization.Map.DockPosition")
@js.native
object DockPosition extends js.Object {
  //specifies the bottom position
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.DockPosition
  
  //specifies the left position
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.DockPosition
  
  //specifies the bottom position
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.DockPosition
  
  //specifies the top position
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.DockPosition
  
  /* 1 */ val Bottom: Bottom with scala.Double = js.native
  /* 3 */ val Left: Left with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  /* 0 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.DockPosition with scala.Double] = js.native
}

