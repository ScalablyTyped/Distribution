package typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnitTextPlacement extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.UnitTextPlacement")
@js.native
object UnitTextPlacement extends js.Object {
  //string
  @js.native
  sealed trait Back extends UnitTextPlacement
  
  //string
  @js.native
  sealed trait Front extends UnitTextPlacement
  
  /* 0 */ val Back: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.UnitTextPlacement.Back with Double = js.native
  /* 1 */ val Front: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.UnitTextPlacement.Front with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnitTextPlacement with Double] = js.native
}

