package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndicatorTypes extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.IndicatorTypes")
@js.native
object IndicatorTypes extends js.Object {
  //string
  @js.native
  sealed trait Circle extends IndicatorTypes
  
  //string
  @js.native
  sealed trait Rectangle extends IndicatorTypes
  
  //string
  @js.native
  sealed trait RoundedRectangle extends IndicatorTypes
  
  //string
  @js.native
  sealed trait Text extends IndicatorTypes
  
  /* 1 */ val Circle: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.IndicatorTypes.Circle with Double = js.native
  /* 0 */ val Rectangle: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.IndicatorTypes.Rectangle with Double = js.native
  /* 2 */ val RoundedRectangle: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.IndicatorTypes.RoundedRectangle with Double = js.native
  /* 3 */ val Text: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.IndicatorTypes.Text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndicatorTypes with Double] = js.native
}

