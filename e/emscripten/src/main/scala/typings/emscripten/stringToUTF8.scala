package typings.emscripten

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("stringToUTF8")
@js.native
object stringToUTF8 extends js.Object {
  def apply(str: String, outPtr: Double): Unit = js.native
  def apply(str: String, outPtr: Double, maxBytesToRead: Double): Unit = js.native
}

