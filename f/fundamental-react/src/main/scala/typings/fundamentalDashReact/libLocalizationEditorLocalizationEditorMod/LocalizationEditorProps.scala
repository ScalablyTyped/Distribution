package typings.fundamentalDashReact.libLocalizationEditorLocalizationEditorMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.Anon_ButtonPropsInputProps
import typings.fundamentalDashReact.Anon_InputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizationEditorProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  /* A collection of properties to apply to the `<label>`, `<input>`/`<textarea>` and `<button>` elements. */
  var control: Anon_ButtonPropsInputProps
  var id: js.UndefOr[String] = js.undefined
  var listProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* An array of objects that represent the values of the elements in the dropdown menu. The shape of the objects in the array is `{ placeholder: string, language: string, inputProps: object }`. */
  var menu: js.Array[Anon_InputProps]
  var popoverProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Set to **true** to enable a Localization Editor with a textarea. */
  var textarea: js.UndefOr[Boolean] = js.undefined
}

object LocalizationEditorProps {
  @scala.inline
  def apply(
    control: Anon_ButtonPropsInputProps,
    menu: js.Array[Anon_InputProps],
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    listProps: StringDictionary[js.Any] = null,
    popoverProps: StringDictionary[js.Any] = null,
    textarea: js.UndefOr[Boolean] = js.undefined
  ): LocalizationEditorProps = {
    val __obj = js.Dynamic.literal(control = control, menu = menu)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (id != null) __obj.updateDynamic("id")(id)
    if (listProps != null) __obj.updateDynamic("listProps")(listProps)
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps)
    if (!js.isUndefined(textarea)) __obj.updateDynamic("textarea")(textarea)
    __obj.asInstanceOf[LocalizationEditorProps]
  }
}

