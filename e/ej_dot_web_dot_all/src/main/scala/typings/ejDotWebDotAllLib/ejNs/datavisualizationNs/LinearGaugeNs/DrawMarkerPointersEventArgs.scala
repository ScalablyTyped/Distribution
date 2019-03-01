package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawMarkerPointersEventArgs extends js.Object {
  /** returns the gauge model
    */
  var Model: js.UndefOr[js.Any] = js.undefined
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the context element
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /** returns the current marker pointer element.
    */
  var markerElement: js.UndefOr[js.Any] = js.undefined
  /** returns the index of the marker pointer.
    */
  var markerPointerIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the object of the gauge.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** returns the angle of the marker pointer.
    */
  var pointerAngle: js.UndefOr[scala.Double] = js.undefined
  /** returns the value of the marker pointer.
    */
  var pointerValue: js.UndefOr[scala.Double] = js.undefined
  /** returns the startX and startY of the pointer
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[js.Any] = js.undefined
  /** returns the scaleIndex to which the pointer belongs.
    */
  var scaleIndex: js.UndefOr[scala.Double] = js.undefined
  /** returns the ticks style
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object DrawMarkerPointersEventArgs {
  @scala.inline
  def apply(
    Model: js.Any = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    context: js.Any = null,
    markerElement: js.Any = null,
    markerPointerIndex: scala.Int | scala.Double = null,
    `object`: js.Any = null,
    pointerAngle: scala.Int | scala.Double = null,
    pointerValue: scala.Int | scala.Double = null,
    position: js.Any = null,
    scaleElement: js.Any = null,
    scaleIndex: scala.Int | scala.Double = null,
    style: java.lang.String = null,
    `type`: js.Any = null
  ): DrawMarkerPointersEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Model != null) __obj.updateDynamic("Model")(Model)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (context != null) __obj.updateDynamic("context")(context)
    if (markerElement != null) __obj.updateDynamic("markerElement")(markerElement)
    if (markerPointerIndex != null) __obj.updateDynamic("markerPointerIndex")(markerPointerIndex.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (pointerAngle != null) __obj.updateDynamic("pointerAngle")(pointerAngle.asInstanceOf[js.Any])
    if (pointerValue != null) __obj.updateDynamic("pointerValue")(pointerValue.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (scaleElement != null) __obj.updateDynamic("scaleElement")(scaleElement)
    if (scaleIndex != null) __obj.updateDynamic("scaleIndex")(scaleIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DrawMarkerPointersEventArgs]
  }
}

