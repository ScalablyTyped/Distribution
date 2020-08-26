package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.SchemaPagespeedApiFormatStringV4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Beta extends js.Object {
  var beta: js.UndefOr[Boolean] = js.native
  var groups: js.UndefOr[js.Array[String]] = js.native
  var localizedRuleName: js.UndefOr[String] = js.native
  var ruleImpact: js.UndefOr[Double] = js.native
  var summary: js.UndefOr[SchemaPagespeedApiFormatStringV4] = js.native
  var urlBlocks: js.UndefOr[js.Array[HeaderUrls]] = js.native
}

object Beta {
  @scala.inline
  def apply(): Beta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beta]
  }
  @scala.inline
  implicit class BetaOps[Self <: Beta] (val x: Self) extends AnyVal {
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
    def setBeta(value: Boolean): Self = this.set("beta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeta: Self = this.set("beta", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setLocalizedRuleName(value: String): Self = this.set("localizedRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizedRuleName: Self = this.set("localizedRuleName", js.undefined)
    @scala.inline
    def setRuleImpact(value: Double): Self = this.set("ruleImpact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleImpact: Self = this.set("ruleImpact", js.undefined)
    @scala.inline
    def setSummary(value: SchemaPagespeedApiFormatStringV4): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setUrlBlocksVarargs(value: HeaderUrls*): Self = this.set("urlBlocks", js.Array(value :_*))
    @scala.inline
    def setUrlBlocks(value: js.Array[HeaderUrls]): Self = this.set("urlBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlBlocks: Self = this.set("urlBlocks", js.undefined)
  }
  
}

