package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendAlignment extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LegendAlignment")
@js.native
object LegendAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends LegendAlignment
  
  //string
  @js.native
  sealed trait Far extends LegendAlignment
  
  //string
  @js.native
  sealed trait Near extends LegendAlignment
  
  /* 0 */ val Center: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendAlignment.Center with Double = js.native
  /* 2 */ val Far: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendAlignment.Far with Double = js.native
  /* 1 */ val Near: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendAlignment.Near with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendAlignment with Double] = js.native
}

