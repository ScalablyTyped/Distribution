package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesRecoveryParams extends GenericParams {
  var activeOnly: js.UndefOr[Boolean] = js.native
  var detailed: js.UndefOr[Boolean] = js.native
  var human: js.UndefOr[Boolean] = js.native
  var index: NameList = js.native
}

object IndicesRecoveryParams {
  @scala.inline
  def apply(index: NameList): IndicesRecoveryParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryParams]
  }
  @scala.inline
  implicit class IndicesRecoveryParamsOps[Self <: IndicesRecoveryParams] (val x: Self) extends AnyVal {
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
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: NameList): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveOnly(value: Boolean): Self = this.set("activeOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOnly: Self = this.set("activeOnly", js.undefined)
    @scala.inline
    def setDetailed(value: Boolean): Self = this.set("detailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailed: Self = this.set("detailed", js.undefined)
    @scala.inline
    def setHuman(value: Boolean): Self = this.set("human", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHuman: Self = this.set("human", js.undefined)
  }
  
}

