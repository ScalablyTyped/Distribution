package typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawCustomLabelEventArgs extends js.Object {
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /** returns the current custom label element.
    */
  var customLabelElement: js.UndefOr[js.Any] = js.undefined
  /** returns the index of the custom label.
    */
  var customLabelIndex: js.UndefOr[Double] = js.undefined
  /** returns the gauge model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** returns the startX and startY of the custom label
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.undefined
  /** returns the scaleIndex to which the custom label belongs.
    */
  var scaleIndex: js.UndefOr[Double] = js.undefined
  /** returns the custom label style
    */
  var style: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DrawCustomLabelEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    customLabelElement: js.Any = null,
    customLabelIndex: Int | Double = null,
    model: js.Any = null,
    `object`: js.Any = null,
    position: js.Any = null,
    scaleElement: js.Any = null,
    scaleIndex: Int | Double = null,
    style: String = null,
    `type`: String = null
  ): DrawCustomLabelEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (context != null) __obj.updateDynamic("context")(context)
    if (customLabelElement != null) __obj.updateDynamic("customLabelElement")(customLabelElement)
    if (customLabelIndex != null) __obj.updateDynamic("customLabelIndex")(customLabelIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (position != null) __obj.updateDynamic("position")(position)
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    if (scaleIndex != null) __obj.updateDynamic("scaleIndex")(scaleIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DrawCustomLabelEventArgs]
  }
}

