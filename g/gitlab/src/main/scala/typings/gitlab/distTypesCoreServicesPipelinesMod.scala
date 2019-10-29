package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Pipelines", JSImport.Namespace)
@js.native
object distTypesCoreServicesPipelinesMod extends js.Object {
  @js.native
  class Pipelines () extends BaseService {
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def allVariables(projectId: String, pipelineId: Double): js.Promise[GetResponse] = js.native
    def allVariables(projectId: String, pipelineId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def allVariables(projectId: Double, pipelineId: Double): js.Promise[GetResponse] = js.native
    def allVariables(projectId: Double, pipelineId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def cancel(projectId: String, pipelineId: Double): js.Promise[js.Object] = js.native
    def cancel(projectId: String, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def cancel(projectId: Double, pipelineId: Double): js.Promise[js.Object] = js.native
    def cancel(projectId: Double, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def create(projectId: String, ref: String): js.Promise[js.Object] = js.native
    def create(projectId: String, ref: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double, ref: String): js.Promise[js.Object] = js.native
    def create(projectId: Double, ref: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def delete(projectId: String, pipelineId: Double): js.Promise[js.Object] = js.native
    def delete(projectId: String, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def delete(projectId: Double, pipelineId: Double): js.Promise[js.Object] = js.native
    def delete(projectId: Double, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def retry(projectId: String, pipelineId: Double): js.Promise[js.Object] = js.native
    def retry(projectId: String, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def retry(projectId: Double, pipelineId: Double): js.Promise[js.Object] = js.native
    def retry(projectId: Double, pipelineId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: String, pipelineId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, pipelineId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, pipelineId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, pipelineId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def showJobs(projectId: String, pipelineId: Double): js.Promise[GetResponse] = js.native
    def showJobs(projectId: String, pipelineId: Double, options: Anon_Scope with Sudo): js.Promise[GetResponse] = js.native
    def showJobs(projectId: Double, pipelineId: Double): js.Promise[GetResponse] = js.native
    def showJobs(projectId: Double, pipelineId: Double, options: Anon_Scope with Sudo): js.Promise[GetResponse] = js.native
  }
  
}

