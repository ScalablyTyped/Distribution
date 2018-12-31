package typings
package formsLib.formsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldParameters extends js.Object {
  /** A list of options, used for multiple choice fields. */
  var choices: js.UndefOr[FieldObjectChoice | FieldArrayChoice] = js.undefined
  /** A list of CSS classes for label and field wrapper. */
  var cssClasses: js.UndefOr[formsLib.Anon_Field] = js.undefined
  /** If true, the error message will be displayed after the field, rather than before. */
  var errorAfterField: js.UndefOr[scala.Boolean] = js.undefined
  /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset. */
  var fieldsetClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** If true, errors won't be rendered automatically. */
  var hideError: js.UndefOr[scala.Boolean] = js.undefined
  /** An optional id to override the default. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Optional label text which overrides the default. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** If true, the label text will be displayed after the field, rather than before. */
  var labelAfterField: js.UndefOr[scala.Boolean] = js.undefined
  /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset's legend. */
  var legendClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Boolean describing whether the field is mandatory. */
  var required: js.UndefOr[scala.Boolean | ValidatorFunction] = js.undefined
  /** An array of functions which validate the field data. */
  var validators: js.UndefOr[js.Array[ValidatorFunction]] = js.undefined
  /** A widget object to use when rendering the field. */
  var widget: js.UndefOr[Widget] = js.undefined
}

