package typings.gitlab.distTemplatesResourceCustomAttributesMod

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.CustomAttributeId
import typings.gitlab.distServicesMod.ResourceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceCustomAttributes extends BaseService {
  def all(resourceId: ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(resourceId: ResourceId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def remove(resourceId: ResourceId, customAttributeId: CustomAttributeId): js.Promise[js.Object] = js.native
  def remove(resourceId: ResourceId, customAttributeId: CustomAttributeId, options: Sudo): js.Promise[js.Object] = js.native
  def set(resourceId: ResourceId, customAttributeId: CustomAttributeId, value: String): js.Promise[js.Object] = js.native
  def set(resourceId: ResourceId, customAttributeId: CustomAttributeId, value: String, options: Sudo): js.Promise[js.Object] = js.native
  def show(resourceId: ResourceId, customAttributeId: CustomAttributeId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(resourceId: ResourceId, customAttributeId: CustomAttributeId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

