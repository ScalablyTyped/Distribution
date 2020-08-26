package typings.gifwrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GifEncoder extends js.Object {
  def encodeGif(frames: js.Array[GifFrame], spec: GifSpec): js.Promise[Gif] = js.native
}

object GifEncoder {
  @scala.inline
  def apply(encodeGif: (js.Array[GifFrame], GifSpec) => js.Promise[Gif]): GifEncoder = {
    val __obj = js.Dynamic.literal(encodeGif = js.Any.fromFunction2(encodeGif))
    __obj.asInstanceOf[GifEncoder]
  }
  @scala.inline
  implicit class GifEncoderOps[Self <: GifEncoder] (val x: Self) extends AnyVal {
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
    def setEncodeGif(value: (js.Array[GifFrame], GifSpec) => js.Promise[Gif]): Self = this.set("encodeGif", js.Any.fromFunction2(value))
  }
  
}

