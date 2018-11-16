package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DoubleClickEventArgs extends js.Object {
  /** Set this option to true to cancel the event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** location - X and Y co-ordinate of the points with respect to circular gauge area.id - ID of the target element.    size - Width and height of the circular gauge.    pageX -
               * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the circular gauge model object
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

