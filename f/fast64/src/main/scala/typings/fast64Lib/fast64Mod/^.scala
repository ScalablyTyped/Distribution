package typings
package fast64Lib.fast64Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast64", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(base64: java.lang.String): java.lang.String = js.native
  def decode(base64: java.lang.String, options: fast64Lib.fast64Mod.Options): stdLib.Uint8Array = js.native
  def encode(value: java.lang.String): java.lang.String = js.native
  def urldecode(base64: java.lang.String): java.lang.String = js.native
  def urldecode(base64: java.lang.String, options: fast64Lib.fast64Mod.Options): stdLib.Uint8Array = js.native
  def urlencode(value: java.lang.String): java.lang.String = js.native
}

