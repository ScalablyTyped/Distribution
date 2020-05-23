package typings.ejWebAll.ej.datavisualization.LinearGauge

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
  
}

