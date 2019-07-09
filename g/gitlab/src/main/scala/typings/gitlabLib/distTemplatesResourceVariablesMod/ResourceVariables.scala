package typings
package gitlabLib.distTemplatesResourceVariablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceVariables
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(resourceId: gitlabLib.distServicesMod.ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(resourceId: gitlabLib.distServicesMod.ResourceId): js.Promise[js.Object] = js.native
  def create(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(resourceId: gitlabLib.distServicesMod.ResourceId, keyId: gitlabLib.distServicesMod.KeyId): js.Promise[js.Object] = js.native
  def edit(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    keyId: gitlabLib.distServicesMod.KeyId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(resourceId: gitlabLib.distServicesMod.ResourceId, keyId: gitlabLib.distServicesMod.KeyId): js.Promise[js.Object] = js.native
  def remove(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    keyId: gitlabLib.distServicesMod.KeyId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.distServicesMod.ResourceId, keyId: gitlabLib.distServicesMod.KeyId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    keyId: gitlabLib.distServicesMod.KeyId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

