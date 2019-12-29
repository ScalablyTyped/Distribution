package typings.dymoDashLabelDashFramework.dymo.label.framework

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlowDirection extends js.Object

/**
	 * Emuneration that specifies the direction in which objects and object text are laid out on the label.
	 * For Middle East labels/content specify "RightToLeft", otherwise specify "LeftToRight" (default).
	 */
@JSGlobal("dymo.label.framework.FlowDirection")
@js.native
object FlowDirection extends js.Object {
  /** Indicates that the content flows from left to right. */
  @js.native
  sealed trait LeftToRight extends FlowDirection
  
  /** Indicates that the content flows from right to left. */
  @js.native
  sealed trait RightToLeft extends FlowDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlowDirection with Double] = js.native
  /* 0 */ @js.native
  object LeftToRight extends TopLevel[LeftToRight with Double]
  
  /* 1 */ @js.native
  object RightToLeft extends TopLevel[RightToLeft with Double]
  
}

