package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/GroupLabels", JSImport.Namespace)
@js.native
object groupLabelsMod extends js.Object {
  
  @js.native
  class GroupLabels protected () extends ResourceLabels {
    def this(options: BaseServiceOptions) = this()
  }
}
