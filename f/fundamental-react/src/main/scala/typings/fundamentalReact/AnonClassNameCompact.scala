package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassNameCompact extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  /* A collection of properties to apply to the `<label>`, `<input>`/`<textarea>` and `<button>` elements. */
  var control: AnonButtonPropsInputProps
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var listProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* An array of objects that represent the values of the elements in the dropdown menu. The shape of the objects in the array is `{ placeholder: string, language: string, inputProps: object }`. */
  var menu: js.Array[AnonInputProps]
  var popoverProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Set to **true** to enable a Localization Editor with a textarea. */
  var textarea: js.UndefOr[Boolean] = js.undefined
}

object AnonClassNameCompact {
  @scala.inline
  def apply(
    control: AnonButtonPropsInputProps,
    menu: js.Array[AnonInputProps],
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    listProps: StringDictionary[js.Any] = null,
    popoverProps: StringDictionary[js.Any] = null,
    textarea: js.UndefOr[Boolean] = js.undefined
  ): AnonClassNameCompact = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(textarea)) __obj.updateDynamic("textarea")(textarea.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassNameCompact]
  }
}

