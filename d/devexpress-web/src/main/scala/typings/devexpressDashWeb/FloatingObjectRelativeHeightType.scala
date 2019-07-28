package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectRelativeHeightType extends js.Object

@JSGlobal("FloatingObjectRelativeHeightType")
@js.native
object FloatingObjectRelativeHeightType extends js.Object {
  @js.native
  sealed trait BottomMargin extends FloatingObjectRelativeHeightType
  
  @js.native
  sealed trait InsideMargin extends FloatingObjectRelativeHeightType
  
  @js.native
  sealed trait Margin extends FloatingObjectRelativeHeightType
  
  @js.native
  sealed trait OutsideMargin extends FloatingObjectRelativeHeightType
  
  @js.native
  sealed trait Page extends FloatingObjectRelativeHeightType
  
  @js.native
  sealed trait TopMargin extends FloatingObjectRelativeHeightType
  
  /* 3 */ val BottomMargin: typings.devexpressDashWeb.FloatingObjectRelativeHeightType.BottomMargin with Double = js.native
  /* 4 */ val InsideMargin: typings.devexpressDashWeb.FloatingObjectRelativeHeightType.InsideMargin with Double = js.native
  /* 0 */ val Margin: typings.devexpressDashWeb.FloatingObjectRelativeHeightType.Margin with Double = js.native
  /* 5 */ val OutsideMargin: typings.devexpressDashWeb.FloatingObjectRelativeHeightType.OutsideMargin with Double = js.native
  /* 1 */ val Page: typings.devexpressDashWeb.FloatingObjectRelativeHeightType.Page with Double = js.native
  /* 2 */ val TopMargin: typings.devexpressDashWeb.FloatingObjectRelativeHeightType.TopMargin with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectRelativeHeightType with Double] = js.native
}

