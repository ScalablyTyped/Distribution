package typings.gitlab

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Markdown", JSImport.Namespace)
@js.native
object markdownMod extends js.Object {
  @js.native
  class Markdown () extends BaseService {
    def render(text: String, options: AnonGfm with Sudo): js.Promise[js.Object] = js.native
  }
  
}

