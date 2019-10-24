package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreServicesMod.UserId
import typings.gitlab.distSrcCoreTemplatesResourceAccessRequestsMod.ResourceAccessRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceAccessRequests", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceAccessRequestsMod extends js.Object {
  @js.native
  trait ResourceAccessRequests extends BaseService {
    def all(resourceId: ResourceId): js.Promise[GetResponse] = js.native
    def approve(resourceId: ResourceId, userId: UserId): js.Promise[js.Object] = js.native
    def approve(resourceId: ResourceId, userId: UserId, hasAccessLevel: Anon_AccessLevel with Sudo): js.Promise[js.Object] = js.native
    def deny(resourceId: ResourceId, userId: UserId): js.Promise[js.Object] = js.native
    def request(resourceId: ResourceId): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default protected () extends ResourceAccessRequests {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

