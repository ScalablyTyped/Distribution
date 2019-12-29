package typings.dymoDashLabelDashFramework.dymo.label.framework

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TwinTurboRoll with Double] = js.native
  /* 2 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

