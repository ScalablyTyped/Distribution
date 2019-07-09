package typings
package gitlabLib.distTemplatesResourceMembersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMembers
  extends gitlabLib.distInfrastructureMod.BaseService {
  def add(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    userId: gitlabLib.distServicesMod.UserId,
    accessLevel: gitlabLib.distServicesMod.AccessLevel
  ): js.Promise[js.Object] = js.native
  def add(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    userId: gitlabLib.distServicesMod.UserId,
    accessLevel: gitlabLib.distServicesMod.AccessLevel,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def all(resourceId: gitlabLib.distServicesMod.ResourceId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(resourceId: gitlabLib.distServicesMod.ResourceId, includeInherited: scala.Boolean): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    includeInherited: scala.Boolean,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def edit(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    userId: gitlabLib.distServicesMod.UserId,
    accessLevel: gitlabLib.distServicesMod.AccessLevel
  ): js.Promise[js.Object] = js.native
  def edit(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    userId: gitlabLib.distServicesMod.UserId,
    accessLevel: gitlabLib.distServicesMod.AccessLevel,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(resourceId: gitlabLib.distServicesMod.ResourceId, userId: gitlabLib.distServicesMod.UserId): js.Promise[js.Object] = js.native
  def remove(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    userId: gitlabLib.distServicesMod.UserId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(resourceId: gitlabLib.distServicesMod.ResourceId, userId: gitlabLib.distServicesMod.UserId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    resourceId: gitlabLib.distServicesMod.ResourceId,
    userId: gitlabLib.distServicesMod.UserId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

