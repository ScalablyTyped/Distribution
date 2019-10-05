package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.MilestoneId
import typings.gitlab.distServicesMod.ResourceId
import typings.gitlab.distTemplatesResourceMilestonesMod.ResourceMilestones
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/templates/ResourceMilestones", JSImport.Namespace)
@js.native
object distTemplatesResourceMilestonesMod extends js.Object {
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

