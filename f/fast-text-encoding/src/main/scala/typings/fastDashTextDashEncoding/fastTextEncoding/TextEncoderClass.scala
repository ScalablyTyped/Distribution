package typings.fastDashTextDashEncoding.fastTextEncoding

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextEncoder instance.
  */
@JSGlobal("fastTextEncoding.TextEncoderClass")
@js.native
class TextEncoderClass () extends js.Object {
  def this(label: String) = this()
  var encoding: String = js.native
  def encode(string: String): Uint8Array = js.native
  def encode(string: String, options: TextEncodingOptions): Uint8Array = js.native
}

