package typings
package epiceditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EpicEditorOptions extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var clientSideStorage: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[js.Any] = js.undefined
  var file: js.UndefOr[Anon_AutoSave] = js.undefined
  var focusOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  var localStorageName: js.UndefOr[java.lang.String] = js.undefined
  var parser: js.UndefOr[js.Any] = js.undefined
  var shortcut: js.UndefOr[Anon_Fullscreen] = js.undefined
  var string: js.UndefOr[Anon_ToggleEdit] = js.undefined
  var textarea: js.UndefOr[js.Any] = js.undefined
  var theme: js.UndefOr[Anon_Base] = js.undefined
  var useNativeFullsreen: js.UndefOr[scala.Boolean] = js.undefined
}

object EpicEditorOptions {
  @scala.inline
  def apply(
    basePath: java.lang.String = null,
    clientSideStorage: js.UndefOr[scala.Boolean] = js.undefined,
    container: js.Any = null,
    file: Anon_AutoSave = null,
    focusOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    localStorageName: java.lang.String = null,
    parser: js.Any = null,
    shortcut: Anon_Fullscreen = null,
    string: Anon_ToggleEdit = null,
    textarea: js.Any = null,
    theme: Anon_Base = null,
    useNativeFullsreen: js.UndefOr[scala.Boolean] = js.undefined
  ): EpicEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (!js.isUndefined(clientSideStorage)) __obj.updateDynamic("clientSideStorage")(clientSideStorage)
    if (container != null) __obj.updateDynamic("container")(container)
    if (file != null) __obj.updateDynamic("file")(file)
    if (!js.isUndefined(focusOnLoad)) __obj.updateDynamic("focusOnLoad")(focusOnLoad)
    if (localStorageName != null) __obj.updateDynamic("localStorageName")(localStorageName)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut)
    if (string != null) __obj.updateDynamic("string")(string)
    if (textarea != null) __obj.updateDynamic("textarea")(textarea)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(useNativeFullsreen)) __obj.updateDynamic("useNativeFullsreen")(useNativeFullsreen)
    __obj.asInstanceOf[EpicEditorOptions]
  }
}

