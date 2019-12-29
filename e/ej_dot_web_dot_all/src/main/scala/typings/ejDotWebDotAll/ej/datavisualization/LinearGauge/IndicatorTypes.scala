package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndicatorTypes with Double] = js.native
  /* 1 */ @js.native
  object Circle extends TopLevel[Circle with Double]
  
  /* 0 */ @js.native
  object Rectangle extends TopLevel[Rectangle with Double]
  
  /* 2 */ @js.native
  object RoundedRectangle extends TopLevel[RoundedRectangle with Double]
  
  /* 3 */ @js.native
  object Text extends TopLevel[Text with Double]
  
}

