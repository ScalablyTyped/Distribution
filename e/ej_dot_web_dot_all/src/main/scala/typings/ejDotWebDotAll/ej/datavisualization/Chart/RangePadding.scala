package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RangePadding extends js.Object

@JSGlobal("ej.datavisualization.Chart.RangePadding")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RangePadding with Double] = js.native
  /* 0 */ @js.native
  object Additional extends TopLevel[Additional with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  /* 3 */ @js.native
  object Round extends TopLevel[Round with Double]
  
}

