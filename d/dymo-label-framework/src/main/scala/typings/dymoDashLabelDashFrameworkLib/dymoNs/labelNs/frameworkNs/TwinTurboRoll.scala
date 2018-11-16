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
  
  val Auto: Auto with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TwinTurboRoll with java.lang.String
  ] = js.native
}

