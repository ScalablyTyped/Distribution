package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/templates/ResourceCustomAttributes", JSImport.Namespace)
@js.native
object distTypesCoreTemplatesResourceCustomAttributesMod extends js.Object {
  @js.native
  class ResourceCustomAttributes protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def remove(resourceId: String, customAttributeId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: String, customAttributeId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, customAttributeId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, customAttributeId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def set(resourceId: String, customAttributeId: Double, value: String): js.Promise[js.Object] = js.native
    def set(resourceId: String, customAttributeId: Double, value: String, options: Sudo): js.Promise[js.Object] = js.native
    def set(resourceId: Double, customAttributeId: Double, value: String): js.Promise[js.Object] = js.native
    def set(resourceId: Double, customAttributeId: Double, value: String, options: Sudo): js.Promise[js.Object] = js.native
    def show(resourceId: String, customAttributeId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, customAttributeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, customAttributeId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, customAttributeId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
}

