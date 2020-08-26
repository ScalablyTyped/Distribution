package typings.getStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsWithEncoding[EncodingType] extends Options {
  /**
  		[Encoding](https://nodejs.org/api/buffer.html#buffer_buffer) of the incoming stream.
  		@default 'utf8'
  		*/
  val encoding: js.UndefOr[EncodingType] = js.native
}

object OptionsWithEncoding {
  @scala.inline
  def apply[EncodingType](): OptionsWithEncoding[EncodingType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsWithEncoding[EncodingType]]
  }
  @scala.inline
  implicit class OptionsWithEncodingOps[Self <: OptionsWithEncoding[_], EncodingType] (val x: Self with OptionsWithEncoding[EncodingType]) extends AnyVal {
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
    def setEncoding(value: EncodingType): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
  }
  
}

