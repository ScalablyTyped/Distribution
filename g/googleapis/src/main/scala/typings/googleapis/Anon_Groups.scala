package typings.googleapis

import typings.googleapis.buildSrcApisPagespeedonlineV2Mod.pagespeedonline_v2.Schema$PagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Groups extends js.Object {
  var groups: js.UndefOr[js.Array[String]] = js.native
  var localizedRuleName: js.UndefOr[String] = js.native
  var ruleImpact: js.UndefOr[Double] = js.native
  var summary: js.UndefOr[Schema$PagespeedApiFormatStringV2] = js.native
  var urlBlocks: js.UndefOr[js.Array[Anon_HeaderUrls]] = js.native
}

object Anon_Groups {
  @scala.inline
  def apply(
    groups: js.Array[String] = null,
    localizedRuleName: String = null,
    ruleImpact: Int | Double = null,
    summary: Schema$PagespeedApiFormatStringV2 = null,
    urlBlocks: js.Array[Anon_HeaderUrls] = null
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

