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
  def apply(
    beta: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null,
    localizedRuleName: String = null,
    ruleImpact: js.UndefOr[Double] = js.undefined,
    summary: SchemaPagespeedApiFormatStringV4 = null,
    urlBlocks: js.Array[HeaderUrls] = null
  ): Beta = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beta)) __obj.updateDynamic("beta")(beta.get.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (localizedRuleName != null) __obj.updateDynamic("localizedRuleName")(localizedRuleName.asInstanceOf[js.Any])
    if (!js.isUndefined(ruleImpact)) __obj.updateDynamic("ruleImpact")(ruleImpact.get.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (urlBlocks != null) __obj.updateDynamic("urlBlocks")(urlBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beta]
  }
}

