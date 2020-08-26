package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.nodes
import typings.elasticsearch.elasticsearchStrings.parents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TasksListParams extends GenericParams {
  var actions: js.UndefOr[NameList] = js.native
  var detailed: js.UndefOr[Boolean] = js.native
  var groupBy: js.UndefOr[nodes | parents] = js.native
  var nodeId: js.UndefOr[NameList] = js.native
  var parentNode: js.UndefOr[String] = js.native
  var parentTask: js.UndefOr[String] = js.native
  var waitForCompletion: js.UndefOr[Boolean] = js.native
}

object TasksListParams {
  @scala.inline
  def apply(): TasksListParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TasksListParams]
  }
  @scala.inline
  implicit class TasksListParamsOps[Self <: TasksListParams] (val x: Self) extends AnyVal {
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
    def setGroupBy(value: nodes | parents): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
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
    def setParentTask(value: String): Self = this.set("parentTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentTask: Self = this.set("parentTask", js.undefined)
    @scala.inline
    def setWaitForCompletion(value: Boolean): Self = this.set("waitForCompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForCompletion: Self = this.set("waitForCompletion", js.undefined)
  }
  
}

