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
  
  val Aerial: Aerial with java.lang.String = js.native
  val Aerialwithlabel: Aerialwithlabel with java.lang.String = js.native
  val Road: Road with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.BingMapType with java.lang.String
  ] = js.native
}

