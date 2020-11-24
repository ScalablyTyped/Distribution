package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ChunkSize
import typings.devextreme.anon.Copy
import typings.devextreme.anon.CurrentDeselectedItemKeys
import typings.devextreme.anon.Details
import typings.devextreme.anon.Directory
import typings.devextreme.anon.ErrorCode
import typings.devextreme.anon.File
import typings.devextreme.anon.ItemIndexModel
import typings.devextreme.anon.ItemItemElement
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFileManagerOptions extends WidgetOptions[dxFileManager] {
  
  /**
    * [descr:dxFileManager.Options.allowedFileExtensions]
    */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [descr:dxFileManager.Options.contextMenu]
    */
  var contextMenu: js.UndefOr[dxFileManagerContextMenu] = js.native
  
  /**
    * [descr:dxFileManager.Options.currentPath]
    */
  var currentPath: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileManager.Options.currentPathKeys]
    */
  var currentPathKeys: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [descr:dxFileManager.Options.customizeDetailColumns]
    */
  var customizeDetailColumns: js.UndefOr[
    js.Function1[
      /* columns */ js.Array[dxFileManagerDetailsColumn], 
      js.Array[dxFileManagerDetailsColumn]
    ]
  ] = js.native
  
  /**
    * [descr:dxFileManager.Options.customizeThumbnail]
    */
  var customizeThumbnail: js.UndefOr[js.Function1[/* fileSystemItem */ FileSystemItem, String]] = js.native
  
  /**
    * [descr:dxFileManager.Options.fileSystemProvider]
    */
  var fileSystemProvider: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxFileManager.Options.focusedItemKey]
    */
  var focusedItemKey: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileManager.Options.itemView]
    */
  var itemView: js.UndefOr[Details] = js.native
  
  /**
    * [descr:dxFileManager.Options.onContextMenuItemClick]
    */
  var onContextMenuItemClick: js.UndefOr[js.Function1[/* e */ typings.devextreme.anon.FileSystemItem, _]] = js.native
  
  /**
    * [descr:dxFileManager.Options.onCurrentDirectoryChanged]
    */
  var onCurrentDirectoryChanged: js.UndefOr[js.Function1[/* e */ Directory, _]] = js.native
  
  /**
    * [descr:dxFileManager.Options.onErrorOccurred]
    */
  var onErrorOccurred: js.UndefOr[js.Function1[/* e */ ErrorCode, _]] = js.native
  
  /**
    * [descr:dxFileManager.Options.onFocusedItemChanged]
    */
  var onFocusedItemChanged: js.UndefOr[js.Function1[/* e */ ItemItemElement, _]] = js.native
  
  /**
    * [descr:dxFileManager.Options.onSelectedFileOpened]
    */
  var onSelectedFileOpened: js.UndefOr[js.Function1[/* e */ File, _]] = js.native
  
  /**
    * [descr:dxFileManager.Options.onSelectionChanged]
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ CurrentDeselectedItemKeys, _]] = js.native
  
  /**
    * [descr:dxFileManager.Options.onToolbarItemClick]
    */
  var onToolbarItemClick: js.UndefOr[js.Function1[/* e */ ItemIndexModel, _]] = js.native
  
  /**
    * [descr:dxFileManager.Options.permissions]
    */
  var permissions: js.UndefOr[Copy] = js.native
  
  /**
    * [descr:dxFileManager.Options.rootFolderName]
    */
  var rootFolderName: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxFileManager.Options.selectedItemKeys]
    */
  var selectedItemKeys: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [descr:dxFileManager.Options.selectionMode]
    */
  var selectionMode: js.UndefOr[multiple | single_] = js.native
  
  /**
    * [descr:dxFileManager.Options.toolbar]
    */
  var toolbar: js.UndefOr[dxFileManagerToolbar] = js.native
  
  /**
    * [descr:dxFileManager.Options.upload]
    */
  var upload: js.UndefOr[ChunkSize] = js.native
}
object dxFileManagerOptions {
  
  @scala.inline
  def apply(): dxFileManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerOptions]
  }
  
  @scala.inline
  implicit class dxFileManagerOptionsOps[Self <: dxFileManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowedFileExtensionsVarargs(value: String*): Self = this.set("allowedFileExtensions", js.Array(value :_*))
    
    @scala.inline
    def setAllowedFileExtensions(value: js.Array[String]): Self = this.set("allowedFileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedFileExtensions: Self = this.set("allowedFileExtensions", js.undefined)
    
    @scala.inline
    def setContextMenu(value: dxFileManagerContextMenu): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setCurrentPath(value: String): Self = this.set("currentPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPath: Self = this.set("currentPath", js.undefined)
    
    @scala.inline
    def setCurrentPathKeysVarargs(value: String*): Self = this.set("currentPathKeys", js.Array(value :_*))
    
    @scala.inline
    def setCurrentPathKeys(value: js.Array[String]): Self = this.set("currentPathKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPathKeys: Self = this.set("currentPathKeys", js.undefined)
    
    @scala.inline
    def setCustomizeDetailColumns(value: /* columns */ js.Array[dxFileManagerDetailsColumn] => js.Array[dxFileManagerDetailsColumn]): Self = this.set("customizeDetailColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeDetailColumns: Self = this.set("customizeDetailColumns", js.undefined)
    
    @scala.inline
    def setCustomizeThumbnail(value: /* fileSystemItem */ FileSystemItem => String): Self = this.set("customizeThumbnail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeThumbnail: Self = this.set("customizeThumbnail", js.undefined)
    
    @scala.inline
    def setFileSystemProvider(value: js.Any): Self = this.set("fileSystemProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemProvider: Self = this.set("fileSystemProvider", js.undefined)
    
    @scala.inline
    def setFocusedItemKey(value: String): Self = this.set("focusedItemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusedItemKey: Self = this.set("focusedItemKey", js.undefined)
    
    @scala.inline
    def setItemView(value: Details): Self = this.set("itemView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemView: Self = this.set("itemView", js.undefined)
    
    @scala.inline
    def setOnContextMenuItemClick(value: /* e */ typings.devextreme.anon.FileSystemItem => _): Self = this.set("onContextMenuItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenuItemClick: Self = this.set("onContextMenuItemClick", js.undefined)
    
    @scala.inline
    def setOnCurrentDirectoryChanged(value: /* e */ Directory => _): Self = this.set("onCurrentDirectoryChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCurrentDirectoryChanged: Self = this.set("onCurrentDirectoryChanged", js.undefined)
    
    @scala.inline
    def setOnErrorOccurred(value: /* e */ ErrorCode => _): Self = this.set("onErrorOccurred", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnErrorOccurred: Self = this.set("onErrorOccurred", js.undefined)
    
    @scala.inline
    def setOnFocusedItemChanged(value: /* e */ ItemItemElement => _): Self = this.set("onFocusedItemChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocusedItemChanged: Self = this.set("onFocusedItemChanged", js.undefined)
    
    @scala.inline
    def setOnSelectedFileOpened(value: /* e */ File => _): Self = this.set("onSelectedFileOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectedFileOpened: Self = this.set("onSelectedFileOpened", js.undefined)
    
    @scala.inline
    def setOnSelectionChanged(value: /* e */ CurrentDeselectedItemKeys => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    
    @scala.inline
    def setOnToolbarItemClick(value: /* e */ ItemIndexModel => _): Self = this.set("onToolbarItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnToolbarItemClick: Self = this.set("onToolbarItemClick", js.undefined)
    
    @scala.inline
    def setPermissions(value: Copy): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setRootFolderName(value: String): Self = this.set("rootFolderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootFolderName: Self = this.set("rootFolderName", js.undefined)
    
    @scala.inline
    def setSelectedItemKeysVarargs(value: String*): Self = this.set("selectedItemKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItemKeys(value: js.Array[String]): Self = this.set("selectedItemKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItemKeys: Self = this.set("selectedItemKeys", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: multiple | single_): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setToolbar(value: dxFileManagerToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setUpload(value: ChunkSize): Self = this.set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
}
