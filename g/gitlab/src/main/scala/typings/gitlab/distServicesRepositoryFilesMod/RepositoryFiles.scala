package typings.gitlab.distServicesRepositoryFilesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryFiles extends BaseService {
  def create(projectId: ProjectId, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
  def create(
    projectId: ProjectId,
    filePath: String,
    branch: String,
    content: String,
    commitMessage: String,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
  def edit(
    projectId: ProjectId,
    filePath: String,
    branch: String,
    content: String,
    commitMessage: String,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, filePath: String, branch: String, commitMessage: String): js.Promise[js.Object] = js.native
  def remove(
    projectId: ProjectId,
    filePath: String,
    branch: String,
    commitMessage: String,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, filePath: String, ref: String): js.Promise[GetResponse] = js.native
  def show(projectId: ProjectId, filePath: String, ref: String, options: Sudo): js.Promise[GetResponse] = js.native
  def showRaw(projectId: ProjectId, filePath: String, ref: String): js.Promise[GetResponse] = js.native
  def showRaw(projectId: ProjectId, filePath: String, ref: String, options: Sudo): js.Promise[GetResponse] = js.native
}

