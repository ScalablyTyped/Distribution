package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndEditEventArgs extends js.Object {
  /** Returns modified data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns modified data.
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object EndEditEventArgs {
  @scala.inline
  def apply(data: js.Any = null, model: js.Any = null, rowData: js.Any = null, `type`: String = null): EndEditEventArgs = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EndEditEventArgs]
  }
}

