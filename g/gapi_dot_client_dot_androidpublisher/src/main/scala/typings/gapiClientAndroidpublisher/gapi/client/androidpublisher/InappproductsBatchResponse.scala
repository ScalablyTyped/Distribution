package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsBatchResponse extends js.Object {
  var entrys: js.UndefOr[js.Array[InappproductsBatchResponseEntry]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidpublisher#inappproductsBatchResponse". */
  var kind: js.UndefOr[String] = js.native
}

object InappproductsBatchResponse {
  @scala.inline
  def apply(): InappproductsBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsBatchResponse]
  }
  @scala.inline
  implicit class InappproductsBatchResponseOps[Self <: InappproductsBatchResponse] (val x: Self) extends AnyVal {
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
    def setEntrysVarargs(value: InappproductsBatchResponseEntry*): Self = this.set("entrys", js.Array(value :_*))
    @scala.inline
    def setEntrys(value: js.Array[InappproductsBatchResponseEntry]): Self = this.set("entrys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntrys: Self = this.set("entrys", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

