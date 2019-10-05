package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

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
    IndicatorIndex: Int | Double = null,
    Model: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    `object`: js.Any = null,
    position: js.Any = null,
    scaleElement: js.Any = null,
    scaleIndex: Int | Double = null,
    style: String = null,
    `type`: js.Any = null
  ): DrawIndicatorsEventArgs = {
    val __obj = js.Dynamic.literal()
    if (IndicatorElement != null) __obj.updateDynamic("IndicatorElement")(IndicatorElement)
    if (IndicatorIndex != null) __obj.updateDynamic("IndicatorIndex")(IndicatorIndex.asInstanceOf[js.Any])
    if (Model != null) __obj.updateDynamic("Model")(Model)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (context != null) __obj.updateDynamic("context")(context)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (position != null) __obj.updateDynamic("position")(position)
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    if (scaleIndex != null) __obj.updateDynamic("scaleIndex")(scaleIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DrawIndicatorsEventArgs]
  }
}

