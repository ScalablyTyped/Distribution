package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesPackagesMod.Packages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Packages", JSImport.Namespace)
@js.native
object distServicesPackagesMod extends js.Object {
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

