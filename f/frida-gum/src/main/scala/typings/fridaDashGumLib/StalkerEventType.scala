package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.call
  - fridaDashGumLib.fridaDashGumLibStrings.ret
  - fridaDashGumLib.fridaDashGumLibStrings.exec
  - fridaDashGumLib.fridaDashGumLibStrings.block
  - fridaDashGumLib.fridaDashGumLibStrings.compile
*/
trait StalkerEventType extends js.Object

object StalkerEventType {
  @scala.inline
  def Block: fridaDashGumLib.fridaDashGumLibStrings.block = this.cast("block")
  @scala.inline
  def Call: fridaDashGumLib.fridaDashGumLibStrings.call = this.cast("call")
  @scala.inline
  def Compile: fridaDashGumLib.fridaDashGumLibStrings.compile = this.cast("compile")
  @scala.inline
  def Exec: fridaDashGumLib.fridaDashGumLibStrings.exec = this.cast("exec")
  @scala.inline
  def Ret: fridaDashGumLib.fridaDashGumLibStrings.ret = this.cast("ret")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

