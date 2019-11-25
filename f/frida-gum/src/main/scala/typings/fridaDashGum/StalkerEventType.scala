package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.call
  - typings.fridaDashGum.fridaDashGumStrings.ret
  - typings.fridaDashGum.fridaDashGumStrings.exec
  - typings.fridaDashGum.fridaDashGumStrings.block
  - typings.fridaDashGum.fridaDashGumStrings.compile
*/
trait StalkerEventType extends js.Object

object StalkerEventType {
  @scala.inline
  def block: typings.fridaDashGum.fridaDashGumStrings.block = this.cast("block")
  @scala.inline
  def call: typings.fridaDashGum.fridaDashGumStrings.call = this.cast("call")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compile: typings.fridaDashGum.fridaDashGumStrings.compile = this.cast("compile")
  @scala.inline
  def exec: typings.fridaDashGum.fridaDashGumStrings.exec = this.cast("exec")
  @scala.inline
  def ret: typings.fridaDashGum.fridaDashGumStrings.ret = this.cast("ret")
}

