package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginEditEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the primary key.
    */
  var primaryKey: js.UndefOr[js.Any] = js.undefined
  /** Returns the primary key value.
    */
  var primaryKeyValue: js.UndefOr[js.Any] = js.undefined
  /** Returns the current edited row.
    */
  var row: js.UndefOr[js.Any] = js.undefined
  /** Returns the edited row index.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeginEditEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: js.Any = null,
    primaryKey: js.Any = null,
    primaryKeyValue: js.Any = null,
    row: js.Any = null,
    rowIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): BeginEditEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (primaryKeyValue != null) __obj.updateDynamic("primaryKeyValue")(primaryKeyValue)
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeginEditEventArgs]
  }
}

