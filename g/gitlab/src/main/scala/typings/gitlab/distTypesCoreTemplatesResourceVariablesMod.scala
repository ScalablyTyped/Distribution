package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/templates/ResourceVariables", JSImport.Namespace)
@js.native
object distTypesCoreTemplatesResourceVariablesMod extends js.Object {
  @js.native
  class ResourceVariables protected () extends BaseService {
    def this(resourceType: String, options: BaseServiceOptions) = this()
    def all(resourceId: String): js.Promise[GetResponse] = js.native
    def all(resourceId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(resourceId: Double): js.Promise[GetResponse] = js.native
    def all(resourceId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(resourceId: String): js.Promise[js.Object] = js.native
    def create(resourceId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def create(resourceId: Double): js.Promise[js.Object] = js.native
    def create(resourceId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: String, keyId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: String, keyId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, keyId: Double): js.Promise[js.Object] = js.native
    def edit(resourceId: Double, keyId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(resourceId: String, keyId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: String, keyId: Double, options: PaginatedRequestOptions): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, keyId: Double): js.Promise[js.Object] = js.native
    def remove(resourceId: Double, keyId: Double, options: PaginatedRequestOptions): js.Promise[js.Object] = js.native
    def show(resourceId: String, keyId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: String, keyId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, keyId: Double): js.Promise[GetResponse] = js.native
    def show(resourceId: Double, keyId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

