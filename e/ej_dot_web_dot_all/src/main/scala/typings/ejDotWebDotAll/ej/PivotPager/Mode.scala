package typings.ejDotWebDotAll.ej.PivotPager

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("ej.PivotPager.Mode")
@js.native
object Mode extends js.Object {
  ///To set both categorical and series pager for paging.
  @js.native
  sealed trait Both extends Mode
  
  ///To set only categorical pager for paging.
  @js.native
  sealed trait Categorical extends Mode
  
  ///To set only series pager for paging.
  @js.native
  sealed trait Series extends Mode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Mode with Double] = js.native
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 1 */ @js.native
  object Categorical extends TopLevel[Categorical with Double]
  
  /* 2 */ @js.native
  object Series extends TopLevel[Series with Double]
  
}

