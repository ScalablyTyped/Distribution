package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawTicksEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the interval value.
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** returns the settings for majorTicks.
    */
  var majorTickSettings: js.UndefOr[js.Any] = js.undefined
  /** returns the maximum value.
    */
  var maximum: js.UndefOr[scala.Double] = js.undefined
  /** returns the minimum value.
    */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /** returns the value of minorTicksPerInterval.
    */
  var minorTickPerInterval: js.UndefOr[scala.Double] = js.undefined
  /** returns the settings for minorTicks.
    */
  var minorTickSettings: js.UndefOr[js.Any] = js.undefined
  /** returns the model of the bullet graph.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DrawTicksEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Int | scala.Double = null,
    majorTickSettings: js.Any = null,
    maximum: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    minorTickPerInterval: scala.Int | scala.Double = null,
    minorTickSettings: js.Any = null,
    model: js.Any = null,
    `type`: java.lang.String = null
  ): DrawTicksEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (majorTickSettings != null) __obj.updateDynamic("majorTickSettings")(majorTickSettings)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorTickPerInterval != null) __obj.updateDynamic("minorTickPerInterval")(minorTickPerInterval.asInstanceOf[js.Any])
    if (minorTickSettings != null) __obj.updateDynamic("minorTickSettings")(minorTickSettings)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DrawTicksEventArgs]
  }
}

