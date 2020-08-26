package typings.giphyApi.mod

import typings.giphyApi.anon.Count
import typings.giphyApi.anon.Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiResponse extends BaseResponse {
  var data: js.Array[GIFObject] = js.native
}

object MultiResponse {
  @scala.inline
  def apply(data: js.Array[GIFObject], meta: Msg, pagination: Count): MultiResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiResponse]
  }
  @scala.inline
  implicit class MultiResponseOps[Self <: MultiResponse] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: GIFObject*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[GIFObject]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

