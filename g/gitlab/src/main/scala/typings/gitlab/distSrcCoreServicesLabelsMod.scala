package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseServiceOptions
import typings.gitlab.distSrcCoreTemplatesMod.ResourceLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Labels", JSImport.Namespace)
@js.native
object distSrcCoreServicesLabelsMod extends js.Object {
  @js.native
  class default protected () extends ResourceLabels {
    def this(options: BaseServiceOptions) = this()
  }
  
  type Labels = ResourceLabels
}

