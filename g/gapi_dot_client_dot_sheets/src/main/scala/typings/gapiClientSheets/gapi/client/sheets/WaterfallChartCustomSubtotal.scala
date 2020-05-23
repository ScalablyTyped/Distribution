package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartCustomSubtotal extends js.Object {
  /**
    * True if the data point at subtotal_index is the subtotal. If false,
    * the subtotal will be computed and appear after the data point.
    */
  var dataIsSubtotal: js.UndefOr[Boolean] = js.undefined
  /** A label for the subtotal column. */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The 0-based index of a data point within the series. If
    * data_is_subtotal is true, the data point at this index is the
    * subtotal. Otherwise, the subtotal appears after the data point with
    * this index. A series can have multiple subtotals at arbitrary indices,
    * but subtotals do not affect the indices of the data points. For
    * example, if a series has three data points, their indices will always
    * be 0, 1, and 2, regardless of how many subtotals exist on the series or
    * what data points they are associated with.
    */
  var subtotalIndex: js.UndefOr[Double] = js.undefined
}

object WaterfallChartCustomSubtotal {
  @scala.inline
  def apply(
    dataIsSubtotal: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    subtotalIndex: js.UndefOr[Double] = js.undefined
  ): WaterfallChartCustomSubtotal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataIsSubtotal)) __obj.updateDynamic("dataIsSubtotal")(dataIsSubtotal.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(subtotalIndex)) __obj.updateDynamic("subtotalIndex")(subtotalIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterfallChartCustomSubtotal]
  }
}

