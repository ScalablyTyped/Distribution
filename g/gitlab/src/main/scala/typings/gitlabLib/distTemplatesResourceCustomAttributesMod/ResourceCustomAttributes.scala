package typings
package gitlabLib.distTemplatesResourceCustomAttributesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceCustomAttributes
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
  def remove(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    customAttributeId: gitlabLib.distServicesMod.CustomAttributeId
  ): js.Promise[js.Object] = js.native
  def remove(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    customAttributeId: gitlabLib.distServicesMod.CustomAttributeId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def set(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    customAttributeId: gitlabLib.distServicesMod.CustomAttributeId,
    value: java.lang.String
  ): js.Promise[js.Object] = js.native
  def set(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    customAttributeId: gitlabLib.distServicesMod.CustomAttributeId,
    value: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    customAttributeId: gitlabLib.distServicesMod.CustomAttributeId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    customAttributeId: gitlabLib.distServicesMod.CustomAttributeId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

