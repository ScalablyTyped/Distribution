package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesGroupMembersMod.GroupMembers
import typings.gitlab.distTemplatesMod.ResourceMembers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/GroupMembers", JSImport.Namespace)
@js.native
object distServicesGroupMembersMod extends js.Object {
  @js.native
  class default protected () extends GroupMembers {
    def this(options: BaseServiceOptions) = this()
  }
  
  type GroupMembers = ResourceMembers
}

