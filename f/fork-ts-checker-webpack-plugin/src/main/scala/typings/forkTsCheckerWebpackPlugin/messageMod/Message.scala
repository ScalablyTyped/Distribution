package typings.forkTsCheckerWebpackPlugin.messageMod

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var diagnostics: js.Array[Issue]
  var lints: js.Array[Issue]
}

object Message {
  @scala.inline
  def apply(diagnostics: js.Array[Issue], lints: js.Array[Issue]): Message = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], lints = lints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

