package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangePadding extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.RangePadding")
@js.native
object RangePadding extends js.Object {
  //string
  @js.native
  sealed trait Additional extends RangePadding
  
  //string
  @js.native
  sealed trait None extends RangePadding
  
  //string
  @js.native
  sealed trait Normal extends RangePadding
  
  //string
  @js.native
  sealed trait Round extends RangePadding
  
  /* 0 */ val Additional: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.RangePadding.Additional with Double = js.native
  /* 2 */ val None: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.RangePadding.None with Double = js.native
  /* 1 */ val Normal: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.RangePadding.Normal with Double = js.native
  /* 3 */ val Round: typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.RangePadding.Round with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RangePadding with Double] = js.native
}

