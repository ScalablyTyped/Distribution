package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeBatchDeleteEventArgs extends js.Object {
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the primaryKey.
    */
  var primaryKey: js.UndefOr[js.Any] = js.undefined
  /** Returns the row element.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns deleted data.
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeBatchDeleteEventArgs {
  @scala.inline
  def apply(
    model: js.Any = null,
    primaryKey: js.Any = null,
    row: js.Any = null,
    rowData: js.Any = null,
    rowIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): BeforeBatchDeleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeBatchDeleteEventArgs]
  }
}

