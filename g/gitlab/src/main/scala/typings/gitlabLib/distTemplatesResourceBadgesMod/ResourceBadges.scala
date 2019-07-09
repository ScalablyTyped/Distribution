package typings
package gitlabLib.distTemplatesResourceBadgesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceBadges
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(resourceId: gitlabLib.distServicesMod.ResourceId): js.Promise[js.Object] = js.native
  def add(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def all(resourceId: gitlabLib.distServicesMod.ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def edit(resourceId: gitlabLib.distServicesMod.ResourceId, badgeId: gitlabLib.distServicesMod.BadgeId): js.Promise[js.Object] = js.native
  def edit(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    badgeId: gitlabLib.distServicesMod.BadgeId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def preview(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    linkUrl: java.lang.String,
    imageUrl: java.lang.String
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def preview(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    linkUrl: java.lang.String,
    imageUrl: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def remove(resourceId: gitlabLib.distServicesMod.ResourceId, badgeId: gitlabLib.distServicesMod.BadgeId): js.Promise[js.Object] = js.native
  def remove(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    badgeId: gitlabLib.distServicesMod.BadgeId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.distServicesMod.ResourceId, badgeId: gitlabLib.distServicesMod.BadgeId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    badgeId: gitlabLib.distServicesMod.BadgeId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

