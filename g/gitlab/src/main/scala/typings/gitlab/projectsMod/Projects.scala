package typings.gitlab.projectsMod

import typings.gitlab.anon.forkedFromIdnumberBaseReq
import typings.gitlab.anon.metadataUploadMetadataSud
import typings.gitlab.anon.userIdnumberBaseRequestOp
import typings.gitlab.eventsMod.EventOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Projects", "Projects")
@js.native
class Projects () extends BaseService {
  def all(): js.Promise[js.Array[ProjectSchema]] = js.native
  def all(options: PaginatedRequestOptions): js.Promise[js.Array[ProjectSchema]] = js.native
  def archive(projectId: String): js.Promise[js.Object] = js.native
  def archive(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
  def archive(projectId: Double): js.Promise[js.Object] = js.native
  def archive(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def create(hasUserIdOptions: userIdnumberBaseRequestOp): js.Promise[js.Object] = js.native
  def edit(projectId: String): js.Promise[js.Object] = js.native
  def edit(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: Double): js.Promise[js.Object] = js.native
  def edit(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def events(projectId: String): js.Promise[GetResponse] = js.native
  def events(projectId: String, options: BaseRequestOptions with EventOptions): js.Promise[GetResponse] = js.native
  def events(projectId: Double): js.Promise[GetResponse] = js.native
  def events(projectId: Double, options: BaseRequestOptions with EventOptions): js.Promise[GetResponse] = js.native
  def fork(projectId: String): js.Promise[js.Object] = js.native
  def fork(projectId: String, hasForkedFromIdOptions: forkedFromIdnumberBaseReq): js.Promise[js.Object] = js.native
  def fork(projectId: Double): js.Promise[js.Object] = js.native
  def fork(projectId: Double, hasForkedFromIdOptions: forkedFromIdnumberBaseReq): js.Promise[js.Object] = js.native
  def forks(projectId: String): js.Promise[GetResponse] = js.native
  def forks(projectId: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  def forks(projectId: Double): js.Promise[GetResponse] = js.native
  def forks(projectId: Double, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  def languages(projectId: String): js.Promise[GetResponse] = js.native
  def languages(projectId: String, options: Sudo): js.Promise[GetResponse] = js.native
  def languages(projectId: Double): js.Promise[GetResponse] = js.native
  def languages(projectId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def mirrorPull(projectId: String): js.Promise[js.Object] = js.native
  def mirrorPull(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
  def mirrorPull(projectId: Double): js.Promise[js.Object] = js.native
  def mirrorPull(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def remove(projectId: String): js.Promise[js.Object] = js.native
  def remove(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
  def remove(projectId: Double): js.Promise[js.Object] = js.native
  def remove(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def removeFork(projectId: String): js.Promise[js.Object] = js.native
  def removeFork(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
  def removeFork(projectId: Double): js.Promise[js.Object] = js.native
  def removeFork(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def search(projectName: String): js.Promise[GetResponse] = js.native
  def share(projectId: String, groupId: String, groupAccess: Double): js.Promise[js.Object] = js.native
  def share(projectId: String, groupId: String, groupAccess: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def share(projectId: String, groupId: Double, groupAccess: Double): js.Promise[js.Object] = js.native
  def share(projectId: String, groupId: Double, groupAccess: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def share(projectId: Double, groupId: String, groupAccess: Double): js.Promise[js.Object] = js.native
  def share(projectId: Double, groupId: String, groupAccess: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def share(projectId: Double, groupId: Double, groupAccess: Double): js.Promise[js.Object] = js.native
  def share(projectId: Double, groupId: Double, groupAccess: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def show(projectId: String): js.Promise[ProjectSchema] = js.native
  def show(projectId: String, options: BaseRequestOptions): js.Promise[ProjectSchema] = js.native
  def show(projectId: Double): js.Promise[ProjectSchema] = js.native
  def show(projectId: Double, options: BaseRequestOptions): js.Promise[ProjectSchema] = js.native
  def star(projectId: String): js.Promise[js.Object] = js.native
  def star(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
  def star(projectId: Double): js.Promise[js.Object] = js.native
  def star(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def statuses(projectId: String, sha: String, state: String): js.Promise[js.Object] = js.native
  def statuses(projectId: String, sha: String, state: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def statuses(projectId: Double, sha: String, state: String): js.Promise[js.Object] = js.native
  def statuses(projectId: Double, sha: String, state: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def transfer(projectId: String, namespaceId: String): js.Promise[js.Object] = js.native
  def transfer(projectId: String, namespaceId: Double): js.Promise[js.Object] = js.native
  def transfer(projectId: Double, namespaceId: String): js.Promise[js.Object] = js.native
  def transfer(projectId: Double, namespaceId: Double): js.Promise[js.Object] = js.native
  def unarchive(projectId: String): js.Promise[js.Object] = js.native
  def unarchive(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
  def unarchive(projectId: Double): js.Promise[js.Object] = js.native
  def unarchive(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def unshare(projectId: String, groupId: String): js.Promise[js.Object] = js.native
  def unshare(projectId: String, groupId: String, options: Sudo): js.Promise[js.Object] = js.native
  def unshare(projectId: String, groupId: Double): js.Promise[js.Object] = js.native
  def unshare(projectId: String, groupId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def unshare(projectId: Double, groupId: String): js.Promise[js.Object] = js.native
  def unshare(projectId: Double, groupId: String, options: Sudo): js.Promise[js.Object] = js.native
  def unshare(projectId: Double, groupId: Double): js.Promise[js.Object] = js.native
  def unshare(projectId: Double, groupId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def unstar(projectId: String): js.Promise[js.Object] = js.native
  def unstar(projectId: String, options: Sudo): js.Promise[js.Object] = js.native
  def unstar(projectId: Double): js.Promise[js.Object] = js.native
  def unstar(projectId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def upload(projectId: js.Any, content: js.Any): js.Promise[js.Object] = js.native
  def upload(projectId: js.Any, content: js.Any, hasMetadataSudo: metadataUploadMetadataSud): js.Promise[js.Object] = js.native
}

