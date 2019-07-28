package typings.fast64.fast64Mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast64", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(base64: String): String = js.native
  def decode(base64: String, options: Options): Uint8Array = js.native
  def encode(value: String): String = js.native
  def urldecode(base64: String): String = js.native
  def urldecode(base64: String, options: Options): Uint8Array = js.native
  def urlencode(value: String): String = js.native
}

