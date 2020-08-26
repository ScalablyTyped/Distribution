package typings.fastTextEncoding.fastTextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for `TextDecoder.decode` and `TextEncoder.encode`.
  */
@js.native
trait TextEncodingOptions extends js.Object {
  var stream: Boolean = js.native
}

object TextEncodingOptions {
  @scala.inline
  def apply(stream: Boolean): TextEncodingOptions = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncodingOptions]
  }
  @scala.inline
  implicit class TextEncodingOptionsOps[Self <: TextEncodingOptions] (val x: Self) extends AnyVal {
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
    def setStream(value: Boolean): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
  
}

