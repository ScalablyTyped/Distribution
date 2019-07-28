package typings.easyDashXDashHeaders.stringUnderscoreDecoderMod

import typings.easyDashXDashHeaders.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStringDecoder extends js.Object {
  def detectIncompleteChar(buffer: Buffer): Double
  def write(buffer: Buffer): String
}

object NodeStringDecoder {
  @scala.inline
  def apply(detectIncompleteChar: Buffer => Double, write: Buffer => String): NodeStringDecoder = {
    val __obj = js.Dynamic.literal(detectIncompleteChar = js.Any.fromFunction1(detectIncompleteChar), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[NodeStringDecoder]
  }
}

