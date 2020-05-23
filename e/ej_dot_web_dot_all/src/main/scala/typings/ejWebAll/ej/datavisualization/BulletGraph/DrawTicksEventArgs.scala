package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawTicksEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the interval value.
    */
  var interval: js.UndefOr[Double] = js.undefined
  /** returns the settings for majorTicks.
    */
  var majorTickSettings: js.UndefOr[js.Any] = js.undefined
  /** returns the maximum value.
    */
  var maximum: js.UndefOr[Double] = js.undefined
  /** returns the minimum value.
    */
  var minimum: js.UndefOr[Double] = js.undefined
  /** returns the value of minorTicksPerInterval.
    */
  var minorTickPerInterval: js.UndefOr[Double] = js.undefined
  /** returns the settings for minorTicks.
    */
  var minorTickSettings: js.UndefOr[js.Any] = js.undefined
  /** returns the model of the bullet graph.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DrawTicksEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    majorTickSettings: js.Any = null,
    maximum: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    minorTickPerInterval: js.UndefOr[Double] = js.undefined,
    minorTickSettings: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): DrawTicksEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (majorTickSettings != null) __obj.updateDynamic("majorTickSettings")(majorTickSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickPerInterval)) __obj.updateDynamic("minorTickPerInterval")(minorTickPerInterval.get.asInstanceOf[js.Any])
    if (minorTickSettings != null) __obj.updateDynamic("minorTickSettings")(minorTickSettings.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawTicksEventArgs]
  }
}

