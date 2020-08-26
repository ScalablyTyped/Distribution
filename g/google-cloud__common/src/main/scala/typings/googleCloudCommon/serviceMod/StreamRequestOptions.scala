package typings.googleCloudCommon.serviceMod

import typings.googleCloudCommon.googleCloudCommonBooleans.`true`
import typings.googleCloudCommon.utilMod.DecorateRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamRequestOptions extends DecorateRequestOptions {
  @JSName("shouldReturnStream")
  var shouldReturnStream_StreamRequestOptions: `true` = js.native
}

object StreamRequestOptions {
  @scala.inline
  def apply(shouldReturnStream: `true`, uri: String): StreamRequestOptions = {
    val __obj = js.Dynamic.literal(shouldReturnStream = shouldReturnStream.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamRequestOptions]
  }
  @scala.inline
  implicit class StreamRequestOptionsOps[Self <: StreamRequestOptions] (val x: Self) extends AnyVal {
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
    def setShouldReturnStream(value: `true`): Self = this.set("shouldReturnStream", value.asInstanceOf[js.Any])
  }
  
}

