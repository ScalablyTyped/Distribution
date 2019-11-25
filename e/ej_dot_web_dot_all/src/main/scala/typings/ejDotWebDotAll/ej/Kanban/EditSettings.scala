package typings.ejDotWebDotAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable the adding action in cards behavior on Kanban.
    * @Default {false}
    */
  var allowAdding: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the editing action in cards of Kanban.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /** This specifies the id of the template which is require to be edited using the Dialog Box.
    * @Default {null}
    */
  var dialogTemplate: js.UndefOr[String] = js.undefined
  /** Get or sets an object that indicates whether to customize the editing fields of Kanban card.
    * @Default {Array}
    */
  var editItems: js.UndefOr[js.Array[EditSettingsEditItem]] = js.undefined
  /** Get or sets an object that indicates whether to customize the editMode of the Kanban.
    * @Default {ej.Kanban.EditMode.Dialog}
    */
  var editMode: js.UndefOr[EditMode | String] = js.undefined
  /** This specifies the id of the template which is require to be edited using the External edit form.
    * @Default {null}
    */
  var externalFormTemplate: js.UndefOr[String] = js.undefined
  /** This specifies to set the position of an External edit form either in the right or bottom of the Kanban.
    * @Default {ej.Kanban.FormPosition.Bottom}
    */
  var formPosition: js.UndefOr[FormPosition | String] = js.undefined
}

object EditSettings {
  @scala.inline
  def apply(
    allowAdding: js.UndefOr[Boolean] = js.undefined,
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    dialogTemplate: String = null,
    editItems: js.Array[EditSettingsEditItem] = null,
    editMode: EditMode | String = null,
    externalFormTemplate: String = null,
    formPosition: FormPosition | String = null
  ): EditSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAdding)) __obj.updateDynamic("allowAdding")(allowAdding.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.asInstanceOf[js.Any])
    if (dialogTemplate != null) __obj.updateDynamic("dialogTemplate")(dialogTemplate.asInstanceOf[js.Any])
    if (editItems != null) __obj.updateDynamic("editItems")(editItems.asInstanceOf[js.Any])
    if (editMode != null) __obj.updateDynamic("editMode")(editMode.asInstanceOf[js.Any])
    if (externalFormTemplate != null) __obj.updateDynamic("externalFormTemplate")(externalFormTemplate.asInstanceOf[js.Any])
    if (formPosition != null) __obj.updateDynamic("formPosition")(formPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSettings]
  }
}

