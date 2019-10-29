package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/templates/ResourceBadges", JSImport.Namespace)
@js.native
object distTypesCoreTemplatesResourceBadgesMod extends js.Object {
  @js.native
  class ResourceBadges protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    def add(resourceId: String): js.Promise[js.Object] = js.native
    def add(resourceId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(resourceId: Double): js.Promise[js.Object] = js.native
    def add(resourceId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def edit(resourceId: String, badgeId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: String, badgeId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, badgeId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, badgeId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def preview(resourceId: String, linkUrl: String, imageUrl: String): js.Promise[GetResponse] = js.native
    def preview(resourceId: String, linkUrl: String, imageUrl: String, options: Sudo): js.Promise[GetResponse] = js.native
    def preview(resourceId: Double, linkUrl: String, imageUrl: String): js.Promise[GetResponse] = js.native
    def preview(resourceId: Double, linkUrl: String, imageUrl: String, options: Sudo): js.Promise[GetResponse] = js.native
    def remove(resourceId: String, badgeId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: String, badgeId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, badgeId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, badgeId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(resourceId: String, badgeId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, badgeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, badgeId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, badgeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

