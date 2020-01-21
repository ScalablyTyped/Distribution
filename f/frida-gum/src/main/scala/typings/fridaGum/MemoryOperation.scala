package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.read
  - typings.fridaGum.fridaGumStrings.write
  - typings.fridaGum.fridaGumStrings.execute
*/
trait MemoryOperation extends js.Object

object MemoryOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def execute: typings.fridaGum.fridaGumStrings.execute = this.cast("execute")
  @scala.inline
  def read: typings.fridaGum.fridaGumStrings.read = this.cast("read")
  @scala.inline
  def write: typings.fridaGum.fridaGumStrings.write = this.cast("write")
}

