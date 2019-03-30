package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var assetId: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var targetingTemplateId: js.UndefOr[java.lang.String] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    assetId: java.lang.String = null,
    name: java.lang.String = null,
    targetingTemplateId: java.lang.String = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (assetId != null) __obj.updateDynamic("assetId")(assetId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (targetingTemplateId != null) __obj.updateDynamic("targetingTemplateId")(targetingTemplateId)
    __obj.asInstanceOf[Rule]
  }
}

