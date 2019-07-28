package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

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
  sealed trait Bing extends LayerType
  
  //specifies the geometry type
  @js.native
  sealed trait Geometry extends LayerType
  
  //specifies the osm type
  @js.native
  sealed trait Osm extends LayerType
  
  /* 2 */ val Bing: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.LayerType.Bing with Double = js.native
  /* 0 */ val Geometry: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.LayerType.Geometry with Double = js.native
  /* 1 */ val Osm: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.LayerType.Osm with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LayerType with Double] = js.native
}

