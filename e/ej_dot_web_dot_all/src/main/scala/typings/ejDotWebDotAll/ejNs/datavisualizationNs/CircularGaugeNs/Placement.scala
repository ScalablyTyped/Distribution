package typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Placement extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.Placement")
@js.native
object Placement extends js.Object {
  //string
  @js.native
  sealed trait Far extends Placement
  
  //string
  @js.native
  sealed trait Near extends Placement
  
  /* 1 */ val Far: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.Placement.Far with Double = js.native
  /* 0 */ val Near: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.Placement.Near with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Placement with Double] = js.native
}

