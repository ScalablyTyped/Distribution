package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/GroupProjects", JSImport.Namespace)
@js.native
object distTypesCoreServicesGroupProjectsMod extends js.Object {
  @js.native
  class GroupProjects () extends BaseService {
    def add(groupId: String, projectId: String): js.Promise[js.Object] = js.native
    def add(groupId: String, projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(groupId: String, projectId: Double): js.Promise[js.Object] = js.native
    def add(groupId: String, projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(groupId: Double, projectId: String): js.Promise[js.Object] = js.native
    def add(groupId: Double, projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(groupId: Double, projectId: Double): js.Promise[js.Object] = js.native
    def add(groupId: Double, projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(groupId: String): js.Promise[GetResponse] = js.native
    def all(groupId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(groupId: Double): js.Promise[GetResponse] = js.native
    def all(groupId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

