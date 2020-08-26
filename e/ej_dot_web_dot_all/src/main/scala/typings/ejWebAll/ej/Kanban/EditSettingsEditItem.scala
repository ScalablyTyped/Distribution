package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditSettingsEditItem extends js.Object {
  /** It is used to specify defaultValue for the fields while adding new card.
    * @Default {null}
    */
  var defaultValue: js.UndefOr[String | Double] = js.native
  /** It is used to set the particular editparams in the card for editing.
    * @Default {Object}
    */
  var editParams: js.UndefOr[js.Any] = js.native
  /** It is used to set the particular editType in the card for editing.
    * @Default {ej.Kanban.EditingType.String}
    */
  var editType: js.UndefOr[EditingType | String] = js.native
  /** It is used to map editing field from the data source.
    * @Default {null}
    */
  var field: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates to define constraints for saving data to the database.
    * @Default {Object}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
}

object EditSettingsEditItem {
  @scala.inline
  def apply(): EditSettingsEditItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditSettingsEditItem]
  }
  @scala.inline
  implicit class EditSettingsEditItemOps[Self <: EditSettingsEditItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultValue(value: String | Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setEditParams(value: js.Any): Self = this.set("editParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditParams: Self = this.set("editParams", js.undefined)
    @scala.inline
    def setEditType(value: EditingType | String): Self = this.set("editType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditType: Self = this.set("editType", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setValidationRules(value: js.Any): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
  }
  
}

