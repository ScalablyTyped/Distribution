package typings.gifwrap.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GifDecoder extends js.Object {
  def decodeGif(buffer: Buffer): js.Promise[Gif] = js.native
}

object GifDecoder {
  @scala.inline
  def apply(decodeGif: Buffer => js.Promise[Gif]): GifDecoder = {
    val __obj = js.Dynamic.literal(decodeGif = js.Any.fromFunction1(decodeGif))
    __obj.asInstanceOf[GifDecoder]
  }
  @scala.inline
  implicit class GifDecoderOps[Self <: GifDecoder] (val x: Self) extends AnyVal {
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
    def setDecodeGif(value: Buffer => js.Promise[Gif]): Self = this.set("decodeGif", js.Any.fromFunction1(value))
  }
  
}

