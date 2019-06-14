package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LayerType extends js.Object

@JSGlobal("ej.datavisualization.Map.LayerType")
@js.native
object LayerType extends js.Object {
  //specifies the bing type
  @js.native
  sealed trait Bing
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LayerType
  
  //specifies the geometry type
  @js.native
  sealed trait Geometry
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LayerType
  
  //specifies the osm type
  @js.native
  sealed trait Osm
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LayerType
  
  /* 2 */ val Bing: Bing with scala.Double = js.native
  /* 0 */ val Geometry: Geometry with scala.Double = js.native
  /* 1 */ val Osm: Osm with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LayerType with scala.Double] = js.native
}

