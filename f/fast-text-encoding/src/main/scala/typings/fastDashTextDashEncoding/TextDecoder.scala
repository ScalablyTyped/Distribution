package typings.fastDashTextDashEncoding

import typings.fastDashTextDashEncoding.fastTextEncoder.Options
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextDecoder")
@js.native
class TextDecoder () extends js.Object {
  def this(utfLabel: String) = this()
  def this(utfLabel: String, options: Anon_Fatal) = this()
  var encoding: String = js.native
  var fatal: Boolean = js.native
  var ignoreBOM: Boolean = js.native
  def decode(buffer: Uint8Array): String = js.native
  def decode(buffer: Uint8Array, options: Options): String = js.native
}

