package typings.fundamentalDashReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonPropsInputProps extends js.Object {
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Localized text for the `<label>` element. */
  var label: js.UndefOr[String] = js.undefined
  var labelProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Text to display on the `<button>` element. Meant to be the language of the text in the `<input>`/`<textarea>` element. */
  var language: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
}

object Anon_ButtonPropsInputProps {
  @scala.inline
  def apply(
    buttonProps: StringDictionary[js.Any] = null,
    inputProps: StringDictionary[js.Any] = null,
    label: String = null,
    labelProps: StringDictionary[js.Any] = null,
    language: String = null,
    placeholder: String = null
  ): Anon_ButtonPropsInputProps = {
    val __obj = js.Dynamic.literal()
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps)
    if (language != null) __obj.updateDynamic("language")(language)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[Anon_ButtonPropsInputProps]
  }
}

