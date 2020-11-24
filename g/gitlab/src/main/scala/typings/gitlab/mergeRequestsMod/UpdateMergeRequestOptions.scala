package typings.gitlab.mergeRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMergeRequestOptions extends js.Object {
  
  var allow_collaboration: js.UndefOr[Boolean] = js.native
  
  var allow_maintainer_to_push: js.UndefOr[Boolean] = js.native
  
  var assignee_id: js.UndefOr[Double] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var discussion_locked: js.UndefOr[Boolean] = js.native
  
  var labels: js.UndefOr[String] = js.native
  
  var milestone_id: js.UndefOr[Double] = js.native
  
  var remove_source_branch: js.UndefOr[Boolean] = js.native
  
  var squash: js.UndefOr[Boolean] = js.native
  
  var state_event: js.UndefOr[String] = js.native
  
  var target_branch: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object UpdateMergeRequestOptions {
  
  @scala.inline
  def apply(): UpdateMergeRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMergeRequestOptions]
  }
  
  @scala.inline
  implicit class UpdateMergeRequestOptionsOps[Self <: UpdateMergeRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setAllow_collaboration(value: Boolean): Self = this.set("allow_collaboration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_collaboration: Self = this.set("allow_collaboration", js.undefined)
    
    @scala.inline
    def setAllow_maintainer_to_push(value: Boolean): Self = this.set("allow_maintainer_to_push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_maintainer_to_push: Self = this.set("allow_maintainer_to_push", js.undefined)
    
    @scala.inline
    def setAssignee_id(value: Double): Self = this.set("assignee_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignee_id: Self = this.set("assignee_id", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDiscussion_locked(value: Boolean): Self = this.set("discussion_locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscussion_locked: Self = this.set("discussion_locked", js.undefined)
    
    @scala.inline
    def setLabels(value: String): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMilestone_id(value: Double): Self = this.set("milestone_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMilestone_id: Self = this.set("milestone_id", js.undefined)
    
    @scala.inline
    def setRemove_source_branch(value: Boolean): Self = this.set("remove_source_branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove_source_branch: Self = this.set("remove_source_branch", js.undefined)
    
    @scala.inline
    def setSquash(value: Boolean): Self = this.set("squash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSquash: Self = this.set("squash", js.undefined)
    
    @scala.inline
    def setState_event(value: String): Self = this.set("state_event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState_event: Self = this.set("state_event", js.undefined)
    
    @scala.inline
    def setTarget_branch(value: Double): Self = this.set("target_branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_branch: Self = this.set("target_branch", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
