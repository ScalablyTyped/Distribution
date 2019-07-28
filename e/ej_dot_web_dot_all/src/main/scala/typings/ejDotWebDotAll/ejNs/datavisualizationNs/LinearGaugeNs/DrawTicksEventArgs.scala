package typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawTicksEventArgs extends js.Object {
  /** returns the gauge model
    */
  var Model: js.UndefOr[js.Any] = js.undefined
  /** returns the angle of the tick.
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /** returns the current tick element.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the index of the tick.
    */
  var index: js.UndefOr[Double] = js.undefined
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** returns the startX and startY of the ticks
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.undefined
  /** returns the scaleIndex to which the tick belongs.
    */
  var scaleIndex: js.UndefOr[Double] = js.undefined
  /** returns the ticks style
    */
  var style: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
  /** returns the tick value of the tick.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object DrawTicksEventArgs {
  @scala.inline
  def apply(
    Model: js.Any = null,
    angle: Int | Double = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    element: js.Any = null,
    index: Int | Double = null,
    `object`: js.Any = null,
    position: js.Any = null,
    scaleElement: js.Any = null,
    scaleIndex: Int | Double = null,
    style: String = null,
    `type`: js.Any = null,
    value: Int | Double = null
  ): DrawTicksEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Model != null) __obj.updateDynamic("Model")(Model)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (context != null) __obj.updateDynamic("context")(context)
    if (element != null) __obj.updateDynamic("element")(element)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (position != null) __obj.updateDynamic("position")(position)
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    if (scaleIndex != null) __obj.updateDynamic("scaleIndex")(scaleIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawTicksEventArgs]
  }
}

