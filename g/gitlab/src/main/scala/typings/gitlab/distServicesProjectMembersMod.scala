package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesProjectMembersMod.ProjectMembers
import typings.gitlab.distTemplatesMod.ResourceMembers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ProjectMembers", JSImport.Namespace)
@js.native
object distServicesProjectMembersMod extends js.Object {
  @js.native
  class default protected () extends ProjectMembers {
    def this(options: BaseServiceOptions) = this()
  }
  
  type ProjectMembers = ResourceMembers
}

