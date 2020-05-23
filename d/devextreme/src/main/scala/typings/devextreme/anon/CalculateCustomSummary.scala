package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalculateCustomSummary extends js.Object {
  var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ TotalValue, _]] = js.undefined
  var groupItems: js.UndefOr[js.Array[AlignByColumn]] = js.undefined
  var recalculateWhileEditing: js.UndefOr[Boolean] = js.undefined
  var skipEmptyValues: js.UndefOr[Boolean] = js.undefined
  var texts: js.UndefOr[Avg] = js.undefined
  var totalItems: js.UndefOr[js.Array[Alignment]] = js.undefined
}

object CalculateCustomSummary {
  @scala.inline
  def apply(
    calculateCustomSummary: /* options */ TotalValue => _ = null,
    groupItems: js.Array[AlignByColumn] = null,
    recalculateWhileEditing: js.UndefOr[Boolean] = js.undefined,
    skipEmptyValues: js.UndefOr[Boolean] = js.undefined,
    texts: Avg = null,
    totalItems: js.Array[Alignment] = null
  ): CalculateCustomSummary = {
    val __obj = js.Dynamic.literal()
    if (calculateCustomSummary != null) __obj.updateDynamic("calculateCustomSummary")(js.Any.fromFunction1(calculateCustomSummary))
    if (groupItems != null) __obj.updateDynamic("groupItems")(groupItems.asInstanceOf[js.Any])
    if (!js.isUndefined(recalculateWhileEditing)) __obj.updateDynamic("recalculateWhileEditing")(recalculateWhileEditing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyValues)) __obj.updateDynamic("skipEmptyValues")(skipEmptyValues.get.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculateCustomSummary]
  }
}

