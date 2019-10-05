package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

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
  
  /* 3 */ val Bottom: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Bottom with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Left with Double = js.native
  /* 1 */ val Right: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Right with Double = js.native
  /* 2 */ val Top: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.OuterCustomLabelPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OuterCustomLabelPosition with Double] = js.native
}

