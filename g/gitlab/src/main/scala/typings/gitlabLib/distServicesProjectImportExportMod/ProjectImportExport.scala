package typings
package gitlabLib.distServicesProjectImportExportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectImportExport
  extends gitlabLib.distInfrastructureMod.BaseService {
  def download(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def download(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def exportStatus(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def exportStatus(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def `import`(content: java.lang.String, path: java.lang.String): js.Promise[js.Object] = js.native
  def `import`(content: java.lang.String, path: java.lang.String, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def importStatus(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def importStatus(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def schedule(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def schedule(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
}

