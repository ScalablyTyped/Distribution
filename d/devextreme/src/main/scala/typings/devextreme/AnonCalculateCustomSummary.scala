package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalculateCustomSummary extends js.Object {
  var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ AnonTotalValue, _]] = js.undefined
  var groupItems: js.UndefOr[js.Array[AnonAlignByColumn]] = js.undefined
  var recalculateWhileEditing: js.UndefOr[Boolean] = js.undefined
  var skipEmptyValues: js.UndefOr[Boolean] = js.undefined
  var texts: js.UndefOr[AnonAvg] = js.undefined
  var totalItems: js.UndefOr[js.Array[AnonAlignment]] = js.undefined
}

object AnonCalculateCustomSummary {
  @scala.inline
  def apply(
    calculateCustomSummary: /* options */ AnonTotalValue => _ = null,
    groupItems: js.Array[AnonAlignByColumn] = null,
    recalculateWhileEditing: js.UndefOr[Boolean] = js.undefined,
    skipEmptyValues: js.UndefOr[Boolean] = js.undefined,
    texts: AnonAvg = null,
    totalItems: js.Array[AnonAlignment] = null
  ): AnonCalculateCustomSummary = {
    val __obj = js.Dynamic.literal()
    if (calculateCustomSummary != null) __obj.updateDynamic("calculateCustomSummary")(js.Any.fromFunction1(calculateCustomSummary))
    if (groupItems != null) __obj.updateDynamic("groupItems")(groupItems.asInstanceOf[js.Any])
    if (!js.isUndefined(recalculateWhileEditing)) __obj.updateDynamic("recalculateWhileEditing")(recalculateWhileEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyValues)) __obj.updateDynamic("skipEmptyValues")(skipEmptyValues.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalculateCustomSummary]
  }
}

