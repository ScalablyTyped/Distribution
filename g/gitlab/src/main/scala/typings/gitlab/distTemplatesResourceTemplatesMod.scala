package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ResourceId
import typings.gitlab.distTemplatesResourceTemplatesMod.ResourceTemplates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/templates/ResourceTemplates", JSImport.Namespace)
@js.native
object distTemplatesResourceTemplatesMod extends js.Object {
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

