package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsExpandEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns detail row element.
    */
  var detailsRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the foreign key record object (JSON).
    */
  var foreignKeyData: js.UndefOr[js.Any] = js.undefined
  /** Returns master row of detail row record object (JSON).
    */
  var masterData: js.UndefOr[js.Any] = js.undefined
  /** Returns master row element.
    */
  var masterRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DetailsExpandEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    detailsRow: js.Any = null,
    foreignKeyData: js.Any = null,
    masterData: js.Any = null,
    masterRow: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): DetailsExpandEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (detailsRow != null) __obj.updateDynamic("detailsRow")(detailsRow)
    if (foreignKeyData != null) __obj.updateDynamic("foreignKeyData")(foreignKeyData)
    if (masterData != null) __obj.updateDynamic("masterData")(masterData)
    if (masterRow != null) __obj.updateDynamic("masterRow")(masterRow)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DetailsExpandEventArgs]
  }
}

