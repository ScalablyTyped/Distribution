package typings
package fundamentalDashReactLib.libLocalizationEditorLocalizationEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizationEditorProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /* A collection of properties to apply to the `<label>`, `<input>`/`<textarea>` and `<button>` elements. */
  var control: fundamentalDashReactLib.Anon_ButtonPropsInputProps
  var id: js.UndefOr[java.lang.String] = js.undefined
  var listProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* An array of objects that represent the values of the elements in the dropdown menu. The shape of the objects in the array is `{ placeholder: string, language: string, inputProps: object }`. */
  var menu: js.Array[fundamentalDashReactLib.Anon_InputProps]
  var popoverProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Set to **true** to enable a Localization Editor with a textarea. */
  var textarea: js.UndefOr[scala.Boolean] = js.undefined
}

object LocalizationEditorProps {
  @scala.inline
  def apply(
    control: fundamentalDashReactLib.Anon_ButtonPropsInputProps,
    menu: js.Array[fundamentalDashReactLib.Anon_InputProps],
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    listProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    popoverProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    textarea: js.UndefOr[scala.Boolean] = js.undefined
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

