package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDataBoundEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the data of rendering row record..
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the row element of rendering row.
    */
  var rowElement: js.UndefOr[js.Any] = js.undefined
}

object RowDataBoundEventArgs {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, data: js.Any = null, rowElement: js.Any = null): RowDataBoundEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (rowElement != null) __obj.updateDynamic("rowElement")(rowElement)
    __obj.asInstanceOf[RowDataBoundEventArgs]
  }
}

