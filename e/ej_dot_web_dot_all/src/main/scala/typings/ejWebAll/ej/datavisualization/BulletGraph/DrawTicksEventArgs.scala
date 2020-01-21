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
    interval: Int | Double = null,
    majorTickSettings: js.Any = null,
    maximum: Int | Double = null,
    minimum: Int | Double = null,
    minorTickPerInterval: Int | Double = null,
    minorTickSettings: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): DrawTicksEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (majorTickSettings != null) __obj.updateDynamic("majorTickSettings")(majorTickSettings.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorTickPerInterval != null) __obj.updateDynamic("minorTickPerInterval")(minorTickPerInterval.asInstanceOf[js.Any])
    if (minorTickSettings != null) __obj.updateDynamic("minorTickSettings")(minorTickSettings.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawTicksEventArgs]
  }
}

