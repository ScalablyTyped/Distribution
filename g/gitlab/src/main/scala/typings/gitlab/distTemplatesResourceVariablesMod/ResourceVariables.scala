package typings.gitlab.distTemplatesResourceVariablesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distServicesMod.KeyId
import typings.gitlab.distServicesMod.ResourceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceVariables extends BaseService {
  def all(resourceId: ResourceId): js.Promise[GetResponse] = js.native
  def all(resourceId: ResourceId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def create(resourceId: ResourceId): js.Promise[js.Object] = js.native
  def create(resourceId: ResourceId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(resourceId: ResourceId, keyId: KeyId): js.Promise[js.Object] = js.native
  def edit(resourceId: ResourceId, keyId: KeyId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(resourceId: ResourceId, keyId: KeyId): js.Promise[js.Object] = js.native
  def remove(resourceId: ResourceId, keyId: KeyId, options: PaginatedRequestOptions): js.Promise[js.Object] = js.native
  def show(resourceId: ResourceId, keyId: KeyId): js.Promise[GetResponse] = js.native
  def show(resourceId: ResourceId, keyId: KeyId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
}

