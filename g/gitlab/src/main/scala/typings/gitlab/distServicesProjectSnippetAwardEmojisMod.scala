package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distServicesProjectSnippetAwardEmojisMod.ProjectSnippetAwardEmojis
import typings.gitlab.distTemplatesMod.ResourceAwardEmojis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ProjectSnippetAwardEmojis", JSImport.Namespace)
@js.native
object distServicesProjectSnippetAwardEmojisMod extends js.Object {
  @js.native
  class default protected () extends ProjectSnippetAwardEmojis {
    def this(options: BaseServiceOptions) = this()
  }
  
  type ProjectSnippetAwardEmojis = ResourceAwardEmojis
}

