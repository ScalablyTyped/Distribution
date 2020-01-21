package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__iconv")
@js.native
object iconv extends js.Object {
  def decode(charset: String, data: ClassBuffer): String = js.native
  def encode(charset: String, data: String): ClassBuffer = js.native
  def isEncoding(charset: String): Boolean = js.native
}

