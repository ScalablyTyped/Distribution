package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/PipelineScheduleVariables", JSImport.Namespace)
@js.native
object distTypesCoreServicesPipelineScheduleVariablesMod extends js.Object {
  @js.native
  class PipelineScheduleVariables () extends BaseService {
    def all(projectId: String, pipelineScheduleId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: String, pipelineScheduleId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double, pipelineScheduleId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, pipelineScheduleId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: String, pipelineScheduleId: Double): js.Promise[js.Object] = js.native
    def create(projectId: String, pipelineScheduleId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(projectId: Double, pipelineScheduleId: Double): js.Promise[js.Object] = js.native
    def create(projectId: Double, pipelineScheduleId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: String, pipelineScheduleId: Double, keyId: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, pipelineScheduleId: Double, keyId: String): js.Promise[js.Object] = js.native
    def edit(projectId: Double, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: String, pipelineScheduleId: Double, keyId: String): js.Promise[js.Object] = js.native
    def remove(projectId: String, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: Double, pipelineScheduleId: Double, keyId: String): js.Promise[js.Object] = js.native
    def remove(projectId: Double, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def show(projectId: String, pipelineScheduleId: Double, keyId: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def show(projectId: Double, pipelineScheduleId: Double, keyId: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, pipelineScheduleId: Double, keyId: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

