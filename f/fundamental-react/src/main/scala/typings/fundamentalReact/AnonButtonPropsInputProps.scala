package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonPropsInputProps extends js.Object {
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Localized text for the `<label>` element. */
  var label: js.UndefOr[String] = js.undefined
  var labelProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Text to display on the `<button>` element. Meant to be the language of the text in the `<input>`/`<textarea>` element. */
  var language: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
}

object AnonButtonPropsInputProps {
  @scala.inline
  def apply(
    buttonProps: StringDictionary[js.Any] = null,
    inputProps: StringDictionary[js.Any] = null,
    label: String = null,
    labelProps: StringDictionary[js.Any] = null,
    language: String = null,
    placeholder: String = null
  ): AnonButtonPropsInputProps = {
    val __obj = js.Dynamic.literal()
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonPropsInputProps]
  }
}

