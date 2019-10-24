package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.AccessLevel
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreServicesMod.UserId
import typings.gitlab.distSrcCoreTemplatesResourceMembersMod.ResourceMembers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceMembers", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceMembersMod extends js.Object {
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

