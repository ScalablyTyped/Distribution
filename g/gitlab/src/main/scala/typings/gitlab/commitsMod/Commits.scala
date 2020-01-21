package typings.gitlab.commitsMod

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Commits", "Commits")
@js.native
class Commits () extends BaseService {
  def all(projectId: String): js.Promise[GetResponse] = js.native
  def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def all(projectId: Double): js.Promise[GetResponse] = js.native
  def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def cherryPick(projectId: String, sha: String, branch: String): js.Promise[js.Object] = js.native
  def cherryPick(projectId: String, sha: String, branch: String, options: Sudo): js.Promise[js.Object] = js.native
  def cherryPick(projectId: Double, sha: String, branch: String): js.Promise[js.Object] = js.native
  def cherryPick(projectId: Double, sha: String, branch: String, options: Sudo): js.Promise[js.Object] = js.native
  def comments(projectId: String, sha: String): js.Promise[GetResponse] = js.native
  def comments(projectId: String, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
  def comments(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
  def comments(projectId: Double, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
  def create(projectId: String, branch: String, message: String): js.Promise[js.Object] = js.native
  def create(projectId: String, branch: String, message: String, actions: js.Array[CommitAction]): js.Promise[js.Object] = js.native
  def create(
    projectId: String,
    branch: String,
    message: String,
    actions: js.Array[CommitAction],
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def create(projectId: Double, branch: String, message: String): js.Promise[js.Object] = js.native
  def create(projectId: Double, branch: String, message: String, actions: js.Array[CommitAction]): js.Promise[js.Object] = js.native
  def create(
    projectId: Double,
    branch: String,
    message: String,
    actions: js.Array[CommitAction],
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def createComment(projectId: String, sha: String, note: String): js.Promise[js.Object] = js.native
  def createComment(projectId: String, sha: String, note: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def createComment(projectId: Double, sha: String, note: String): js.Promise[js.Object] = js.native
  def createComment(projectId: Double, sha: String, note: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def diff(projectId: String, sha: String): js.Promise[GetResponse] = js.native
  def diff(projectId: String, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
  def diff(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
  def diff(projectId: Double, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
  def editStatus(projectId: String, sha: String): js.Promise[js.Object] = js.native
  def editStatus(projectId: String, sha: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def editStatus(projectId: Double, sha: String): js.Promise[js.Object] = js.native
  def editStatus(projectId: Double, sha: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def mergeRequests(projectId: String, sha: String): js.Promise[GetResponse] = js.native
  def mergeRequests(projectId: String, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  def mergeRequests(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
  def mergeRequests(projectId: Double, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  def references(projectId: String, sha: String): js.Promise[GetResponse] = js.native
  def references(projectId: String, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
  def references(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
  def references(projectId: Double, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
  def show(projectId: String, sha: String): js.Promise[GetResponse] = js.native
  def show(projectId: String, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  def show(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
  def show(projectId: Double, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  def status(projectId: String, sha: String): js.Promise[GetResponse] = js.native
  def status(projectId: String, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  def status(projectId: Double, sha: String): js.Promise[GetResponse] = js.native
  def status(projectId: Double, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
}

