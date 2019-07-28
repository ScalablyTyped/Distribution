package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

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
  sealed trait Geographic extends GeometryType
  
  //specifies the normal land view of map
  @js.native
  sealed trait Normal extends GeometryType
  
  /* 0 */ val Geographic: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.GeometryType.Geographic with Double = js.native
  /* 1 */ val Normal: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.GeometryType.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeometryType with Double] = js.native
}

