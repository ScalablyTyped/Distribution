package typings.ejDotWebDotAll.ej.datavisualization.Map

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Map.LayerType.Bing
import typings.ejDotWebDotAll.ej.datavisualization.Map.LayerType.Geometry
import typings.ejDotWebDotAll.ej.datavisualization.Map.LayerType.Osm
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LayerType with Double] = js.native
  /* 2 */ @js.native
  object Bing extends TopLevel[Bing with Double]
  
  /* 0 */ @js.native
  object Geometry extends TopLevel[Geometry with Double]
  
  /* 1 */ @js.native
  object Osm extends TopLevel[Osm with Double]
  
}

