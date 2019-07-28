package typings.gitlab.distServicesReleaseLinksMod

import typings.gitlab.Anon_Name
import typings.gitlab.Anon_Url
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseLinks extends BaseService {
  def all(projectId: ProjectId, tagName: String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(projectId: ProjectId, tagName: String, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(projectId: ProjectId, tagName: String, name: String, url: String): js.Promise[js.Object] = js.native
  def create(projectId: ProjectId, tagName: String, name: String, url: String, options: Sudo): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, tagName: String, linkId: Double, options: Sudo with (Anon_Name | Anon_Url)): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, tagName: String, linkId: Double): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, tagName: String, linkId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, tagName: String, linkId: Double): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(projectId: ProjectId, tagName: String, linkId: Double, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

