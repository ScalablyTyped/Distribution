package typings
package gitlabLib.distServicesEpicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Epics
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(groupId: gitlabLib.distServicesMod.GroupId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    groupId: gitlabLib.distServicesMod.GroupId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(groupId: gitlabLib.distServicesMod.GroupId, title: java.lang.String): js.Promise[js.Object] = js.native
  def create(
    groupId: gitlabLib.distServicesMod.GroupId,
    title: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(groupId: gitlabLib.distServicesMod.GroupId, epicId: gitlabLib.distServicesMod.EpicId): js.Promise[js.Object] = js.native
  def edit(
    groupId: gitlabLib.distServicesMod.GroupId,
    epicId: gitlabLib.distServicesMod.EpicId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(groupId: gitlabLib.distServicesMod.GroupId, epicId: gitlabLib.distServicesMod.EpicId): js.Promise[js.Object] = js.native
  def remove(
    groupId: gitlabLib.distServicesMod.GroupId,
    epicId: gitlabLib.distServicesMod.EpicId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(groupId: gitlabLib.distServicesMod.GroupId, epicId: gitlabLib.distServicesMod.EpicId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    groupId: gitlabLib.distServicesMod.GroupId,
    epicId: gitlabLib.distServicesMod.EpicId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

