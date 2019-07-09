package typings
package gitlabLib.distServicesLabelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Labels
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.distServicesMod.ProjectId, labelName: java.lang.String): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.distServicesMod.ProjectId,
    labelName: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.distServicesMod.ProjectId, labelName: java.lang.String): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    labelName: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def subscribe(projectId: gitlabLib.distServicesMod.ProjectId, labelId: gitlabLib.distServicesMod.LabelId): js.Promise[js.Object] = js.native
  def subscribe(
    projectId: gitlabLib.distServicesMod.ProjectId,
    labelId: gitlabLib.distServicesMod.LabelId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def unsubscribe(projectId: gitlabLib.distServicesMod.ProjectId, labelId: gitlabLib.distServicesMod.LabelId): js.Promise[js.Object] = js.native
  def unsubscribe(
    projectId: gitlabLib.distServicesMod.ProjectId,
    labelId: gitlabLib.distServicesMod.LabelId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
}

