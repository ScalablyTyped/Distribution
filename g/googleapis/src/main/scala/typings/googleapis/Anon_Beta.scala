package typings.googleapis

import typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4.Schema$PagespeedApiFormatStringV4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Beta extends js.Object {
  var beta: js.UndefOr[Boolean] = js.native
  var groups: js.UndefOr[js.Array[String]] = js.native
  var localizedRuleName: js.UndefOr[String] = js.native
  var ruleImpact: js.UndefOr[Double] = js.native
  var summary: js.UndefOr[Schema$PagespeedApiFormatStringV4] = js.native
  var urlBlocks: js.UndefOr[js.Array[Anon_HeaderUrlsAnonDetailsResultArraySchemaPagespeedApiFormatStringV4]] = js.native
}

object Anon_Beta {
  @scala.inline
  def apply(
    beta: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null,
    localizedRuleName: String = null,
    ruleImpact: Int | Double = null,
    summary: Schema$PagespeedApiFormatStringV4 = null,
    urlBlocks: js.Array[Anon_HeaderUrlsAnonDetailsResultArraySchemaPagespeedApiFormatStringV4] = null
  ): Anon_Beta = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beta)) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (localizedRuleName != null) __obj.updateDynamic("localizedRuleName")(localizedRuleName.asInstanceOf[js.Any])
    if (ruleImpact != null) __obj.updateDynamic("ruleImpact")(ruleImpact.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (urlBlocks != null) __obj.updateDynamic("urlBlocks")(urlBlocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Beta]
  }
}

