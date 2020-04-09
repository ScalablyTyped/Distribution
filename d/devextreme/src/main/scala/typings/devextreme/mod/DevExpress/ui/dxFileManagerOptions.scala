package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonComponentDxFileManager
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonCopy
import typings.devextreme.AnonElement
import typings.devextreme.AnonFileItem
import typings.devextreme.AnonMaxFileSize
import typings.devextreme.AnonMode
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFileManagerOptions extends WidgetOptions[dxFileManager] {
  /** @name dxFileManager.Options.allowedFileExtensions */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  /** @name dxFileManager.Options.contextMenu */
  var contextMenu: js.UndefOr[dxFileManagerContextMenu] = js.undefined
  /** @name dxFileManager.Options.currentPath */
  var currentPath: js.UndefOr[String] = js.undefined
  /** @name dxFileManager.Options.customizeDetailColumns */
  var customizeDetailColumns: js.UndefOr[
    js.Function1[/* columns */ js.Array[dxDataGridColumn], js.Array[dxDataGridColumn]]
  ] = js.undefined
  /** @name dxFileManager.Options.customizeThumbnail */
  var customizeThumbnail: js.UndefOr[js.Function1[/* fileItem */ js.Any, String]] = js.undefined
  /** @name dxFileManager.Options.fileProvider */
  var fileProvider: js.UndefOr[js.Any] = js.undefined
  /** @name dxFileManager.Options.itemView */
  var itemView: js.UndefOr[AnonMode] = js.undefined
  /** @name dxFileManager.Options.onCurrentDirectoryChanged */
  var onCurrentDirectoryChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxFileManager, _]] = js.undefined
  /** @name dxFileManager.Options.onSelectedFileOpened */
  var onSelectedFileOpened: js.UndefOr[js.Function1[/* e */ AnonFileItem, _]] = js.undefined
  /** @name dxFileManager.Options.permissions */
  var permissions: js.UndefOr[AnonCopy] = js.undefined
  /** @name dxFileManager.Options.rootFolderName */
  var rootFolderName: js.UndefOr[String] = js.undefined
  /** @name dxFileManager.Options.selectionMode */
  var selectionMode: js.UndefOr[multiple | single_] = js.undefined
  /** @name dxFileManager.Options.toolbar */
  var toolbar: js.UndefOr[dxFileManagerToolbar] = js.undefined
  /** @name dxFileManager.Options.upload */
  var upload: js.UndefOr[AnonMaxFileSize] = js.undefined
}

object dxFileManagerOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowedFileExtensions: js.Array[String] = null,
    bindingOptions: js.Any = null,
    contextMenu: dxFileManagerContextMenu = null,
    currentPath: String = null,
    customizeDetailColumns: /* columns */ js.Array[dxDataGridColumn] => js.Array[dxDataGridColumn] = null,
    customizeThumbnail: /* fileItem */ js.Any => String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    fileProvider: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemView: AnonMode = null,
    onContentReady: /* e */ AnonComponentElement[dxFileManager] => _ = null,
    onCurrentDirectoryChanged: /* e */ AnonComponentDxFileManager => _ = null,
    onDisposing: /* e */ AnonModel[dxFileManager] => _ = null,
    onInitialized: /* e */ AnonElement[dxFileManager] => _ = null,
    onOptionChanged: /* e */ AnonName[dxFileManager] => _ = null,
    onSelectedFileOpened: /* e */ AnonFileItem => _ = null,
    permissions: AnonCopy = null,
    rootFolderName: String = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionMode: multiple | single_ = null,
    tabIndex: Int | Double = null,
    toolbar: dxFileManagerToolbar = null,
    upload: AnonMaxFileSize = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxFileManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (allowedFileExtensions != null) __obj.updateDynamic("allowedFileExtensions")(allowedFileExtensions.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (currentPath != null) __obj.updateDynamic("currentPath")(currentPath.asInstanceOf[js.Any])
    if (customizeDetailColumns != null) __obj.updateDynamic("customizeDetailColumns")(js.Any.fromFunction1(customizeDetailColumns))
    if (customizeThumbnail != null) __obj.updateDynamic("customizeThumbnail")(js.Any.fromFunction1(customizeThumbnail))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (fileProvider != null) __obj.updateDynamic("fileProvider")(fileProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (itemView != null) __obj.updateDynamic("itemView")(itemView.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onCurrentDirectoryChanged != null) __obj.updateDynamic("onCurrentDirectoryChanged")(js.Any.fromFunction1(onCurrentDirectoryChanged))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onSelectedFileOpened != null) __obj.updateDynamic("onSelectedFileOpened")(js.Any.fromFunction1(onSelectedFileOpened))
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (rootFolderName != null) __obj.updateDynamic("rootFolderName")(rootFolderName.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFileManagerOptions]
  }
}

