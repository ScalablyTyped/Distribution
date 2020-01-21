package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/UserCustomAttributes", JSImport.Namespace)
@js.native
object userCustomAttributesMod extends js.Object {
  @js.native
  class UserCustomAttributes () extends ResourceCustomAttributes {
    def this(options: BaseServiceOptions) = this()
  }
  
}

