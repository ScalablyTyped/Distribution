package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesGitLabCIYMLTemplatesMod.GitLabCIYMLTemplates
import typings.gitlab.distTemplatesMod.ResourceTemplates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/GitLabCIYMLTemplates", JSImport.Namespace)
@js.native
object distServicesGitLabCIYMLTemplatesMod extends js.Object {
  @js.native
  class default protected () extends GitLabCIYMLTemplates {
    def this(options: BaseServiceOptions) = this()
  }
  
  type GitLabCIYMLTemplates = ResourceTemplates
}

