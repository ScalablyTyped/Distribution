package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesGroupVariablesMod.GroupVariables
import typings.gitlab.distTemplatesMod.ResourceVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/GroupVariables", JSImport.Namespace)
@js.native
object distServicesGroupVariablesMod extends js.Object {
  @js.native
  class default protected () extends GroupVariables {
    def this(options: BaseServiceOptions) = this()
  }
  
  type GroupVariables = ResourceVariables
}

