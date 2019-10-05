package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesProjectCustomAttributesMod.ProjectCustomAttributes
import typings.gitlab.distTemplatesMod.ResourceCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ProjectCustomAttributes", JSImport.Namespace)
@js.native
object distServicesProjectCustomAttributesMod extends js.Object {
  @js.native
  class default protected () extends ProjectCustomAttributes {
    def this(options: BaseServiceOptions) = this()
  }
  
  type ProjectCustomAttributes = ResourceCustomAttributes
}

