package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TapeCutMode extends StObject
/** Enumeration that specifies the tape cut mode when printing multiple labels to a Tape printer. Note: This enumeration affects multiple page print jobs only. If a one page job is printed, the tape is always cut. */
@JSGlobal("dymo.label.framework.TapeCutMode")
@js.native
object TapeCutMode extends StObject {
  
  /** Indicates to cut the tape between labels. */
  @js.native
  sealed trait AutoCut
    extends StObject
       with TapeCutMode
  
  /** Indicates to print cut marks between labels. */
  @js.native
  sealed trait ChainMarks
    extends StObject
       with TapeCutMode
}
