package typings.dymoDashLabelDashFramework.dymo.label.framework

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TapeCutMode with Double] = js.native
  /* 0 */ @js.native
  object AutoCut extends TopLevel[AutoCut with Double]
  
  /* 1 */ @js.native
  object ChainMarks extends TopLevel[ChainMarks with Double]
  
}

