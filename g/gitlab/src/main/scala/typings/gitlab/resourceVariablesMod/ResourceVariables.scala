package typings.gitlab.resourceVariablesMod

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/templates/ResourceVariables", "ResourceVariables")
@js.native
class ResourceVariables protected () extends BaseService {
  def this(resourceType: String, options: BaseServiceOptions) = this()
  def all(resourceId: String): js.Promise[js.Array[ResourceVariableSchema]] = js.native
  def all(resourceId: String, options: PaginatedRequestOptions): js.Promise[js.Array[ResourceVariableSchema]] = js.native
  def all(resourceId: Double): js.Promise[js.Array[ResourceVariableSchema]] = js.native
  def all(resourceId: Double, options: PaginatedRequestOptions): js.Promise[js.Array[ResourceVariableSchema]] = js.native
  def create(resourceId: String): js.Promise[js.Object] = js.native
  def create(resourceId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def create(resourceId: Double): js.Promise[js.Object] = js.native
  def create(resourceId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(resourceId: String, keyId: String): js.Promise[js.Object] = js.native
  def edit(resourceId: String, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(resourceId: Double, keyId: String): js.Promise[js.Object] = js.native
  def edit(resourceId: Double, keyId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(resourceId: String, keyId: String): js.Promise[js.Object] = js.native
  def remove(resourceId: String, keyId: String, options: PaginatedRequestOptions): js.Promise[js.Object] = js.native
  def remove(resourceId: Double, keyId: String): js.Promise[js.Object] = js.native
  def remove(resourceId: Double, keyId: String, options: PaginatedRequestOptions): js.Promise[js.Object] = js.native
  def show(resourceId: String, keyId: String): js.Promise[ResourceVariableSchema] = js.native
  def show(resourceId: String, keyId: String, options: PaginatedRequestOptions): js.Promise[ResourceVariableSchema] = js.native
  def show(resourceId: Double, keyId: String): js.Promise[ResourceVariableSchema] = js.native
  def show(resourceId: Double, keyId: String, options: PaginatedRequestOptions): js.Promise[ResourceVariableSchema] = js.native
}

