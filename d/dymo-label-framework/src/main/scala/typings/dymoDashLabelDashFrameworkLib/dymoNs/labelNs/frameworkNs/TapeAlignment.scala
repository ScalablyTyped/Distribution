package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

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
  sealed trait Center
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TapeAlignment
  
  /** Indicates a 6mm leader and a 10mm trailer. */
  @js.native
  sealed trait Left
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TapeAlignment
  
  /** Indicates a 10mm leader and a 6mm trailer. */
  @js.native
  sealed trait Right
    extends dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TapeAlignment
  
  val Center: Center with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs.TapeAlignment with java.lang.String
  ] = js.native
}

