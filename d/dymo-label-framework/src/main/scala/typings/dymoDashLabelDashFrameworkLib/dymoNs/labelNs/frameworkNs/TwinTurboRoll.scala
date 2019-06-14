package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TwinTurboRoll extends js.Object

/** Enumeration that specifies which roll to print to when printing to a Twin Turbo printer. */
@JSGlobal("dymo.label.framework.TwinTurboRoll")
@js.native
object TwinTurboRoll extends js.Object {
  /** Indicates to continue printing to the other roll when the current roll is out of paper. Note: This does not indicate which roll to print to first; printing may start on either roll. */
  @js.native
  sealed trait Auto
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TwinTurboRoll
  
  /** Indicates to print to the left roll only. */
  @js.native
  sealed trait Left
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TwinTurboRoll
  
  /** Indicates to print to the right roll only. */
  @js.native
  sealed trait Right
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TwinTurboRoll
  
  /* 2 */ val Auto: Auto with scala.Double = js.native
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 1 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TwinTurboRoll with scala.Double
  ] = js.native
}

