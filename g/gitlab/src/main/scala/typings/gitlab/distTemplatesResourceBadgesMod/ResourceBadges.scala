package typings.gitlab.distTemplatesResourceBadgesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.BadgeId
import typings.gitlab.distServicesMod.ResourceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceBadges extends BaseService {
  def add(resourceId: ResourceId): js.Promise[js.Object] = js.native
  def add(resourceId: ResourceId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def all(resourceId: ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(resourceId: ResourceId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def edit(resourceId: ResourceId, badgeId: BadgeId): js.Promise[js.Object] = js.native
  def edit(resourceId: ResourceId, badgeId: BadgeId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def preview(resourceId: ResourceId, linkUrl: String, imageUrl: String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def preview(resourceId: ResourceId, linkUrl: String, imageUrl: String, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def remove(resourceId: ResourceId, badgeId: BadgeId): js.Promise[js.Object] = js.native
  def remove(resourceId: ResourceId, badgeId: BadgeId, options: Sudo): js.Promise[js.Object] = js.native
  def show(resourceId: ResourceId, badgeId: BadgeId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(resourceId: ResourceId, badgeId: BadgeId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

