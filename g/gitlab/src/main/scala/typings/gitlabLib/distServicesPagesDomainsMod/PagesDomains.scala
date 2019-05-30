package typings
package gitlabLib.distServicesPagesDomainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagesDomains
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(hasProjectIdOptions: gitlabLib.Anon_ProjectId with gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(projectId: gitlabLib.ProjectId, domain: java.lang.String): js.Promise[js.Object] = js.native
  def create(projectId: gitlabLib.ProjectId, domain: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId, domain: java.lang.String): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId, domain: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, domain: java.lang.String): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, domain: java.lang.String, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, domain: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, domain: java.lang.String, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

