package typings
package gitlabLib.distTemplatesResourceMilestonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMilestones
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(resourceId: gitlabLib.ResourceId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(resourceId: gitlabLib.ResourceId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(resourceId: gitlabLib.ResourceId, title: java.lang.String): js.Promise[js.Object] = js.native
  def create(resourceId: gitlabLib.ResourceId, title: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(resourceId: gitlabLib.ResourceId, milestoneId: gitlabLib.MilestoneId): js.Promise[js.Object] = js.native
  def edit(
    resourceId: gitlabLib.ResourceId,
    milestoneId: gitlabLib.MilestoneId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def issues(resourceId: gitlabLib.ResourceId, milestoneId: gitlabLib.MilestoneId): js.Promise[gitlabLib.GetResponse] = js.native
  def issues(resourceId: gitlabLib.ResourceId, milestoneId: gitlabLib.MilestoneId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def mergeRequests(resourceId: gitlabLib.ResourceId, milestoneId: gitlabLib.MilestoneId): js.Promise[gitlabLib.GetResponse] = js.native
  def mergeRequests(resourceId: gitlabLib.ResourceId, milestoneId: gitlabLib.MilestoneId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def show(resourceId: gitlabLib.ResourceId, milestoneId: gitlabLib.MilestoneId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(resourceId: gitlabLib.ResourceId, milestoneId: gitlabLib.MilestoneId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

