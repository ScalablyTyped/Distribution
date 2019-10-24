package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesRepositoriesMod.Repositories
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Repositories", JSImport.Namespace)
@js.native
object distSrcCoreServicesRepositoriesMod extends js.Object {
  @js.native
  trait Repositories extends BaseService {
    def compare(projectId: ProjectId, from: String, to: String): js.Promise[GetResponse] = js.native
    def compare(projectId: ProjectId, from: String, to: String, options: Sudo): js.Promise[GetResponse] = js.native
    def contributors(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def contributors(projectId: ProjectId, options: Sudo): js.Promise[GetResponse] = js.native
    def mergeBase(projectId: ProjectId, refs: js.Array[String]): js.Promise[GetResponse] = js.native
    def mergeBase(projectId: ProjectId, refs: js.Array[String], options: Sudo): js.Promise[GetResponse] = js.native
    def showArchive(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def showArchive(projectId: ProjectId, options: Anon_ShaString with Sudo): js.Promise[GetResponse] = js.native
    def showBlob(projectId: ProjectId, sha: String): js.Promise[GetResponse] = js.native
    def showBlob(projectId: ProjectId, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showBlobRaw(projectId: ProjectId, sha: String): js.Promise[GetResponse] = js.native
    def showBlobRaw(projectId: ProjectId, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def tree(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def tree(projectId: ProjectId, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Repositories
  
}

