package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterObject extends js.Object {
  var address: js.UndefOr[String] = js.native
  var fromBlock: js.UndefOr[Double | String] = js.native
  var toBlock: js.UndefOr[Double | String] = js.native
  var topics: js.UndefOr[js.Array[LogTopic]] = js.native
}

object FilterObject {
  @scala.inline
  def apply(): FilterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterObject]
  }
  @scala.inline
  implicit class FilterObjectOps[Self <: FilterObject] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setFromBlock(value: Double | String): Self = this.set("fromBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromBlock: Self = this.set("fromBlock", js.undefined)
    @scala.inline
    def setToBlock(value: Double | String): Self = this.set("toBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToBlock: Self = this.set("toBlock", js.undefined)
    @scala.inline
    def setTopicsVarargs(value: LogTopic*): Self = this.set("topics", js.Array(value :_*))
    @scala.inline
    def setTopics(value: js.Array[LogTopic]): Self = this.set("topics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopics: Self = this.set("topics", js.undefined)
  }
  
}

