package typings.gitlab.repositoryFilesMod

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/RepositoryFiles", "RepositoryFiles")
@js.native
class RepositoryFiles () extends BaseService {
  def create(projectId: String, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
  def create(
    projectId: String,
    filePath: String,
    branch: String,
    content: String,
    commitMessage: String,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def create(projectId: Double, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
  def create(
    projectId: Double,
    filePath: String,
    branch: String,
    content: String,
    commitMessage: String,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(projectId: String, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
  def edit(
    projectId: String,
    filePath: String,
    branch: String,
    content: String,
    commitMessage: String,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(projectId: Double, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
  def edit(
    projectId: Double,
    filePath: String,
    branch: String,
    content: String,
    commitMessage: String,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: String, filePath: String, branch: String, commitMessage: String): js.Promise[js.Object] = js.native
  def remove(
    projectId: String,
    filePath: String,
    branch: String,
    commitMessage: String,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: Double, filePath: String, branch: String, commitMessage: String): js.Promise[js.Object] = js.native
  def remove(
    projectId: Double,
    filePath: String,
    branch: String,
    commitMessage: String,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(projectId: String, filePath: String, ref: String): js.Promise[RepositoryFileSchema] = js.native
  def show(projectId: String, filePath: String, ref: String, options: Sudo): js.Promise[RepositoryFileSchema] = js.native
  def show(projectId: Double, filePath: String, ref: String): js.Promise[RepositoryFileSchema] = js.native
  def show(projectId: Double, filePath: String, ref: String, options: Sudo): js.Promise[RepositoryFileSchema] = js.native
  def showBlame(projectId: String, filePath: String): js.Promise[GetResponse] = js.native
  def showBlame(projectId: String, filePath: String, options: Sudo): js.Promise[GetResponse] = js.native
  def showBlame(projectId: Double, filePath: String): js.Promise[GetResponse] = js.native
  def showBlame(projectId: Double, filePath: String, options: Sudo): js.Promise[GetResponse] = js.native
  def showRaw(projectId: String, filePath: String, ref: String): js.Promise[GetResponse] = js.native
  def showRaw(projectId: String, filePath: String, ref: String, options: Sudo): js.Promise[GetResponse] = js.native
  def showRaw(projectId: Double, filePath: String, ref: String): js.Promise[GetResponse] = js.native
  def showRaw(projectId: Double, filePath: String, ref: String, options: Sudo): js.Promise[GetResponse] = js.native
}

