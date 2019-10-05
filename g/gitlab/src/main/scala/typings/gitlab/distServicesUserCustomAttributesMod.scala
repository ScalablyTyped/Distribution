package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesUserCustomAttributesMod.UserCustomAttributes
import typings.gitlab.distTemplatesMod.ResourceCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/UserCustomAttributes", JSImport.Namespace)
@js.native
object distServicesUserCustomAttributesMod extends js.Object {
  @js.native
  class default protected () extends UserCustomAttributes {
    def this(options: BaseServiceOptions) = this()
  }
  
  type UserCustomAttributes = ResourceCustomAttributes
}

