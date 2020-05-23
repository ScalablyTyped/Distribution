package typings.electronPrompt.mod

import typings.electronPrompt.electronPromptStrings.ApostropheinputApostrophe
import typings.electronPrompt.electronPromptStrings.select
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The local path of a CSS file to stylize the prompt window.
    * Defaults to `null`.
    */
  var customStylesheet: js.UndefOr[String | Null] = js.undefined
  /** The height of the prompt window. Defaults to `130`. */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The path to an icon image to use in the title bar. Defaults to `null`
    * and uses electron's icon.
    */
  var icon: js.UndefOr[String | Null] = js.undefined
  /**
    * The attributes of the input field, analagous to the HTML attributes:
    * `{type: 'text', required: true}` -> `<input type="text" required>`.
    * Used if the type is `'input'`.
    */
  var inputAttrs: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * The label which appears on the prompt for the input field. Defaults
    * to `'Please input a value:'`.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Whether the prompt window can be resized or not. Defaults to
    * `false`.
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
    * The items for the select dropdown if using the `'select'` type in the
    * format `'value'`: `'display text'`, where the value is what will be
    * given to the then block and the display text is what the user will
    * see.
    */
  var selectOptions: js.UndefOr[js.Object] = js.undefined
  /** The title of the prompt window. Defaults to `'Prompt'`. */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The type of input field, either `'input'` for a standard text input
    * field or 'select' for a dropdown type input. Defaults to `'input'`.
    */
  var `type`: js.UndefOr[ApostropheinputApostrophe | select] = js.undefined
  /**
    * Whether the label should be interpreted as HTML or not. Defaults to
    * `false`.
    */
  var useHtmlLabel: js.UndefOr[Boolean] = js.undefined
  /** The default value for the input field. Defaults to `null`. */
  var value: js.UndefOr[String | Null] = js.undefined
  /** The width of the prompt window. Defaults to `370`. */
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    customStylesheet: js.UndefOr[Null | String] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    icon: js.UndefOr[Null | String] = js.undefined,
    inputAttrs: Record[String, _] = null,
    label: String = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    selectOptions: js.Object = null,
    title: String = null,
    `type`: ApostropheinputApostrophe | select = null,
    useHtmlLabel: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Null | String] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(customStylesheet)) __obj.updateDynamic("customStylesheet")(customStylesheet.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (inputAttrs != null) __obj.updateDynamic("inputAttrs")(inputAttrs.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (selectOptions != null) __obj.updateDynamic("selectOptions")(selectOptions.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useHtmlLabel)) __obj.updateDynamic("useHtmlLabel")(useHtmlLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

