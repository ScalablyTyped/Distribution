package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.BadgeId
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreTemplatesResourceBadgesMod.ResourceBadges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceBadges", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceBadgesMod extends js.Object {
  @js.native
  trait ResourceBadges extends BaseService {
    def add(resourceId: ResourceId): js.Promise[js.Object] = js.native
    def add(resourceId: ResourceId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(resourceId: ResourceId): js.Promise[GetResponse] = js.native
    def all(resourceId: ResourceId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def edit(resourceId: ResourceId, badgeId: BadgeId): js.Promise[js.Object] = js.native
    def edit(resourceId: ResourceId, badgeId: BadgeId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def preview(resourceId: ResourceId, linkUrl: String, imageUrl: String): js.Promise[GetResponse] = js.native
    def preview(resourceId: ResourceId, linkUrl: String, imageUrl: String, options: Sudo): js.Promise[GetResponse] = js.native
    def remove(resourceId: ResourceId, badgeId: BadgeId): js.Promise[js.Object] = js.native
    def remove(resourceId: ResourceId, badgeId: BadgeId, options: Sudo): js.Promise[js.Object] = js.native
    def show(resourceId: ResourceId, badgeId: BadgeId): js.Promise[GetResponse] = js.native
    def show(resourceId: ResourceId, badgeId: BadgeId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default protected () extends ResourceBadges {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

