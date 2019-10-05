package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomLabelPositionType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.CustomLabelPositionType")
@js.native
object CustomLabelPositionType extends js.Object {
  //string
  @js.native
  sealed trait Inner extends CustomLabelPositionType
  
  //string
  @js.native
  sealed trait Outer extends CustomLabelPositionType
  
  /* 0 */ val Inner: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.CustomLabelPositionType.Inner with Double = js.native
  /* 1 */ val Outer: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.CustomLabelPositionType.Outer with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomLabelPositionType with Double] = js.native
}

