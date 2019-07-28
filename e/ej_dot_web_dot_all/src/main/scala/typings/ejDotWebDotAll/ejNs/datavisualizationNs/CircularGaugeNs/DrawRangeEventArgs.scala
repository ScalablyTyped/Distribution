package typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs

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
    rangeIndex: Int | Double = null,
    scaleElement: js.Any = null,
    scaleIndex: Int | Double = null,
    style: String = null,
    `type`: String = null
  ): DrawRangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (context != null) __obj.updateDynamic("context")(context)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (position != null) __obj.updateDynamic("position")(position)
    if (rangeElement != null) __obj.updateDynamic("rangeElement")(rangeElement)
    if (rangeIndex != null) __obj.updateDynamic("rangeIndex")(rangeIndex.asInstanceOf[js.Any])
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    if (scaleIndex != null) __obj.updateDynamic("scaleIndex")(scaleIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DrawRangeEventArgs]
  }
}

