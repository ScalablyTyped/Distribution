package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesPackagesMod.Packages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Packages", JSImport.Namespace)
@js.native
object distSrcCoreServicesPackagesMod extends js.Object {
  @js.native
  trait Packages extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def remove(projectId: ProjectId, packageId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, packageId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, packageId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, packageId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def showFiles(projectId: ProjectId, packageId: Double): js.Promise[GetResponse] = js.native
    def showFiles(projectId: ProjectId, packageId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Packages
  
}

