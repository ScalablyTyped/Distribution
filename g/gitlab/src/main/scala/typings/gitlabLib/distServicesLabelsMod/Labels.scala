package typings
package gitlabLib.distServicesLabelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Labels
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def create(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId, labelName: java.lang.String): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId, labelName: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, labelName: java.lang.String): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, labelName: java.lang.String, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def subscribe(projectId: gitlabLib.ProjectId, labelId: gitlabLib.LabelId): js.Promise[js.Object] = js.native
  def subscribe(projectId: gitlabLib.ProjectId, labelId: gitlabLib.LabelId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def unsubscribe(projectId: gitlabLib.ProjectId, labelId: gitlabLib.LabelId): js.Promise[js.Object] = js.native
  def unsubscribe(projectId: gitlabLib.ProjectId, labelId: gitlabLib.LabelId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

