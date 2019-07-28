package typings.gitlab.distServicesProjectsMod

import typings.gitlab.Anon_Metadata
import typings.gitlab.Anon_UserId
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.EventOptions
import typings.gitlab.distServicesMod.GroupId
import typings.gitlab.distServicesMod.NamespaceId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projects extends BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def archive(projectId: ProjectId): js.Promise[js.Object] = js.native
  def archive(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
  def create(hasUserIdOptions: Anon_UserId with BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def events(projectId: ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def events(projectId: ProjectId, options: BaseRequestOptions with EventOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def fork(projectId: ProjectId): js.Promise[js.Object] = js.native
  def fork(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def forks(projectId: ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def forks(projectId: ProjectId, options: BaseRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def languages(projectId: ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def languages(projectId: ProjectId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def mirrorPull(projectId: ProjectId): js.Promise[js.Object] = js.native
  def mirrorPull(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
  def removeFork(projectId: ProjectId): js.Promise[js.Object] = js.native
  def removeFork(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
  def search(projectName: String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def share(projectId: ProjectId, groupId: GroupId, groupAccess: Double): js.Promise[js.Object] = js.native
  def share(projectId: ProjectId, groupId: GroupId, groupAccess: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(projectId: ProjectId, options: BaseRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def star(projectId: ProjectId): js.Promise[js.Object] = js.native
  def star(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
  def statuses(projectId: ProjectId, sha: String, state: String): js.Promise[js.Object] = js.native
  def statuses(projectId: ProjectId, sha: String, state: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def transfer(projectId: ProjectId, namespaceId: NamespaceId): js.Promise[js.Object] = js.native
  def unarchive(projectId: ProjectId): js.Promise[js.Object] = js.native
  def unarchive(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
  def unshare(projectId: ProjectId, groupId: GroupId): js.Promise[js.Object] = js.native
  def unshare(projectId: ProjectId, groupId: GroupId, options: Sudo): js.Promise[js.Object] = js.native
  def unstar(projectId: ProjectId): js.Promise[js.Object] = js.native
  def unstar(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
  def updatePushRule(projectId: ProjectId): js.Promise[js.Object] = js.native
  def updatePushRule(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def upload(projectId: js.Any, content: js.Any): js.Promise[js.Object] = js.native
  def upload(projectId: js.Any, content: js.Any, hasMetadataSudo: Anon_Metadata with Sudo): js.Promise[js.Object] = js.native
}

