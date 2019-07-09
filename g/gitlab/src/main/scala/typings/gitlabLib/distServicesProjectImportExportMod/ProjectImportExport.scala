package typings
package gitlabLib.distServicesProjectImportExportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectImportExport
  extends gitlabLib.distInfrastructureMod.BaseService {
  def download(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def download(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def exportStatus(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def exportStatus(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def `import`(content: java.lang.String): js.Promise[js.Object] = js.native
  def `import`(
    content: java.lang.String,
    hasMetadataSudo: gitlabLib.Anon_Metadata with gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def importStatus(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def importStatus(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def schedule(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def schedule(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
}

