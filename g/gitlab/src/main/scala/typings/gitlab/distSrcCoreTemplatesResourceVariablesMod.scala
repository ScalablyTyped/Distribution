package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreServicesMod.KeyId
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreTemplatesResourceVariablesMod.ResourceVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceVariables", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceVariablesMod extends js.Object {
  @js.native
  trait ResourceVariables extends BaseService {
    def all(resourceId: ResourceId): js.Promise[GetResponse] = js.native
    def all(resourceId: ResourceId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(resourceId: ResourceId): js.Promise[js.Object] = js.native
    def create(resourceId: ResourceId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: ResourceId, keyId: KeyId): js.Promise[js.Object] = js.native
    def edit(resourceId: ResourceId, keyId: KeyId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(resourceId: ResourceId, keyId: KeyId): js.Promise[js.Object] = js.native
    def remove(resourceId: ResourceId, keyId: KeyId, options: PaginatedRequestOptions): js.Promise[js.Object] = js.native
    def show(resourceId: ResourceId, keyId: KeyId): js.Promise[GetResponse] = js.native
    def show(resourceId: ResourceId, keyId: KeyId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default protected () extends ResourceVariables {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

