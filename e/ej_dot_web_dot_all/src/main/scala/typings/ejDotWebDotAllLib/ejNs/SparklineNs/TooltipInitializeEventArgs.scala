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

