package typings
package ejDotWebDotAllLib.ejNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointRegionMouseMoveEventArgs extends js.Object {
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** X-coordinate of point in pixel
    */
  var locationX: js.UndefOr[scala.Double] = js.undefined
  /** Y-coordinate of point in pixel
    */
  var locationY: js.UndefOr[scala.Double] = js.undefined
  /** Instance of the sparkline model object
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Index of the point in series
    */
  var pointIndex: js.UndefOr[scala.Double] = js.undefined
  /** Type of the series
    */
  var seriesType: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

