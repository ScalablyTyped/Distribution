package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeBatchAddEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the default data object.
    */
  var defaultData: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the primaryKey.
    */
  var primaryKey: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeBatchAddEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    defaultData: js.Any = null,
    model: js.Any = null,
    primaryKey: js.Any = null,
    `type`: String = null
  ): BeforeBatchAddEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (defaultData != null) __obj.updateDynamic("defaultData")(defaultData)
    if (model != null) __obj.updateDynamic("model")(model)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeBatchAddEventArgs]
  }
}

