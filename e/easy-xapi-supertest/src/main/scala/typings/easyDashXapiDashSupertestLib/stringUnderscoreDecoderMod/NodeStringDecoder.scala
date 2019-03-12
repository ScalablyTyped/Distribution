package typings
package easyDashXapiDashSupertestLib.stringUnderscoreDecoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStringDecoder extends js.Object {
  def detectIncompleteChar(buffer: easyDashXapiDashSupertestLib.Buffer): scala.Double
  def write(buffer: easyDashXapiDashSupertestLib.Buffer): java.lang.String
}

object NodeStringDecoder {
  @scala.inline
  def apply(
    detectIncompleteChar: easyDashXapiDashSupertestLib.Buffer => scala.Double,
    write: easyDashXapiDashSupertestLib.Buffer => java.lang.String
  ): NodeStringDecoder = {
    val __obj = js.Dynamic.literal(detectIncompleteChar = js.Any.fromFunction1(detectIncompleteChar), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[NodeStringDecoder]
  }
}

