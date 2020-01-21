package typings.forkTsCheckerWebpackPlugin.messageMod

import typings.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var diagnostics: js.Array[NormalizedMessage]
  var lints: js.Array[NormalizedMessage]
}

object Message {
  @scala.inline
  def apply(diagnostics: js.Array[NormalizedMessage], lints: js.Array[NormalizedMessage]): Message = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], lints = lints.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Message]
  }
}

