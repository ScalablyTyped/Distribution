package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsCollapseEventArgs extends js.Object {
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

object DetailsCollapseEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    detailsRow: js.Any = null,
    foreignKeyData: js.Any = null,
    masterData: js.Any = null,
    masterRow: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): DetailsCollapseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (detailsRow != null) __obj.updateDynamic("detailsRow")(detailsRow.asInstanceOf[js.Any])
    if (foreignKeyData != null) __obj.updateDynamic("foreignKeyData")(foreignKeyData.asInstanceOf[js.Any])
    if (masterData != null) __obj.updateDynamic("masterData")(masterData.asInstanceOf[js.Any])
    if (masterRow != null) __obj.updateDynamic("masterRow")(masterRow.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailsCollapseEventArgs]
  }
}

