package typings.gapiClientPagespeedonline.anon

import typings.gapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  /** List of rule groups that this rule belongs to. Each entry in the list is one of "SPEED" or "USABILITY". */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /** Localized name of the rule, intended for presentation to a user. */
  var localizedRuleName: js.UndefOr[String] = js.native
  /**
    * The impact (unbounded floating point value) that implementing the suggestions for this rule would have on making the page faster. Impact is comparable
    * between rules to determine which rule's suggestions would have a higher or lower impact on making a page faster. For instance, if enabling compression
    * would save 1MB, while optimizing images would save 500kB, the enable compression rule would have 2x the impact of the image optimization rule, all
    * other things being equal.
    */
  var ruleImpact: js.UndefOr[Double] = js.native
  /** A brief summary description for the rule, indicating at a high level what should be done to follow the rule and what benefit can be gained by doing so. */
  var summary: js.UndefOr[PagespeedApiFormatStringV2] = js.native
  /** List of blocks of URLs. Each block may contain a heading and a list of URLs. Each URL may optionally include additional details. */
  var urlBlocks: js.UndefOr[js.Array[Header]] = js.native
}

object Groups {
  @scala.inline
  def apply(): Groups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groups]
  }
  @scala.inline
  implicit class GroupsOps[Self <: Groups] (val x: Self) extends AnyVal {
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
    def setSummary(value: PagespeedApiFormatStringV2): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setUrlBlocksVarargs(value: Header*): Self = this.set("urlBlocks", js.Array(value :_*))
    @scala.inline
    def setUrlBlocks(value: js.Array[Header]): Self = this.set("urlBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlBlocks: Self = this.set("urlBlocks", js.undefined)
  }
  
}

