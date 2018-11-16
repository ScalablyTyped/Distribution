package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CellClickEventArgs extends js.Object {
  /** returns the custom object bound with PivotClient control.
               */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotGrid control.
               */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the JSON details of the respective on cell.
               */
  var selectedData: js.UndefOr[js.Array[_]] = js.undefined
}

