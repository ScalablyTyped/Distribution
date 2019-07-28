package typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TapeCutMode extends js.Object

/** Enumeration that specifies the tape cut mode when printing multiple labels to a Tape printer. Note: This enumeration affects multiple page print jobs only. If a one page job is printed, the tape is always cut. */
@JSGlobal("dymo.label.framework.TapeCutMode")
@js.native
object TapeCutMode extends js.Object {
  /** Indicates to cut the tape between labels. */
  @js.native
  sealed trait AutoCut extends TapeCutMode
  
  /** Indicates to print cut marks between labels. */
  @js.native
  sealed trait ChainMarks extends TapeCutMode
  
  /* 0 */ val AutoCut: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.TapeCutMode.AutoCut with Double = js.native
  /* 1 */ val ChainMarks: typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs.TapeCutMode.ChainMarks with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TapeCutMode with Double] = js.native
}

