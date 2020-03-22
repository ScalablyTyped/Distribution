package typings.gitlab.deploymentsMod

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Deployments", "Deployments")
@js.native
class Deployments () extends BaseService {
  def all(projectId: String): js.Promise[GetResponse] = js.native
  def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def all(projectId: Double): js.Promise[GetResponse] = js.native
  def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def mergeRequests(projectId: String, deploymentId: Double): js.Promise[GetResponse] = js.native
  def mergeRequests(projectId: String, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def mergeRequests(projectId: Double, deploymentId: Double): js.Promise[GetResponse] = js.native
  def mergeRequests(projectId: Double, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def show(projectId: String, deploymentId: Double): js.Promise[GetResponse] = js.native
  def show(projectId: String, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def show(projectId: Double, deploymentId: Double): js.Promise[GetResponse] = js.native
  def show(projectId: Double, deploymentId: Double, options: Sudo): js.Promise[GetResponse] = js.native
}

