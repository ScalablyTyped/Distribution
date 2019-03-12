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
    detectIncompleteChar: easyDashXDashHeadersLib.Buffer => scala.Double,
    write: easyDashXDashHeadersLib.Buffer => java.lang.String
  ): NodeStringDecoder = {
    val __obj = js.Dynamic.literal(detectIncompleteChar = js.Any.fromFunction1(detectIncompleteChar), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[NodeStringDecoder]
  }
}

