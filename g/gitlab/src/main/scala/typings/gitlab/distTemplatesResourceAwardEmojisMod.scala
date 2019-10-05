package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.AwardId
import typings.gitlab.distServicesMod.NoteId
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesMod.ResourceId
import typings.gitlab.distTemplatesResourceAwardEmojisMod.ResourceAwardsEmojis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/templates/ResourceAwardEmojis", JSImport.Namespace)
@js.native
object distTemplatesResourceAwardEmojisMod extends js.Object {
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

