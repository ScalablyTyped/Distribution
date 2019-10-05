package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the data of edited cell record..
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns state of a record whether it is in expanded or collapsed state.
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  /** Returns the row index of record.
    */
  var recordIndex: js.UndefOr[js.Any] = js.undefined
}

object ExpandingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    recordIndex: js.Any = null
  ): ExpandingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex)
    __obj.asInstanceOf[ExpandingEventArgs]
  }
}

