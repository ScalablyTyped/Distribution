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
    detectIncompleteChar: js.Function1[easyDashXapiDashSupertestLib.Buffer, scala.Double],
    write: js.Function1[easyDashXapiDashSupertestLib.Buffer, java.lang.String]
  ): NodeStringDecoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detectIncompleteChar")(detectIncompleteChar)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[NodeStringDecoder]
  }
}

