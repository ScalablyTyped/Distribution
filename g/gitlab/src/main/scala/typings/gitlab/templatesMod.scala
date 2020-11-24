package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/templates", JSImport.Namespace)
@js.native
object templatesMod extends js.Object {
  
  @js.native
  class ResourceAccessRequests protected ()
    extends typings.gitlab.resourceAccessRequestsMod.ResourceAccessRequests {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceAwardEmojis protected ()
    extends typings.gitlab.resourceAwardEmojisMod.ResourceAwardEmojis {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceBadges protected ()
    extends typings.gitlab.resourceBadgesMod.ResourceBadges {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceCustomAttributes protected ()
    extends typings.gitlab.resourceCustomAttributesMod.ResourceCustomAttributes {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceDiscussions protected ()
    extends typings.gitlab.resourceDiscussionsMod.ResourceDiscussions {
    def this(resourceType: String, resource2Type: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceIssueBoards protected ()
    extends typings.gitlab.resourceIssueBoardsMod.ResourceIssueBoards {
    def this(resourceType: String, options: js.Any) = this()
  }
  
  @js.native
  class ResourceLabels protected ()
    extends typings.gitlab.resourceLabelsMod.ResourceLabels {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceMembers protected ()
    extends typings.gitlab.resourceMembersMod.ResourceMembers {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceMilestones protected ()
    extends typings.gitlab.resourceMilestonesMod.ResourceMilestones {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceNotes protected ()
    extends typings.gitlab.resourceNotesMod.ResourceNotes {
    def this(resourceType: String, resource2Type: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceTemplates protected ()
    extends typings.gitlab.resourceTemplatesMod.ResourceTemplates {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceVariables protected ()
    extends typings.gitlab.resourceVariablesMod.ResourceVariables {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
}
