package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.call
  - typings.fridaGum.fridaGumStrings.ret
  - typings.fridaGum.fridaGumStrings.exec
  - typings.fridaGum.fridaGumStrings.block
  - typings.fridaGum.fridaGumStrings.compile
*/
trait StalkerEventType extends js.Object

object StalkerEventType {
  @scala.inline
  def block: typings.fridaGum.fridaGumStrings.block = this.cast("block")
  @scala.inline
  def call: typings.fridaGum.fridaGumStrings.call = this.cast("call")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compile: typings.fridaGum.fridaGumStrings.compile = this.cast("compile")
  @scala.inline
  def exec: typings.fridaGum.fridaGumStrings.exec = this.cast("exec")
  @scala.inline
  def ret: typings.fridaGum.fridaGumStrings.ret = this.cast("ret")
}

