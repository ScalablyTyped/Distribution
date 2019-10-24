package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.CustomAttributeId
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreTemplatesResourceCustomAttributesMod.ResourceCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceCustomAttributes", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceCustomAttributesMod extends js.Object {
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

