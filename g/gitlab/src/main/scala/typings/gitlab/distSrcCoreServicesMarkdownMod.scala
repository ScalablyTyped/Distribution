package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMarkdownMod.Markdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Markdown", JSImport.Namespace)
@js.native
object distSrcCoreServicesMarkdownMod extends js.Object {
  @js.native
  trait Markdown extends BaseService {
    def render(text: String, options: Anon_Gfm with Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends Markdown
  
}

