package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelPosition extends js.Object

@JSGlobal("ej.datavisualization.Chart.LabelPosition")
@js.native
object LabelPosition extends js.Object {
  //string
  @js.native
  sealed trait Inside extends LabelPosition
  
  //string
  @js.native
  sealed trait Outside extends LabelPosition
  
  //string
  @js.native
  sealed trait OutsideExtended extends LabelPosition
  
  /* 0 */ val Inside: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelPosition.Inside with Double = js.native
  /* 1 */ val Outside: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelPosition.Outside with Double = js.native
  /* 2 */ val OutsideExtended: typings.ejDotWebDotAll.ej.datavisualization.Chart.LabelPosition.OutsideExtended with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelPosition with Double] = js.native
}

