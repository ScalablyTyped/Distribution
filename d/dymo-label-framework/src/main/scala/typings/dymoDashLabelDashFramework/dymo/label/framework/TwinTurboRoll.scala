package typings.dymoDashLabelDashFramework.dymo.label.framework

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
  sealed trait Auto extends TwinTurboRoll
  
  /** Indicates to print to the left roll only. */
  @js.native
  sealed trait Left extends TwinTurboRoll
  
  /** Indicates to print to the right roll only. */
  @js.native
  sealed trait Right extends TwinTurboRoll
  
  /* 2 */ val Auto: typings.dymoDashLabelDashFramework.dymo.label.framework.TwinTurboRoll.Auto with Double = js.native
  /* 0 */ val Left: typings.dymoDashLabelDashFramework.dymo.label.framework.TwinTurboRoll.Left with Double = js.native
  /* 1 */ val Right: typings.dymoDashLabelDashFramework.dymo.label.framework.TwinTurboRoll.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TwinTurboRoll with Double] = js.native
}

