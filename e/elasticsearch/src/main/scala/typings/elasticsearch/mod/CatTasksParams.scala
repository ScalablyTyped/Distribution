package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatTasksParams extends GenericParams {
  var actions: js.UndefOr[NameList] = js.native
  var detailed: js.UndefOr[Boolean] = js.native
  var format: String = js.native
  var h: js.UndefOr[NameList] = js.native
  var help: js.UndefOr[Boolean] = js.native
  var nodeId: js.UndefOr[NameList] = js.native
  var parentNode: js.UndefOr[String] = js.native
  var parentTask: js.UndefOr[Double] = js.native
  var v: js.UndefOr[Boolean] = js.native
}

object CatTasksParams {
  @scala.inline
  def apply(format: String): CatTasksParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatTasksParams]
  }
  @scala.inline
  implicit class CatTasksParamsOps[Self <: CatTasksParams] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: NameList): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setDetailed(value: Boolean): Self = this.set("detailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailed: Self = this.set("detailed", js.undefined)
    @scala.inline
    def setHVarargs(value: String*): Self = this.set("h", js.Array(value :_*))
    @scala.inline
    def setH(value: NameList): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def setHelp(value: Boolean): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setNodeIdVarargs(value: String*): Self = this.set("nodeId", js.Array(value :_*))
    @scala.inline
    def setNodeId(value: NameList): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    @scala.inline
    def setParentNode(value: String): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentNode: Self = this.set("parentNode", js.undefined)
    @scala.inline
    def setParentTask(value: Double): Self = this.set("parentTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTask: Self = this.set("parentTask", js.undefined)
    @scala.inline
    def setV(value: Boolean): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
  
}

