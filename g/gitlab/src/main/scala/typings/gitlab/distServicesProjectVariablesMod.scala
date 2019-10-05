package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesProjectVariablesMod.ProjectVariables
import typings.gitlab.distTemplatesMod.ResourceVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ProjectVariables", JSImport.Namespace)
@js.native
object distServicesProjectVariablesMod extends js.Object {
  @js.native
  class default protected () extends ProjectVariables {
    def this(options: BaseServiceOptions) = this()
  }
  
  type ProjectVariables = ResourceVariables
}

