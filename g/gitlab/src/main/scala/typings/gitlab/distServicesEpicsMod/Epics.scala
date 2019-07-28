package typings.gitlab.distServicesEpicsMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.EpicId
import typings.gitlab.distServicesMod.GroupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Epics extends BaseService {
  def all(groupId: GroupId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(groupId: GroupId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(groupId: GroupId, title: String): js.Promise[js.Object] = js.native
  def create(groupId: GroupId, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(groupId: GroupId, epicId: EpicId): js.Promise[js.Object] = js.native
  def edit(groupId: GroupId, epicId: EpicId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(groupId: GroupId, epicId: EpicId): js.Promise[js.Object] = js.native
  def remove(groupId: GroupId, epicId: EpicId, options: Sudo): js.Promise[js.Object] = js.native
  def show(groupId: GroupId, epicId: EpicId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(groupId: GroupId, epicId: EpicId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

