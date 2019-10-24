package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreTemplatesResourceAccessRequestsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/templates", JSImport.Namespace)
@js.native
object distSrcCoreTemplatesMod extends js.Object {
  @js.native
  class ResourceAccessRequests protected () extends default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceAwardEmojis protected ()
    extends typings.gitlab.distSrcCoreTemplatesResourceAwardEmojisMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceBadges protected ()
    extends typings.gitlab.distSrcCoreTemplatesResourceBadgesMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceCustomAttributes protected ()
    extends typings.gitlab.distSrcCoreTemplatesResourceCustomAttributesMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceDiscussions protected ()
    extends typings.gitlab.distSrcCoreTemplatesResourceDiscussionsMod.default {
    def this(resourceType: String, resource2Type: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceIssueBoards protected ()
    extends typings.gitlab.distSrcCoreTemplatesResourceIssueBoardsMod.default {
    def this(resourceType: String, options: js.Any) = this()
  }
  
  @js.native
  class ResourceLabels protected ()
    extends typings.gitlab.distSrcCoreTemplatesResourceLabelsMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceMembers protected ()
    extends typings.gitlab.distSrcCoreTemplatesResourceMembersMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceMilestones protected ()
    extends typings.gitlab.distSrcCoreTemplatesResourceMilestonesMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceNotes protected ()
    extends typings.gitlab.distSrcCoreTemplatesResourceNotesMod.default {
    def this(resourceType: String, resource2Type: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceTemplates protected ()
    extends typings.gitlab.distSrcCoreTemplatesResourceTemplatesMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceVariables protected ()
    extends typings.gitlab.distSrcCoreTemplatesResourceVariablesMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

