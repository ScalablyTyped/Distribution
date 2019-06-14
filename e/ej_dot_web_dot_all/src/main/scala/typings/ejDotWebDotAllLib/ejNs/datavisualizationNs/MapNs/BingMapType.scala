package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BingMapType extends js.Object

@JSGlobal("ej.datavisualization.Map.BingMapType")
@js.native
object BingMapType extends js.Object {
  //specifies the aerial type
  @js.native
  sealed trait Aerial
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.BingMapType
  
  //specifies the aerialwithlabel type
  @js.native
  sealed trait Aerialwithlabel
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.BingMapType
  
  //specifies the road type
  @js.native
  sealed trait Road
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.BingMapType
  
  /* 0 */ val Aerial: Aerial with scala.Double = js.native
  /* 1 */ val Aerialwithlabel: Aerialwithlabel with scala.Double = js.native
  /* 2 */ val Road: Road with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.BingMapType with scala.Double] = js.native
}

