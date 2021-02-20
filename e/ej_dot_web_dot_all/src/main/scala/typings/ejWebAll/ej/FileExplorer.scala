package typings.ejWebAll.ej

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileExplorer extends Widget_ {
  
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
    sealed trait Grid extends layoutType
    
    ///Supports to display files as large icons
    @js.native
    sealed trait LargeIcons extends layoutType
    
    ///Supports to display files in tile view
    @js.native
    sealed trait Tile extends layoutType
  }
  
  @js.native
  trait BeforeAjaxRequestEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the AJAX request data
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeAjaxRequestEventArgs {
    
    @scala.inline
    def apply(): BeforeAjaxRequestEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeAjaxRequestEventArgs]
    }
    
    @scala.inline
    implicit class BeforeAjaxRequestEventArgsMutableBuilder[Self <: BeforeAjaxRequestEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeDownloadEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the downloaded file names.
      */
    var files: js.UndefOr[js.Array[String]] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the path of currently opened item.
      */
    var path: js.UndefOr[String] = js.native
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeDownloadEventArgs {
    
    @scala.inline
    def apply(): BeforeDownloadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeDownloadEventArgs]
    }
    
    @scala.inline
    implicit class BeforeDownloadEventArgsMutableBuilder[Self <: BeforeDownloadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeGetImageEventArgs extends StObject {
    
    /** enable or disable the image compress option.
      */
    var canCompress: js.UndefOr[Boolean] = js.native
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the expected image size.
      */
    var size: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeGetImageEventArgs {
    
    @scala.inline
    def apply(): BeforeGetImageEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeGetImageEventArgs]
    }
    
    @scala.inline
    implicit class BeforeGetImageEventArgsMutableBuilder[Self <: BeforeGetImageEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanCompress(value: Boolean): Self = StObject.set(x, "canCompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanCompressUndefined: Self = StObject.set(x, "canCompress", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeOpenEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the opened item type.
      */
    var itemType: js.UndefOr[String] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the path of currently opened item.
      */
    var path: js.UndefOr[String] = js.native
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeOpenEventArgs {
    
    @scala.inline
    def apply(): BeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeOpenEventArgs]
    }
    
    @scala.inline
    implicit class BeforeOpenEventArgsMutableBuilder[Self <: BeforeOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeUploadDialogOpenEventArgs extends StObject {
    
    /** returns Selected FileList objects
      */
    var files: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeUploadDialogOpenEventArgs {
    
    @scala.inline
    def apply(): BeforeUploadDialogOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeUploadDialogOpenEventArgs]
    }
    
    @scala.inline
    implicit class BeforeUploadDialogOpenEventArgsMutableBuilder[Self <: BeforeUploadDialogOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeUploadEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the path of currently opened item.
      */
    var path: js.UndefOr[String] = js.native
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the upload item details.
      */
    var uploadItemDetails: js.UndefOr[js.Any] = js.native
  }
  object BeforeUploadEventArgs {
    
    @scala.inline
    def apply(): BeforeUploadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeUploadEventArgs]
    }
    
    @scala.inline
    implicit class BeforeUploadEventArgsMutableBuilder[Self <: BeforeUploadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUploadItemDetails(value: js.Any): Self = StObject.set(x, "uploadItemDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadItemDetailsUndefined: Self = StObject.set(x, "uploadItemDetails", js.undefined)
    }
  }
  
  @js.native
  trait BeforeUploadSendEventArgs extends StObject {
    
    /** if the event is cancelled; otherwise, false
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** selected FileList Object
      */
    var files: js.UndefOr[js.Any] = js.native
    
    /** returns the upload model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** XHR-AJAX Object for reference
      */
    var xhr: js.UndefOr[js.Any] = js.native
  }
  object BeforeUploadSendEventArgs {
    
    @scala.inline
    def apply(): BeforeUploadSendEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeUploadSendEventArgs]
    }
    
    @scala.inline
    implicit class BeforeUploadSendEventArgsMutableBuilder[Self <: BeforeUploadSendEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setXhr(value: js.Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  @js.native
  trait ContextMenuSettings extends StObject {
    
    /** The customMenuFields property is used to define custom functionality for custom ContextMenu item's which are defined in items property.
      * @Default {[]}
      */
    var customMenuFields: js.UndefOr[js.Array[_]] = js.native
    
    /** The items property is used to configure and group the required ContextMenu items in FileExplorer control.
      * @Default {{% highlight javascript %}{navbar: [NewFolder, Upload, |, Delete, Rename, |, Cut, Copy, Paste, |, Getinfo],cwd: [Refresh, Paste,|, SortBy, |, NewFolder, Upload, |,
      * Getinfo],files: [Open, Download, |, Upload, |, Delete, Rename, |, Cut, Copy, Paste, |, OpenFolderLocation, Getinfo]}{% endhighlight %}}
      */
    var items: js.UndefOr[js.Any] = js.native
  }
  object ContextMenuSettings {
    
    @scala.inline
    def apply(): ContextMenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettings]
    }
    
    @scala.inline
    implicit class ContextMenuSettingsMutableBuilder[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomMenuFields(value: js.Array[_]): Self = StObject.set(x, "customMenuFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMenuFieldsUndefined: Self = StObject.set(x, "customMenuFields", js.undefined)
      
      @scala.inline
      def setCustomMenuFieldsVarargs(value: js.Any*): Self = StObject.set(x, "customMenuFields", js.Array(value :_*))
      
      @scala.inline
      def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    }
  }
  
  @js.native
  trait CopyEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of copied file/folder.
      */
    var name: js.UndefOr[js.Array[String]] = js.native
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the source path.
      */
    var sourcePath: js.UndefOr[String] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CopyEventArgs {
    
    @scala.inline
    def apply(): CopyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyEventArgs]
    }
    
    @scala.inline
    implicit class CopyEventArgsMutableBuilder[Self <: CopyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePathUndefined: Self = StObject.set(x, "sourcePath", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateFolderEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the AJAX response data
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the selected item details
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateFolderEventArgs {
    
    @scala.inline
    def apply(): CreateFolderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateFolderEventArgs]
    }
    
    @scala.inline
    implicit class CreateFolderEventArgsMutableBuilder[Self <: CreateFolderEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CutEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of moved file or folder.
      */
    var name: js.UndefOr[js.Array[String]] = js.native
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the source path.
      */
    var sourcePath: js.UndefOr[String] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CutEventArgs {
    
    @scala.inline
    def apply(): CutEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CutEventArgs]
    }
    
    @scala.inline
    implicit class CutEventArgsMutableBuilder[Self <: CutEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePathUndefined: Self = StObject.set(x, "sourcePath", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DragEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the target element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of target element.
      */
    var targetElementName: js.UndefOr[String] = js.native
    
    /** returns the path of target element.
      */
    var targetPath: js.UndefOr[String] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DragEventArgs {
    
    @scala.inline
    def apply(): DragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragEventArgs]
    }
    
    @scala.inline
    implicit class DragEventArgsMutableBuilder[Self <: DragEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementName(value: String): Self = StObject.set(x, "targetElementName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementNameUndefined: Self = StObject.set(x, "targetElementName", js.undefined)
      
      @scala.inline
      def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPathUndefined: Self = StObject.set(x, "targetPath", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DragStartEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the dragging file details.
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the dragging element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the path of dragging element.
      */
    var targetPath: js.UndefOr[String] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DragStartEventArgs {
    
    @scala.inline
    def apply(): DragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStartEventArgs]
    }
    
    @scala.inline
    implicit class DragStartEventArgsMutableBuilder[Self <: DragStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPathUndefined: Self = StObject.set(x, "targetPath", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DragStopEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the action, which is performed after dropping the files (upload/ move).
      */
    var dropAction: js.UndefOr[String] = js.native
    
    /** returns the dragging file details
      */
    var fileInfo: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the target element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of target element
      */
    var targetElementName: js.UndefOr[String] = js.native
    
    /** returns the path of target element.
      */
    var targetPath: js.UndefOr[String] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DragStopEventArgs {
    
    @scala.inline
    def apply(): DragStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStopEventArgs]
    }
    
    @scala.inline
    implicit class DragStopEventArgsMutableBuilder[Self <: DragStopEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDropAction(value: String): Self = StObject.set(x, "dropAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropActionUndefined: Self = StObject.set(x, "dropAction", js.undefined)
      
      @scala.inline
      def setFileInfo(value: js.Any): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileInfoUndefined: Self = StObject.set(x, "fileInfo", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementName(value: String): Self = StObject.set(x, "targetElementName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementNameUndefined: Self = StObject.set(x, "targetElementName", js.undefined)
      
      @scala.inline
      def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPathUndefined: Self = StObject.set(x, "targetPath", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DropEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the action, which is performed after dropping the files (upload/ move).
      */
    var dropAction: js.UndefOr[String] = js.native
    
    /** returns the dragging element details.
      */
    var fileInfo: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the target element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of target folder.
      */
    var targetFolder: js.UndefOr[String] = js.native
    
    /** returns the path of target folder.
      */
    var targetPath: js.UndefOr[String] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DropEventArgs {
    
    @scala.inline
    def apply(): DropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropEventArgs]
    }
    
    @scala.inline
    implicit class DropEventArgsMutableBuilder[Self <: DropEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDropAction(value: String): Self = StObject.set(x, "dropAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropActionUndefined: Self = StObject.set(x, "dropAction", js.undefined)
      
      @scala.inline
      def setFileInfo(value: js.Any): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileInfoUndefined: Self = StObject.set(x, "fileInfo", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetFolder(value: String): Self = StObject.set(x, "targetFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetFolderUndefined: Self = StObject.set(x, "targetFolder", js.undefined)
      
      @scala.inline
      def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPathUndefined: Self = StObject.set(x, "targetPath", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait FilterSettings extends StObject {
    
    /** It allows to search the text given in search Textbox in every keyup event. When this property was set as false, searching will works only on Enter key and searchbar blur.
      * @Default {true}
      */
    var allowSearchOnTyping: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables to perform the filter operation with case sensitive.
      * @Default {false}
      */
    var caseSensitiveSearch: js.UndefOr[Boolean] = js.native
    
    /** Sets the search filter type. There are several filter types available such as &quot;startswith&quot;, &quot;contains&quot;, &quot;endswith&quot;. See filterType.
      * @Default {ej.FileExplorer.filterType.Contains}
      */
    var filterType: js.UndefOr[FilterType_ | String] = js.native
  }
  object FilterSettings {
    
    @scala.inline
    def apply(): FilterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterSettings]
    }
    
    @scala.inline
    implicit class FilterSettingsMutableBuilder[Self <: FilterSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSearchOnTyping(value: Boolean): Self = StObject.set(x, "allowSearchOnTyping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSearchOnTypingUndefined: Self = StObject.set(x, "allowSearchOnTyping", js.undefined)
      
      @scala.inline
      def setCaseSensitiveSearch(value: Boolean): Self = StObject.set(x, "caseSensitiveSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveSearchUndefined: Self = StObject.set(x, "caseSensitiveSearch", js.undefined)
      
      @scala.inline
      def setFilterType(value: FilterType_ | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    }
  }
  
  @js.native
  trait GetImageEventArgs extends StObject {
    
    /** returns the action type, which specifies thumbnail preview or opening image.
      */
    var action: js.UndefOr[String] = js.native
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** loaded image element
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** original arguments of image load or error event
      */
    var originalArgs: js.UndefOr[js.Any] = js.native
    
    /** loaded image path.
      */
    var path: js.UndefOr[String] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object GetImageEventArgs {
    
    @scala.inline
    def apply(): GetImageEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetImageEventArgs]
    }
    
    @scala.inline
    implicit class GetImageEventArgsMutableBuilder[Self <: GetImageEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setOriginalArgs(value: js.Any): Self = StObject.set(x, "originalArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalArgsUndefined: Self = StObject.set(x, "originalArgs", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait GridSettings extends StObject {
    
    /** Allows to Resize the width of the columns by simply click and move the particular column header line.
      * @Default {true}
      */
    var allowResizing: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to enable the dynamic sorting behavior on grid data. Sorting can be done through clicking on particular column header.
      * @Default {true}
      */
    var allowSorting: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets an object that indicates to render the grid with specified columns. You can use this property same as the column property in Grid control.
      * @Default {[{ field: name, headerText: Name, width: 30% }, { field: dateModified, headerText: Date Modified, width: 30% }, { field: type, headerText: Type, width: 15% }, { field:
      * size, headerText: Size, width: 12%, textAlign: right, headerTextAlign: left }]}
      */
    var columns: js.UndefOr[js.Array[_]] = js.native
  }
  object GridSettings {
    
    @scala.inline
    def apply(): GridSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridSettings]
    }
    
    @scala.inline
    implicit class GridSettingsMutableBuilder[Self <: GridSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowResizing(value: Boolean): Self = StObject.set(x, "allowResizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowResizingUndefined: Self = StObject.set(x, "allowResizing", js.undefined)
      
      @scala.inline
      def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[_]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: js.Any*): Self = StObject.set(x, "columns", js.Array(value :_*))
    }
  }
  
  @js.native
  trait KeydownEventArgs extends StObject {
    
    /** returns altKey value.
      */
    var altKey: js.UndefOr[Boolean] = js.native
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns ctrlKey value.
      */
    var ctrlKey: js.UndefOr[Boolean] = js.native
    
    /** returns the downed key keyCode value
      */
    var keyCode: js.UndefOr[Double] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the event object.
      */
    var originalArgs: js.UndefOr[js.Any] = js.native
    
    /** returns shiftKey value.
      */
    var shiftKey: js.UndefOr[Boolean] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object KeydownEventArgs {
    
    @scala.inline
    def apply(): KeydownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeydownEventArgs]
    }
    
    @scala.inline
    implicit class KeydownEventArgsMutableBuilder[Self <: KeydownEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setOriginalArgs(value: js.Any): Self = StObject.set(x, "originalArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalArgsUndefined: Self = StObject.set(x, "originalArgs", js.undefined)
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LayoutChangeEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** return true when we change the layout via interaction, else false.
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the current view type.
      */
    var layoutType: js.UndefOr[String] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LayoutChangeEventArgs {
    
    @scala.inline
    def apply(): LayoutChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutChangeEventArgs]
    }
    
    @scala.inline
    implicit class LayoutChangeEventArgsMutableBuilder[Self <: LayoutChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setLayoutType(value: String): Self = StObject.set(x, "layoutType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutTypeUndefined: Self = StObject.set(x, "layoutType", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MenuBeforeOpenEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the name of ContextMenu items group.
      */
    var contextMenu: js.UndefOr[String] = js.native
    
    /** returns the dataSource of ContextMenu.
      */
    var dataSource: js.UndefOr[js.Array[_]] = js.native
    
    /** returns the element of ContextMenu.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the event of ContextMenu.
      */
    var events: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the target element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object MenuBeforeOpenEventArgs {
    
    @scala.inline
    def apply(): MenuBeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuBeforeOpenEventArgs]
    }
    
    @scala.inline
    implicit class MenuBeforeOpenEventArgsMutableBuilder[Self <: MenuBeforeOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Array[_]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MenuClickEventArgs extends StObject {
    
    /** returns the ID of clicked ContextMenu item.
      */
    var ID: js.UndefOr[String] = js.native
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the name of ContextMenu items group.
      */
    var contextMenu: js.UndefOr[String] = js.native
    
    /** returns the element of clicked ContextMenu item.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the event of ContextMenu.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the parent element ID of clicked ContextMenu item.
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** returns the parent element text of clicked ContextMenu item.
      */
    var parentText: js.UndefOr[String] = js.native
    
    /** returns the text of clicked ContextMenu item.
      */
    var text: js.UndefOr[String] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object MenuClickEventArgs {
    
    @scala.inline
    def apply(): MenuClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuClickEventArgs]
    }
    
    @scala.inline
    implicit class MenuClickEventArgsMutableBuilder[Self <: MenuClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setParentText(value: String): Self = StObject.set(x, "parentText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentTextUndefined: Self = StObject.set(x, "parentText", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait MenuOpenEventArgs extends StObject {
    
    /** set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the name of ContextMenu items group.
      */
    var contextMenu: js.UndefOr[String] = js.native
    
    /** returns the element of ContextMenu.
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the target element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object MenuOpenEventArgs {
    
    @scala.inline
    def apply(): MenuOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuOpenEventArgs]
    }
    
    @scala.inline
    implicit class MenuOpenEventArgsMutableBuilder[Self <: MenuOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Sets the URL of server side AJAX handling method that handles file operation like Read, Remove, Rename, Create, Upload, Download, Copy and Move in FileExplorer.
      */
    var ajaxAction: js.UndefOr[String] = js.native
    
    /** Specifies the data type of server side AJAX handling method.
      * @Default {json}
      */
    var ajaxDataType: js.UndefOr[String] = js.native
    
    /** By using ajaxSettings property, you can customize the AJAX configurations. Normally you can customize the following option in AJAX handling data, URL, type, async, contentType,
      * dataType and success. For upload, download and getImage API, you can only customize URL.
      * @Default {{ read: {}, createFolder: {}, remove: {}, rename: {}, paste: {}, getDetails: {}, download: {}, upload: {}, getImage: {}, search: {}}}
      */
    var ajaxSettings: js.UndefOr[js.Any] = js.native
    
    /** The FileExplorer allows to move the files from one folder to another folder of FileExplorer by using drag and drop option. Also it supports to upload a file by dragging it from
      * windows explorer to the necessary folder of ejFileExplorer.
      * @Default {true}
      */
    var allowDragAndDrop: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to enable keyboard support for FileExplorer actions.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
    
    /** The FileExplorer allows to select multiple files by enabling the allowMultiSelection property. You can perform multi selection by pressing the Ctrl key or Shift key.
      * @Default {true}
      */
    var allowMultiSelection: js.UndefOr[Boolean] = js.native
    
    /** Fires before the AJAX request is performed.
      */
    var beforeAjaxRequest: js.UndefOr[js.Function1[/* e */ BeforeAjaxRequestEventArgs, Unit]] = js.native
    
    /** Fires before downloading the files.
      */
    var beforeDownload: js.UndefOr[js.Function1[/* e */ BeforeDownloadEventArgs, Unit]] = js.native
    
    /** Fires before getting a requested image from server. Also this event will be triggered when you have enabled thumbnail image compression option in FileExplorer.Using this event,
      * you can customize the image compression size.
      */
    var beforeGetImage: js.UndefOr[js.Function1[/* e */ BeforeGetImageEventArgs, Unit]] = js.native
    
    /** Fires before files or folders open.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
    
    /** Fires before uploading the files.
      */
    var beforeUpload: js.UndefOr[js.Function1[/* e */ BeforeUploadEventArgs, Unit]] = js.native
    
    /** Fires before opening the upload dialog.
      */
    var beforeUploadDialogOpen: js.UndefOr[js.Function1[/* e */ BeforeUploadDialogOpenEventArgs, Unit]] = js.native
    
    /** Event is fired before the upload progress is started.
      */
    var beforeUploadSend: js.UndefOr[js.Function1[/* e */ BeforeUploadSendEventArgs, Unit]] = js.native
    
    /** By using the contextMenuSettings property, you can customize the ContextMenu in the FileExplorer control.
      */
    var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
    
    /** Fires when file or folder is copied successfully.
      */
    var copy: js.UndefOr[js.Function1[/* e */ CopyEventArgs, Unit]] = js.native
    
    /** Fires when FileExplorer control was created
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Fires when new folder is created successfully in file system.
      */
    var createFolder: js.UndefOr[js.Function1[/* e */ CreateFolderEventArgs, Unit]] = js.native
    
    /** Sets the root class for FileExplorer theme. This cssClass API allows to use custom skinning option for File Explorer control. By defining the root class by using this API, you
      * have to include this root class in CSS.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Fires when file or folder is cut successfully.
      */
    var cut: js.UndefOr[js.Function1[/* e */ CutEventArgs, Unit]] = js.native
    
    /** Fires when the FileExplorer is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Fires when the files or directory is dragging over on the FileExplorer.
      */
    var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
    
    /** Fires when the files or directory has been started to drag over on the FileExplorer
      */
    var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.native
    
    /** Fires when the files or directory has been stopped to drag over on FileExplorer
      */
    var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.native
    
    /** Fires when the files or directory is dropped to the target folder of FileExplorer
      */
    var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.native
    
    /** Specify the enablePersistence to FileExplorer to save the current model value in browser cookies for state maintains.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the Right to Left alignment support in FileExplorer control.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the resize support in FileExplorer control.
      * @Default {false}
      */
    var enableResize: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the thumbnail image compression option in FileExplorer control. By enabling this option, you can reduce the thumbnail image size while loading.
      * @Default {false}
      */
    var enableThumbnailCompress: js.UndefOr[Boolean] = js.native
    
    /** Allows specified type of files only to display in FileExplorer control.
      * @Default {* . *}
      */
    var fileTypes: js.UndefOr[String] = js.native
    
    /** By using filterSettings property, you can customize the search functionality of the search bar in FileExplorer control.
      */
    var filterSettings: js.UndefOr[FilterSettings] = js.native
    
    /** Fires after loading the requested image from server. Using this event, you can get the details of loaded image.
      */
    var getImage: js.UndefOr[js.Function1[/* e */ GetImageEventArgs, Unit]] = js.native
    
    /** By using the gridSettings property, you can customize the grid behavior in the FileExplorer control.
      */
    var gridSettings: js.UndefOr[GridSettings] = js.native
    
    /** Specifies the height of FileExplorer control.
      * @Default {400}
      */
    var height: js.UndefOr[String | Double] = js.native
    
    /** Enables or disables the responsive support for FileExplorer control during the window resizing time.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Fires when keydown in FileExplorer control.
      */
    var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, Unit]] = js.native
    
    /** Sets the file view type. There are three view types available such as Grid, Tile and Large icons. See layoutType.
      * @Default {ej.FileExplorer.layoutType.Grid}
      */
    var layout: js.UndefOr[layoutType | String] = js.native
    
    /** Fires when the file view type is changed.
      */
    var layoutChange: js.UndefOr[js.Function1[/* e */ LayoutChangeEventArgs, Unit]] = js.native
    
    /** Sets the culture in FileExplorer.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Sets the maximum height of FileExplorer control.
      * @Default {null}
      */
    var maxHeight: js.UndefOr[String | Double] = js.native
    
    /** Sets the maximum width of FileExplorer control.
      * @Default {null}
      */
    var maxWidth: js.UndefOr[String | Double] = js.native
    
    /** Fires when before the ContextMenu opening.
      */
    var menuBeforeOpen: js.UndefOr[js.Function1[/* e */ MenuBeforeOpenEventArgs, Unit]] = js.native
    
    /** Fires when click the ContextMenu item.
      */
    var menuClick: js.UndefOr[js.Function1[/* e */ MenuClickEventArgs, Unit]] = js.native
    
    /** Fires when ContextMenu is successfully opened.
      */
    var menuOpen: js.UndefOr[js.Function1[/* e */ MenuOpenEventArgs, Unit]] = js.native
    
    /** Sets the minimum height of FileExplorer control.
      * @Default {250px}
      */
    var minHeight: js.UndefOr[String | Double] = js.native
    
    /** Sets the minimum width of FileExplorer control.
      * @Default {400px}
      */
    var minWidth: js.UndefOr[String | Double] = js.native
    
    /** Fires when files are successfully opened.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
    
    /** Fires when a file or folder is pasted successfully.
      */
    var paste: js.UndefOr[js.Function1[/* e */ PasteEventArgs, Unit]] = js.native
    
    /** The property path denotes the filesystem path that are to be explored. The path for the filesystem can be physical path or relative path, but it has to be relevant to where the
      * Web API is hosted.
      */
    var path: js.UndefOr[String] = js.native
    
    /** Fires when file or folder is deleted successfully.
      */
    var remove: js.UndefOr[js.Function1[/* e */ RemoveEventArgs, Unit]] = js.native
    
    /** Fires when resizing is performed for FileExplorer.
      */
    var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.native
    
    /** Fires when resizing is started for FileExplorer.
      */
    var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.native
    
    /** Fires this event when the resizing is stopped for FileExplorer.
      */
    var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, Unit]] = js.native
    
    /** Sets the alias name of root folder name in FileExplorer. It is used to replace the actual root folder name in FileExplorer.
      */
    var rootFolderName: js.UndefOr[String] = js.native
    
    /** Fires when the items from grid view or tile view of FileExplorer control is selected.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
    
    /** The selectedFolder is used to select the specified folder of FileExplorer control.
      */
    var selectedFolder: js.UndefOr[String] = js.native
    
    /** The selectedItems is used to select the specified items (file, folder) of FileExplorer control.
      */
    var selectedItems: js.UndefOr[String | js.Array[_]] = js.native
    
    /** Enables or disables the checkbox option in FileExplorer control.
      * @Default {true}
      */
    var showCheckbox: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the context menu option in FileExplorer control.
      * @Default {true}
      */
    var showContextMenu: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the footer in FileExplorer control. The footer element displays the details of the current selected files and folders. And also the footer having the switcher
      * to change the layout view.
      * @Default {true}
      */
    var showFooter: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the navigation pane in FileExplorer control. The navigation pane contains a tree view element that displays all the folders from the filesystem in a
      * hierarchical manner. This is useful to a quick navigation of any folder in the filesystem.
      * @Default {true}
      */
    var showNavigationPane: js.UndefOr[Boolean] = js.native
    
    /** FileExplorer control is displayed with rounded corner when this property is set to true.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.native
    
    /** FileExplorer control is rendered with thumbnail preview of images in Tile and LargeIcons layout when this property set to true.
      * @Default {true}
      */
    var showThumbnail: js.UndefOr[Boolean] = js.native
    
    /** Shows or disables the toolbar in FileExplorer control.
      * @Default {true}
      */
    var showToolbar: js.UndefOr[Boolean] = js.native
    
    /** Triggered when refresh the template column elements in the grid view of FileExplorer control.
      */
    var templateRefresh: js.UndefOr[js.Function1[/* e */ TemplateRefreshEventArgs, Unit]] = js.native
    
    /** The tools property is used to configure and group required toolbar items in FileExplorer control.
      * @Default {{ creation: [NewFolder], navigation: [Back, Forward, Upward], addressBar: [Addressbar], editing: [Refresh, Upload, Delete, Rename, Download], copyPaste: [Cut, Copy,
      * Paste], getProperties: [Details], searchBar: [Searchbar], layout: [Layout], sortBy: [SortBy]}}
      */
    var tools: js.UndefOr[js.Any] = js.native
    
    /** The toolsList property is used to arrange the toolbar items in the FileExplorer control.
      * @Default {[layout, creation, navigation, addressBar, editing, copyPaste, sortBy, getProperties, searchBar]}
      */
    var toolsList: js.UndefOr[js.Array[_]] = js.native
    
    /** Fires when the items from grid view or tile view or large icons view of FileExplorer control is unselected.
      */
    var unselect: js.UndefOr[js.Function1[/* e */ UnselectEventArgs, Unit]] = js.native
    
    /** Event is fired when the file upload progress gets completed.
      */
    var uploadComplete: js.UndefOr[js.Function1[/* e */ UploadCompleteEventArgs, Unit]] = js.native
    
    /** Event is fired when the file upload fails due to some error.
      */
    var uploadError: js.UndefOr[js.Function1[/* e */ UploadErrorEventArgs, Unit]] = js.native
    
    /** Gets or sets an object that indicates whether to customize the upload behavior in the FileExplorer.
      */
    var uploadSettings: js.UndefOr[UploadSettings] = js.native
    
    /** Event is fired when the file upload progress gets succeeded.
      */
    var uploadSuccess: js.UndefOr[js.Function1[/* e */ UploadSuccessEventArgs, Unit]] = js.native
    
    /** Specifies the virtual item count for virtual support.
      * @Default {0}
      */
    var virtualItemCount: js.UndefOr[Double] = js.native
    
    /** Specifies the width of FileExplorer control.
      * @Default {850}
      */
    var width: js.UndefOr[String | Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.FileExplorer.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.FileExplorer.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.FileExplorer.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxAction(value: String): Self = StObject.set(x, "ajaxAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxActionUndefined: Self = StObject.set(x, "ajaxAction", js.undefined)
      
      @scala.inline
      def setAjaxDataType(value: String): Self = StObject.set(x, "ajaxDataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxDataTypeUndefined: Self = StObject.set(x, "ajaxDataType", js.undefined)
      
      @scala.inline
      def setAjaxSettings(value: js.Any): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxSettingsUndefined: Self = StObject.set(x, "ajaxSettings", js.undefined)
      
      @scala.inline
      def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setAllowMultiSelection(value: Boolean): Self = StObject.set(x, "allowMultiSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultiSelectionUndefined: Self = StObject.set(x, "allowMultiSelection", js.undefined)
      
      @scala.inline
      def setBeforeAjaxRequest(value: /* e */ BeforeAjaxRequestEventArgs => Unit): Self = StObject.set(x, "beforeAjaxRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeAjaxRequestUndefined: Self = StObject.set(x, "beforeAjaxRequest", js.undefined)
      
      @scala.inline
      def setBeforeDownload(value: /* e */ BeforeDownloadEventArgs => Unit): Self = StObject.set(x, "beforeDownload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeDownloadUndefined: Self = StObject.set(x, "beforeDownload", js.undefined)
      
      @scala.inline
      def setBeforeGetImage(value: /* e */ BeforeGetImageEventArgs => Unit): Self = StObject.set(x, "beforeGetImage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeGetImageUndefined: Self = StObject.set(x, "beforeGetImage", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setBeforeUpload(value: /* e */ BeforeUploadEventArgs => Unit): Self = StObject.set(x, "beforeUpload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeUploadDialogOpen(value: /* e */ BeforeUploadDialogOpenEventArgs => Unit): Self = StObject.set(x, "beforeUploadDialogOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeUploadDialogOpenUndefined: Self = StObject.set(x, "beforeUploadDialogOpen", js.undefined)
      
      @scala.inline
      def setBeforeUploadSend(value: /* e */ BeforeUploadSendEventArgs => Unit): Self = StObject.set(x, "beforeUploadSend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeUploadSendUndefined: Self = StObject.set(x, "beforeUploadSend", js.undefined)
      
      @scala.inline
      def setBeforeUploadUndefined: Self = StObject.set(x, "beforeUpload", js.undefined)
      
      @scala.inline
      def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      @scala.inline
      def setCopy(value: /* e */ CopyEventArgs => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateFolder(value: /* e */ CreateFolderEventArgs => Unit): Self = StObject.set(x, "createFolder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateFolderUndefined: Self = StObject.set(x, "createFolder", js.undefined)
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCut(value: /* e */ CutEventArgs => Unit): Self = StObject.set(x, "cut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDrag(value: /* e */ DragEventArgs => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragStart(value: /* e */ DragStartEventArgs => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      @scala.inline
      def setDragStop(value: /* e */ DragStopEventArgs => Unit): Self = StObject.set(x, "dragStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragStopUndefined: Self = StObject.set(x, "dragStop", js.undefined)
      
      @scala.inline
      def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      @scala.inline
      def setDrop(value: /* e */ DropEventArgs => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      @scala.inline
      def setEnableThumbnailCompress(value: Boolean): Self = StObject.set(x, "enableThumbnailCompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableThumbnailCompressUndefined: Self = StObject.set(x, "enableThumbnailCompress", js.undefined)
      
      @scala.inline
      def setFileTypes(value: String): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
      
      @scala.inline
      def setFilterSettings(value: FilterSettings): Self = StObject.set(x, "filterSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterSettingsUndefined: Self = StObject.set(x, "filterSettings", js.undefined)
      
      @scala.inline
      def setGetImage(value: /* e */ GetImageEventArgs => Unit): Self = StObject.set(x, "getImage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetImageUndefined: Self = StObject.set(x, "getImage", js.undefined)
      
      @scala.inline
      def setGridSettings(value: GridSettings): Self = StObject.set(x, "gridSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridSettingsUndefined: Self = StObject.set(x, "gridSettings", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setKeydown(value: /* e */ KeydownEventArgs => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      @scala.inline
      def setLayout(value: layoutType | String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutChange(value: /* e */ LayoutChangeEventArgs => Unit): Self = StObject.set(x, "layoutChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLayoutChangeUndefined: Self = StObject.set(x, "layoutChange", js.undefined)
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: String | Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMenuBeforeOpen(value: /* e */ MenuBeforeOpenEventArgs => Unit): Self = StObject.set(x, "menuBeforeOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuBeforeOpenUndefined: Self = StObject.set(x, "menuBeforeOpen", js.undefined)
      
      @scala.inline
      def setMenuClick(value: /* e */ MenuClickEventArgs => Unit): Self = StObject.set(x, "menuClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuClickUndefined: Self = StObject.set(x, "menuClick", js.undefined)
      
      @scala.inline
      def setMenuOpen(value: /* e */ MenuOpenEventArgs => Unit): Self = StObject.set(x, "menuOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuOpenUndefined: Self = StObject.set(x, "menuOpen", js.undefined)
      
      @scala.inline
      def setMinHeight(value: String | Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPaste(value: /* e */ PasteEventArgs => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRemove(value: /* e */ RemoveEventArgs => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setResize(value: /* e */ ResizeEventArgs => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
      
      @scala.inline
      def setResizeStop(value: /* e */ ResizeStopEventArgs => Unit): Self = StObject.set(x, "resizeStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizeStopUndefined: Self = StObject.set(x, "resizeStop", js.undefined)
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setRootFolderName(value: String): Self = StObject.set(x, "rootFolderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootFolderNameUndefined: Self = StObject.set(x, "rootFolderName", js.undefined)
      
      @scala.inline
      def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSelectedFolder(value: String): Self = StObject.set(x, "selectedFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedFolderUndefined: Self = StObject.set(x, "selectedFolder", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: String | js.Array[_]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setSelectedItemsVarargs(value: js.Any*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
      
      @scala.inline
      def setShowCheckbox(value: Boolean): Self = StObject.set(x, "showCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCheckboxUndefined: Self = StObject.set(x, "showCheckbox", js.undefined)
      
      @scala.inline
      def setShowContextMenu(value: Boolean): Self = StObject.set(x, "showContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowContextMenuUndefined: Self = StObject.set(x, "showContextMenu", js.undefined)
      
      @scala.inline
      def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      @scala.inline
      def setShowNavigationPane(value: Boolean): Self = StObject.set(x, "showNavigationPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNavigationPaneUndefined: Self = StObject.set(x, "showNavigationPane", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setShowThumbnail(value: Boolean): Self = StObject.set(x, "showThumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowThumbnailUndefined: Self = StObject.set(x, "showThumbnail", js.undefined)
      
      @scala.inline
      def setShowToolbar(value: Boolean): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowToolbarUndefined: Self = StObject.set(x, "showToolbar", js.undefined)
      
      @scala.inline
      def setTemplateRefresh(value: /* e */ TemplateRefreshEventArgs => Unit): Self = StObject.set(x, "templateRefresh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTemplateRefreshUndefined: Self = StObject.set(x, "templateRefresh", js.undefined)
      
      @scala.inline
      def setTools(value: js.Any): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolsList(value: js.Array[_]): Self = StObject.set(x, "toolsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolsListUndefined: Self = StObject.set(x, "toolsList", js.undefined)
      
      @scala.inline
      def setToolsListVarargs(value: js.Any*): Self = StObject.set(x, "toolsList", js.Array(value :_*))
      
      @scala.inline
      def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
      
      @scala.inline
      def setUnselect(value: /* e */ UnselectEventArgs => Unit): Self = StObject.set(x, "unselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnselectUndefined: Self = StObject.set(x, "unselect", js.undefined)
      
      @scala.inline
      def setUploadComplete(value: /* e */ UploadCompleteEventArgs => Unit): Self = StObject.set(x, "uploadComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUploadCompleteUndefined: Self = StObject.set(x, "uploadComplete", js.undefined)
      
      @scala.inline
      def setUploadError(value: /* e */ UploadErrorEventArgs => Unit): Self = StObject.set(x, "uploadError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUploadErrorUndefined: Self = StObject.set(x, "uploadError", js.undefined)
      
      @scala.inline
      def setUploadSettings(value: UploadSettings): Self = StObject.set(x, "uploadSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadSettingsUndefined: Self = StObject.set(x, "uploadSettings", js.undefined)
      
      @scala.inline
      def setUploadSuccess(value: /* e */ UploadSuccessEventArgs => Unit): Self = StObject.set(x, "uploadSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUploadSuccessUndefined: Self = StObject.set(x, "uploadSuccess", js.undefined)
      
      @scala.inline
      def setVirtualItemCount(value: Double): Self = StObject.set(x, "virtualItemCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualItemCountUndefined: Self = StObject.set(x, "virtualItemCount", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait OpenEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the opened item type.
      */
    var itemType: js.UndefOr[String] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the path of currently opened item.
      */
    var path: js.UndefOr[String] = js.native
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object OpenEventArgs {
    
    @scala.inline
    def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit class OpenEventArgsMutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait PasteEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of moved/copied file or folder.
      */
    var name: js.UndefOr[js.Array[String]] = js.native
    
    /** returns the selected item details.
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the target folder item details.
      */
    var targetFolder: js.UndefOr[js.Any] = js.native
    
    /** returns the target path.
      */
    var targetPath: js.UndefOr[String] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PasteEventArgs {
    
    @scala.inline
    def apply(): PasteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasteEventArgs]
    }
    
    @scala.inline
    implicit class PasteEventArgsMutableBuilder[Self <: PasteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setTargetFolder(value: js.Any): Self = StObject.set(x, "targetFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetFolderUndefined: Self = StObject.set(x, "targetFolder", js.undefined)
      
      @scala.inline
      def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPathUndefined: Self = StObject.set(x, "targetPath", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RemoveEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the AJAX response data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the names of deleted items.
      */
    var name: js.UndefOr[String] = js.native
    
    /** returns the path of deleted item.
      */
    var path: js.UndefOr[String] = js.native
    
    /** returns the removed item details.
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RemoveEventArgs {
    
    @scala.inline
    def apply(): RemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveEventArgs]
    }
    
    @scala.inline
    implicit class RemoveEventArgsMutableBuilder[Self <: RemoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ResizeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the mouse move event args.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ResizeEventArgs {
    
    @scala.inline
    def apply(): ResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeEventArgs]
    }
    
    @scala.inline
    implicit class ResizeEventArgsMutableBuilder[Self <: ResizeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ResizeStartEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the mouse down event args.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ResizeStartEventArgs {
    
    @scala.inline
    def apply(): ResizeStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeStartEventArgs]
    }
    
    @scala.inline
    implicit class ResizeStartEventArgsMutableBuilder[Self <: ResizeStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ResizeStopEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the mouse leave event args.
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ResizeStopEventArgs {
    
    @scala.inline
    def apply(): ResizeStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeStopEventArgs]
    }
    
    @scala.inline
    implicit class ResizeStopEventArgsMutableBuilder[Self <: ResizeStopEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SelectEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** returns the name of selected items.
      */
    var name: js.UndefOr[js.Array[String]] = js.native
    
    /** returns the path of selected items.
      */
    var path: js.UndefOr[String] = js.native
    
    /** returns the selected item details
      */
    var selectedItems: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SelectEventArgs {
    
    @scala.inline
    def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    @scala.inline
    implicit class SelectEventArgsMutableBuilder[Self <: SelectEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: js.Any): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TemplateRefreshEventArgs extends StObject {
    
    /** Set to true when the event has to be canceled, else false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the cell object.
      */
    var cell: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Returns the column object.
      */
    var column: js.UndefOr[js.Any] = js.native
    
    /** Returns the current row data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the grid model of FileExplorer.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the current row index.
      */
    var rowIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object TemplateRefreshEventArgs {
    
    @scala.inline
    def apply(): TemplateRefreshEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateRefreshEventArgs]
    }
    
    @scala.inline
    implicit class TemplateRefreshEventArgsMutableBuilder[Self <: TemplateRefreshEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCell(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait UnselectEventArgs extends StObject {
    
    /** Returns the FileExplorer model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.native
    
    /** Returns the name of unselected item.
      */
    var name: js.UndefOr[String] = js.native
    
    /** Returns the name of unselected items.
      */
    var names: js.UndefOr[js.Array[String]] = js.native
    
    /** Returns the type of unselected item.
      */
    var nodeType: js.UndefOr[String] = js.native
    
    /** Returns the path of unselected item.
      */
    var path: js.UndefOr[String] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Returns the unselected item details.
      */
    var unselectedItem: js.UndefOr[js.Any] = js.native
    
    /** Returns the unselected items details.
      */
    var unselectedItems: js.UndefOr[js.Array[_]] = js.native
  }
  object UnselectEventArgs {
    
    @scala.inline
    def apply(): UnselectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnselectEventArgs]
    }
    
    @scala.inline
    implicit class UnselectEventArgsMutableBuilder[Self <: UnselectEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnselectedItem(value: js.Any): Self = StObject.set(x, "unselectedItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedItemUndefined: Self = StObject.set(x, "unselectedItem", js.undefined)
      
      @scala.inline
      def setUnselectedItems(value: js.Array[_]): Self = StObject.set(x, "unselectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedItemsUndefined: Self = StObject.set(x, "unselectedItems", js.undefined)
      
      @scala.inline
      def setUnselectedItemsVarargs(value: js.Any*): Self = StObject.set(x, "unselectedItems", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UploadCompleteEventArgs extends StObject {
    
    /** AJAX event argument for reference
      */
    var e: js.UndefOr[js.Any] = js.native
    
    /** details about the error information
      */
    var error: js.UndefOr[String] = js.native
    
    /** uploaded file list
      */
    var files: js.UndefOr[js.Any] = js.native
    
    /** returns the Upload model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** response from the server
      */
    var responseText: js.UndefOr[String] = js.native
    
    /** successfully uploaded files list
      */
    var success: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** XHR-AJAX Object for reference
      */
    var xhr: js.UndefOr[js.Any] = js.native
  }
  object UploadCompleteEventArgs {
    
    @scala.inline
    def apply(): UploadCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadCompleteEventArgs]
    }
    
    @scala.inline
    implicit class UploadCompleteEventArgsMutableBuilder[Self <: UploadCompleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      @scala.inline
      def setSuccess(value: js.Any): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setXhr(value: js.Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  @js.native
  trait UploadErrorEventArgs extends StObject {
    
    /** error event action details
      */
    var action: js.UndefOr[String] = js.native
    
    /** details about the error information
      */
    var error: js.UndefOr[String] = js.native
    
    /** returns the details of the uploaded files
      */
    var files: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object UploadErrorEventArgs {
    
    @scala.inline
    def apply(): UploadErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadErrorEventArgs]
    }
    
    @scala.inline
    implicit class UploadErrorEventArgsMutableBuilder[Self <: UploadErrorEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait UploadSettings extends StObject {
    
    /** Enables or disables the multiple files upload. When it is enabled, you can upload multiple files at a time and when disabled, you can upload only one file at a time.
      * @Default {true}
      */
    var allowMultipleFile: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the auto upload option while uploading files in FileExplorer control.
      * @Default {false}
      */
    var autoUpload: js.UndefOr[Boolean] = js.native
    
    /** Specifies the actions for upload dialog during initialization.
      * @Default {{ modal:false, closeOnComplete:false, content:null, drag:true }}
      */
    var dialogAction: js.UndefOr[js.Any] = js.native
    
    /** Specifies the position at which the upload dialog is displayed using X and Y values. X: Sets the left position value for dialog. Y: Sets the top position value for dialog.
      * @Default {null}
      */
    var dialogPosition: js.UndefOr[js.Any] = js.native
    
    /** Specifies the maximum file size allowed to upload. It accepts the value in bytes.
      * @Default {31457280}
      */
    var maxFileSize: js.UndefOr[Double] = js.native
    
    /** Specifies the file details which are to be displayed when selected for upload by setting the showFileDetails to true.
      * @Default {true}
      */
    var showFileDetails: js.UndefOr[Boolean] = js.native
  }
  object UploadSettings {
    
    @scala.inline
    def apply(): UploadSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadSettings]
    }
    
    @scala.inline
    implicit class UploadSettingsMutableBuilder[Self <: UploadSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowMultipleFile(value: Boolean): Self = StObject.set(x, "allowMultipleFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultipleFileUndefined: Self = StObject.set(x, "allowMultipleFile", js.undefined)
      
      @scala.inline
      def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
      
      @scala.inline
      def setDialogAction(value: js.Any): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogActionUndefined: Self = StObject.set(x, "dialogAction", js.undefined)
      
      @scala.inline
      def setDialogPosition(value: js.Any): Self = StObject.set(x, "dialogPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogPositionUndefined: Self = StObject.set(x, "dialogPosition", js.undefined)
      
      @scala.inline
      def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      @scala.inline
      def setShowFileDetails(value: Boolean): Self = StObject.set(x, "showFileDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFileDetailsUndefined: Self = StObject.set(x, "showFileDetails", js.undefined)
    }
  }
  
  @js.native
  trait UploadSuccessEventArgs extends StObject {
    
    /** AJAX event argument for reference
      */
    var e: js.UndefOr[js.Any] = js.native
    
    /** uploaded file list
      */
    var files: js.UndefOr[js.Any] = js.native
    
    /** returns the Upload model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** response from the server
      */
    var responseText: js.UndefOr[String] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** XHR-AJAX Object for reference
      */
    var xhr: js.UndefOr[js.Any] = js.native
  }
  object UploadSuccessEventArgs {
    
    @scala.inline
    def apply(): UploadSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadSuccessEventArgs]
    }
    
    @scala.inline
    implicit class UploadSuccessEventArgsMutableBuilder[Self <: UploadSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setXhr(value: js.Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
}
