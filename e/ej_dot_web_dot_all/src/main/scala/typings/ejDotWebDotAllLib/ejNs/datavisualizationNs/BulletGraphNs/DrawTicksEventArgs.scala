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

