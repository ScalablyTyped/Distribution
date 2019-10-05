package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSettingsBatchEditSettings extends js.Object {
  /** Specifies the batch edit mode whether it is cell, row or dialog.
    * @Default {ej.TreeGrid.BatchEditMode.Cell}
    */
  var editMode: js.UndefOr[BatchEditMode | String] = js.undefined
}

object EditSettingsBatchEditSettings {
  @scala.inline
  def apply(editMode: BatchEditMode | String = null): EditSettingsBatchEditSettings = {
    val __obj = js.Dynamic.literal()
    if (editMode != null) __obj.updateDynamic("editMode")(editMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSettingsBatchEditSettings]
  }
}

