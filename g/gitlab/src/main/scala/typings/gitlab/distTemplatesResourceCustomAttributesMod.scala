package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.CustomAttributeId
import typings.gitlab.distServicesMod.ResourceId
import typings.gitlab.distTemplatesResourceCustomAttributesMod.ResourceCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/templates/ResourceCustomAttributes", JSImport.Namespace)
@js.native
object distTemplatesResourceCustomAttributesMod extends js.Object {
  @js.native
  trait ResourceCustomAttributes extends BaseService {
    def all(resourceId: ResourceId): js.Promise[GetResponse] = js.native
    def all(resourceId: ResourceId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def remove(resourceId: ResourceId, customAttributeId: CustomAttributeId): js.Promise[js.Object] = js.native
    def remove(resourceId: ResourceId, customAttributeId: CustomAttributeId, options: Sudo): js.Promise[js.Object] = js.native
    def set(resourceId: ResourceId, customAttributeId: CustomAttributeId, value: String): js.Promise[js.Object] = js.native
    def set(resourceId: ResourceId, customAttributeId: CustomAttributeId, value: String, options: Sudo): js.Promise[js.Object] = js.native
    def show(resourceId: ResourceId, customAttributeId: CustomAttributeId): js.Promise[GetResponse] = js.native
    def show(resourceId: ResourceId, customAttributeId: CustomAttributeId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default protected () extends ResourceCustomAttributes {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

