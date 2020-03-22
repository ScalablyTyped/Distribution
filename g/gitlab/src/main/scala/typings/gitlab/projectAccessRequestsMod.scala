package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceAccessRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ProjectAccessRequests", JSImport.Namespace)
@js.native
object projectAccessRequestsMod extends js.Object {
  @js.native
  class ProjectAccessRequests protected () extends ResourceAccessRequests {
    def this(options: BaseServiceOptions) = this()
  }
  
}

