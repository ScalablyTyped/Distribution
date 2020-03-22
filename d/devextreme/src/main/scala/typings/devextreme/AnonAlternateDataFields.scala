package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlternateDataFields extends js.Object {
  var alternateDataFields: js.UndefOr[Boolean] = js.undefined
  var customizeChart: js.UndefOr[js.Function] = js.undefined
  var customizeSeries: js.UndefOr[js.Function] = js.undefined
  var dataFieldsDisplayMode: js.UndefOr[String] = js.undefined
  var inverted: js.UndefOr[Boolean] = js.undefined
  var processCell: js.UndefOr[js.Function] = js.undefined
  var putDataFieldsInto: js.UndefOr[String] = js.undefined
}

object AnonAlternateDataFields {
  @scala.inline
  def apply(
    alternateDataFields: js.UndefOr[Boolean] = js.undefined,
    customizeChart: js.Function = null,
    customizeSeries: js.Function = null,
    dataFieldsDisplayMode: String = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    processCell: js.Function = null,
    putDataFieldsInto: String = null
  ): AnonAlternateDataFields = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alternateDataFields)) __obj.updateDynamic("alternateDataFields")(alternateDataFields.asInstanceOf[js.Any])
    if (customizeChart != null) __obj.updateDynamic("customizeChart")(customizeChart.asInstanceOf[js.Any])
    if (customizeSeries != null) __obj.updateDynamic("customizeSeries")(customizeSeries.asInstanceOf[js.Any])
    if (dataFieldsDisplayMode != null) __obj.updateDynamic("dataFieldsDisplayMode")(dataFieldsDisplayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (processCell != null) __obj.updateDynamic("processCell")(processCell.asInstanceOf[js.Any])
    if (putDataFieldsInto != null) __obj.updateDynamic("putDataFieldsInto")(putDataFieldsInto.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlternateDataFields]
  }
}

