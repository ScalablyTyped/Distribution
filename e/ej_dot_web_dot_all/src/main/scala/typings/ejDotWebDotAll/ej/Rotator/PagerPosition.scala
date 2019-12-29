package typings.ejDotWebDotAll.ej.Rotator

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PagerPosition extends js.Object

@JSGlobal("ej.Rotator.PagerPosition")
@js.native
object PagerPosition extends js.Object {
  ///string
  @js.native
  sealed trait BottomLeft extends PagerPosition
  
  ///string
  @js.native
  sealed trait BottomRight extends PagerPosition
  
  ///string
  @js.native
  sealed trait Outside extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopCenter extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopLeft extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopRight extends PagerPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PagerPosition with Double] = js.native
  /* 0 */ @js.native
  object BottomLeft extends TopLevel[BottomLeft with Double]
  
  /* 1 */ @js.native
  object BottomRight extends TopLevel[BottomRight with Double]
  
  /* 2 */ @js.native
  object Outside extends TopLevel[Outside with Double]
  
  /* 3 */ @js.native
  object TopCenter extends TopLevel[TopCenter with Double]
  
  /* 4 */ @js.native
  object TopLeft extends TopLevel[TopLeft with Double]
  
  /* 5 */ @js.native
  object TopRight extends TopLevel[TopRight with Double]
  
}

