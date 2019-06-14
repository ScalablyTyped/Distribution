package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeometryType extends js.Object

@JSGlobal("ej.datavisualization.Map.GeometryType")
@js.native
object GeometryType extends js.Object {
  //specifies the geographic view of map
  @js.native
  sealed trait Geographic
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.GeometryType
  
  //specifies the normal land view of map
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.GeometryType
  
  /* 0 */ val Geographic: Geographic with scala.Double = js.native
  /* 1 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.GeometryType with scala.Double] = js.native
}

