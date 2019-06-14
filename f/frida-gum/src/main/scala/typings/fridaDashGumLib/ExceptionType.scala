package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.abort
  - fridaDashGumLib.fridaDashGumLibStrings.`access-violation`
  - fridaDashGumLib.fridaDashGumLibStrings.`guard-page`
  - fridaDashGumLib.fridaDashGumLibStrings.`illegal-instruction`
  - fridaDashGumLib.fridaDashGumLibStrings.`stack-overflow`
  - fridaDashGumLib.fridaDashGumLibStrings.arithmetic
  - fridaDashGumLib.fridaDashGumLibStrings.breakpoint
  - fridaDashGumLib.fridaDashGumLibStrings.`single-step`
  - fridaDashGumLib.fridaDashGumLibStrings.system
*/
trait ExceptionType extends js.Object

object ExceptionType {
  @scala.inline
  def Abort: fridaDashGumLib.fridaDashGumLibStrings.abort = this.cast("abort")
  @scala.inline
  def AccessViolation: fridaDashGumLib.fridaDashGumLibStrings.`access-violation` = this.cast("access-violation")
  @scala.inline
  def Arithmetic: fridaDashGumLib.fridaDashGumLibStrings.arithmetic = this.cast("arithmetic")
  @scala.inline
  def Breakpoint: fridaDashGumLib.fridaDashGumLibStrings.breakpoint = this.cast("breakpoint")
  @scala.inline
  def GuardPage: fridaDashGumLib.fridaDashGumLibStrings.`guard-page` = this.cast("guard-page")
  @scala.inline
  def IllegalInstruction: fridaDashGumLib.fridaDashGumLibStrings.`illegal-instruction` = this.cast("illegal-instruction")
  @scala.inline
  def SingleStep: fridaDashGumLib.fridaDashGumLibStrings.`single-step` = this.cast("single-step")
  @scala.inline
  def StackOverflow: fridaDashGumLib.fridaDashGumLibStrings.`stack-overflow` = this.cast("stack-overflow")
  @scala.inline
  def System: fridaDashGumLib.fridaDashGumLibStrings.system = this.cast("system")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

