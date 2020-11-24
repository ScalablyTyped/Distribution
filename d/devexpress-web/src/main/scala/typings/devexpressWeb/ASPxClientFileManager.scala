package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxFileManager control.
  */
@js.native
trait ASPxClientFileManager extends ASPxClientControl {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientFileManager.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires on the client side after the current folder has been changed within a file manager.
    */
  var CurrentFolderChanged: ASPxClientEvent[ASPxClientFileManagerCurrentFolderChangedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires when a custom item is clicked, allowing you to perform custom actions.
    */
  var CustomCommand: ASPxClientEvent[ASPxClientFileManagerCustomCommandEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Enables you to display the alert with the result error description.
    */
  var ErrorAlertDisplaying: ASPxClientEvent[ASPxClientFileManagerErrorAlertDisplayingEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires on the client if any error occurs while editing an item.
    */
  var ErrorOccurred: ASPxClientEvent[ASPxClientFileManagerErrorEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Executes the specified command. true, if the specified command has been completed successfully; otherwise, false.
    * @param commandName A string value that specifies the command to perform.
    */
  def ExecuteCommand(commandName: String): Boolean = js.native
  
  /**
    * Fires on the client side before a file download starts, and allows you to cancel the action.
    */
  var FileDownloading: ASPxClientEvent[ASPxClientFileManagerFileDownloadingEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Enables you to specify whether the selected file(s) are valid and provide an error text.
    */
  var FileUploadValidationErrorOccurred: ASPxClientEvent[
    ASPxClientUploadControlValidationErrorOccurredEventHandler[ASPxClientFileManager]
  ] = js.native
  
  /**
    * Occurs on the client side after a file has been uploaded.
    */
  var FileUploaded: ASPxClientEvent[ASPxClientFileManagerFileUploadedEventHandler[ASPxClientFileManager]] = js.native
  
  /** @deprecated This event is now obsolete. Use the FilesUploading event instead. */
  /**
    * Fires on the client side before a file upload starts, and allows you to cancel the action.
    */
  var FileUploading: ASPxClientEvent[ASPxClientFileManagerFileUploadingEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Occurs on the client side after upload of all selected files has been completed.
    */
  var FilesUploaded: ASPxClientEvent[ASPxClientFileManagerFilesUploadedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires on the client side before the selected items are uploaded and allows you to cancel the action.
    */
  var FilesUploading: ASPxClientEvent[ASPxClientFileManagerFilesUploadingEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires after the focused item has been changed.
    */
  var FocusedItemChanged: ASPxClientEvent[ASPxClientFileManagerFocusedItemChangedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Occurs on the client side after a folder has been created.
    */
  var FolderCreated: ASPxClientEvent[ASPxClientFileManagerItemCreatedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires on the client side before the folder is created, and allows you to cancel the action.
    */
  var FolderCreating: ASPxClientEvent[ASPxClientFileManagerItemEditingEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Gets the name of the currently active file manager area.
    */
  def GetActiveAreaName(): String = js.native
  
  /**
    * Sends a callback to the server and returns a list of files that are contained within the current folder.
    * @param onCallback A  object that represents the JavaScript function which receives the list of row values as a parameter.
    */
  def GetAllItems(onCallback: ASPxClientFileManagerAllItemsCallback): Unit = js.native
  
  /**
    * Returns a context menu item specified by its command name. An ASPxClientFileManagerToolbarItem object that is the item with the specified command name.
    * @param commandName A string value specifying the command name of the item.
    */
  def GetContextMenuItemByCommandName(commandName: String): ASPxClientFileManagerToolbarItem = js.native
  
  /**
    * Gets the current folder's ID.
    */
  def GetCurrentFolderId(): String = js.native
  
  /**
    * Gets the current folder's path with the specified settings. A string value that represents the path to the folder.
    * @param separator A string value that specifies the separator between the folder's name within the path.
    * @param skipRootFolder true to skip the root folder; otherwise, false.
    */
  def GetCurrentFolderPath(): String = js.native
  def GetCurrentFolderPath(separator: js.UndefOr[scala.Nothing], skipRootFolder: Boolean): String = js.native
  def GetCurrentFolderPath(separator: String): String = js.native
  def GetCurrentFolderPath(separator: String, skipRootFolder: Boolean): String = js.native
  
  /**
    * Returns a list of files that are loaded on the current page.
    */
  def GetItems(): js.Array[ASPxClientFileManagerFile] = js.native
  
  /**
    * Returns the selected file within the ASPxFileManager control's file container.
    */
  def GetSelectedFile(): ASPxClientFileManagerFile = js.native
  
  /**
    * Returns an array of the file manager's selected items.
    */
  def GetSelectedItems(): js.Array[ASPxClientFileManagerFile] = js.native
  
  /**
    * Returns a toolbar item specified by its command name. An ASPxClientFileManagerToolbarItem object that is the item with the specified command name.
    * @param commandName A string value specifying the command name of the item.
    */
  def GetToolbarItemByCommandName(commandName: String): ASPxClientFileManagerToolbarItem = js.native
  
  /**
    * Enables you to highlight the search text, which is specified using the filter box, in templates.
    */
  var HighlightItemTemplate: ASPxClientEvent[ASPxClientFileManagerHighlightItemTemplateEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Occurs on the client side after a file manager item has been copied.
    */
  var ItemCopied: ASPxClientEvent[ASPxClientFileManagerItemCopiedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires on the client side before an item is copied and allows you to cancel the action.
    */
  var ItemCopying: ASPxClientEvent[ASPxClientFileManagerItemEditingEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Occurs on the client side after a file manager's item has been deleted.
    */
  var ItemDeleted: ASPxClientEvent[ASPxClientFileManagerItemDeletedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires on the client side before an item is deleted and allows you to cancel the action.
    */
  var ItemDeleting: ASPxClientEvent[ASPxClientFileManagerItemEditingEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Occurs on the client side after a file manager's item has been moved.
    */
  var ItemMoved: ASPxClientEvent[ASPxClientFileManagerItemMovedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires on the client side before an item is moved and allows you to cancel the action.
    */
  var ItemMoving: ASPxClientEvent[ASPxClientFileManagerItemEditingEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Occurs on the client side after a file manager's item has been renamed.
    */
  var ItemRenamed: ASPxClientEvent[ASPxClientFileManagerItemRenamedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires on the client side before an item is renamed and allows you to cancel the action.
    */
  var ItemRenaming: ASPxClientEvent[ASPxClientFileManagerItemEditingEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Occurs on the client side after all the selected items have been copied.
    */
  var ItemsCopied: ASPxClientEvent[ASPxClientFileManagerItemsCopiedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Occurs on the client side after all the selected items have been deleted.
    */
  var ItemsDeleted: ASPxClientEvent[ASPxClientFileManagerItemsDeletedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Occurs on the client side after all the selected items have been moved.
    */
  var ItemsMoved: ASPxClientEvent[ASPxClientFileManagerItemsMovedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Sends a callback to the server and generates the server-side ASPxFileManager.CustomCallback event, passing it the specified argument.
    * @param args A string value that specifies any information that needs to be sent to the server-side ASPxFileManager.CustomCallback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(args: String): Unit = js.native
  def PerformCallback(args: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  /**
    * Client-side scripting method which initiates a round trip to the server, so that the current page will be reloaded.
    */
  def Refresh(): Unit = js.native
  
  /**
    * Fires on the client side after the selected file has been changed.
    */
  var SelectedFileChanged: ASPxClientEvent[ASPxClientFileManagerFileEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires on the client side when an end-user opens a file by double-clicking it or pressing the Enter key.
    */
  var SelectedFileOpened: ASPxClientEvent[ASPxClientFileManagerFileOpenedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Fires after the selection has been changed.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientFileManagerSelectionChangedEventHandler[ASPxClientFileManager]] = js.native
  
  /**
    * Sets the current folder's path.
    * @param path A String value that is the relative path to the folder (without the root folder).
    * @param onCallback A ASPxClientFileManagerCallback object that is the JavaScript function that receives the callback data as a parameter.
    */
  def SetCurrentFolderPath(path: String, onCallback: ASPxClientFileManagerCallback): Unit = js.native
  
  /**
    * Fires on the client side when the file manager updates the state of toolbar or context menu items.
    */
  var ToolbarUpdating: ASPxClientEvent[ASPxClientFileManagerToolbarUpdatingEventHandler[ASPxClientFileManager]] = js.native
}
