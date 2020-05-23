package typings.getStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithEncoding[EncodingType] extends Options {
  /**
  		[Encoding](https://nodejs.org/api/buffer.html#buffer_buffer) of the incoming stream.
  		@default 'utf8'
  		*/
  val encoding: js.UndefOr[EncodingType] = js.undefined
}

object OptionsWithEncoding {
  @scala.inline
  def apply[EncodingType](encoding: EncodingType = null, maxBuffer: js.UndefOr[Double] = js.undefined): OptionsWithEncoding[EncodingType] = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBuffer)) __obj.updateDynamic("maxBuffer")(maxBuffer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithEncoding[EncodingType]]
  }
}

