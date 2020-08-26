package typings.empower.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var destructive: js.UndefOr[Boolean] = js.native
  var modifyMessageOnRethrow: js.UndefOr[Boolean] = js.native
  var patterns: js.UndefOr[js.Array[String]] = js.native
  var saveContextOnRethrow: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDestructive(value: Boolean): Self = this.set("destructive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestructive: Self = this.set("destructive", js.undefined)
    @scala.inline
    def setModifyMessageOnRethrow(value: Boolean): Self = this.set("modifyMessageOnRethrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyMessageOnRethrow: Self = this.set("modifyMessageOnRethrow", js.undefined)
    @scala.inline
    def setPatternsVarargs(value: String*): Self = this.set("patterns", js.Array(value :_*))
    @scala.inline
    def setPatterns(value: js.Array[String]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatterns: Self = this.set("patterns", js.undefined)
    @scala.inline
    def setSaveContextOnRethrow(value: Boolean): Self = this.set("saveContextOnRethrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveContextOnRethrow: Self = this.set("saveContextOnRethrow", js.undefined)
  }
  
}

