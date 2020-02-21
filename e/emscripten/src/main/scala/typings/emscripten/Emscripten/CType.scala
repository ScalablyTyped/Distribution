package typings.emscripten.Emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.emscripten.emscriptenStrings.i8
  - typings.emscripten.emscriptenStrings.i16
  - typings.emscripten.emscriptenStrings.i32
  - typings.emscripten.emscriptenStrings.i64
  - typings.emscripten.emscriptenStrings.float
  - typings.emscripten.emscriptenStrings.double
  - typings.emscripten.emscriptenStrings.i8Asterisk
  - typings.emscripten.emscriptenStrings.i16Asterisk
  - typings.emscripten.emscriptenStrings.i32Asterisk
  - typings.emscripten.emscriptenStrings.i64Asterisk
  - typings.emscripten.emscriptenStrings.floatAsterisk
  - typings.emscripten.emscriptenStrings.doubleAsterisk
  - typings.emscripten.emscriptenStrings.Asterisk
*/
trait CType extends js.Object

object CType {
  @scala.inline
  def Asterisk: typings.emscripten.emscriptenStrings.Asterisk = this.cast("*")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def double: typings.emscripten.emscriptenStrings.double = this.cast("double")
  @scala.inline
  def doubleAsterisk: typings.emscripten.emscriptenStrings.doubleAsterisk = this.cast("double*")
  @scala.inline
  def float: typings.emscripten.emscriptenStrings.float = this.cast("float")
  @scala.inline
  def floatAsterisk: typings.emscripten.emscriptenStrings.floatAsterisk = this.cast("float*")
  @scala.inline
  def i16: typings.emscripten.emscriptenStrings.i16 = this.cast("i16")
  @scala.inline
  def i16Asterisk: typings.emscripten.emscriptenStrings.i16Asterisk = this.cast("i16*")
  @scala.inline
  def i32: typings.emscripten.emscriptenStrings.i32 = this.cast("i32")
  @scala.inline
  def i32Asterisk: typings.emscripten.emscriptenStrings.i32Asterisk = this.cast("i32*")
  @scala.inline
  def i64: typings.emscripten.emscriptenStrings.i64 = this.cast("i64")
  @scala.inline
  def i64Asterisk: typings.emscripten.emscriptenStrings.i64Asterisk = this.cast("i64*")
  @scala.inline
  def i8: typings.emscripten.emscriptenStrings.i8 = this.cast("i8")
  @scala.inline
  def i8Asterisk: typings.emscripten.emscriptenStrings.i8Asterisk = this.cast("i8*")
}

