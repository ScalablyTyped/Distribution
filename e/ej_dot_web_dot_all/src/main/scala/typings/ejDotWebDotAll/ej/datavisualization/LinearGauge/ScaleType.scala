package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleType extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.ScaleType")
@js.native
object ScaleType extends js.Object {
  //string
  @js.native
  sealed trait Major extends ScaleType
  
  //string
  @js.native
  sealed trait Minor extends ScaleType
  
  /* 0 */ val Major: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.ScaleType.Major with Double = js.native
  /* 1 */ val Minor: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.ScaleType.Minor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScaleType with Double] = js.native
}

