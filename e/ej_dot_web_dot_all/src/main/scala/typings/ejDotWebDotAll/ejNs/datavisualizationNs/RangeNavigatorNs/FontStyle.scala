package typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.FontStyle")
@js.native
object FontStyle extends js.Object {
  //string
  @js.native
  sealed trait Bold extends FontStyle
  
  //string
  @js.native
  sealed trait Italic extends FontStyle
  
  //string
  @js.native
  sealed trait Normal extends FontStyle
  
  /* 1 */ val Bold: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.FontStyle.Bold with Double = js.native
  /* 2 */ val Italic: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.FontStyle.Italic with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.FontStyle.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
}

