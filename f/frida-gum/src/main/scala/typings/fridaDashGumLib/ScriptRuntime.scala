package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.DUK
  - fridaDashGumLib.fridaDashGumLibStrings.V8
*/
trait ScriptRuntime extends js.Object

object ScriptRuntime {
  @scala.inline
  def Duk: fridaDashGumLib.fridaDashGumLibStrings.DUK = this.cast("DUK")
  @scala.inline
  def V8: fridaDashGumLib.fridaDashGumLibStrings.V8 = this.cast("V8")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

