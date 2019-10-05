package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesGitignoreTemplatesMod.GitignoreTemplates
import typings.gitlab.distTemplatesMod.ResourceTemplates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/GitignoreTemplates", JSImport.Namespace)
@js.native
object distServicesGitignoreTemplatesMod extends js.Object {
  @js.native
  class default protected () extends GitignoreTemplates {
    def this(options: BaseServiceOptions) = this()
  }
  
  type GitignoreTemplates = ResourceTemplates
}

