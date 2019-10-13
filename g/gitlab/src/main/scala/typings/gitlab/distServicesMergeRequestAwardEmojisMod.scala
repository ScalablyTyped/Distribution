package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseServiceOptions
import typings.gitlab.distTemplatesMod.ResourceAwardEmojis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/MergeRequestAwardEmojis", JSImport.Namespace)
@js.native
object distServicesMergeRequestAwardEmojisMod extends js.Object {
  @js.native
  class default protected () extends ResourceAwardEmojis {
    def this(options: BaseServiceOptions) = this()
  }
  
  type MergeRequestAwardEmojis = ResourceAwardEmojis
}

