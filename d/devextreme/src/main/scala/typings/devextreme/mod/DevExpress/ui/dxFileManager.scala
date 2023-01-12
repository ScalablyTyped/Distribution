package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
import typings.std.File
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFileManager
  extends StObject
     with Widget[dxFileManagerOptions] {
  
  /**
    * Gets the current directory object.
    */
  def getCurrentDirectory(): Any = js.native
  
  /**
    * Gets the selected items.
    */
  def getSelectedItems(): js.Array[Any] = js.native
  
  /**
    * Reloads data and repaints the UI component.
    */
  def refresh(): js.Promise[Any] = js.native
}
object dxFileManager {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait ActionEventInfo extends StObject {
    
    var cancel: Boolean | PromiseLike[Unit]
    
    var errorCode: js.UndefOr[Double] = js.undefined
    
    var errorText: String
  }
  object ActionEventInfo {
    
    inline def apply(cancel: Boolean | PromiseLike[Unit], errorText: String): ActionEventInfo = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionEventInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionEventInfo] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean | PromiseLike[Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    }
  }
  
  type ContentReadyEvent = EventInfo[dxFileManager]
  
  type ContextMenuItem = dxFileManagerContextMenuItem
  
  trait ContextMenuItemClickEvent
    extends StObject
       with NativeEventInfo[dxFileManager, KeyboardEvent | PointerEvent | MouseEvent] {
    
    val fileSystemItem: js.UndefOr[FileSystemItem] = js.undefined
    
    val itemData: Any
    
    val itemElement: DxElement_[HTMLElement]
    
    val itemIndex: Double
    
    val viewArea: FileManagerViewArea
  }
  object ContextMenuItemClickEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      itemData: Any,
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double,
      viewArea: FileManagerViewArea
    ): ContextMenuItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], viewArea = viewArea.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuItemClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuItemClickEvent] (val x: Self) extends AnyVal {
      
      inline def setFileSystemItem(value: FileSystemItem): Self = StObject.set(x, "fileSystemItem", value.asInstanceOf[js.Any])
      
      inline def setFileSystemItemUndefined: Self = StObject.set(x, "fileSystemItem", js.undefined)
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      inline def setViewArea(value: FileManagerViewArea): Self = StObject.set(x, "viewArea", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextMenuShowingEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxFileManager, KeyboardEvent | PointerEvent | MouseEvent] {
    
    val fileSystemItem: js.UndefOr[FileSystemItem] = js.undefined
    
    val targetElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val viewArea: FileManagerViewArea
  }
  object ContextMenuShowingEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement], viewArea: FileManagerViewArea): ContextMenuShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], viewArea = viewArea.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuShowingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuShowingEvent] (val x: Self) extends AnyVal {
      
      inline def setFileSystemItem(value: FileSystemItem): Self = StObject.set(x, "fileSystemItem", value.asInstanceOf[js.Any])
      
      inline def setFileSystemItemUndefined: Self = StObject.set(x, "fileSystemItem", js.undefined)
      
      inline def setTargetElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
      
      inline def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
      
      inline def setViewArea(value: FileManagerViewArea): Self = StObject.set(x, "viewArea", value.asInstanceOf[js.Any])
    }
  }
  
  trait CurrentDirectoryChangedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val directory: FileSystemItem
  }
  object CurrentDirectoryChangedEvent {
    
    inline def apply(component: dxFileManager, directory: FileSystemItem, element: DxElement_[HTMLElement]): CurrentDirectoryChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentDirectoryChangedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrentDirectoryChangedEvent] (val x: Self) extends AnyVal {
      
      inline def setDirectory(value: FileSystemItem): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectoryCreatedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val name: String
    
    val parentDirectory: FileSystemItem
  }
  object DirectoryCreatedEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      name: String,
      parentDirectory: FileSystemItem
    ): DirectoryCreatedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentDirectory = parentDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryCreatedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryCreatedEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParentDirectory(value: FileSystemItem): Self = StObject.set(x, "parentDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectoryCreatingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val name: String
    
    val parentDirectory: FileSystemItem
  }
  object DirectoryCreatingEvent {
    
    inline def apply(
      cancel: Boolean | PromiseLike[Unit],
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      errorText: String,
      name: String,
      parentDirectory: FileSystemItem
    ): DirectoryCreatingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentDirectory = parentDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryCreatingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryCreatingEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParentDirectory(value: FileSystemItem): Self = StObject.set(x, "parentDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxFileManager]
  
  trait ErrorOccurredEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val errorCode: js.UndefOr[Double] = js.undefined
    
    var errorText: js.UndefOr[String] = js.undefined
    
    val fileSystemItem: js.UndefOr[FileSystemItem] = js.undefined
  }
  object ErrorOccurredEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement]): ErrorOccurredEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorOccurredEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorOccurredEvent] (val x: Self) extends AnyVal {
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
      
      inline def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
      
      inline def setFileSystemItem(value: FileSystemItem): Self = StObject.set(x, "fileSystemItem", value.asInstanceOf[js.Any])
      
      inline def setFileSystemItemUndefined: Self = StObject.set(x, "fileSystemItem", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.details
    - typings.devextreme.devextremeStrings.thumbnails
  */
  trait FileManagerItemViewMode extends StObject
  object FileManagerItemViewMode {
    
    inline def details: typings.devextreme.devextremeStrings.details = "details".asInstanceOf[typings.devextreme.devextremeStrings.details]
    
    inline def thumbnails: typings.devextreme.devextremeStrings.thumbnails = "thumbnails".asInstanceOf[typings.devextreme.devextremeStrings.thumbnails]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.create
    - typings.devextreme.devextremeStrings.upload
    - typings.devextreme.devextremeStrings.refresh
    - typings.devextreme.devextremeStrings.download
    - typings.devextreme.devextremeStrings.move
    - typings.devextreme.devextremeStrings.copy
    - typings.devextreme.devextremeStrings.rename
    - typings.devextreme.devextremeStrings.delete
  */
  trait FileManagerPredefinedContextMenuItem extends StObject
  object FileManagerPredefinedContextMenuItem {
    
    inline def copy: typings.devextreme.devextremeStrings.copy = "copy".asInstanceOf[typings.devextreme.devextremeStrings.copy]
    
    inline def create: typings.devextreme.devextremeStrings.create = "create".asInstanceOf[typings.devextreme.devextremeStrings.create]
    
    inline def delete: typings.devextreme.devextremeStrings.delete = "delete".asInstanceOf[typings.devextreme.devextremeStrings.delete]
    
    inline def download: typings.devextreme.devextremeStrings.download = "download".asInstanceOf[typings.devextreme.devextremeStrings.download]
    
    inline def move: typings.devextreme.devextremeStrings.move = "move".asInstanceOf[typings.devextreme.devextremeStrings.move]
    
    inline def refresh: typings.devextreme.devextremeStrings.refresh = "refresh".asInstanceOf[typings.devextreme.devextremeStrings.refresh]
    
    inline def rename: typings.devextreme.devextremeStrings.rename = "rename".asInstanceOf[typings.devextreme.devextremeStrings.rename]
    
    inline def upload: typings.devextreme.devextremeStrings.upload = "upload".asInstanceOf[typings.devextreme.devextremeStrings.upload]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.showNavPane
    - typings.devextreme.devextremeStrings.create
    - typings.devextreme.devextremeStrings.upload
    - typings.devextreme.devextremeStrings.refresh
    - typings.devextreme.devextremeStrings.switchView
    - typings.devextreme.devextremeStrings.download
    - typings.devextreme.devextremeStrings.move
    - typings.devextreme.devextremeStrings.copy
    - typings.devextreme.devextremeStrings.rename
    - typings.devextreme.devextremeStrings.delete
    - typings.devextreme.devextremeStrings.clearSelection
    - typings.devextreme.devextremeStrings.separator
  */
  trait FileManagerPredefinedToolbarItem extends StObject
  object FileManagerPredefinedToolbarItem {
    
    inline def clearSelection: typings.devextreme.devextremeStrings.clearSelection = "clearSelection".asInstanceOf[typings.devextreme.devextremeStrings.clearSelection]
    
    inline def copy: typings.devextreme.devextremeStrings.copy = "copy".asInstanceOf[typings.devextreme.devextremeStrings.copy]
    
    inline def create: typings.devextreme.devextremeStrings.create = "create".asInstanceOf[typings.devextreme.devextremeStrings.create]
    
    inline def delete: typings.devextreme.devextremeStrings.delete = "delete".asInstanceOf[typings.devextreme.devextremeStrings.delete]
    
    inline def download: typings.devextreme.devextremeStrings.download = "download".asInstanceOf[typings.devextreme.devextremeStrings.download]
    
    inline def move: typings.devextreme.devextremeStrings.move = "move".asInstanceOf[typings.devextreme.devextremeStrings.move]
    
    inline def refresh: typings.devextreme.devextremeStrings.refresh = "refresh".asInstanceOf[typings.devextreme.devextremeStrings.refresh]
    
    inline def rename: typings.devextreme.devextremeStrings.rename = "rename".asInstanceOf[typings.devextreme.devextremeStrings.rename]
    
    inline def separator: typings.devextreme.devextremeStrings.separator = "separator".asInstanceOf[typings.devextreme.devextremeStrings.separator]
    
    inline def showNavPane: typings.devextreme.devextremeStrings.showNavPane = "showNavPane".asInstanceOf[typings.devextreme.devextremeStrings.showNavPane]
    
    inline def switchView: typings.devextreme.devextremeStrings.switchView = "switchView".asInstanceOf[typings.devextreme.devextremeStrings.switchView]
    
    inline def upload: typings.devextreme.devextremeStrings.upload = "upload".asInstanceOf[typings.devextreme.devextremeStrings.upload]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.navPane
    - typings.devextreme.devextremeStrings.itemView
  */
  trait FileManagerViewArea extends StObject
  object FileManagerViewArea {
    
    inline def itemView: typings.devextreme.devextremeStrings.itemView = "itemView".asInstanceOf[typings.devextreme.devextremeStrings.itemView]
    
    inline def navPane: typings.devextreme.devextremeStrings.navPane = "navPane".asInstanceOf[typings.devextreme.devextremeStrings.navPane]
  }
  
  trait FileUploadedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val fileData: File
    
    val parentDirectory: FileSystemItem
  }
  object FileUploadedEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      fileData: File,
      parentDirectory: FileSystemItem
    ): FileUploadedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileData = fileData.asInstanceOf[js.Any], parentDirectory = parentDirectory.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadedEvent] (val x: Self) extends AnyVal {
      
      inline def setFileData(value: File): Self = StObject.set(x, "fileData", value.asInstanceOf[js.Any])
      
      inline def setParentDirectory(value: FileSystemItem): Self = StObject.set(x, "parentDirectory", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileUploadingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val destinationDirectory: FileSystemItem
    
    val fileData: File
  }
  object FileUploadingEvent {
    
    inline def apply(
      cancel: Boolean | PromiseLike[Unit],
      component: dxFileManager,
      destinationDirectory: FileSystemItem,
      element: DxElement_[HTMLElement],
      errorText: String,
      fileData: File
    ): FileUploadingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], destinationDirectory = destinationDirectory.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], fileData = fileData.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploadingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploadingEvent] (val x: Self) extends AnyVal {
      
      inline def setDestinationDirectory(value: FileSystemItem): Self = StObject.set(x, "destinationDirectory", value.asInstanceOf[js.Any])
      
      inline def setFileData(value: File): Self = StObject.set(x, "fileData", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusedItemChangedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val item: js.UndefOr[FileSystemItem] = js.undefined
    
    val itemElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object FocusedItemChangedEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement]): FocusedItemChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedItemChangedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusedItemChangedEvent] (val x: Self) extends AnyVal {
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxFileManager]
  
  trait ItemCopiedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val itemName: String
    
    val itemPath: String
    
    val parentDirectory: FileSystemItem
    
    val sourceItem: FileSystemItem
  }
  object ItemCopiedEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      itemName: String,
      itemPath: String,
      parentDirectory: FileSystemItem,
      sourceItem: FileSystemItem
    ): ItemCopiedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], itemPath = itemPath.asInstanceOf[js.Any], parentDirectory = parentDirectory.asInstanceOf[js.Any], sourceItem = sourceItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemCopiedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemCopiedEvent] (val x: Self) extends AnyVal {
      
      inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      inline def setItemPath(value: String): Self = StObject.set(x, "itemPath", value.asInstanceOf[js.Any])
      
      inline def setParentDirectory(value: FileSystemItem): Self = StObject.set(x, "parentDirectory", value.asInstanceOf[js.Any])
      
      inline def setSourceItem(value: FileSystemItem): Self = StObject.set(x, "sourceItem", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemCopyingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val destinationDirectory: FileSystemItem
    
    val item: FileSystemItem
  }
  object ItemCopyingEvent {
    
    inline def apply(
      cancel: Boolean | PromiseLike[Unit],
      component: dxFileManager,
      destinationDirectory: FileSystemItem,
      element: DxElement_[HTMLElement],
      errorText: String,
      item: FileSystemItem
    ): ItemCopyingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], destinationDirectory = destinationDirectory.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemCopyingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemCopyingEvent] (val x: Self) extends AnyVal {
      
      inline def setDestinationDirectory(value: FileSystemItem): Self = StObject.set(x, "destinationDirectory", value.asInstanceOf[js.Any])
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemDeletedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val item: FileSystemItem
  }
  object ItemDeletedEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement], item: FileSystemItem): ItemDeletedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDeletedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemDeletedEvent] (val x: Self) extends AnyVal {
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemDeletingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val item: FileSystemItem
  }
  object ItemDeletingEvent {
    
    inline def apply(
      cancel: Boolean | PromiseLike[Unit],
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      errorText: String,
      item: FileSystemItem
    ): ItemDeletingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDeletingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemDeletingEvent] (val x: Self) extends AnyVal {
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemDownloadingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val item: FileSystemItem
  }
  object ItemDownloadingEvent {
    
    inline def apply(
      cancel: Boolean | PromiseLike[Unit],
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      errorText: String,
      item: FileSystemItem
    ): ItemDownloadingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemDownloadingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemDownloadingEvent] (val x: Self) extends AnyVal {
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemMovedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val itemName: String
    
    val itemPath: String
    
    val parentDirectory: FileSystemItem
    
    val sourceItem: FileSystemItem
  }
  object ItemMovedEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      itemName: String,
      itemPath: String,
      parentDirectory: FileSystemItem,
      sourceItem: FileSystemItem
    ): ItemMovedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], itemPath = itemPath.asInstanceOf[js.Any], parentDirectory = parentDirectory.asInstanceOf[js.Any], sourceItem = sourceItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemMovedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemMovedEvent] (val x: Self) extends AnyVal {
      
      inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      inline def setItemPath(value: String): Self = StObject.set(x, "itemPath", value.asInstanceOf[js.Any])
      
      inline def setParentDirectory(value: FileSystemItem): Self = StObject.set(x, "parentDirectory", value.asInstanceOf[js.Any])
      
      inline def setSourceItem(value: FileSystemItem): Self = StObject.set(x, "sourceItem", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemMovingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val destinationDirectory: FileSystemItem
    
    val item: FileSystemItem
  }
  object ItemMovingEvent {
    
    inline def apply(
      cancel: Boolean | PromiseLike[Unit],
      component: dxFileManager,
      destinationDirectory: FileSystemItem,
      element: DxElement_[HTMLElement],
      errorText: String,
      item: FileSystemItem
    ): ItemMovingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], destinationDirectory = destinationDirectory.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemMovingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemMovingEvent] (val x: Self) extends AnyVal {
      
      inline def setDestinationDirectory(value: FileSystemItem): Self = StObject.set(x, "destinationDirectory", value.asInstanceOf[js.Any])
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemRenamedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val itemName: String
    
    val sourceItem: FileSystemItem
  }
  object ItemRenamedEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      itemName: String,
      sourceItem: FileSystemItem
    ): ItemRenamedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], sourceItem = sourceItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenamedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemRenamedEvent] (val x: Self) extends AnyVal {
      
      inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      inline def setSourceItem(value: FileSystemItem): Self = StObject.set(x, "sourceItem", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemRenamingEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ActionEventInfo {
    
    val item: FileSystemItem
    
    val newName: String
  }
  object ItemRenamingEvent {
    
    inline def apply(
      cancel: Boolean | PromiseLike[Unit],
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      errorText: String,
      item: FileSystemItem,
      newName: String
    ): ItemRenamingEvent = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemRenamingEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemRenamingEvent] (val x: Self) extends AnyVal {
      
      inline def setItem(value: FileSystemItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxFileManager]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxFileManagerOptions
  
  trait SelectedFileOpenedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val file: FileSystemItem
  }
  object SelectedFileOpenedEvent {
    
    inline def apply(component: dxFileManager, element: DxElement_[HTMLElement], file: FileSystemItem): SelectedFileOpenedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectedFileOpenedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectedFileOpenedEvent] (val x: Self) extends AnyVal {
      
      inline def setFile(value: FileSystemItem): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxFileManager] {
    
    val currentDeselectedItemKeys: js.Array[String]
    
    val currentSelectedItemKeys: js.Array[String]
    
    val selectedItemKeys: js.Array[String]
    
    val selectedItems: js.Array[FileSystemItem]
  }
  object SelectionChangedEvent {
    
    inline def apply(
      component: dxFileManager,
      currentDeselectedItemKeys: js.Array[String],
      currentSelectedItemKeys: js.Array[String],
      element: DxElement_[HTMLElement],
      selectedItemKeys: js.Array[String],
      selectedItems: js.Array[FileSystemItem]
    ): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], currentDeselectedItemKeys = currentDeselectedItemKeys.asInstanceOf[js.Any], currentSelectedItemKeys = currentSelectedItemKeys.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], selectedItemKeys = selectedItemKeys.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionChangedEvent] (val x: Self) extends AnyVal {
      
      inline def setCurrentDeselectedItemKeys(value: js.Array[String]): Self = StObject.set(x, "currentDeselectedItemKeys", value.asInstanceOf[js.Any])
      
      inline def setCurrentDeselectedItemKeysVarargs(value: String*): Self = StObject.set(x, "currentDeselectedItemKeys", js.Array(value*))
      
      inline def setCurrentSelectedItemKeys(value: js.Array[String]): Self = StObject.set(x, "currentSelectedItemKeys", value.asInstanceOf[js.Any])
      
      inline def setCurrentSelectedItemKeysVarargs(value: String*): Self = StObject.set(x, "currentSelectedItemKeys", js.Array(value*))
      
      inline def setSelectedItemKeys(value: js.Array[String]): Self = StObject.set(x, "selectedItemKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemKeysVarargs(value: String*): Self = StObject.set(x, "selectedItemKeys", js.Array(value*))
      
      inline def setSelectedItems(value: js.Array[FileSystemItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsVarargs(value: FileSystemItem*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    }
  }
  
  type ToolbarItem = dxFileManagerToolbarItem
  
  trait ToolbarItemClickEvent
    extends StObject
       with NativeEventInfo[dxFileManager, PointerEvent | MouseEvent] {
    
    val itemData: Any
    
    val itemElement: DxElement_[HTMLElement]
    
    val itemIndex: Double
  }
  object ToolbarItemClickEvent {
    
    inline def apply(
      component: dxFileManager,
      element: DxElement_[HTMLElement],
      itemData: Any,
      itemElement: DxElement_[HTMLElement],
      itemIndex: Double
    ): ToolbarItemClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarItemClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarItemClickEvent] (val x: Self) extends AnyVal {
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    }
  }
}
