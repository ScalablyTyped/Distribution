package typings.ejWebAll.ej

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileExplorer
  extends StObject
     with Widget_ {
  
  /** Refresh the size of FileExplorer control.
    * @returns {void}
    */
  def adjustSize(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Disable the particular context menu item.
    * @param {string|HTMLElement} Id of the menu item/ Menu element to be disabled
    * @returns {void}
    */
  def disableMenuItem(item: String): Unit = js.native
  def disableMenuItem(item: HTMLElement): Unit = js.native
  
  /** Disable the particular toolbar item.
    * @param {string|HTMLElement} Id of the toolbar item/ Tool item element to be disabled
    * @returns {void}
    */
  def disableToolbarItem(item: String): Unit = js.native
  def disableToolbarItem(item: HTMLElement): Unit = js.native
  
  /** Enable the particular context menu item.
    * @param {string|HTMLElement} Id of the menu item/ Menu element to be Enabled
    * @returns {void}
    */
  def enableMenuItem(item: String): Unit = js.native
  def enableMenuItem(item: HTMLElement): Unit = js.native
  
  /** Enable the particular toolbar item
    * @param {string|HTMLElement} Id of the tool item/ Tool item element to be Enabled
    * @returns {void}
    */
  def enableToolbarItem(item: String): Unit = js.native
  def enableToolbarItem(item: HTMLElement): Unit = js.native
  
  @JSName("model")
  var model_FileExplorer: Model = js.native
  
  /** Refresh the content of the selected folder in FileExplorer control.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** Remove the particular toolbar item.
    * @param {string|HTMLElement} Id of the tool item/ tool item element to be removed
    * @returns {void}
    */
  def removeToolbarItem(item: String): Unit = js.native
  def removeToolbarItem(item: HTMLElement): Unit = js.native
}
object FileExplorer {
  
  @js.native
  sealed trait layoutType extends StObject
  @JSGlobal("ej.FileExplorer.layoutType")
  @js.native
  object layoutType extends StObject {
    
    ///Supports to display files in grid view
    @js.native
    sealed trait Grid
      extends StObject
         with layoutType
    
    ///Supports to display files as large icons
    @js.native
    sealed trait LargeIcons
      extends StObject
         with layoutType
    
    ///Supports to display files in tile view
    @js.native
    sealed trait Tile
      extends StObject
         with layoutType
  }
  
  trait BeforeAjaxRequestEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the AJAX request data
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeAjaxRequestEventArgs {
    
    inline def apply(): BeforeAjaxRequestEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeAjaxRequestEventArgs]
    }
    
    extension [Self <: BeforeAjaxRequestEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeDownloadEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the downloaded file names.
      */
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the path of currently opened item.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeDownloadEventArgs {
    
    inline def apply(): BeforeDownloadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeDownloadEventArgs]
    }
    
    extension [Self <: BeforeDownloadEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeGetImageEventArgs extends StObject {
    
    /** enable or disable the image compress option.
      */
    var canCompress: js.UndefOr[Boolean] = js.undefined
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the expected image size.
      */
    var size: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeGetImageEventArgs {
    
    inline def apply(): BeforeGetImageEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeGetImageEventArgs]
    }
    
    extension [Self <: BeforeGetImageEventArgs](x: Self) {
      
      inline def setCanCompress(value: Boolean): Self = StObject.set(x, "canCompress", value.asInstanceOf[js.Any])
      
      inline def setCanCompressUndefined: Self = StObject.set(x, "canCompress", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeOpenEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the opened item type.
      */
    var itemType: js.UndefOr[String] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the path of currently opened item.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeOpenEventArgs {
    
    inline def apply(): BeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeOpenEventArgs]
    }
    
    extension [Self <: BeforeOpenEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeUploadDialogOpenEventArgs extends StObject {
    
    /** returns Selected FileList objects
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeUploadDialogOpenEventArgs {
    
    inline def apply(): BeforeUploadDialogOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeUploadDialogOpenEventArgs]
    }
    
    extension [Self <: BeforeUploadDialogOpenEventArgs](x: Self) {
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeUploadEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the path of currently opened item.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns the upload item details.
      */
    var uploadItemDetails: js.UndefOr[Any] = js.undefined
  }
  object BeforeUploadEventArgs {
    
    inline def apply(): BeforeUploadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeUploadEventArgs]
    }
    
    extension [Self <: BeforeUploadEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUploadItemDetails(value: Any): Self = StObject.set(x, "uploadItemDetails", value.asInstanceOf[js.Any])
      
      inline def setUploadItemDetailsUndefined: Self = StObject.set(x, "uploadItemDetails", js.undefined)
    }
  }
  
  trait BeforeUploadSendEventArgs extends StObject {
    
    /** if the event is cancelled; otherwise, false
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** selected FileList Object
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the upload model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** XHR-AJAX Object for reference
      */
    var xhr: js.UndefOr[Any] = js.undefined
  }
  object BeforeUploadSendEventArgs {
    
    inline def apply(): BeforeUploadSendEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeUploadSendEventArgs]
    }
    
    extension [Self <: BeforeUploadSendEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait ContextMenuSettings extends StObject {
    
    /** The customMenuFields property is used to define custom functionality for custom ContextMenu item's which are defined in items property.
      * @Default {[]}
      */
    var customMenuFields: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** The items property is used to configure and group the required ContextMenu items in FileExplorer control.
      * @Default {{% highlight javascript %}{navbar: [NewFolder, Upload, |, Delete, Rename, |, Cut, Copy, Paste, |, Getinfo],cwd: [Refresh, Paste,|, SortBy, |, NewFolder, Upload, |,
      * Getinfo],files: [Open, Download, |, Upload, |, Delete, Rename, |, Cut, Copy, Paste, |, OpenFolderLocation, Getinfo]}{% endhighlight %}}
      */
    var items: js.UndefOr[Any] = js.undefined
  }
  object ContextMenuSettings {
    
    inline def apply(): ContextMenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettings]
    }
    
    extension [Self <: ContextMenuSettings](x: Self) {
      
      inline def setCustomMenuFields(value: js.Array[Any]): Self = StObject.set(x, "customMenuFields", value.asInstanceOf[js.Any])
      
      inline def setCustomMenuFieldsUndefined: Self = StObject.set(x, "customMenuFields", js.undefined)
      
      inline def setCustomMenuFieldsVarargs(value: Any*): Self = StObject.set(x, "customMenuFields", js.Array(value*))
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    }
  }
  
  trait CopyEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of copied file/folder.
      */
    var name: js.UndefOr[js.Array[String]] = js.undefined
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the source path.
      */
    var sourcePath: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CopyEventArgs {
    
    inline def apply(): CopyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyEventArgs]
    }
    
    extension [Self <: CopyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
      
      inline def setSourcePathUndefined: Self = StObject.set(x, "sourcePath", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    extension [Self <: CreateEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateFolderEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the AJAX response data
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the selected item details
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateFolderEventArgs {
    
    inline def apply(): CreateFolderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateFolderEventArgs]
    }
    
    extension [Self <: CreateFolderEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CutEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of moved file or folder.
      */
    var name: js.UndefOr[js.Array[String]] = js.undefined
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the source path.
      */
    var sourcePath: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CutEventArgs {
    
    inline def apply(): CutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CutEventArgs]
    }
    
    extension [Self <: CutEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
      
      inline def setSourcePathUndefined: Self = StObject.set(x, "sourcePath", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    extension [Self <: DestroyEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the target element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** returns the name of target element.
      */
    var targetElementName: js.UndefOr[String] = js.undefined
    
    /** returns the path of target element.
      */
    var targetPath: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragEventArgs {
    
    inline def apply(): DragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragEventArgs]
    }
    
    extension [Self <: DragEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetElementName(value: String): Self = StObject.set(x, "targetElementName", value.asInstanceOf[js.Any])
      
      inline def setTargetElementNameUndefined: Self = StObject.set(x, "targetElementName", js.undefined)
      
      inline def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
      
      inline def setTargetPathUndefined: Self = StObject.set(x, "targetPath", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragStartEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the dragging file details.
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the dragging element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** returns the path of dragging element.
      */
    var targetPath: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragStartEventArgs {
    
    inline def apply(): DragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStartEventArgs]
    }
    
    extension [Self <: DragStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
      
      inline def setTargetPathUndefined: Self = StObject.set(x, "targetPath", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragStopEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the action, which is performed after dropping the files (upload/ move).
      */
    var dropAction: js.UndefOr[String] = js.undefined
    
    /** returns the dragging file details
      */
    var fileInfo: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the target element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** returns the name of target element
      */
    var targetElementName: js.UndefOr[String] = js.undefined
    
    /** returns the path of target element.
      */
    var targetPath: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragStopEventArgs {
    
    inline def apply(): DragStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStopEventArgs]
    }
    
    extension [Self <: DragStopEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDropAction(value: String): Self = StObject.set(x, "dropAction", value.asInstanceOf[js.Any])
      
      inline def setDropActionUndefined: Self = StObject.set(x, "dropAction", js.undefined)
      
      inline def setFileInfo(value: Any): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
      
      inline def setFileInfoUndefined: Self = StObject.set(x, "fileInfo", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetElementName(value: String): Self = StObject.set(x, "targetElementName", value.asInstanceOf[js.Any])
      
      inline def setTargetElementNameUndefined: Self = StObject.set(x, "targetElementName", js.undefined)
      
      inline def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
      
      inline def setTargetPathUndefined: Self = StObject.set(x, "targetPath", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DropEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the action, which is performed after dropping the files (upload/ move).
      */
    var dropAction: js.UndefOr[String] = js.undefined
    
    /** returns the dragging element details.
      */
    var fileInfo: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the target element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** returns the name of target folder.
      */
    var targetFolder: js.UndefOr[String] = js.undefined
    
    /** returns the path of target folder.
      */
    var targetPath: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DropEventArgs {
    
    inline def apply(): DropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropEventArgs]
    }
    
    extension [Self <: DropEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDropAction(value: String): Self = StObject.set(x, "dropAction", value.asInstanceOf[js.Any])
      
      inline def setDropActionUndefined: Self = StObject.set(x, "dropAction", js.undefined)
      
      inline def setFileInfo(value: Any): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
      
      inline def setFileInfoUndefined: Self = StObject.set(x, "fileInfo", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFolder(value: String): Self = StObject.set(x, "targetFolder", value.asInstanceOf[js.Any])
      
      inline def setTargetFolderUndefined: Self = StObject.set(x, "targetFolder", js.undefined)
      
      inline def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
      
      inline def setTargetPathUndefined: Self = StObject.set(x, "targetPath", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FilterSettings extends StObject {
    
    /** It allows to search the text given in search Textbox in every keyup event. When this property was set as false, searching will works only on Enter key and searchbar blur.
      * @Default {true}
      */
    var allowSearchOnTyping: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables to perform the filter operation with case sensitive.
      * @Default {false}
      */
    var caseSensitiveSearch: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the search filter type. There are several filter types available such as &quot;startswith&quot;, &quot;contains&quot;, &quot;endswith&quot;. See filterType.
      * @Default {ej.FileExplorer.filterType.Contains}
      */
    var filterType: js.UndefOr[FilterType_ | String] = js.undefined
  }
  object FilterSettings {
    
    inline def apply(): FilterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterSettings]
    }
    
    extension [Self <: FilterSettings](x: Self) {
      
      inline def setAllowSearchOnTyping(value: Boolean): Self = StObject.set(x, "allowSearchOnTyping", value.asInstanceOf[js.Any])
      
      inline def setAllowSearchOnTypingUndefined: Self = StObject.set(x, "allowSearchOnTyping", js.undefined)
      
      inline def setCaseSensitiveSearch(value: Boolean): Self = StObject.set(x, "caseSensitiveSearch", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveSearchUndefined: Self = StObject.set(x, "caseSensitiveSearch", js.undefined)
      
      inline def setFilterType(value: FilterType_ | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    }
  }
  
  trait GetImageEventArgs extends StObject {
    
    /** returns the action type, which specifies thumbnail preview or opening image.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** loaded image element
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** original arguments of image load or error event
      */
    var originalArgs: js.UndefOr[Any] = js.undefined
    
    /** loaded image path.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object GetImageEventArgs {
    
    inline def apply(): GetImageEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetImageEventArgs]
    }
    
    extension [Self <: GetImageEventArgs](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalArgs(value: Any): Self = StObject.set(x, "originalArgs", value.asInstanceOf[js.Any])
      
      inline def setOriginalArgsUndefined: Self = StObject.set(x, "originalArgs", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait GridSettings extends StObject {
    
    /** Allows to Resize the width of the columns by simply click and move the particular column header line.
      * @Default {true}
      */
    var allowResizing: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the dynamic sorting behavior on grid data. Sorting can be done through clicking on particular column header.
      * @Default {true}
      */
    var allowSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets an object that indicates to render the grid with specified columns. You can use this property same as the column property in Grid control.
      * @Default {[{ field: name, headerText: Name, width: 30% }, { field: dateModified, headerText: Date Modified, width: 30% }, { field: type, headerText: Type, width: 15% }, { field:
      * size, headerText: Size, width: 12%, textAlign: right, headerTextAlign: left }]}
      */
    var columns: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object GridSettings {
    
    inline def apply(): GridSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridSettings]
    }
    
    extension [Self <: GridSettings](x: Self) {
      
      inline def setAllowResizing(value: Boolean): Self = StObject.set(x, "allowResizing", value.asInstanceOf[js.Any])
      
      inline def setAllowResizingUndefined: Self = StObject.set(x, "allowResizing", js.undefined)
      
      inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      inline def setColumns(value: js.Array[Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: Any*): Self = StObject.set(x, "columns", js.Array(value*))
    }
  }
  
  trait KeydownEventArgs extends StObject {
    
    /** returns altKey value.
      */
    var altKey: js.UndefOr[Boolean] = js.undefined
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns ctrlKey value.
      */
    var ctrlKey: js.UndefOr[Boolean] = js.undefined
    
    /** returns the downed key keyCode value
      */
    var keyCode: js.UndefOr[Double] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the event object.
      */
    var originalArgs: js.UndefOr[Any] = js.undefined
    
    /** returns shiftKey value.
      */
    var shiftKey: js.UndefOr[Boolean] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object KeydownEventArgs {
    
    inline def apply(): KeydownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeydownEventArgs]
    }
    
    extension [Self <: KeydownEventArgs](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOriginalArgs(value: Any): Self = StObject.set(x, "originalArgs", value.asInstanceOf[js.Any])
      
      inline def setOriginalArgsUndefined: Self = StObject.set(x, "originalArgs", js.undefined)
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LayoutChangeEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** return true when we change the layout via interaction, else false.
      */
    var isInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current view type.
      */
    var layoutType: js.UndefOr[String] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LayoutChangeEventArgs {
    
    inline def apply(): LayoutChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutChangeEventArgs]
    }
    
    extension [Self <: LayoutChangeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      inline def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      inline def setLayoutType(value: String): Self = StObject.set(x, "layoutType", value.asInstanceOf[js.Any])
      
      inline def setLayoutTypeUndefined: Self = StObject.set(x, "layoutType", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MenuBeforeOpenEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the name of ContextMenu items group.
      */
    var contextMenu: js.UndefOr[String] = js.undefined
    
    /** returns the dataSource of ContextMenu.
      */
    var dataSource: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** returns the element of ContextMenu.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the event of ContextMenu.
      */
    var events: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the target element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MenuBeforeOpenEventArgs {
    
    inline def apply(): MenuBeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuBeforeOpenEventArgs]
    }
    
    extension [Self <: MenuBeforeOpenEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDataSource(value: js.Array[Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MenuClickEventArgs extends StObject {
    
    /** returns the ID of clicked ContextMenu item.
      */
    var ID: js.UndefOr[String] = js.undefined
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the name of ContextMenu items group.
      */
    var contextMenu: js.UndefOr[String] = js.undefined
    
    /** returns the element of clicked ContextMenu item.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the event of ContextMenu.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the parent element ID of clicked ContextMenu item.
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** returns the parent element text of clicked ContextMenu item.
      */
    var parentText: js.UndefOr[String] = js.undefined
    
    /** returns the text of clicked ContextMenu item.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MenuClickEventArgs {
    
    inline def apply(): MenuClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuClickEventArgs]
    }
    
    extension [Self <: MenuClickEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setParentText(value: String): Self = StObject.set(x, "parentText", value.asInstanceOf[js.Any])
      
      inline def setParentTextUndefined: Self = StObject.set(x, "parentText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MenuOpenEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the name of ContextMenu items group.
      */
    var contextMenu: js.UndefOr[String] = js.undefined
    
    /** returns the element of ContextMenu.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the target element.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MenuOpenEventArgs {
    
    inline def apply(): MenuOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuOpenEventArgs]
    }
    
    extension [Self <: MenuOpenEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Sets the URL of server side AJAX handling method that handles file operation like Read, Remove, Rename, Create, Upload, Download, Copy and Move in FileExplorer.
      */
    var ajaxAction: js.UndefOr[String] = js.undefined
    
    /** Specifies the data type of server side AJAX handling method.
      * @Default {json}
      */
    var ajaxDataType: js.UndefOr[String] = js.undefined
    
    /** By using ajaxSettings property, you can customize the AJAX configurations. Normally you can customize the following option in AJAX handling data, URL, type, async, contentType,
      * dataType and success. For upload, download and getImage API, you can only customize URL.
      * @Default {{ read: {}, createFolder: {}, remove: {}, rename: {}, paste: {}, getDetails: {}, download: {}, upload: {}, getImage: {}, search: {}}}
      */
    var ajaxSettings: js.UndefOr[Any] = js.undefined
    
    /** The FileExplorer allows to move the files from one folder to another folder of FileExplorer by using drag and drop option. Also it supports to upload a file by dragging it from
      * windows explorer to the necessary folder of ejFileExplorer.
      * @Default {true}
      */
    var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable keyboard support for FileExplorer actions.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** The FileExplorer allows to select multiple files by enabling the allowMultiSelection property. You can perform multi selection by pressing the Ctrl key or Shift key.
      * @Default {true}
      */
    var allowMultiSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Fires before the AJAX request is performed.
      */
    var beforeAjaxRequest: js.UndefOr[js.Function1[/* e */ BeforeAjaxRequestEventArgs, Unit]] = js.undefined
    
    /** Fires before downloading the files.
      */
    var beforeDownload: js.UndefOr[js.Function1[/* e */ BeforeDownloadEventArgs, Unit]] = js.undefined
    
    /** Fires before getting a requested image from server. Also this event will be triggered when you have enabled thumbnail image compression option in FileExplorer.Using this event,
      * you can customize the image compression size.
      */
    var beforeGetImage: js.UndefOr[js.Function1[/* e */ BeforeGetImageEventArgs, Unit]] = js.undefined
    
    /** Fires before files or folders open.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
    
    /** Fires before uploading the files.
      */
    var beforeUpload: js.UndefOr[js.Function1[/* e */ BeforeUploadEventArgs, Unit]] = js.undefined
    
    /** Fires before opening the upload dialog.
      */
    var beforeUploadDialogOpen: js.UndefOr[js.Function1[/* e */ BeforeUploadDialogOpenEventArgs, Unit]] = js.undefined
    
    /** Event is fired before the upload progress is started.
      */
    var beforeUploadSend: js.UndefOr[js.Function1[/* e */ BeforeUploadSendEventArgs, Unit]] = js.undefined
    
    /** By using the contextMenuSettings property, you can customize the ContextMenu in the FileExplorer control.
      */
    var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
    
    /** Fires when file or folder is copied successfully.
      */
    var copy: js.UndefOr[js.Function1[/* e */ CopyEventArgs, Unit]] = js.undefined
    
    /** Fires when FileExplorer control was created
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Fires when new folder is created successfully in file system.
      */
    var createFolder: js.UndefOr[js.Function1[/* e */ CreateFolderEventArgs, Unit]] = js.undefined
    
    /** Sets the root class for FileExplorer theme. This cssClass API allows to use custom skinning option for File Explorer control. By defining the root class by using this API, you
      * have to include this root class in CSS.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Fires when file or folder is cut successfully.
      */
    var cut: js.UndefOr[js.Function1[/* e */ CutEventArgs, Unit]] = js.undefined
    
    /** Fires when the FileExplorer is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Fires when the files or directory is dragging over on the FileExplorer.
      */
    var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.undefined
    
    /** Fires when the files or directory has been started to drag over on the FileExplorer
      */
    var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.undefined
    
    /** Fires when the files or directory has been stopped to drag over on FileExplorer
      */
    var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.undefined
    
    /** Fires when the files or directory is dropped to the target folder of FileExplorer
      */
    var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.undefined
    
    /** Specify the enablePersistence to FileExplorer to save the current model value in browser cookies for state maintains.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the Right to Left alignment support in FileExplorer control.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the resize support in FileExplorer control.
      * @Default {false}
      */
    var enableResize: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the thumbnail image compression option in FileExplorer control. By enabling this option, you can reduce the thumbnail image size while loading.
      * @Default {false}
      */
    var enableThumbnailCompress: js.UndefOr[Boolean] = js.undefined
    
    /** Allows specified type of files only to display in FileExplorer control.
      * @Default {* . *}
      */
    var fileTypes: js.UndefOr[String] = js.undefined
    
    /** By using filterSettings property, you can customize the search functionality of the search bar in FileExplorer control.
      */
    var filterSettings: js.UndefOr[FilterSettings] = js.undefined
    
    /** Fires after loading the requested image from server. Using this event, you can get the details of loaded image.
      */
    var getImage: js.UndefOr[js.Function1[/* e */ GetImageEventArgs, Unit]] = js.undefined
    
    /** By using the gridSettings property, you can customize the grid behavior in the FileExplorer control.
      */
    var gridSettings: js.UndefOr[GridSettings] = js.undefined
    
    /** Specifies the height of FileExplorer control.
      * @Default {400}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Enables or disables the responsive support for FileExplorer control during the window resizing time.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Fires when keydown in FileExplorer control.
      */
    var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, Unit]] = js.undefined
    
    /** Sets the file view type. There are three view types available such as Grid, Tile and Large icons. See layoutType.
      * @Default {ej.FileExplorer.layoutType.Grid}
      */
    var layout: js.UndefOr[layoutType | String] = js.undefined
    
    /** Fires when the file view type is changed.
      */
    var layoutChange: js.UndefOr[js.Function1[/* e */ LayoutChangeEventArgs, Unit]] = js.undefined
    
    /** Sets the culture in FileExplorer.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Sets the maximum height of FileExplorer control.
      * @Default {null}
      */
    var maxHeight: js.UndefOr[String | Double] = js.undefined
    
    /** Sets the maximum width of FileExplorer control.
      * @Default {null}
      */
    var maxWidth: js.UndefOr[String | Double] = js.undefined
    
    /** Fires when before the ContextMenu opening.
      */
    var menuBeforeOpen: js.UndefOr[js.Function1[/* e */ MenuBeforeOpenEventArgs, Unit]] = js.undefined
    
    /** Fires when click the ContextMenu item.
      */
    var menuClick: js.UndefOr[js.Function1[/* e */ MenuClickEventArgs, Unit]] = js.undefined
    
    /** Fires when ContextMenu is successfully opened.
      */
    var menuOpen: js.UndefOr[js.Function1[/* e */ MenuOpenEventArgs, Unit]] = js.undefined
    
    /** Sets the minimum height of FileExplorer control.
      * @Default {250px}
      */
    var minHeight: js.UndefOr[String | Double] = js.undefined
    
    /** Sets the minimum width of FileExplorer control.
      * @Default {400px}
      */
    var minWidth: js.UndefOr[String | Double] = js.undefined
    
    /** Fires when files are successfully opened.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
    
    /** Fires when a file or folder is pasted successfully.
      */
    var paste: js.UndefOr[js.Function1[/* e */ PasteEventArgs, Unit]] = js.undefined
    
    /** The property path denotes the filesystem path that are to be explored. The path for the filesystem can be physical path or relative path, but it has to be relevant to where the
      * Web API is hosted.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /** Fires when file or folder is deleted successfully.
      */
    var remove: js.UndefOr[js.Function1[/* e */ RemoveEventArgs, Unit]] = js.undefined
    
    /** Fires when resizing is performed for FileExplorer.
      */
    var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.undefined
    
    /** Fires when resizing is started for FileExplorer.
      */
    var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.undefined
    
    /** Fires this event when the resizing is stopped for FileExplorer.
      */
    var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, Unit]] = js.undefined
    
    /** Sets the alias name of root folder name in FileExplorer. It is used to replace the actual root folder name in FileExplorer.
      */
    var rootFolderName: js.UndefOr[String] = js.undefined
    
    /** Fires when the items from grid view or tile view of FileExplorer control is selected.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
    
    /** The selectedFolder is used to select the specified folder of FileExplorer control.
      */
    var selectedFolder: js.UndefOr[String] = js.undefined
    
    /** The selectedItems is used to select the specified items (file, folder) of FileExplorer control.
      */
    var selectedItems: js.UndefOr[String | js.Array[Any]] = js.undefined
    
    /** Enables or disables the checkbox option in FileExplorer control.
      * @Default {true}
      */
    var showCheckbox: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the context menu option in FileExplorer control.
      * @Default {true}
      */
    var showContextMenu: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the footer in FileExplorer control. The footer element displays the details of the current selected files and folders. And also the footer having the switcher
      * to change the layout view.
      * @Default {true}
      */
    var showFooter: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the navigation pane in FileExplorer control. The navigation pane contains a tree view element that displays all the folders from the filesystem in a
      * hierarchical manner. This is useful to a quick navigation of any folder in the filesystem.
      * @Default {true}
      */
    var showNavigationPane: js.UndefOr[Boolean] = js.undefined
    
    /** FileExplorer control is displayed with rounded corner when this property is set to true.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** FileExplorer control is rendered with thumbnail preview of images in Tile and LargeIcons layout when this property set to true.
      * @Default {true}
      */
    var showThumbnail: js.UndefOr[Boolean] = js.undefined
    
    /** Shows or disables the toolbar in FileExplorer control.
      * @Default {true}
      */
    var showToolbar: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered when refresh the template column elements in the grid view of FileExplorer control.
      */
    var templateRefresh: js.UndefOr[js.Function1[/* e */ TemplateRefreshEventArgs, Unit]] = js.undefined
    
    /** The tools property is used to configure and group required toolbar items in FileExplorer control.
      * @Default {{ creation: [NewFolder], navigation: [Back, Forward, Upward], addressBar: [Addressbar], editing: [Refresh, Upload, Delete, Rename, Download], copyPaste: [Cut, Copy,
      * Paste], getProperties: [Details], searchBar: [Searchbar], layout: [Layout], sortBy: [SortBy]}}
      */
    var tools: js.UndefOr[Any] = js.undefined
    
    /** The toolsList property is used to arrange the toolbar items in the FileExplorer control.
      * @Default {[layout, creation, navigation, addressBar, editing, copyPaste, sortBy, getProperties, searchBar]}
      */
    var toolsList: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Fires when the items from grid view or tile view or large icons view of FileExplorer control is unselected.
      */
    var unselect: js.UndefOr[js.Function1[/* e */ UnselectEventArgs, Unit]] = js.undefined
    
    /** Event is fired when the file upload progress gets completed.
      */
    var uploadComplete: js.UndefOr[js.Function1[/* e */ UploadCompleteEventArgs, Unit]] = js.undefined
    
    /** Event is fired when the file upload fails due to some error.
      */
    var uploadError: js.UndefOr[js.Function1[/* e */ UploadErrorEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates whether to customize the upload behavior in the FileExplorer.
      */
    var uploadSettings: js.UndefOr[UploadSettings] = js.undefined
    
    /** Event is fired when the file upload progress gets succeeded.
      */
    var uploadSuccess: js.UndefOr[js.Function1[/* e */ UploadSuccessEventArgs, Unit]] = js.undefined
    
    /** Specifies the virtual item count for virtual support.
      * @Default {0}
      */
    var virtualItemCount: js.UndefOr[Double] = js.undefined
    
    /** Specifies the width of FileExplorer control.
      * @Default {850}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.FileExplorer.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.FileExplorer.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.FileExplorer.Model](x: Self) {
      
      inline def setAjaxAction(value: String): Self = StObject.set(x, "ajaxAction", value.asInstanceOf[js.Any])
      
      inline def setAjaxActionUndefined: Self = StObject.set(x, "ajaxAction", js.undefined)
      
      inline def setAjaxDataType(value: String): Self = StObject.set(x, "ajaxDataType", value.asInstanceOf[js.Any])
      
      inline def setAjaxDataTypeUndefined: Self = StObject.set(x, "ajaxDataType", js.undefined)
      
      inline def setAjaxSettings(value: Any): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      inline def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      inline def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      inline def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      inline def setAllowMultiSelection(value: Boolean): Self = StObject.set(x, "allowMultiSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiSelectionUndefined: Self = StObject.set(x, "allowMultiSelection", js.undefined)
      
      inline def setBeforeAjaxRequest(value: /* e */ BeforeAjaxRequestEventArgs => Unit): Self = StObject.set(x, "beforeAjaxRequest", js.Any.fromFunction1(value))
      
      inline def setBeforeAjaxRequestUndefined: Self = StObject.set(x, "beforeAjaxRequest", js.undefined)
      
      inline def setBeforeDownload(value: /* e */ BeforeDownloadEventArgs => Unit): Self = StObject.set(x, "beforeDownload", js.Any.fromFunction1(value))
      
      inline def setBeforeDownloadUndefined: Self = StObject.set(x, "beforeDownload", js.undefined)
      
      inline def setBeforeGetImage(value: /* e */ BeforeGetImageEventArgs => Unit): Self = StObject.set(x, "beforeGetImage", js.Any.fromFunction1(value))
      
      inline def setBeforeGetImageUndefined: Self = StObject.set(x, "beforeGetImage", js.undefined)
      
      inline def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setBeforeUpload(value: /* e */ BeforeUploadEventArgs => Unit): Self = StObject.set(x, "beforeUpload", js.Any.fromFunction1(value))
      
      inline def setBeforeUploadDialogOpen(value: /* e */ BeforeUploadDialogOpenEventArgs => Unit): Self = StObject.set(x, "beforeUploadDialogOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeUploadDialogOpenUndefined: Self = StObject.set(x, "beforeUploadDialogOpen", js.undefined)
      
      inline def setBeforeUploadSend(value: /* e */ BeforeUploadSendEventArgs => Unit): Self = StObject.set(x, "beforeUploadSend", js.Any.fromFunction1(value))
      
      inline def setBeforeUploadSendUndefined: Self = StObject.set(x, "beforeUploadSend", js.undefined)
      
      inline def setBeforeUploadUndefined: Self = StObject.set(x, "beforeUpload", js.undefined)
      
      inline def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      inline def setCopy(value: /* e */ CopyEventArgs => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateFolder(value: /* e */ CreateFolderEventArgs => Unit): Self = StObject.set(x, "createFolder", js.Any.fromFunction1(value))
      
      inline def setCreateFolderUndefined: Self = StObject.set(x, "createFolder", js.undefined)
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCut(value: /* e */ CutEventArgs => Unit): Self = StObject.set(x, "cut", js.Any.fromFunction1(value))
      
      inline def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDrag(value: /* e */ DragEventArgs => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
      
      inline def setDragStart(value: /* e */ DragStartEventArgs => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
      
      inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      inline def setDragStop(value: /* e */ DragStopEventArgs => Unit): Self = StObject.set(x, "dragStop", js.Any.fromFunction1(value))
      
      inline def setDragStopUndefined: Self = StObject.set(x, "dragStop", js.undefined)
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setDrop(value: /* e */ DropEventArgs => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      inline def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      inline def setEnableThumbnailCompress(value: Boolean): Self = StObject.set(x, "enableThumbnailCompress", value.asInstanceOf[js.Any])
      
      inline def setEnableThumbnailCompressUndefined: Self = StObject.set(x, "enableThumbnailCompress", js.undefined)
      
      inline def setFileTypes(value: String): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
      
      inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
      
      inline def setFilterSettings(value: FilterSettings): Self = StObject.set(x, "filterSettings", value.asInstanceOf[js.Any])
      
      inline def setFilterSettingsUndefined: Self = StObject.set(x, "filterSettings", js.undefined)
      
      inline def setGetImage(value: /* e */ GetImageEventArgs => Unit): Self = StObject.set(x, "getImage", js.Any.fromFunction1(value))
      
      inline def setGetImageUndefined: Self = StObject.set(x, "getImage", js.undefined)
      
      inline def setGridSettings(value: GridSettings): Self = StObject.set(x, "gridSettings", value.asInstanceOf[js.Any])
      
      inline def setGridSettingsUndefined: Self = StObject.set(x, "gridSettings", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setKeydown(value: /* e */ KeydownEventArgs => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
      
      inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      inline def setLayout(value: layoutType | String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutChange(value: /* e */ LayoutChangeEventArgs => Unit): Self = StObject.set(x, "layoutChange", js.Any.fromFunction1(value))
      
      inline def setLayoutChangeUndefined: Self = StObject.set(x, "layoutChange", js.undefined)
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: String | Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMenuBeforeOpen(value: /* e */ MenuBeforeOpenEventArgs => Unit): Self = StObject.set(x, "menuBeforeOpen", js.Any.fromFunction1(value))
      
      inline def setMenuBeforeOpenUndefined: Self = StObject.set(x, "menuBeforeOpen", js.undefined)
      
      inline def setMenuClick(value: /* e */ MenuClickEventArgs => Unit): Self = StObject.set(x, "menuClick", js.Any.fromFunction1(value))
      
      inline def setMenuClickUndefined: Self = StObject.set(x, "menuClick", js.undefined)
      
      inline def setMenuOpen(value: /* e */ MenuOpenEventArgs => Unit): Self = StObject.set(x, "menuOpen", js.Any.fromFunction1(value))
      
      inline def setMenuOpenUndefined: Self = StObject.set(x, "menuOpen", js.undefined)
      
      inline def setMinHeight(value: String | Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPaste(value: /* e */ PasteEventArgs => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
      
      inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRemove(value: /* e */ RemoveEventArgs => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setResize(value: /* e */ ResizeEventArgs => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      inline def setResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1(value))
      
      inline def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
      
      inline def setResizeStop(value: /* e */ ResizeStopEventArgs => Unit): Self = StObject.set(x, "resizeStop", js.Any.fromFunction1(value))
      
      inline def setResizeStopUndefined: Self = StObject.set(x, "resizeStop", js.undefined)
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRootFolderName(value: String): Self = StObject.set(x, "rootFolderName", value.asInstanceOf[js.Any])
      
      inline def setRootFolderNameUndefined: Self = StObject.set(x, "rootFolderName", js.undefined)
      
      inline def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedFolder(value: String): Self = StObject.set(x, "selectedFolder", value.asInstanceOf[js.Any])
      
      inline def setSelectedFolderUndefined: Self = StObject.set(x, "selectedFolder", js.undefined)
      
      inline def setSelectedItems(value: String | js.Array[Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSelectedItemsVarargs(value: Any*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
      
      inline def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
      
      inline def setShowContextMenu(value: Boolean): Self = StObject.set(x, "showContextMenu", value.asInstanceOf[js.Any])
      
      inline def setShowContextMenuUndefined: Self = StObject.set(x, "showContextMenu", js.undefined)
      
      inline def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      inline def setShowNavigationPane(value: Boolean): Self = StObject.set(x, "showNavigationPane", value.asInstanceOf[js.Any])
      
      inline def setShowNavigationPaneUndefined: Self = StObject.set(x, "showNavigationPane", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setShowThumbnail(value: Boolean): Self = StObject.set(x, "showThumbnail", value.asInstanceOf[js.Any])
      
      inline def setShowThumbnailUndefined: Self = StObject.set(x, "showThumbnail", js.undefined)
      
      inline def setShowToolbar(value: Boolean): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
      
      inline def setShowToolbarUndefined: Self = StObject.set(x, "showToolbar", js.undefined)
      
      inline def setTemplateRefresh(value: /* e */ TemplateRefreshEventArgs => Unit): Self = StObject.set(x, "templateRefresh", js.Any.fromFunction1(value))
      
      inline def setTemplateRefreshUndefined: Self = StObject.set(x, "templateRefresh", js.undefined)
      
      inline def setTools(value: Any): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      inline def setToolsList(value: js.Array[Any]): Self = StObject.set(x, "toolsList", value.asInstanceOf[js.Any])
      
      inline def setToolsListUndefined: Self = StObject.set(x, "toolsList", js.undefined)
      
      inline def setToolsListVarargs(value: Any*): Self = StObject.set(x, "toolsList", js.Array(value*))
      
      inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
      
      inline def setUnselect(value: /* e */ UnselectEventArgs => Unit): Self = StObject.set(x, "unselect", js.Any.fromFunction1(value))
      
      inline def setUnselectUndefined: Self = StObject.set(x, "unselect", js.undefined)
      
      inline def setUploadComplete(value: /* e */ UploadCompleteEventArgs => Unit): Self = StObject.set(x, "uploadComplete", js.Any.fromFunction1(value))
      
      inline def setUploadCompleteUndefined: Self = StObject.set(x, "uploadComplete", js.undefined)
      
      inline def setUploadError(value: /* e */ UploadErrorEventArgs => Unit): Self = StObject.set(x, "uploadError", js.Any.fromFunction1(value))
      
      inline def setUploadErrorUndefined: Self = StObject.set(x, "uploadError", js.undefined)
      
      inline def setUploadSettings(value: UploadSettings): Self = StObject.set(x, "uploadSettings", value.asInstanceOf[js.Any])
      
      inline def setUploadSettingsUndefined: Self = StObject.set(x, "uploadSettings", js.undefined)
      
      inline def setUploadSuccess(value: /* e */ UploadSuccessEventArgs => Unit): Self = StObject.set(x, "uploadSuccess", js.Any.fromFunction1(value))
      
      inline def setUploadSuccessUndefined: Self = StObject.set(x, "uploadSuccess", js.undefined)
      
      inline def setVirtualItemCount(value: Double): Self = StObject.set(x, "virtualItemCount", value.asInstanceOf[js.Any])
      
      inline def setVirtualItemCountUndefined: Self = StObject.set(x, "virtualItemCount", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OpenEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the opened item type.
      */
    var itemType: js.UndefOr[String] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the path of currently opened item.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OpenEventArgs {
    
    inline def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    extension [Self <: OpenEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PasteEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of moved/copied file or folder.
      */
    var name: js.UndefOr[js.Array[String]] = js.undefined
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the target folder item details.
      */
    var targetFolder: js.UndefOr[Any] = js.undefined
    
    /** returns the target path.
      */
    var targetPath: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PasteEventArgs {
    
    inline def apply(): PasteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasteEventArgs]
    }
    
    extension [Self <: PasteEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setTargetFolder(value: Any): Self = StObject.set(x, "targetFolder", value.asInstanceOf[js.Any])
      
      inline def setTargetFolderUndefined: Self = StObject.set(x, "targetFolder", js.undefined)
      
      inline def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
      
      inline def setTargetPathUndefined: Self = StObject.set(x, "targetPath", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RemoveEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the AJAX response data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the names of deleted items.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** returns the path of deleted item.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /** returns the removed item details.
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RemoveEventArgs {
    
    inline def apply(): RemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveEventArgs]
    }
    
    extension [Self <: RemoveEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ResizeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the mouse move event args.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResizeEventArgs {
    
    inline def apply(): ResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeEventArgs]
    }
    
    extension [Self <: ResizeEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ResizeStartEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the mouse down event args.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResizeStartEventArgs {
    
    inline def apply(): ResizeStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeStartEventArgs]
    }
    
    extension [Self <: ResizeStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ResizeStopEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the mouse leave event args.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResizeStopEventArgs {
    
    inline def apply(): ResizeStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeStopEventArgs]
    }
    
    extension [Self <: ResizeStopEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SelectEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of selected items.
      */
    var name: js.UndefOr[js.Array[String]] = js.undefined
    
    /** returns the path of selected items.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /** returns the selected item details
      */
    var selectedItems: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SelectEventArgs {
    
    inline def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    extension [Self <: SelectEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSelectedItems(value: Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TemplateRefreshEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the cell object.
      */
    var cell: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the column object.
      */
    var column: js.UndefOr[Any] = js.undefined
    
    /** Returns the current row data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the grid model of FileExplorer.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the current row index.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TemplateRefreshEventArgs {
    
    inline def apply(): TemplateRefreshEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateRefreshEventArgs]
    }
    
    extension [Self <: TemplateRefreshEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait UnselectEventArgs extends StObject {
    
    /** Returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of unselected item.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Returns the name of unselected items.
      */
    var names: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Returns the type of unselected item.
      */
    var nodeType: js.UndefOr[String] = js.undefined
    
    /** Returns the path of unselected item.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the unselected item details.
      */
    var unselectedItem: js.UndefOr[Any] = js.undefined
    
    /** Returns the unselected items details.
      */
    var unselectedItems: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object UnselectEventArgs {
    
    inline def apply(): UnselectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnselectEventArgs]
    }
    
    extension [Self <: UnselectEventArgs](x: Self) {
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnselectedItem(value: Any): Self = StObject.set(x, "unselectedItem", value.asInstanceOf[js.Any])
      
      inline def setUnselectedItemUndefined: Self = StObject.set(x, "unselectedItem", js.undefined)
      
      inline def setUnselectedItems(value: js.Array[Any]): Self = StObject.set(x, "unselectedItems", value.asInstanceOf[js.Any])
      
      inline def setUnselectedItemsUndefined: Self = StObject.set(x, "unselectedItems", js.undefined)
      
      inline def setUnselectedItemsVarargs(value: Any*): Self = StObject.set(x, "unselectedItems", js.Array(value*))
    }
  }
  
  trait UploadCompleteEventArgs extends StObject {
    
    /** AJAX event argument for reference
      */
    var e: js.UndefOr[Any] = js.undefined
    
    /** details about the error information
      */
    var error: js.UndefOr[String] = js.undefined
    
    /** uploaded file list
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the Upload model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** response from the server
      */
    var responseText: js.UndefOr[String] = js.undefined
    
    /** successfully uploaded files list
      */
    var success: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** XHR-AJAX Object for reference
      */
    var xhr: js.UndefOr[Any] = js.undefined
  }
  object UploadCompleteEventArgs {
    
    inline def apply(): UploadCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadCompleteEventArgs]
    }
    
    extension [Self <: UploadCompleteEventArgs](x: Self) {
      
      inline def setE(value: Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      inline def setSuccess(value: Any): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait UploadErrorEventArgs extends StObject {
    
    /** error event action details
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** details about the error information
      */
    var error: js.UndefOr[String] = js.undefined
    
    /** returns the details of the uploaded files
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object UploadErrorEventArgs {
    
    inline def apply(): UploadErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadErrorEventArgs]
    }
    
    extension [Self <: UploadErrorEventArgs](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait UploadSettings extends StObject {
    
    /** Enables or disables the multiple files upload. When it is enabled, you can upload multiple files at a time and when disabled, you can upload only one file at a time.
      * @Default {true}
      */
    var allowMultipleFile: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the auto upload option while uploading files in FileExplorer control.
      * @Default {false}
      */
    var autoUpload: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the actions for upload dialog during initialization.
      * @Default {{ modal:false, closeOnComplete:false, content:null, drag:true }}
      */
    var dialogAction: js.UndefOr[Any] = js.undefined
    
    /** Specifies the position at which the upload dialog is displayed using X and Y values. X: Sets the left position value for dialog. Y: Sets the top position value for dialog.
      * @Default {null}
      */
    var dialogPosition: js.UndefOr[Any] = js.undefined
    
    /** Specifies the maximum file size allowed to upload. It accepts the value in bytes.
      * @Default {31457280}
      */
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    /** Specifies the file details which are to be displayed when selected for upload by setting the showFileDetails to true.
      * @Default {true}
      */
    var showFileDetails: js.UndefOr[Boolean] = js.undefined
  }
  object UploadSettings {
    
    inline def apply(): UploadSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadSettings]
    }
    
    extension [Self <: UploadSettings](x: Self) {
      
      inline def setAllowMultipleFile(value: Boolean): Self = StObject.set(x, "allowMultipleFile", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleFileUndefined: Self = StObject.set(x, "allowMultipleFile", js.undefined)
      
      inline def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
      
      inline def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
      
      inline def setDialogAction(value: Any): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
      
      inline def setDialogActionUndefined: Self = StObject.set(x, "dialogAction", js.undefined)
      
      inline def setDialogPosition(value: Any): Self = StObject.set(x, "dialogPosition", value.asInstanceOf[js.Any])
      
      inline def setDialogPositionUndefined: Self = StObject.set(x, "dialogPosition", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setShowFileDetails(value: Boolean): Self = StObject.set(x, "showFileDetails", value.asInstanceOf[js.Any])
      
      inline def setShowFileDetailsUndefined: Self = StObject.set(x, "showFileDetails", js.undefined)
    }
  }
  
  trait UploadSuccessEventArgs extends StObject {
    
    /** AJAX event argument for reference
      */
    var e: js.UndefOr[Any] = js.undefined
    
    /** uploaded file list
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the Upload model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** response from the server
      */
    var responseText: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** XHR-AJAX Object for reference
      */
    var xhr: js.UndefOr[Any] = js.undefined
  }
  object UploadSuccessEventArgs {
    
    inline def apply(): UploadSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadSuccessEventArgs]
    }
    
    extension [Self <: UploadSuccessEventArgs](x: Self) {
      
      inline def setE(value: Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
}
