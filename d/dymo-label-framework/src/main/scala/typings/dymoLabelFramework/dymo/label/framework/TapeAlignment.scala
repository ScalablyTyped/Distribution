package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TapeAlignment with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 1 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

