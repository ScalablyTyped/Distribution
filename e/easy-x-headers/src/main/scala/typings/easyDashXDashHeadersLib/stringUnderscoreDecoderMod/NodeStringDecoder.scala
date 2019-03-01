package typings
package easyDashXDashHeadersLib.stringUnderscoreDecoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStringDecoder extends js.Object {
  def detectIncompleteChar(buffer: easyDashXDashHeadersLib.Buffer): scala.Double
  def write(buffer: easyDashXDashHeadersLib.Buffer): java.lang.String
}

object NodeStringDecoder {
  @scala.inline
  def apply(
    detectIncompleteChar: js.Function1[easyDashXDashHeadersLib.Buffer, scala.Double],
    write: js.Function1[easyDashXDashHeadersLib.Buffer, java.lang.String]
  ): NodeStringDecoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detectIncompleteChar")(detectIncompleteChar)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[NodeStringDecoder]
  }
}

