package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Issues", JSImport.Namespace)
@js.native
object distTypesCoreServicesIssuesMod extends js.Object {
  @js.native
  class Issues () extends BaseService {
    def addSpentTime(projectId: String, issueId: Double, duration: String): js.Promise[js.Object] = js.native
    def addSpentTime(projectId: String, issueId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    def addSpentTime(projectId: Double, issueId: Double, duration: String): js.Promise[js.Object] = js.native
    def addSpentTime(projectId: Double, issueId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: String, issueId: Double, duration: String): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: String, issueId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: Double, issueId: Double, duration: String): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: Double, issueId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    def all(): js.Promise[GetResponse] = js.native
    def all(
      hasProjectIdGroupIdOptions: (Anon_ProjectId | Anon_GroupId | js.Object) with PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    def create(projectId: String): js.Promise[js.Object] = js.native
    def create(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: String, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def link(projectId: String, issueIId: Double, targetProjectId: String, targetIssueId: Double): js.Promise[js.Object] = js.native
    def link(
      projectId: String,
      issueIId: Double,
      targetProjectId: String,
      targetIssueId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def link(projectId: String, issueIId: Double, targetProjectId: Double, targetIssueId: Double): js.Promise[js.Object] = js.native
    def link(
      projectId: String,
      issueIId: Double,
      targetProjectId: Double,
      targetIssueId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def link(projectId: Double, issueIId: Double, targetProjectId: String, targetIssueId: Double): js.Promise[js.Object] = js.native
    def link(
      projectId: Double,
      issueIId: Double,
      targetProjectId: String,
      targetIssueId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def link(projectId: Double, issueIId: Double, targetProjectId: Double, targetIssueId: Double): js.Promise[js.Object] = js.native
    def link(
      projectId: Double,
      issueIId: Double,
      targetProjectId: Double,
      targetIssueId: Double,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def participants(projectId: String, issueId: Double): js.Promise[GetResponse] = js.native
    def participants(projectId: String, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def participants(projectId: Double, issueId: Double): js.Promise[GetResponse] = js.native
    def participants(projectId: Double, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def remove(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: String, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: Double, issueId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: String, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: String, issueId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, issueId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def subscribe(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def subscribe(projectId: String, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def subscribe(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def subscribe(projectId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def timeStats(projectId: String, issueId: Double): js.Promise[GetResponse] = js.native
    def timeStats(projectId: String, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def timeStats(projectId: Double, issueId: Double): js.Promise[GetResponse] = js.native
    def timeStats(projectId: Double, issueId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def unsubscribe(projectId: String, issueId: Double): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: String, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: Double, issueId: Double): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: Double, issueId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
  
}

