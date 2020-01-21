package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPopulationTerm extends js.Object {
  var contains: js.UndefOr[Boolean] = js.undefined
  var negation: js.UndefOr[Boolean] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
  var remarketingListId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var variableFriendlyName: js.UndefOr[String] = js.undefined
  var variableName: js.UndefOr[String] = js.undefined
}

object ListPopulationTerm {
  @scala.inline
  def apply(
    contains: js.UndefOr[Boolean] = js.undefined,
    negation: js.UndefOr[Boolean] = js.undefined,
    operator: String = null,
    remarketingListId: String = null,
    `type`: String = null,
    value: String = null,
    variableFriendlyName: String = null,
    variableName: String = null
  ): ListPopulationTerm = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contains)) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (!js.isUndefined(negation)) __obj.updateDynamic("negation")(negation.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (remarketingListId != null) __obj.updateDynamic("remarketingListId")(remarketingListId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variableFriendlyName != null) __obj.updateDynamic("variableFriendlyName")(variableFriendlyName.asInstanceOf[js.Any])
    if (variableName != null) __obj.updateDynamic("variableName")(variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPopulationTerm]
  }
}

