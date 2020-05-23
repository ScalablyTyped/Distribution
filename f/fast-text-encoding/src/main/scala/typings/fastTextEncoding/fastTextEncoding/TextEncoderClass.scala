package typings.fastTextEncoding.fastTextEncoding

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextEncoder instance.
  */
@js.native
trait TextEncoderClass extends js.Object {
  var encoding: String = js.native
  def encode(string: String): Uint8Array = js.native
  def encode(string: String, options: TextEncodingOptions): Uint8Array = js.native
}

