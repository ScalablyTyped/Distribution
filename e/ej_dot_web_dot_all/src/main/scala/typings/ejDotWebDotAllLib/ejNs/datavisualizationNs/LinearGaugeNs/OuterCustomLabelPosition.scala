package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

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
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.OuterCustomLabelPosition
  
  /* 3 */ val Bottom: Bottom with scala.Double = js.native
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 1 */ val Right: Right with scala.Double = js.native
  /* 2 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.OuterCustomLabelPosition with scala.Double
  ] = js.native
}

