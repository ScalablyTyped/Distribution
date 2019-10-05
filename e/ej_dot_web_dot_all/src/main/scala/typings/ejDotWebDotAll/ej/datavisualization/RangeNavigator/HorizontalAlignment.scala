package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Left extends HorizontalAlignment
  
  //string
  @js.native
  sealed trait Middle extends HorizontalAlignment
  
  //string
  @js.native
  sealed trait Right extends HorizontalAlignment
  
  /* 1 */ val Left: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.HorizontalAlignment.Left with Double = js.native
  /* 0 */ val Middle: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.HorizontalAlignment.Middle with Double = js.native
  /* 2 */ val Right: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.HorizontalAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalAlignment with Double] = js.native
}

