package typings.fastTextEncoding.fastTextEncoding

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextDecoder instance.
  */
@js.native
trait TextDecoderClass extends js.Object {
  var encoding: String = js.native
  var fatal: Boolean = js.native
  var ignoreBOM: Boolean = js.native
  def decode(buffer: Uint8Array): String = js.native
  def decode(buffer: Uint8Array, options: TextEncodingOptions): String = js.native
}

