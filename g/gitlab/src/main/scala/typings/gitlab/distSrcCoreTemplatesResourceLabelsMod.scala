package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.LabelId
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreTemplatesResourceLabelsMod.ResourceLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceLabels", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceLabelsMod extends js.Object {
  @js.native
  trait ResourceLabels extends BaseService {
    def all(resourceId: ResourceId): js.Promise[GetResponse] = js.native
    def all(resourceId: ResourceId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(resourceId: ResourceId, labelName: String, color: String): js.Promise[js.Object] = js.native
    def create(resourceId: ResourceId, labelName: String, color: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(resourceId: ResourceId, labelName: String): js.Promise[js.Object] = js.native
    def edit(resourceId: ResourceId, labelName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(resourceId: ResourceId, labelName: String): js.Promise[js.Object] = js.native
    def remove(resourceId: ResourceId, labelName: String, options: Sudo): js.Promise[js.Object] = js.native
    def subscribe(resourceId: ResourceId, labelId: LabelId): js.Promise[js.Object] = js.native
    def subscribe(resourceId: ResourceId, labelId: LabelId, options: Sudo): js.Promise[js.Object] = js.native
    def unsubscribe(resourceId: ResourceId, labelId: LabelId): js.Promise[js.Object] = js.native
    def unsubscribe(resourceId: ResourceId, labelId: LabelId, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default protected () extends ResourceLabels {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

