package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesDeployKeysMod.DeployKeys
import typings.gitlab.distSrcCoreServicesMod.KeyId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/DeployKeys", JSImport.Namespace)
@js.native
object distSrcCoreServicesDeployKeysMod extends js.Object {
  @js.native
  trait DeployKeys extends BaseService {
    def add(projectId: ProjectId): js.Promise[js.Object] = js.native
    def add(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
    def all(hasProjectIdOptions: Anon_ProjectId with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def edit(projectId: ProjectId, keyId: KeyId): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, keyId: KeyId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def enable(projectId: ProjectId, keyId: KeyId): js.Promise[js.Object] = js.native
    def enable(projectId: ProjectId, keyId: KeyId, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, keyId: KeyId): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, keyId: KeyId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, keyId: KeyId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, keyId: KeyId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends DeployKeys
  
}

