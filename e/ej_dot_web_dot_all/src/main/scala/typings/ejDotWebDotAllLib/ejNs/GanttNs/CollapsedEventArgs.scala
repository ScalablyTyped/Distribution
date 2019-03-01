package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data of collapsed record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns state of a record whether it is in expanded or collapsed state.
    */
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the row index of collapsed record.
    */
  var recordIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns Request Type.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
}

object CollapsedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    recordIndex: scala.Int | scala.Double = null,
    requestType: java.lang.String = null
  ): CollapsedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    __obj.asInstanceOf[CollapsedEventArgs]
  }
}

