package typings.gapiDotClientDotPagespeedonline

import typings.gapiDotClientDotPagespeedonline.gapi.client.pagespeedonline.PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groups extends js.Object {
  /** List of rule groups that this rule belongs to. Each entry in the list is one of "SPEED" or "USABILITY". */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  /** Localized name of the rule, intended for presentation to a user. */
  var localizedRuleName: js.UndefOr[String] = js.undefined
  /**
    * The impact (unbounded floating point value) that implementing the suggestions for this rule would have on making the page faster. Impact is comparable
    * between rules to determine which rule's suggestions would have a higher or lower impact on making a page faster. For instance, if enabling compression
    * would save 1MB, while optimizing images would save 500kB, the enable compression rule would have 2x the impact of the image optimization rule, all
    * other things being equal.
    */
  var ruleImpact: js.UndefOr[Double] = js.undefined
  /** A brief summary description for the rule, indicating at a high level what should be done to follow the rule and what benefit can be gained by doing so. */
  var summary: js.UndefOr[PagespeedApiFormatStringV2] = js.undefined
  /** List of blocks of URLs. Each block may contain a heading and a list of URLs. Each URL may optionally include additional details. */
  var urlBlocks: js.UndefOr[js.Array[Anon_Header]] = js.undefined
}

object Anon_Groups {
  @scala.inline
  def apply(
    groups: js.Array[String] = null,
    localizedRuleName: String = null,
    ruleImpact: Int | Double = null,
    summary: PagespeedApiFormatStringV2 = null,
    urlBlocks: js.Array[Anon_Header] = null
  ): Anon_Groups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (localizedRuleName != null) __obj.updateDynamic("localizedRuleName")(localizedRuleName.asInstanceOf[js.Any])
    if (ruleImpact != null) __obj.updateDynamic("ruleImpact")(ruleImpact.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (urlBlocks != null) __obj.updateDynamic("urlBlocks")(urlBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Groups]
  }
}

