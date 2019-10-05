package typings.freedom.freedom.RTCDataChannel

import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var binary: js.UndefOr[Blob] = js.undefined
  var buffer: js.UndefOr[ArrayBuffer] = js.undefined
  // Exactly one of the below must be specified.
  var text: js.UndefOr[String] = js.undefined
}

object Message {
  @scala.inline
  def apply(binary: Blob = null, buffer: ArrayBuffer = null, text: String = null): Message = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Message]
  }
}

