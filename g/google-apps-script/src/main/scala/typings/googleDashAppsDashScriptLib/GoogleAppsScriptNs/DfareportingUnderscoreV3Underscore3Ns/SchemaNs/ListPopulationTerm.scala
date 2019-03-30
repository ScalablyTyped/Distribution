package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPopulationTerm extends js.Object {
  var contains: js.UndefOr[scala.Boolean] = js.undefined
  var negation: js.UndefOr[scala.Boolean] = js.undefined
  var operator: js.UndefOr[java.lang.String] = js.undefined
  var remarketingListId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var variableFriendlyName: js.UndefOr[java.lang.String] = js.undefined
  var variableName: js.UndefOr[java.lang.String] = js.undefined
}

object ListPopulationTerm {
  @scala.inline
  def apply(
    contains: js.UndefOr[scala.Boolean] = js.undefined,
    negation: js.UndefOr[scala.Boolean] = js.undefined,
    operator: java.lang.String = null,
    remarketingListId: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null,
    variableFriendlyName: java.lang.String = null,
    variableName: java.lang.String = null
  ): ListPopulationTerm = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contains)) __obj.updateDynamic("contains")(contains)
    if (!js.isUndefined(negation)) __obj.updateDynamic("negation")(negation)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (remarketingListId != null) __obj.updateDynamic("remarketingListId")(remarketingListId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    if (variableFriendlyName != null) __obj.updateDynamic("variableFriendlyName")(variableFriendlyName)
    if (variableName != null) __obj.updateDynamic("variableName")(variableName)
    __obj.asInstanceOf[ListPopulationTerm]
  }
}

