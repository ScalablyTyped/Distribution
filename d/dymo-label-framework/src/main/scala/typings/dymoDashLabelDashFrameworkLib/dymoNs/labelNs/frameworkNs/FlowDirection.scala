package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

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
  sealed trait LeftToRight
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.FlowDirection
  
  /** Indicates that the content flows from right to left. */
  @js.native
  sealed trait RightToLeft
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.FlowDirection
  
  val LeftToRight: LeftToRight with java.lang.String = js.native
  val RightToLeft: RightToLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.FlowDirection with java.lang.String
  ] = js.native
}

