package typings
package gitlabLib.distTemplatesResourceVariablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceVariables
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(resourceId: gitlabLib.ResourceId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(resourceId: gitlabLib.ResourceId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(resourceId: gitlabLib.ResourceId): js.Promise[js.Object] = js.native
  def create(resourceId: gitlabLib.ResourceId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(resourceId: gitlabLib.ResourceId, keyId: gitlabLib.KeyId): js.Promise[js.Object] = js.native
  def edit(resourceId: gitlabLib.ResourceId, keyId: gitlabLib.KeyId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(resourceId: gitlabLib.ResourceId, keyId: gitlabLib.KeyId): js.Promise[js.Object] = js.native
  def remove(
    resourceId: gitlabLib.ResourceId,
    keyId: gitlabLib.KeyId,
    options: gitlabLib.PaginatedRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.ResourceId, keyId: gitlabLib.KeyId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(
    resourceId: gitlabLib.ResourceId,
    keyId: gitlabLib.KeyId,
    options: gitlabLib.PaginatedRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
}

