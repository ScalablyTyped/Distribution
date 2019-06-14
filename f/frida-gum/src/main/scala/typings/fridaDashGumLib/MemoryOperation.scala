package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.read
  - fridaDashGumLib.fridaDashGumLibStrings.write
  - fridaDashGumLib.fridaDashGumLibStrings.execute
*/
trait MemoryOperation extends js.Object

object MemoryOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def execute: fridaDashGumLib.fridaDashGumLibStrings.execute = this.cast("execute")
  @scala.inline
  def read: fridaDashGumLib.fridaDashGumLibStrings.read = this.cast("read")
  @scala.inline
  def write: fridaDashGumLib.fridaDashGumLibStrings.write = this.cast("write")
}

