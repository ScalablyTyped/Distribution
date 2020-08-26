package typings.forkTsCheckerWebpackPlugin.eslintMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintResult
  extends /* key */ StringDictionary[js.Any] {
  var filePath: String = js.native
  var messages: js.Array[LintMessage] = js.native
}

object LintResult {
  @scala.inline
  def apply(filePath: String, messages: js.Array[LintMessage]): LintResult = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResult]
  }
  @scala.inline
  implicit class LintResultOps[Self <: LintResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagesVarargs(value: LintMessage*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[LintMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
  }
  
}

