package typings.forms.formsMod

import typings.forms.Anon_Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldParameters extends js.Object {
  /** A list of options, used for multiple choice fields. */
  var choices: js.UndefOr[FieldObjectChoice | FieldArrayChoice] = js.undefined
  /** A list of CSS classes for label and field wrapper. */
  var cssClasses: js.UndefOr[Anon_Field] = js.undefined
  /** If true, the error message will be displayed after the field, rather than before. */
  var errorAfterField: js.UndefOr[Boolean] = js.undefined
  /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset. */
  var fieldsetClasses: js.UndefOr[js.Array[String]] = js.undefined
  /** If true, errors won't be rendered automatically. */
  var hideError: js.UndefOr[Boolean] = js.undefined
  /** An optional id to override the default. */
  var id: js.UndefOr[String] = js.undefined
  /** Optional label text which overrides the default. */
  var label: js.UndefOr[String] = js.undefined
  /** If true, the label text will be displayed after the field, rather than before. */
  var labelAfterField: js.UndefOr[Boolean] = js.undefined
  /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset's legend. */
  var legendClasses: js.UndefOr[js.Array[String]] = js.undefined
  /** Boolean describing whether the field is mandatory. */
  var required: js.UndefOr[Boolean | ValidatorFunction] = js.undefined
  /** An array of functions which validate the field data. */
  var validators: js.UndefOr[js.Array[ValidatorFunction]] = js.undefined
  /** A widget object to use when rendering the field. */
  var widget: js.UndefOr[Widget] = js.undefined
}

object FieldParameters {
  @scala.inline
  def apply(
    choices: FieldObjectChoice | FieldArrayChoice = null,
    cssClasses: Anon_Field = null,
    errorAfterField: js.UndefOr[Boolean] = js.undefined,
    fieldsetClasses: js.Array[String] = null,
    hideError: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    label: String = null,
    labelAfterField: js.UndefOr[Boolean] = js.undefined,
    legendClasses: js.Array[String] = null,
    required: Boolean | ValidatorFunction = null,
    validators: js.Array[ValidatorFunction] = null,
    widget: Widget = null
  ): FieldParameters = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (cssClasses != null) __obj.updateDynamic("cssClasses")(cssClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(errorAfterField)) __obj.updateDynamic("errorAfterField")(errorAfterField.asInstanceOf[js.Any])
    if (fieldsetClasses != null) __obj.updateDynamic("fieldsetClasses")(fieldsetClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(hideError)) __obj.updateDynamic("hideError")(hideError.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelAfterField)) __obj.updateDynamic("labelAfterField")(labelAfterField.asInstanceOf[js.Any])
    if (legendClasses != null) __obj.updateDynamic("legendClasses")(legendClasses.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldParameters]
  }
}

