package typings.easyXHeaders.stringDecoderMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeStringDecoder extends js.Object {
  def detectIncompleteChar(buffer: Buffer): Double = js.native
  def write(buffer: Buffer): String = js.native
}

object NodeStringDecoder {
  @scala.inline
  def apply(detectIncompleteChar: Buffer => Double, write: Buffer => String): NodeStringDecoder = {
    val __obj = js.Dynamic.literal(detectIncompleteChar = js.Any.fromFunction1(detectIncompleteChar), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[NodeStringDecoder]
  }
  @scala.inline
  implicit class NodeStringDecoderOps[Self <: NodeStringDecoder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetectIncompleteChar(value: Buffer => Double): Self = this.set("detectIncompleteChar", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: Buffer => String): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}

