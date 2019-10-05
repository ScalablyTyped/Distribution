package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendPosition extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LegendPosition")
@js.native
object LegendPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends LegendPosition
  
  //string
  @js.native
  sealed trait Left extends LegendPosition
  
  //string
  @js.native
  sealed trait Right extends LegendPosition
  
  //string
  @js.native
  sealed trait Top extends LegendPosition
  
  /* 3 */ val Bottom: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendPosition.Bottom with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendPosition.Left with Double = js.native
  /* 1 */ val Right: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendPosition.Right with Double = js.native
  /* 2 */ val Top: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendPosition with Double] = js.native
}

