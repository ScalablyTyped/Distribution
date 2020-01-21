package typings.fast64.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast64", "decode")
@js.native
object decode extends js.Object {
  def apply(base64: String): String = js.native
  def apply(base64: String, options: Options): Uint8Array = js.native
}

