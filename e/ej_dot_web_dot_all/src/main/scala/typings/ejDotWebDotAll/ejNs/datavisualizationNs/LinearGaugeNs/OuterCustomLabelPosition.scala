package typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OuterCustomLabelPosition extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.OuterCustomLabelPosition")
@js.native
object OuterCustomLabelPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Left extends OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Right extends OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Top extends OuterCustomLabelPosition
  
  /* 3 */ val Bottom: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.OuterCustomLabelPosition.Bottom with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.OuterCustomLabelPosition.Left with Double = js.native
  /* 1 */ val Right: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.OuterCustomLabelPosition.Right with Double = js.native
  /* 2 */ val Top: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.OuterCustomLabelPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OuterCustomLabelPosition with Double] = js.native
}

