package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSelectingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data selecting record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected row chart element.
    */
  var previousChartRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected data.
    */
  var previousData: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected row grid element.
    */
  var previousGridRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected row index.
    */
  var previousIndex: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the index of selecting row record.
    */
  var recordIndex: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the selecting row chart element.
    */
  var targetChartRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the selecting row grid element.
    */
  var targetGridRow: js.UndefOr[js.Any] = js.undefined
}

