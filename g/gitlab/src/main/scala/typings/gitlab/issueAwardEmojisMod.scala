package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceAwardEmojis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/IssueAwardEmojis", JSImport.Namespace)
@js.native
object issueAwardEmojisMod extends js.Object {
  @js.native
  class IssueAwardEmojis protected () extends ResourceAwardEmojis {
    def this(options: BaseServiceOptions) = this()
  }
  
}

