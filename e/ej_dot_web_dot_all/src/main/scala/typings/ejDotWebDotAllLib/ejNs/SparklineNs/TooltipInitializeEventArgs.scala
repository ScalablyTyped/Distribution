package typings
package ejDotWebDotAllLib.ejNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipInitializeEventArgs extends js.Object {
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Text to be displayed in trackball tooltip. Use this option to add custom text in trackball tooltip
    */
  var currentText: js.UndefOr[java.lang.String] = js.undefined
  /** X Location of the trackball tooltip in pixels
    */
  var locationX: js.UndefOr[js.Any] = js.undefined
  /** Y Location of the trackball tooltip in pixels
    */
  var locationY: js.UndefOr[js.Any] = js.undefined
  /** Instance of the sparkline model object
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Index of the point for which trackball tooltip is displayed
    */
  var pointIndex: js.UndefOr[scala.Double] = js.undefined
  /** Name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TooltipInitializeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentText: java.lang.String = null,
    locationX: js.Any = null,
    locationY: js.Any = null,
    model: js.Any = null,
    pointIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): TooltipInitializeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentText != null) __obj.updateDynamic("currentText")(currentText)
    if (locationX != null) __obj.updateDynamic("locationX")(locationX)
    if (locationY != null) __obj.updateDynamic("locationY")(locationY)
    if (model != null) __obj.updateDynamic("model")(model)
    if (pointIndex != null) __obj.updateDynamic("pointIndex")(pointIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TooltipInitializeEventArgs]
  }
}

