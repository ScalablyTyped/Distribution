package typings
package gitlabLib.distServicesReleaseLinksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseLinks
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.distServicesMod.ProjectId, tagName: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    projectId: gitlabLib.distServicesMod.ProjectId,
    tagName: java.lang.String,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    tagName: java.lang.String,
    name: java.lang.String,
    url: java.lang.String
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    tagName: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.distServicesMod.ProjectId,
    tagName: java.lang.String,
    linkId: scala.Double,
    options: gitlabLib.distInfrastructureMod.Sudo with (gitlabLib.Anon_Name | gitlabLib.Anon_Url)
  ): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.distServicesMod.ProjectId, tagName: java.lang.String, linkId: scala.Double): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    tagName: java.lang.String,
    linkId: scala.Double,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.distServicesMod.ProjectId, tagName: java.lang.String, linkId: scala.Double): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    tagName: java.lang.String,
    linkId: scala.Double,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

