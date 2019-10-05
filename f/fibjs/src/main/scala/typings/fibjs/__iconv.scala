package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__iconv")
@js.native
object __iconv extends js.Object {
  def decode(charset: String, data: Class_Buffer): String = js.native
  def encode(charset: String, data: String): Class_Buffer = js.native
  def isEncoding(charset: String): Boolean = js.native
}

