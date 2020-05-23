package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawIndicatorsEventArgs extends js.Object {
  /** returns the current Indicator element.
    */
  var IndicatorElement: js.UndefOr[js.Any] = js.undefined
  /** returns the index of the Indicator.
    */
  var IndicatorIndex: js.UndefOr[Double] = js.undefined
  /** returns the gauge model
    */
  var Model: js.UndefOr[js.Any] = js.undefined
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** returns the startX and startY of the Indicator
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.undefined
  /** returns the scaleIndex to which the pointer belongs.
    */
  var scaleIndex: js.UndefOr[Double] = js.undefined
  /** returns the Indicator style
    */
  var style: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object DrawIndicatorsEventArgs {
  @scala.inline
  def apply(
    IndicatorElement: js.Any = null,
    IndicatorIndex: js.UndefOr[Double] = js.undefined,
    Model: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    `object`: js.Any = null,
    position: js.Any = null,
    scaleElement: js.Any = null,
    scaleIndex: js.UndefOr[Double] = js.undefined,
    style: String = null,
    `type`: js.Any = null
  ): DrawIndicatorsEventArgs = {
    val __obj = js.Dynamic.literal()
    if (IndicatorElement != null) __obj.updateDynamic("IndicatorElement")(IndicatorElement.asInstanceOf[js.Any])
    if (!js.isUndefined(IndicatorIndex)) __obj.updateDynamic("IndicatorIndex")(IndicatorIndex.get.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleIndex)) __obj.updateDynamic("scaleIndex")(scaleIndex.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawIndicatorsEventArgs]
  }
}

