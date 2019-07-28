package typings.ejDotWebDotAll.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the data of expanded record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns state of a record whether it is in expanded or collapsed state.
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /** Returns the row index of record.
    */
  var recordIndex: js.UndefOr[Double] = js.undefined
  /** Returns Request Type.
    */
  var requestType: js.UndefOr[String] = js.undefined
}

object ExpandedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    recordIndex: Int | Double = null,
    requestType: String = null
  ): ExpandedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    __obj.asInstanceOf[ExpandedEventArgs]
  }
}

