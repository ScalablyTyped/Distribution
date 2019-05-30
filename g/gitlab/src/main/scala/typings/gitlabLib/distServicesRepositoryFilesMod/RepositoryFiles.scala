package typings
package gitlabLib.distServicesRepositoryFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryFiles
  extends gitlabLib.distInfrastructureMod.BaseService {
  def create(
    projectId: gitlabLib.ProjectId,
    filePath: java.lang.String,
    branch: java.lang.String,
    content: java.lang.String
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.ProjectId,
    filePath: java.lang.String,
    branch: java.lang.String,
    content: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    filePath: java.lang.String,
    branch: java.lang.String,
    content: java.lang.String
  ): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    filePath: java.lang.String,
    branch: java.lang.String,
    content: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, filePath: java.lang.String, branch: java.lang.String): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.ProjectId,
    filePath: java.lang.String,
    branch: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, filePath: java.lang.String, ref: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def show(
    projectId: gitlabLib.ProjectId,
    filePath: java.lang.String,
    ref: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def showRaw(projectId: gitlabLib.ProjectId, filePath: java.lang.String, ref: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def showRaw(
    projectId: gitlabLib.ProjectId,
    filePath: java.lang.String,
    ref: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
}

