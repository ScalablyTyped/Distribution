package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LabelType")
@js.native
object LabelType extends js.Object {
  //string
  @js.native
  sealed trait Major extends LabelType
  
  //string
  @js.native
  sealed trait Minor extends LabelType
  
  /* 0 */ val Major: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LabelType.Major with Double = js.native
  /* 1 */ val Minor: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.LabelType.Minor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelType with Double] = js.native
}

