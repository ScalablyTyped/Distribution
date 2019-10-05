package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.BadgeId
import typings.gitlab.distServicesMod.ResourceId
import typings.gitlab.distTemplatesResourceBadgesMod.ResourceBadges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/templates/ResourceBadges", JSImport.Namespace)
@js.native
object distTemplatesResourceBadgesMod extends js.Object {
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

