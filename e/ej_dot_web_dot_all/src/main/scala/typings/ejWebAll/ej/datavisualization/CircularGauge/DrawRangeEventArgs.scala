package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawRangeEventArgs extends js.Object {
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /** returns the gauge model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** returns the startX and startY of the range
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** returns the current range element.
    */
  var rangeElement: js.UndefOr[js.Any] = js.undefined
  /** returns the index of the range.
    */
  var rangeIndex: js.UndefOr[Double] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.undefined
  /** returns the scaleIndex to which the range belongs.
    */
  var scaleIndex: js.UndefOr[Double] = js.undefined
  /** returns the range style
    */
  var style: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DrawRangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    model: js.Any = null,
    `object`: js.Any = null,
    position: js.Any = null,
    rangeElement: js.Any = null,
    rangeIndex: js.UndefOr[Double] = js.undefined,
    scaleElement: js.Any = null,
    scaleIndex: js.UndefOr[Double] = js.undefined,
    style: String = null,
    `type`: String = null
  ): DrawRangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rangeElement != null) __obj.updateDynamic("rangeElement")(rangeElement.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeIndex)) __obj.updateDynamic("rangeIndex")(rangeIndex.get.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleIndex)) __obj.updateDynamic("scaleIndex")(scaleIndex.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawRangeEventArgs]
  }
}

