package typings.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.emscripten.emscriptenStrings.i8
  - typings.emscripten.emscriptenStrings.i16
  - typings.emscripten.emscriptenStrings.i32
  - typings.emscripten.emscriptenStrings.i64
*/
trait CIntType extends js.Object

object CIntType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def i16: typings.emscripten.emscriptenStrings.i16 = this.cast("i16")
  @scala.inline
  def i32: typings.emscripten.emscriptenStrings.i32 = this.cast("i32")
  @scala.inline
  def i64: typings.emscripten.emscriptenStrings.i64 = this.cast("i64")
  @scala.inline
  def i8: typings.emscripten.emscriptenStrings.i8 = this.cast("i8")
}

