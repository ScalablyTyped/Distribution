package typings.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.emscripten.emscriptenStrings.number
  - typings.emscripten.emscriptenStrings.string
  - typings.emscripten.emscriptenStrings.array
  - typings.emscripten.emscriptenStrings.boolean
*/
trait ValueType extends js.Object

object ValueType {
  @scala.inline
  def array: typings.emscripten.emscriptenStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.emscripten.emscriptenStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def number: typings.emscripten.emscriptenStrings.number = this.cast("number")
  @scala.inline
  def string: typings.emscripten.emscriptenStrings.string = this.cast("string")
}

