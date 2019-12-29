package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelPosition with Double] = js.native
  /* 0 */ @js.native
  object Inside extends TopLevel[Inside with Double]
  
  /* 1 */ @js.native
  object Outside extends TopLevel[Outside with Double]
  
  /* 2 */ @js.native
  object OutsideExtended extends TopLevel[OutsideExtended with Double]
  
}

