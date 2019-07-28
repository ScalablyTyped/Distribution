package typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TapeAlignment extends js.Object

/** Enumeration that specifies the leader and trailer for a tape label when printing to a Tape printer. */
@JSGlobal("dymo.label.framework.TapeAlignment")
@js.native
object TapeAlignment extends js.Object {
  /** Indicates a 10mm leader and a 10mm trailer. */
  @js.native
  sealed trait Center extends TapeAlignment
  
  /** Indicates a 6mm leader and a 10mm trailer. */
  @js.native
  sealed trait Left extends TapeAlignment
  
  /** Indicates a 10mm leader and a 6mm trailer. */
  @js.native
  sealed trait Right extends TapeAlignment
  
  /* 0 */ val Center: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.TapeAlignment.Center with Double = js.native
  /* 1 */ val Left: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.TapeAlignment.Left with Double = js.native
  /* 2 */ val Right: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.TapeAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TapeAlignment with Double] = js.native
}

