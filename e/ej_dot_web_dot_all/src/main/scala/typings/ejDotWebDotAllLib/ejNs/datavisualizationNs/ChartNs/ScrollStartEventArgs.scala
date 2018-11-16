package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollStartEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** startRange - returns the scrollbar position starting range value on changing scrollbar    endRange - returns the scrollbar position end range value on changing scrollbar
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the RangeNavigator model
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

