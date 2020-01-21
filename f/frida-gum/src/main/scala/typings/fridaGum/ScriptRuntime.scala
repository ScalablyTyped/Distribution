package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.DUK
  - typings.fridaGum.fridaGumStrings.V8
*/
trait ScriptRuntime extends js.Object

object ScriptRuntime {
  @scala.inline
  def DUK: typings.fridaGum.fridaGumStrings.DUK = this.cast("DUK")
  @scala.inline
  def V8: typings.fridaGum.fridaGumStrings.V8 = this.cast("V8")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

