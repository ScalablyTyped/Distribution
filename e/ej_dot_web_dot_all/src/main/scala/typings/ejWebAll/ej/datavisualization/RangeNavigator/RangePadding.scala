package typings.ejWebAll.ej.datavisualization.RangeNavigator

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
  
}

