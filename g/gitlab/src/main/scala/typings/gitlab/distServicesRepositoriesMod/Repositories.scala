package typings.gitlab.distServicesRepositoriesMod

import typings.gitlab.Anon_ShaString
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

