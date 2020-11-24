package typings.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
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
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setAjaxAction(value: String): Self = this.set("ajaxAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxAction: Self = this.set("ajaxAction", js.undefined)
    
    @scala.inline
    def setAjaxDataType(value: String): Self = this.set("ajaxDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxDataType: Self = this.set("ajaxDataType", js.undefined)
    
    @scala.inline
    def setAjaxSettings(value: js.Any): Self = this.set("ajaxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxSettings: Self = this.set("ajaxSettings", js.undefined)
    
    @scala.inline
    def setAllowDragAndDrop(value: Boolean): Self = this.set("allowDragAndDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDragAndDrop: Self = this.set("allowDragAndDrop", js.undefined)
    
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setAllowMultiSelection(value: Boolean): Self = this.set("allowMultiSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiSelection: Self = this.set("allowMultiSelection", js.undefined)
    
    @scala.inline
    def setBeforeAjaxRequest(value: /* e */ BeforeAjaxRequestEventArgs => Unit): Self = this.set("beforeAjaxRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeAjaxRequest: Self = this.set("beforeAjaxRequest", js.undefined)
    
    @scala.inline
    def setBeforeDownload(value: /* e */ BeforeDownloadEventArgs => Unit): Self = this.set("beforeDownload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeDownload: Self = this.set("beforeDownload", js.undefined)
    
    @scala.inline
    def setBeforeGetImage(value: /* e */ BeforeGetImageEventArgs => Unit): Self = this.set("beforeGetImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeGetImage: Self = this.set("beforeGetImage", js.undefined)
    
    @scala.inline
    def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    
    @scala.inline
    def setBeforeUpload(value: /* e */ BeforeUploadEventArgs => Unit): Self = this.set("beforeUpload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeUpload: Self = this.set("beforeUpload", js.undefined)
    
    @scala.inline
    def setBeforeUploadDialogOpen(value: /* e */ BeforeUploadDialogOpenEventArgs => Unit): Self = this.set("beforeUploadDialogOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeUploadDialogOpen: Self = this.set("beforeUploadDialogOpen", js.undefined)
    
    @scala.inline
    def setBeforeUploadSend(value: /* e */ BeforeUploadSendEventArgs => Unit): Self = this.set("beforeUploadSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeUploadSend: Self = this.set("beforeUploadSend", js.undefined)
    
    @scala.inline
    def setContextMenuSettings(value: ContextMenuSettings): Self = this.set("contextMenuSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuSettings: Self = this.set("contextMenuSettings", js.undefined)
    
    @scala.inline
    def setCopy(value: /* e */ CopyEventArgs => Unit): Self = this.set("copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCreateFolder(value: /* e */ CreateFolderEventArgs => Unit): Self = this.set("createFolder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateFolder: Self = this.set("createFolder", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setCut(value: /* e */ CutEventArgs => Unit): Self = this.set("cut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCut: Self = this.set("cut", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ DragEventArgs => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragStart(value: /* e */ DragStartEventArgs => Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    
    @scala.inline
    def setDragStop(value: /* e */ DragStopEventArgs => Unit): Self = this.set("dragStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragStop: Self = this.set("dragStop", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ DropEventArgs => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnableResize(value: Boolean): Self = this.set("enableResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableResize: Self = this.set("enableResize", js.undefined)
    
    @scala.inline
    def setEnableThumbnailCompress(value: Boolean): Self = this.set("enableThumbnailCompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableThumbnailCompress: Self = this.set("enableThumbnailCompress", js.undefined)
    
    @scala.inline
    def setFileTypes(value: String): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileTypes: Self = this.set("fileTypes", js.undefined)
    
    @scala.inline
    def setFilterSettings(value: FilterSettings): Self = this.set("filterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterSettings: Self = this.set("filterSettings", js.undefined)
    
    @scala.inline
    def setGetImage(value: /* e */ GetImageEventArgs => Unit): Self = this.set("getImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetImage: Self = this.set("getImage", js.undefined)
    
    @scala.inline
    def setGridSettings(value: GridSettings): Self = this.set("gridSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridSettings: Self = this.set("gridSettings", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setKeydown(value: /* e */ KeydownEventArgs => Unit): Self = this.set("keydown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    
    @scala.inline
    def setLayout(value: layoutType | String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLayoutChange(value: /* e */ LayoutChangeEventArgs => Unit): Self = this.set("layoutChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLayoutChange: Self = this.set("layoutChange", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: String | Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: String | Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMenuBeforeOpen(value: /* e */ MenuBeforeOpenEventArgs => Unit): Self = this.set("menuBeforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMenuBeforeOpen: Self = this.set("menuBeforeOpen", js.undefined)
    
    @scala.inline
    def setMenuClick(value: /* e */ MenuClickEventArgs => Unit): Self = this.set("menuClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMenuClick: Self = this.set("menuClick", js.undefined)
    
    @scala.inline
    def setMenuOpen(value: /* e */ MenuOpenEventArgs => Unit): Self = this.set("menuOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMenuOpen: Self = this.set("menuOpen", js.undefined)
    
    @scala.inline
    def setMinHeight(value: String | Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: String | Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPaste(value: /* e */ PasteEventArgs => Unit): Self = this.set("paste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ RemoveEventArgs => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ ResizeEventArgs => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = this.set("resizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResizeStart: Self = this.set("resizeStart", js.undefined)
    
    @scala.inline
    def setResizeStop(value: /* e */ ResizeStopEventArgs => Unit): Self = this.set("resizeStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResizeStop: Self = this.set("resizeStop", js.undefined)
    
    @scala.inline
    def setRootFolderName(value: String): Self = this.set("rootFolderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootFolderName: Self = this.set("rootFolderName", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ SelectEventArgs => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectedFolder(value: String): Self = this.set("selectedFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedFolder: Self = this.set("selectedFolder", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: String | js.Array[_]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    
    @scala.inline
    def setShowCheckbox(value: Boolean): Self = this.set("showCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCheckbox: Self = this.set("showCheckbox", js.undefined)
    
    @scala.inline
    def setShowContextMenu(value: Boolean): Self = this.set("showContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowContextMenu: Self = this.set("showContextMenu", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
    
    @scala.inline
    def setShowNavigationPane(value: Boolean): Self = this.set("showNavigationPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNavigationPane: Self = this.set("showNavigationPane", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setShowThumbnail(value: Boolean): Self = this.set("showThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowThumbnail: Self = this.set("showThumbnail", js.undefined)
    
    @scala.inline
    def setShowToolbar(value: Boolean): Self = this.set("showToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowToolbar: Self = this.set("showToolbar", js.undefined)
    
    @scala.inline
    def setTemplateRefresh(value: /* e */ TemplateRefreshEventArgs => Unit): Self = this.set("templateRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTemplateRefresh: Self = this.set("templateRefresh", js.undefined)
    
    @scala.inline
    def setTools(value: js.Any): Self = this.set("tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
    
    @scala.inline
    def setToolsListVarargs(value: js.Any*): Self = this.set("toolsList", js.Array(value :_*))
    
    @scala.inline
    def setToolsList(value: js.Array[_]): Self = this.set("toolsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolsList: Self = this.set("toolsList", js.undefined)
    
    @scala.inline
    def setUnselect(value: /* e */ UnselectEventArgs => Unit): Self = this.set("unselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnselect: Self = this.set("unselect", js.undefined)
    
    @scala.inline
    def setUploadComplete(value: /* e */ UploadCompleteEventArgs => Unit): Self = this.set("uploadComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUploadComplete: Self = this.set("uploadComplete", js.undefined)
    
    @scala.inline
    def setUploadError(value: /* e */ UploadErrorEventArgs => Unit): Self = this.set("uploadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUploadError: Self = this.set("uploadError", js.undefined)
    
    @scala.inline
    def setUploadSettings(value: UploadSettings): Self = this.set("uploadSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadSettings: Self = this.set("uploadSettings", js.undefined)
    
    @scala.inline
    def setUploadSuccess(value: /* e */ UploadSuccessEventArgs => Unit): Self = this.set("uploadSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUploadSuccess: Self = this.set("uploadSuccess", js.undefined)
    
    @scala.inline
    def setVirtualItemCount(value: Double): Self = this.set("virtualItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualItemCount: Self = this.set("virtualItemCount", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
