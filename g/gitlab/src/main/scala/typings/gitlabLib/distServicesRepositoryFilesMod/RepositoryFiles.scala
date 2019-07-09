package typings
package gitlabLib.distServicesRepositoryFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryFiles
  extends gitlabLib.distInfrastructureMod.BaseService {
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    filePath: java.lang.String,
    branch: java.lang.String,
    content: java.lang.String,
    commitMessage: java.lang.String
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    filePath: java.lang.String,
    branch: java.lang.String,
    content: java.lang.String,
    commitMessage: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.distServicesMod.ProjectId,
    filePath: java.lang.String,
    branch: java.lang.String,
    content: java.lang.String,
    commitMessage: java.lang.String
  ): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.distServicesMod.ProjectId,
    filePath: java.lang.String,
    branch: java.lang.String,
    content: java.lang.String,
    commitMessage: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    filePath: java.lang.String,
    branch: java.lang.String,
    commitMessage: java.lang.String
  ): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    filePath: java.lang.String,
    branch: java.lang.String,
    commitMessage: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.distServicesMod.ProjectId, filePath: java.lang.String, ref: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    filePath: java.lang.String,
    ref: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showRaw(projectId: gitlabLib.distServicesMod.ProjectId, filePath: java.lang.String, ref: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showRaw(
    projectId: gitlabLib.distServicesMod.ProjectId,
    filePath: java.lang.String,
    ref: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

