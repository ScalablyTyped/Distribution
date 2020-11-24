package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceDiscussions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/EpicDiscussions", JSImport.Namespace)
@js.native
object epicDiscussionsMod extends js.Object {
  
  @js.native
  class EpicDiscussions protected () extends ResourceDiscussions {
    def this(options: BaseServiceOptions) = this()
  }
}
