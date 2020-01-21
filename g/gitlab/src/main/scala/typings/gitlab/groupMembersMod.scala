package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceMembers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/GroupMembers", JSImport.Namespace)
@js.native
object groupMembersMod extends js.Object {
  @js.native
  class GroupMembers () extends ResourceMembers {
    def this(options: BaseServiceOptions) = this()
  }
  
}

