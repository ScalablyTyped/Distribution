package typings
package freedomLib.freedomNs.RTCDataChannelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var binary: js.UndefOr[stdLib.Blob] = js.undefined
  var buffer: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  // Exactly one of the below must be specified.
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Message {
  @scala.inline
  def apply(binary: stdLib.Blob = null, buffer: stdLib.ArrayBuffer = null, text: java.lang.String = null): Message = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Message]
  }
}

