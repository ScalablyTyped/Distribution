package typings.giphyApi.mod

import typings.giphyApi.anon.Count
import typings.giphyApi.anon.Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleResponse extends BaseResponse {
  var data: GIFObject = js.native
}

object SingleResponse {
  @scala.inline
  def apply(data: GIFObject, meta: Msg, pagination: Count): SingleResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleResponse]
  }
  @scala.inline
  implicit class SingleResponseOps[Self <: SingleResponse] (val x: Self) extends AnyVal {
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
    def setData(value: GIFObject): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

