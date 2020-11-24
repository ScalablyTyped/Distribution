package typings.forms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldParameters extends js.Object {
  
  /** A list of options, used for multiple choice fields. */
  var choices: js.UndefOr[FieldObjectChoice | FieldArrayChoice] = js.native
  
  /** A list of CSS classes for label and field wrapper. */
  var cssClasses: js.UndefOr[typings.forms.anon.Field] = js.native
  
  /** If true, the error message will be displayed after the field, rather than before. */
  var errorAfterField: js.UndefOr[Boolean] = js.native
  
  /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset. */
  var fieldsetClasses: js.UndefOr[js.Array[String]] = js.native
  
  /** If true, errors won't be rendered automatically. */
  var hideError: js.UndefOr[Boolean] = js.native
  
  /** An optional id to override the default. */
  var id: js.UndefOr[String] = js.native
  
  /** Optional label text which overrides the default. */
  var label: js.UndefOr[String] = js.native
  
  /** If true, the label text will be displayed after the field, rather than before. */
  var labelAfterField: js.UndefOr[Boolean] = js.native
  
  /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset's legend. */
  var legendClasses: js.UndefOr[js.Array[String]] = js.native
  
  /** Boolean describing whether the field is mandatory. */
  var required: js.UndefOr[Boolean | ValidatorFunction] = js.native
  
  /** An array of functions which validate the field data. */
  var validators: js.UndefOr[js.Array[ValidatorFunction]] = js.native
  
  /** A widget object to use when rendering the field. */
  var widget: js.UndefOr[Widget] = js.native
}
object FieldParameters {
  
  @scala.inline
  def apply(): FieldParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldParameters]
  }
  
  @scala.inline
  implicit class FieldParametersOps[Self <: FieldParameters] (val x: Self) extends AnyVal {
    
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
    def setChoices(value: FieldObjectChoice | FieldArrayChoice): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    
    @scala.inline
    def setCssClasses(value: typings.forms.anon.Field): Self = this.set("cssClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClasses: Self = this.set("cssClasses", js.undefined)
    
    @scala.inline
    def setErrorAfterField(value: Boolean): Self = this.set("errorAfterField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorAfterField: Self = this.set("errorAfterField", js.undefined)
    
    @scala.inline
    def setFieldsetClassesVarargs(value: String*): Self = this.set("fieldsetClasses", js.Array(value :_*))
    
    @scala.inline
    def setFieldsetClasses(value: js.Array[String]): Self = this.set("fieldsetClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldsetClasses: Self = this.set("fieldsetClasses", js.undefined)
    
    @scala.inline
    def setHideError(value: Boolean): Self = this.set("hideError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideError: Self = this.set("hideError", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelAfterField(value: Boolean): Self = this.set("labelAfterField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAfterField: Self = this.set("labelAfterField", js.undefined)
    
    @scala.inline
    def setLegendClassesVarargs(value: String*): Self = this.set("legendClasses", js.Array(value :_*))
    
    @scala.inline
    def setLegendClasses(value: js.Array[String]): Self = this.set("legendClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendClasses: Self = this.set("legendClasses", js.undefined)
    
    @scala.inline
    def setRequiredFunction3(
      value: (/* form */ FormBound, /* field */ FieldBound, /* callback */ js.Function1[/* err */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("required", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRequired(value: Boolean | ValidatorFunction): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: ValidatorFunction*): Self = this.set("validators", js.Array(value :_*))
    
    @scala.inline
    def setValidators(value: js.Array[ValidatorFunction]): Self = this.set("validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
    
    @scala.inline
    def setWidget(value: Widget): Self = this.set("widget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidget: Self = this.set("widget", js.undefined)
  }
}
