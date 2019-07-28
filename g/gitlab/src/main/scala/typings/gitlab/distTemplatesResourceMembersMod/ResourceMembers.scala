package typings.gitlab.distTemplatesResourceMembersMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.AccessLevel
import typings.gitlab.distServicesMod.ResourceId
import typings.gitlab.distServicesMod.UserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMembers extends BaseService {
  def add(resourceId: ResourceId, userId: UserId, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
  def add(resourceId: ResourceId, userId: UserId, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def all(resourceId: ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(resourceId: ResourceId, includeInherited: Boolean): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(resourceId: ResourceId, includeInherited: Boolean, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def edit(resourceId: ResourceId, userId: UserId, accessLevel: AccessLevel): js.Promise[js.Object] = js.native
  def edit(resourceId: ResourceId, userId: UserId, accessLevel: AccessLevel, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(resourceId: ResourceId, userId: UserId): js.Promise[js.Object] = js.native
  def remove(resourceId: ResourceId, userId: UserId, options: Sudo): js.Promise[js.Object] = js.native
  def show(resourceId: ResourceId, userId: UserId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(resourceId: ResourceId, userId: UserId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

