package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.read
  - typings.fridaDashGum.fridaDashGumStrings.write
  - typings.fridaDashGum.fridaDashGumStrings.execute
*/
trait MemoryOperation extends js.Object

object MemoryOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def execute: typings.fridaDashGum.fridaDashGumStrings.execute = this.cast("execute")
  @scala.inline
  def read: typings.fridaDashGum.fridaDashGumStrings.read = this.cast("read")
  @scala.inline
  def write: typings.fridaDashGum.fridaDashGumStrings.write = this.cast("write")
}

