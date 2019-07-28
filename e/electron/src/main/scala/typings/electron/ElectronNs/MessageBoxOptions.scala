package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBoxOptions extends js.Object {
  /**
    * Array of texts for buttons. On Windows, an empty array will result in one button
    * labeled "OK".
    */
  var buttons: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The index of the button to be used to cancel the dialog, via the Esc key. By
    * default this is assigned to the first button with "cancel" or "no" as the label.
    * If no such labeled buttons exist and this option is not set, 0 will be used as
    * the return value or callback response.
    */
  var cancelId: js.UndefOr[Double] = js.undefined
  /**
    * Initial checked state of the checkbox. false by default.
    */
  var checkboxChecked: js.UndefOr[Boolean] = js.undefined
  /**
    * If provided, the message box will include a checkbox with the given label. The
    * checkbox state can be inspected only when using callback.
    */
  var checkboxLabel: js.UndefOr[String] = js.undefined
  /**
    * Index of the button in the buttons array which will be selected by default when
    * the message box opens.
    */
  var defaultId: js.UndefOr[Double] = js.undefined
  /**
    * Extra information of the message.
    */
  var detail: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[NativeImage] = js.undefined
  /**
    * Content of the message box.
    */
  var message: String
  /**
    * On Windows Electron will try to figure out which one of the buttons are common
    * buttons (like "Cancel" or "Yes"), and show the others as command links in the
    * dialog. This can make the dialog appear in the style of modern Windows apps. If
    * you don't like this behavior, you can set noLink to true.
    */
  var noLink: js.UndefOr[Boolean] = js.undefined
  /**
    * Normalize the keyboard access keys across platforms. Default is false. Enabling
    * this assumes & is used in the button labels for the placement of the keyboard
    * shortcut access key and labels will be converted so they work correctly on each
    * platform, & characters are removed on macOS, converted to _ on Linux, and left
    * untouched on Windows. For example, a button label of Vie&w will be converted to
    * Vie_w on Linux and View on macOS and can be selected via Alt-W on Windows and
    * Linux.
    */
  var normalizeAccessKeys: js.UndefOr[Boolean] = js.undefined
  /**
    * Title of the message box, some platforms will not show it.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Can be "none", "info", "error", "question" or "warning". On Windows, "question"
    * displays the same icon as "info", unless you set an icon using the "icon"
    * option. On macOS, both "warning" and "error" display the same warning icon.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MessageBoxOptions {
  @scala.inline
  def apply(
    message: String,
    buttons: js.Array[String] = null,
    cancelId: Int | Double = null,
    checkboxChecked: js.UndefOr[Boolean] = js.undefined,
    checkboxLabel: String = null,
    defaultId: Int | Double = null,
    detail: String = null,
    icon: NativeImage = null,
    noLink: js.UndefOr[Boolean] = js.undefined,
    normalizeAccessKeys: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    `type`: String = null
  ): MessageBoxOptions = {
    val __obj = js.Dynamic.literal(message = message)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (cancelId != null) __obj.updateDynamic("cancelId")(cancelId.asInstanceOf[js.Any])
    if (!js.isUndefined(checkboxChecked)) __obj.updateDynamic("checkboxChecked")(checkboxChecked)
    if (checkboxLabel != null) __obj.updateDynamic("checkboxLabel")(checkboxLabel)
    if (defaultId != null) __obj.updateDynamic("defaultId")(defaultId.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(noLink)) __obj.updateDynamic("noLink")(noLink)
    if (!js.isUndefined(normalizeAccessKeys)) __obj.updateDynamic("normalizeAccessKeys")(normalizeAccessKeys)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MessageBoxOptions]
  }
}

