package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesLintMod.Lint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Lint", JSImport.Namespace)
@js.native
object distServicesLintMod extends js.Object {
  @js.native
  trait Lint extends BaseService {
    def lint(content: String): js.Promise[js.Object] = js.native
    def lint(content: String, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends Lint
  
}

