package typings.gitlab

import typings.gitlab.infrastructureMod.BaseService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Markdown", JSImport.Namespace)
@js.native
object markdownMod extends js.Object {
  @js.native
  class Markdown () extends BaseService {
    def render(text: String): js.Promise[js.Object] = js.native
    def render(text: String, options: gfmstringprojectstringnum): js.Promise[js.Object] = js.native
  }
  
}

