package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Labels", JSImport.Namespace)
@js.native
object labelsMod extends js.Object {
  @js.native
  class Labels protected () extends ResourceLabels {
    def this(options: BaseServiceOptions) = this()
  }
  
}

