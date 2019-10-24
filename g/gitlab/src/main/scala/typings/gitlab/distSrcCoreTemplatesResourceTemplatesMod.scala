package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreTemplatesResourceTemplatesMod.ResourceTemplates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceTemplates", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceTemplatesMod extends js.Object {
  @js.native
  trait ResourceTemplates extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def show(resourceId: ResourceId): js.Promise[js.Object] = js.native
    def show(resourceId: ResourceId, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default protected () extends ResourceTemplates {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

