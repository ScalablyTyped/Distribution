package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.abort
  - typings.fridaGum.fridaGumStrings.`access-violation`
  - typings.fridaGum.fridaGumStrings.`guard-page`
  - typings.fridaGum.fridaGumStrings.`illegal-instruction`
  - typings.fridaGum.fridaGumStrings.`stack-overflow`
  - typings.fridaGum.fridaGumStrings.arithmetic
  - typings.fridaGum.fridaGumStrings.breakpoint
  - typings.fridaGum.fridaGumStrings.`single-step`
  - typings.fridaGum.fridaGumStrings.system
*/
trait ExceptionType extends js.Object

object ExceptionType {
  @scala.inline
  def abort: typings.fridaGum.fridaGumStrings.abort = this.cast("abort")
  @scala.inline
  def `access-violation`: typings.fridaGum.fridaGumStrings.`access-violation` = this.cast("access-violation")
  @scala.inline
  def arithmetic: typings.fridaGum.fridaGumStrings.arithmetic = this.cast("arithmetic")
  @scala.inline
  def breakpoint: typings.fridaGum.fridaGumStrings.breakpoint = this.cast("breakpoint")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `guard-page`: typings.fridaGum.fridaGumStrings.`guard-page` = this.cast("guard-page")
  @scala.inline
  def `illegal-instruction`: typings.fridaGum.fridaGumStrings.`illegal-instruction` = this.cast("illegal-instruction")
  @scala.inline
  def `single-step`: typings.fridaGum.fridaGumStrings.`single-step` = this.cast("single-step")
  @scala.inline
  def `stack-overflow`: typings.fridaGum.fridaGumStrings.`stack-overflow` = this.cast("stack-overflow")
  @scala.inline
  def system: typings.fridaGum.fridaGumStrings.system = this.cast("system")
}

