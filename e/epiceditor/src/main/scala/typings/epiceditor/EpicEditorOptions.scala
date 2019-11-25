package typings.epiceditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EpicEditorOptions extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var clientSideStorage: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[js.Any] = js.undefined
  var file: js.UndefOr[Anon_AutoSave] = js.undefined
  var focusOnLoad: js.UndefOr[Boolean] = js.undefined
  var localStorageName: js.UndefOr[String] = js.undefined
  var parser: js.UndefOr[js.Any] = js.undefined
  var shortcut: js.UndefOr[Anon_Fullscreen] = js.undefined
  var string: js.UndefOr[Anon_ToggleEdit] = js.undefined
  var textarea: js.UndefOr[js.Any] = js.undefined
  var theme: js.UndefOr[Anon_Base] = js.undefined
  var useNativeFullsreen: js.UndefOr[Boolean] = js.undefined
}

object EpicEditorOptions {
  @scala.inline
  def apply(
    basePath: String = null,
    clientSideStorage: js.UndefOr[Boolean] = js.undefined,
    container: js.Any = null,
    file: Anon_AutoSave = null,
    focusOnLoad: js.UndefOr[Boolean] = js.undefined,
    localStorageName: String = null,
    parser: js.Any = null,
    shortcut: Anon_Fullscreen = null,
    string: Anon_ToggleEdit = null,
    textarea: js.Any = null,
    theme: Anon_Base = null,
    useNativeFullsreen: js.UndefOr[Boolean] = js.undefined
  ): EpicEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (!js.isUndefined(clientSideStorage)) __obj.updateDynamic("clientSideStorage")(clientSideStorage.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnLoad)) __obj.updateDynamic("focusOnLoad")(focusOnLoad.asInstanceOf[js.Any])
    if (localStorageName != null) __obj.updateDynamic("localStorageName")(localStorageName.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (textarea != null) __obj.updateDynamic("textarea")(textarea.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeFullsreen)) __obj.updateDynamic("useNativeFullsreen")(useNativeFullsreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpicEditorOptions]
  }
}

