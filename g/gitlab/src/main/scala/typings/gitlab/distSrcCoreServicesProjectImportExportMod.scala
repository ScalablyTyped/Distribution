package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesProjectImportExportMod.ProjectImportExport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/ProjectImportExport", JSImport.Namespace)
@js.native
object distSrcCoreServicesProjectImportExportMod extends js.Object {
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
  
  @js.native
  class default () extends ProjectImportExport
  
}

