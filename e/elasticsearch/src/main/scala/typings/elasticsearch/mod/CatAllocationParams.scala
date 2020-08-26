package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatAllocationParams extends CatCommonParams {
  var bytes: js.UndefOr[CatBytes] = js.native
  var nodeId: js.UndefOr[NameList] = js.native
}

object CatAllocationParams {
  @scala.inline
  def apply(format: String): CatAllocationParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatAllocationParams]
  }
  @scala.inline
  implicit class CatAllocationParamsOps[Self <: CatAllocationParams] (val x: Self) extends AnyVal {
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
    def setBytes(value: CatBytes): Self = this.set("bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytes: Self = this.set("bytes", js.undefined)
    @scala.inline
    def setNodeIdVarargs(value: String*): Self = this.set("nodeId", js.Array(value :_*))
    @scala.inline
    def setNodeId(value: NameList): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
  }
  
}

