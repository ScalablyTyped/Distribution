package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

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
  sealed trait AutoCut
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TapeCutMode
  
  /** Indicates to print cut marks between labels. */
  @js.native
  sealed trait ChainMarks
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TapeCutMode
  
  /* 0 */ val AutoCut: AutoCut with scala.Double = js.native
  /* 1 */ val ChainMarks: ChainMarks with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TapeCutMode with scala.Double
  ] = js.native
}

