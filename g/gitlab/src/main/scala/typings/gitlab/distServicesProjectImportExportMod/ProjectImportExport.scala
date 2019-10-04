package typings.gitlab.distServicesProjectImportExportMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectImportExport extends BaseService {
  def download(projectId: ProjectId): js.Promise[GetResponse] = js.native
  def download(projectId: ProjectId, options: Sudo): js.Promise[GetResponse] = js.native
  def exportStatus(projectId: ProjectId): js.Promise[GetResponse] = js.native
  def exportStatus(projectId: ProjectId, options: Sudo): js.Promise[GetResponse] = js.native
  def `import`(content: String, path: String): js.Promise[js.Object] = js.native
  def `import`(content: String, path: String, options: Sudo): js.Promise[js.Object] = js.native
  def importStatus(projectId: ProjectId): js.Promise[GetResponse] = js.native
  def importStatus(projectId: ProjectId, options: Sudo): js.Promise[GetResponse] = js.native
  def schedule(projectId: ProjectId): js.Promise[js.Object] = js.native
  def schedule(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
}

