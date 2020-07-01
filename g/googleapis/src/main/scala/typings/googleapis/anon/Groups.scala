package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  var groups: js.UndefOr[js.Array[String]] = js.native
  var localizedRuleName: js.UndefOr[String] = js.native
  var ruleImpact: js.UndefOr[Double] = js.native
  var summary: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.native
  var urlBlocks: js.UndefOr[js.Array[Urls]] = js.native
}

object Groups {
  @scala.inline
  def apply(
    groups: js.Array[String] = null,
    localizedRuleName: String = null,
    ruleImpact: js.UndefOr[Double] = js.undefined,
    summary: SchemaPagespeedApiFormatStringV2 = null,
    urlBlocks: js.Array[Urls] = null
  ): Groups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (localizedRuleName != null) __obj.updateDynamic("localizedRuleName")(localizedRuleName.asInstanceOf[js.Any])
    if (!js.isUndefined(ruleImpact)) __obj.updateDynamic("ruleImpact")(ruleImpact.get.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (urlBlocks != null) __obj.updateDynamic("urlBlocks")(urlBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

