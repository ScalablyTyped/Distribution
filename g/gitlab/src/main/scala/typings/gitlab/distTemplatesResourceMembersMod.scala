package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.AccessLevel
import typings.gitlab.distServicesMod.ResourceId
import typings.gitlab.distServicesMod.UserId
import typings.gitlab.distTemplatesResourceMembersMod.ResourceMembers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/templates/ResourceMembers", JSImport.Namespace)
@js.native
object distTemplatesResourceMembersMod extends js.Object {
  @js.native
  trait ResourceMembers extends BaseService {
    def add(resourceId: ResourceId, userId: UserId, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def add(resourceId: ResourceId, userId: UserId, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(resourceId: ResourceId): js.Promise[GetResponse] = js.native
    def all(resourceId: ResourceId, includeInherited: Boolean): js.Promise[GetResponse] = js.native
    def all(resourceId: ResourceId, includeInherited: Boolean, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def edit(resourceId: ResourceId, userId: UserId, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
    def edit(resourceId: ResourceId, userId: UserId, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(resourceId: ResourceId, userId: UserId): js.Promise[js.Object] = js.native
    def remove(resourceId: ResourceId, userId: UserId, options: Sudo): js.Promise[js.Object] = js.native
    def show(resourceId: ResourceId, userId: UserId): js.Promise[GetResponse] = js.native
    def show(resourceId: ResourceId, userId: UserId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default protected () extends ResourceMembers {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

