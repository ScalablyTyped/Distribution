package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsDataBoundEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the details row data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns details row element.
    */
  var detailsElement: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the details row data.
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DetailsDataBoundEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    detailsElement: js.Any = null,
    model: js.Any = null,
    rowData: js.Any = null,
    `type`: String = null
  ): DetailsDataBoundEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (detailsElement != null) __obj.updateDynamic("detailsElement")(detailsElement)
    if (model != null) __obj.updateDynamic("model")(model)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DetailsDataBoundEventArgs]
  }
}

