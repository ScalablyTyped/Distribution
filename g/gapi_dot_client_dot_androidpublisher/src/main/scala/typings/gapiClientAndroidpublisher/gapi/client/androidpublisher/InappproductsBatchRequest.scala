package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsBatchRequest extends js.Object {
  var entrys: js.UndefOr[js.Array[InappproductsBatchRequestEntry]] = js.native
}

object InappproductsBatchRequest {
  @scala.inline
  def apply(): InappproductsBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsBatchRequest]
  }
  @scala.inline
  implicit class InappproductsBatchRequestOps[Self <: InappproductsBatchRequest] (val x: Self) extends AnyVal {
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
    def setEntrysVarargs(value: InappproductsBatchRequestEntry*): Self = this.set("entrys", js.Array(value :_*))
    @scala.inline
    def setEntrys(value: js.Array[InappproductsBatchRequestEntry]): Self = this.set("entrys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntrys: Self = this.set("entrys", js.undefined)
  }
  
}

