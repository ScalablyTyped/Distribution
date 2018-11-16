package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollChangedEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameters from RangeNavigator
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the scrollbar position new start and end range value on changing scrollbar
               */
  var dataNewRange: js.UndefOr[js.Any] = js.undefined
  /** returns the scrollbar position old start and end range value on changing scrollbar
               */
  var dataOldRange: js.UndefOr[js.Any] = js.undefined
  /** returns the RangeNavigator model
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

