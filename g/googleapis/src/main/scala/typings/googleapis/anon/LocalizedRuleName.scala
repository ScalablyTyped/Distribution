package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedRuleName extends js.Object {
  var localizedRuleName: js.UndefOr[String] = js.native
  var ruleImpact: js.UndefOr[Double] = js.native
  var urlBlocks: js.UndefOr[js.Array[Header]] = js.native
}

object LocalizedRuleName {
  @scala.inline
  def apply(): LocalizedRuleName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedRuleName]
  }
  @scala.inline
  implicit class LocalizedRuleNameOps[Self <: LocalizedRuleName] (val x: Self) extends AnyVal {
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
    def setLocalizedRuleName(value: String): Self = this.set("localizedRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedRuleName: Self = this.set("localizedRuleName", js.undefined)
    @scala.inline
    def setRuleImpact(value: Double): Self = this.set("ruleImpact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleImpact: Self = this.set("ruleImpact", js.undefined)
    @scala.inline
    def setUrlBlocksVarargs(value: Header*): Self = this.set("urlBlocks", js.Array(value :_*))
    @scala.inline
    def setUrlBlocks(value: js.Array[Header]): Self = this.set("urlBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlBlocks: Self = this.set("urlBlocks", js.undefined)
  }
  
}

