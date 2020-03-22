package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceMembers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ProjectMembers", JSImport.Namespace)
@js.native
object projectMembersMod extends js.Object {
  @js.native
  class ProjectMembers protected () extends ResourceMembers {
    def this(options: BaseServiceOptions) = this()
  }
  
}

