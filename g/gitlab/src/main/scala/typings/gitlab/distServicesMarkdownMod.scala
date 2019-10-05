package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMarkdownMod.Markdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Markdown", JSImport.Namespace)
@js.native
object distServicesMarkdownMod extends js.Object {
  @js.native
  trait Markdown extends BaseService {
    def render(text: String, options: Anon_Gfm with Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends Markdown
  
}

