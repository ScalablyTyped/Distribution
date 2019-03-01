package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsDataBoundEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data collection of selected row.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the details element of selected row.
    */
  var detailsElement: js.UndefOr[js.Any] = js.undefined
  /** Returns the TreeGrid model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the rowIndex of selected row.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DetailsDataBoundEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    detailsElement: js.Any = null,
    model: js.Any = null,
    rowIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): DetailsDataBoundEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (detailsElement != null) __obj.updateDynamic("detailsElement")(detailsElement)
    if (model != null) __obj.updateDynamic("model")(model)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DetailsDataBoundEventArgs]
  }
}

