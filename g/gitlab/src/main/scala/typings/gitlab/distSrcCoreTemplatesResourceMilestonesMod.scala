package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.MilestoneId
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreTemplatesResourceMilestonesMod.ResourceMilestones
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceMilestones", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceMilestonesMod extends js.Object {
  @js.native
  trait ResourceMilestones extends BaseService {
    def all(resourceId: ResourceId): js.Promise[GetResponse] = js.native
    def all(resourceId: ResourceId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(resourceId: ResourceId, title: String): js.Promise[js.Object] = js.native
    def create(resourceId: ResourceId, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: ResourceId, milestoneId: MilestoneId): js.Promise[js.Object] = js.native
    def edit(resourceId: ResourceId, milestoneId: MilestoneId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def issues(resourceId: ResourceId, milestoneId: MilestoneId): js.Promise[GetResponse] = js.native
    def issues(resourceId: ResourceId, milestoneId: MilestoneId, options: Sudo): js.Promise[GetResponse] = js.native
    def mergeRequests(resourceId: ResourceId, milestoneId: MilestoneId): js.Promise[GetResponse] = js.native
    def mergeRequests(resourceId: ResourceId, milestoneId: MilestoneId, options: Sudo): js.Promise[GetResponse] = js.native
    def show(resourceId: ResourceId, milestoneId: MilestoneId): js.Promise[GetResponse] = js.native
    def show(resourceId: ResourceId, milestoneId: MilestoneId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default protected () extends ResourceMilestones {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

