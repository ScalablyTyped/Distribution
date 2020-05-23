package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditDialogField extends js.Object {
  /** Specifies the custom column field was displayed in General tab of edit dialog or not.
    * @Default {false}
    */
  var displayInGeneralTab: js.UndefOr[Boolean] = js.undefined
  /** Specifies editType of fields to be included in the edit dialog in Gantt
    */
  var editType: js.UndefOr[String] = js.undefined
  /** Specifies mapping name to include required fields in Gantt
    */
  var field: js.UndefOr[String] = js.undefined
}

object EditDialogField {
  @scala.inline
  def apply(
    displayInGeneralTab: js.UndefOr[Boolean] = js.undefined,
    editType: String = null,
    field: String = null
  ): EditDialogField = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayInGeneralTab)) __obj.updateDynamic("displayInGeneralTab")(displayInGeneralTab.get.asInstanceOf[js.Any])
    if (editType != null) __obj.updateDynamic("editType")(editType.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditDialogField]
  }
}

