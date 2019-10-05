package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distTemplatesResourceAccessRequestsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/templates", JSImport.Namespace)
@js.native
object distTemplatesMod extends js.Object {
  @js.native
  class ResourceAccessRequests protected () extends default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceAwardEmojis protected ()
    extends typings.gitlab.distTemplatesResourceAwardEmojisMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceBadges protected ()
    extends typings.gitlab.distTemplatesResourceBadgesMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceCustomAttributes protected ()
    extends typings.gitlab.distTemplatesResourceCustomAttributesMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceDiscussions protected ()
    extends typings.gitlab.distTemplatesResourceDiscussionsMod.default {
    def this(resourceType: String, resource2Type: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceIssueBoards protected ()
    extends typings.gitlab.distTemplatesResourceIssueBoardsMod.default {
    def this(resourceType: String, options: js.Any) = this()
  }
  
  @js.native
  class ResourceMembers protected ()
    extends typings.gitlab.distTemplatesResourceMembersMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceMilestones protected ()
    extends typings.gitlab.distTemplatesResourceMilestonesMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceNotes protected ()
    extends typings.gitlab.distTemplatesResourceNotesMod.default {
    def this(resourceType: String, resource2Type: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceTemplates protected ()
    extends typings.gitlab.distTemplatesResourceTemplatesMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
  @js.native
  class ResourceVariables protected ()
    extends typings.gitlab.distTemplatesResourceVariablesMod.default {
    def this(resourceType: String, options: BaseServiceOptions) = this()
  }
  
}

