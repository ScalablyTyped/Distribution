package typings
package gitlabLib.distServicesContainerRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerRegistry
  extends gitlabLib.distInfrastructureMod.BaseService {
  def removeRepository(projectId: gitlabLib.distServicesMod.ProjectId, repositoryId: scala.Double): js.Promise[js.Object] = js.native
  def removeRepository(
    projectId: gitlabLib.distServicesMod.ProjectId,
    repositoryId: scala.Double,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def removeTag(
    projectId: gitlabLib.distServicesMod.ProjectId,
    repositoryId: scala.Double,
    tagName: java.lang.String
  ): js.Promise[js.Object] = js.native
  def removeTag(
    projectId: gitlabLib.distServicesMod.ProjectId,
    repositoryId: scala.Double,
    tagName: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def removeTags(
    projectId: gitlabLib.distServicesMod.ProjectId,
    repositoryId: scala.Double,
    tagNameRegex: java.lang.String
  ): js.Promise[js.Object] = js.native
  def removeTags(
    projectId: gitlabLib.distServicesMod.ProjectId,
    repositoryId: scala.Double,
    tagNameRegex: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo with gitlabLib.Anon_KeepN
  ): js.Promise[js.Object] = js.native
  def repositories(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def repositories(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showTag(
    projectId: gitlabLib.distServicesMod.ProjectId,
    repositoryId: scala.Double,
    tagName: java.lang.String
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def showTag(
    projectId: gitlabLib.distServicesMod.ProjectId,
    repositoryId: scala.Double,
    tagName: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def tags(projectId: gitlabLib.distServicesMod.ProjectId, repositoryId: scala.Double): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def tags(
    projectId: gitlabLib.distServicesMod.ProjectId,
    repositoryId: scala.Double,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

