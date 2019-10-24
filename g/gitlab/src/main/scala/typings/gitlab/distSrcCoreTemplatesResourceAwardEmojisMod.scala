package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.AwardId
import typings.gitlab.distSrcCoreServicesMod.NoteId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesMod.ResourceId
import typings.gitlab.distSrcCoreTemplatesResourceAwardEmojisMod.ResourceAwardsEmojis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates/ResourceAwardEmojis", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesResourceAwardEmojisMod extends js.Object {
  @js.native
  trait ResourceAwardsEmojis extends BaseService {
    var resourceType: String = js.native
    def all(projectId: ProjectId, resourceId: ResourceId, noteId: NoteId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, resourceId: ResourceId, noteId: NoteId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def award(projectId: ProjectId, resourceId: ResourceId, name: String, noteId: NoteId): js.Promise[js.Object] = js.native
    def award(projectId: ProjectId, resourceId: ResourceId, name: String, noteId: NoteId, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, resourceId: ResourceId, awardId: AwardId, noteId: NoteId): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, resourceId: ResourceId, awardId: AwardId, noteId: NoteId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, resourceId: ResourceId, awardId: AwardId, noteId: NoteId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, resourceId: ResourceId, awardId: AwardId, noteId: NoteId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default protected () extends ResourceAwardsEmojis {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

