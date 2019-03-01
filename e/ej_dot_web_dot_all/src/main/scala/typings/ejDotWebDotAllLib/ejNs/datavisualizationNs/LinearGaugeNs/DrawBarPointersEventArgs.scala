package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawBarPointersEventArgs extends js.Object {
  /** returns the gauge model
    */
  var Model: js.UndefOr[js.Any] = js.undefined
  /** returns the value of the bar pointer.
    */
  var PointerValue: js.UndefOr[scala.Double] = js.undefined
  /** returns the current Bar pointer element.
    */
  var barElement: js.UndefOr[js.Any] = js.undefined
  /** returns the index of the bar pointer.
    */
  var barPointerIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** returns the startX and startY of the pointer
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.undefined
  /** returns the scaleIndex to which the pointer belongs.
    */
  var scaleIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the pointer style
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object DrawBarPointersEventArgs {
  @scala.inline
  def apply(
    Model: js.Any = null,
    PointerValue: scala.Int | scala.Double = null,
    barElement: js.Any = null,
    barPointerIndex: scala.Int | scala.Double = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    context: js.Any = null,
    `object`: js.Any = null,
    position: js.Any = null,
    scaleElement: js.Any = null,
    scaleIndex: scala.Int | scala.Double = null,
    style: java.lang.String = null,
    `type`: js.Any = null
  ): DrawBarPointersEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Model != null) __obj.updateDynamic("Model")(Model)
    if (PointerValue != null) __obj.updateDynamic("PointerValue")(PointerValue.asInstanceOf[js.Any])
    if (barElement != null) __obj.updateDynamic("barElement")(barElement)
    if (barPointerIndex != null) __obj.updateDynamic("barPointerIndex")(barPointerIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (context != null) __obj.updateDynamic("context")(context)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (position != null) __obj.updateDynamic("position")(position)
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    if (scaleIndex != null) __obj.updateDynamic("scaleIndex")(scaleIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DrawBarPointersEventArgs]
  }
}

