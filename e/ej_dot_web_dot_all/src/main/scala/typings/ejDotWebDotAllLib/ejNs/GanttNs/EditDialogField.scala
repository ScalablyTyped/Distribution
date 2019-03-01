package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditDialogField extends js.Object {
  /** Specifies the custom column field was displayed in General tab of edit dialog or not.
    * @Default {false}
    */
  var displayInGeneralTab: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies editType of fields to be included in the edit dialog in Gantt
    */
  var editType: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies mapping name to include required fields in Gantt
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
}

object EditDialogField {
  @scala.inline
  def apply(
    displayInGeneralTab: js.UndefOr[scala.Boolean] = js.undefined,
    editType: java.lang.String = null,
    field: java.lang.String = null
  ): EditDialogField = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayInGeneralTab)) __obj.updateDynamic("displayInGeneralTab")(displayInGeneralTab)
    if (editType != null) __obj.updateDynamic("editType")(editType)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[EditDialogField]
  }
}

