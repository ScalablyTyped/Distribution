package typings.fastDashTextDashEncoding

import typings.fastDashTextDashEncoding.fastTextEncoder.Options
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoder")
@js.native
class TextEncoder () extends js.Object {
  def this(label: String) = this()
  var encoding: String = js.native
  def encode(string: String): Uint8Array = js.native
  def encode(string: String, options: Options): Uint8Array = js.native
}

