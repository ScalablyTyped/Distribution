package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ResourceId
import typings.gitlab.distServicesMod.UserId
import typings.gitlab.distTemplatesResourceAccessRequestsMod.ResourceAccessRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/templates/ResourceAccessRequests", JSImport.Namespace)
@js.native
object distTemplatesResourceAccessRequestsMod extends js.Object {
  @js.native
  trait ResourceAccessRequests extends BaseService {
    def all(resourceId: ResourceId): js.Promise[GetResponse] = js.native
    def approve(resourceId: ResourceId, userId: UserId, hasAccessLevel: Anon_AccessLevel with Sudo): js.Promise[js.Object] = js.native
    def deny(resourceId: ResourceId, userId: UserId): js.Promise[js.Object] = js.native
    def request(resourceId: ResourceId): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default protected () extends ResourceAccessRequests {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

