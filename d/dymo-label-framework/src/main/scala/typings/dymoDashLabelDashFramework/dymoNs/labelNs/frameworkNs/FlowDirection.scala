package typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs

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
  
  /* 0 */ val LeftToRight: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.FlowDirection.LeftToRight with Double = js.native
  /* 1 */ val RightToLeft: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.FlowDirection.RightToLeft with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlowDirection with Double] = js.native
}

