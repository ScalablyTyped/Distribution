package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Sets the URL of server side AJAX handling method that handles file operation like Read, Remove, Rename, Create, Upload, Download, Copy and Move in FileExplorer.
    */
  var ajaxAction: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the data type of server side AJAX handling method.
    * @Default {json}
    */
  var ajaxDataType: js.UndefOr[java.lang.String] = js.undefined
  /** By using ajaxSettings property, you can customize the AJAX configurations. Normally you can customize the following option in AJAX handling data, URL, type, async, contentType,
    * dataType and success. For upload, download and getImage API, you can only customize URL.
    * @Default {{ read: {}, createFolder: {}, remove: {}, rename: {}, paste: {}, getDetails: {}, download: {}, upload: {}, getImage: {}, search: {}}}
    */
  var ajaxSettings: js.UndefOr[js.Any] = js.undefined
  /** The FileExplorer allows to move the files from one folder to another folder of FileExplorer by using drag and drop option. Also it supports to upload a file by dragging it from
    * windows explorer to the necessary folder of ejFileExplorer.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable keyboard support for FileExplorer actions.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** The FileExplorer allows to select multiple files by enabling the allowMultiSelection property. You can perform multi selection by pressing the Ctrl key or Shift key.
    * @Default {true}
    */
  var allowMultiSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires before the AJAX request is performed.
    */
  var beforeAjaxRequest: js.UndefOr[js.Function1[/* e */ BeforeAjaxRequestEventArgs, scala.Unit]] = js.undefined
  /** Fires before downloading the files.
    */
  var beforeDownload: js.UndefOr[js.Function1[/* e */ BeforeDownloadEventArgs, scala.Unit]] = js.undefined
  /** Fires before getting a requested image from server. Also this event will be triggered when you have enabled thumbnail image compression option in FileExplorer.Using this event,
    * you can customize the image compression size.
    */
  var beforeGetImage: js.UndefOr[js.Function1[/* e */ BeforeGetImageEventArgs, scala.Unit]] = js.undefined
  /** Fires before files or folders open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Fires before uploading the files.
    */
  var beforeUpload: js.UndefOr[js.Function1[/* e */ BeforeUploadEventArgs, scala.Unit]] = js.undefined
  /** Fires before opening the upload dialog.
    */
  var beforeUploadDialogOpen: js.UndefOr[js.Function1[/* e */ BeforeUploadDialogOpenEventArgs, scala.Unit]] = js.undefined
  /** Event is fired before the upload progress is started.
    */
  var beforeUploadSend: js.UndefOr[js.Function1[/* e */ BeforeUploadSendEventArgs, scala.Unit]] = js.undefined
  /** By using the contextMenuSettings property, you can customize the ContextMenu in the FileExplorer control.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  /** Fires when file or folder is copied successfully.
    */
  var copy: js.UndefOr[js.Function1[/* e */ CopyEventArgs, scala.Unit]] = js.undefined
  /** Fires when FileExplorer control was created
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Fires when new folder is created successfully in file system.
    */
  var createFolder: js.UndefOr[js.Function1[/* e */ CreateFolderEventArgs, scala.Unit]] = js.undefined
  /** Sets the root class for FileExplorer theme. This cssClass API allows to use custom skinning option for File Explorer control. By defining the root class by using this API, you
    * have to include this root class in CSS.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when file or folder is cut successfully.
    */
  var cut: js.UndefOr[js.Function1[/* e */ CutEventArgs, scala.Unit]] = js.undefined
  /** Fires when the FileExplorer is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Fires when the files or directory is dragging over on the FileExplorer.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, scala.Unit]] = js.undefined
  /** Fires when the files or directory has been started to drag over on the FileExplorer
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, scala.Unit]] = js.undefined
  /** Fires when the files or directory has been stopped to drag over on FileExplorer
    */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, scala.Unit]] = js.undefined
  /** Fires when the files or directory is dropped to the target folder of FileExplorer
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, scala.Unit]] = js.undefined
  /** Specify the enablePersistence to FileExplorer to save the current model value in browser cookies for state maintains.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the Right to Left alignment support in FileExplorer control.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the resize support in FileExplorer control.
    * @Default {false}
    */
  var enableResize: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the thumbnail image compression option in FileExplorer control. By enabling this option, you can reduce the thumbnail image size while loading.
    * @Default {false}
    */
  var enableThumbnailCompress: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows specified type of files only to display in FileExplorer control.
    * @Default {* . *}
    */
  var fileTypes: js.UndefOr[java.lang.String] = js.undefined
  /** By using filterSettings property, you can customize the search functionality of the search bar in FileExplorer control.
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.undefined
  /** Fires after loading the requested image from server. Using this event, you can get the details of loaded image.
    */
  var getImage: js.UndefOr[js.Function1[/* e */ GetImageEventArgs, scala.Unit]] = js.undefined
  /** By using the gridSettings property, you can customize the grid behavior in the FileExplorer control.
    */
  var gridSettings: js.UndefOr[GridSettings] = js.undefined
  /** Specifies the height of FileExplorer control.
    * @Default {400}
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Enables or disables the responsive support for FileExplorer control during the window resizing time.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when keydown in FileExplorer control.
    */
  var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, scala.Unit]] = js.undefined
  /** Sets the file view type. There are three view types available such as Grid, Tile and Large icons. See layoutType.
    * @Default {ej.FileExplorer.layoutType.Grid}
    */
  var layout: js.UndefOr[layoutType | java.lang.String] = js.undefined
  /** Fires when the file view type is changed.
    */
  var layoutChange: js.UndefOr[js.Function1[/* e */ LayoutChangeEventArgs, scala.Unit]] = js.undefined
  /** Sets the culture in FileExplorer.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the maximum height of FileExplorer control.
    * @Default {null}
    */
  var maxHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the maximum width of FileExplorer control.
    * @Default {null}
    */
  var maxWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Fires when before the ContextMenu opening.
    */
  var menuBeforeOpen: js.UndefOr[js.Function1[/* e */ MenuBeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Fires when click the ContextMenu item.
    */
  var menuClick: js.UndefOr[js.Function1[/* e */ MenuClickEventArgs, scala.Unit]] = js.undefined
  /** Fires when ContextMenu is successfully opened.
    */
  var menuOpen: js.UndefOr[js.Function1[/* e */ MenuOpenEventArgs, scala.Unit]] = js.undefined
  /** Sets the minimum height of FileExplorer control.
    * @Default {250px}
    */
  var minHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Sets the minimum width of FileExplorer control.
    * @Default {400px}
    */
  var minWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Fires when files are successfully opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Fires when a file or folder is pasted successfully.
    */
  var paste: js.UndefOr[js.Function1[/* e */ PasteEventArgs, scala.Unit]] = js.undefined
  /** The property path denotes the filesystem path that are to be explored. The path for the filesystem can be physical path or relative path, but it has to be relevant to where the
    * Web API is hosted.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when file or folder is deleted successfully.
    */
  var remove: js.UndefOr[js.Function1[/* e */ RemoveEventArgs, scala.Unit]] = js.undefined
  /** Fires when resizing is performed for FileExplorer.
    */
  var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, scala.Unit]] = js.undefined
  /** Fires when resizing is started for FileExplorer.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, scala.Unit]] = js.undefined
  /** Fires this event when the resizing is stopped for FileExplorer.
    */
  var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, scala.Unit]] = js.undefined
  /** Sets the alias name of root folder name in FileExplorer. It is used to replace the actual root folder name in FileExplorer.
    */
  var rootFolderName: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when the items from grid view or tile view of FileExplorer control is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, scala.Unit]] = js.undefined
  /** The selectedFolder is used to select the specified folder of FileExplorer control.
    */
  var selectedFolder: js.UndefOr[java.lang.String] = js.undefined
  /** The selectedItems is used to select the specified items (file, folder) of FileExplorer control.
    */
  var selectedItems: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
  /** Enables or disables the checkbox option in FileExplorer control.
    * @Default {true}
    */
  var showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the context menu option in FileExplorer control.
    * @Default {true}
    */
  var showContextMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the footer in FileExplorer control. The footer element displays the details of the current selected files and folders. And also the footer having the switcher
    * to change the layout view.
    * @Default {true}
    */
  var showFooter: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the navigation pane in FileExplorer control. The navigation pane contains a tree view element that displays all the folders from the filesystem in a
    * hierarchical manner. This is useful to a quick navigation of any folder in the filesystem.
    * @Default {true}
    */
  var showNavigationPane: js.UndefOr[scala.Boolean] = js.undefined
  /** FileExplorer control is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** FileExplorer control is rendered with thumbnail preview of images in Tile and LargeIcons layout when this property set to true.
    * @Default {true}
    */
  var showThumbnail: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows or disables the toolbar in FileExplorer control.
    * @Default {true}
    */
  var showToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered when refresh the template column elements in the grid view of FileExplorer control.
    */
  var templateRefresh: js.UndefOr[js.Function1[/* e */ TemplateRefreshEventArgs, scala.Unit]] = js.undefined
  /** The tools property is used to configure and group required toolbar items in FileExplorer control.
    * @Default {{ creation: [NewFolder], navigation: [Back, Forward, Upward], addressBar: [Addressbar], editing: [Refresh, Upload, Delete, Rename, Download], copyPaste: [Cut, Copy,
    * Paste], getProperties: [Details], searchBar: [Searchbar], layout: [Layout], sortBy: [SortBy]}}
    */
  var tools: js.UndefOr[js.Any] = js.undefined
  /** The toolsList property is used to arrange the toolbar items in the FileExplorer control.
    * @Default {[layout, creation, navigation, addressBar, editing, copyPaste, sortBy, getProperties, searchBar]}
    */
  var toolsList: js.UndefOr[js.Array[_]] = js.undefined
  /** Fires when the items from grid view or tile view or large icons view of FileExplorer control is unselected.
    */
  var unselect: js.UndefOr[js.Function1[/* e */ UnselectEventArgs, scala.Unit]] = js.undefined
  /** Event is fired when the file upload progress gets completed.
    */
  var uploadComplete: js.UndefOr[js.Function1[/* e */ UploadCompleteEventArgs, scala.Unit]] = js.undefined
  /** Event is fired when the file upload fails due to some error.
    */
  var uploadError: js.UndefOr[js.Function1[/* e */ UploadErrorEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to customize the upload behavior in the FileExplorer.
    */
  var uploadSettings: js.UndefOr[UploadSettings] = js.undefined
  /** Event is fired when the file upload progress gets succeeded.
    */
  var uploadSuccess: js.UndefOr[js.Function1[/* e */ UploadSuccessEventArgs, scala.Unit]] = js.undefined
  /** Specifies the virtual item count for virtual support.
    * @Default {0}
    */
  var virtualItemCount: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the width of FileExplorer control.
    * @Default {850}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    ajaxAction: java.lang.String = null,
    ajaxDataType: java.lang.String = null,
    ajaxSettings: js.Any = null,
    allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    allowMultiSelection: js.UndefOr[scala.Boolean] = js.undefined,
    beforeAjaxRequest: js.Function1[/* e */ BeforeAjaxRequestEventArgs, scala.Unit] = null,
    beforeDownload: js.Function1[/* e */ BeforeDownloadEventArgs, scala.Unit] = null,
    beforeGetImage: js.Function1[/* e */ BeforeGetImageEventArgs, scala.Unit] = null,
    beforeOpen: js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit] = null,
    beforeUpload: js.Function1[/* e */ BeforeUploadEventArgs, scala.Unit] = null,
    beforeUploadDialogOpen: js.Function1[/* e */ BeforeUploadDialogOpenEventArgs, scala.Unit] = null,
    beforeUploadSend: js.Function1[/* e */ BeforeUploadSendEventArgs, scala.Unit] = null,
    contextMenuSettings: ContextMenuSettings = null,
    copy: js.Function1[/* e */ CopyEventArgs, scala.Unit] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    createFolder: js.Function1[/* e */ CreateFolderEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    cut: js.Function1[/* e */ CutEventArgs, scala.Unit] = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    drag: js.Function1[/* e */ DragEventArgs, scala.Unit] = null,
    dragStart: js.Function1[/* e */ DragStartEventArgs, scala.Unit] = null,
    dragStop: js.Function1[/* e */ DragStopEventArgs, scala.Unit] = null,
    drop: js.Function1[/* e */ DropEventArgs, scala.Unit] = null,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableResize: js.UndefOr[scala.Boolean] = js.undefined,
    enableThumbnailCompress: js.UndefOr[scala.Boolean] = js.undefined,
    fileTypes: java.lang.String = null,
    filterSettings: FilterSettings = null,
    getImage: js.Function1[/* e */ GetImageEventArgs, scala.Unit] = null,
    gridSettings: GridSettings = null,
    height: java.lang.String | scala.Double = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    keydown: js.Function1[/* e */ KeydownEventArgs, scala.Unit] = null,
    layout: layoutType | java.lang.String = null,
    layoutChange: js.Function1[/* e */ LayoutChangeEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    maxHeight: java.lang.String | scala.Double = null,
    maxWidth: java.lang.String | scala.Double = null,
    menuBeforeOpen: js.Function1[/* e */ MenuBeforeOpenEventArgs, scala.Unit] = null,
    menuClick: js.Function1[/* e */ MenuClickEventArgs, scala.Unit] = null,
    menuOpen: js.Function1[/* e */ MenuOpenEventArgs, scala.Unit] = null,
    minHeight: java.lang.String | scala.Double = null,
    minWidth: java.lang.String | scala.Double = null,
    open: js.Function1[/* e */ OpenEventArgs, scala.Unit] = null,
    paste: js.Function1[/* e */ PasteEventArgs, scala.Unit] = null,
    path: java.lang.String = null,
    remove: js.Function1[/* e */ RemoveEventArgs, scala.Unit] = null,
    resize: js.Function1[/* e */ ResizeEventArgs, scala.Unit] = null,
    resizeStart: js.Function1[/* e */ ResizeStartEventArgs, scala.Unit] = null,
    resizeStop: js.Function1[/* e */ ResizeStopEventArgs, scala.Unit] = null,
    rootFolderName: java.lang.String = null,
    select: js.Function1[/* e */ SelectEventArgs, scala.Unit] = null,
    selectedFolder: java.lang.String = null,
    selectedItems: java.lang.String | js.Array[_] = null,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    showContextMenu: js.UndefOr[scala.Boolean] = js.undefined,
    showFooter: js.UndefOr[scala.Boolean] = js.undefined,
    showNavigationPane: js.UndefOr[scala.Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    showThumbnail: js.UndefOr[scala.Boolean] = js.undefined,
    showToolbar: js.UndefOr[scala.Boolean] = js.undefined,
    templateRefresh: js.Function1[/* e */ TemplateRefreshEventArgs, scala.Unit] = null,
    tools: js.Any = null,
    toolsList: js.Array[_] = null,
    unselect: js.Function1[/* e */ UnselectEventArgs, scala.Unit] = null,
    uploadComplete: js.Function1[/* e */ UploadCompleteEventArgs, scala.Unit] = null,
    uploadError: js.Function1[/* e */ UploadErrorEventArgs, scala.Unit] = null,
    uploadSettings: UploadSettings = null,
    uploadSuccess: js.Function1[/* e */ UploadSuccessEventArgs, scala.Unit] = null,
    virtualItemCount: scala.Int | scala.Double = null,
    width: java.lang.String | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (ajaxAction != null) __obj.updateDynamic("ajaxAction")(ajaxAction)
    if (ajaxDataType != null) __obj.updateDynamic("ajaxDataType")(ajaxDataType)
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings)
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop)
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (!js.isUndefined(allowMultiSelection)) __obj.updateDynamic("allowMultiSelection")(allowMultiSelection)
    if (beforeAjaxRequest != null) __obj.updateDynamic("beforeAjaxRequest")(beforeAjaxRequest)
    if (beforeDownload != null) __obj.updateDynamic("beforeDownload")(beforeDownload)
    if (beforeGetImage != null) __obj.updateDynamic("beforeGetImage")(beforeGetImage)
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen)
    if (beforeUpload != null) __obj.updateDynamic("beforeUpload")(beforeUpload)
    if (beforeUploadDialogOpen != null) __obj.updateDynamic("beforeUploadDialogOpen")(beforeUploadDialogOpen)
    if (beforeUploadSend != null) __obj.updateDynamic("beforeUploadSend")(beforeUploadSend)
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings)
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (create != null) __obj.updateDynamic("create")(create)
    if (createFolder != null) __obj.updateDynamic("createFolder")(createFolder)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (cut != null) __obj.updateDynamic("cut")(cut)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    if (dragStop != null) __obj.updateDynamic("dragStop")(dragStop)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize)
    if (!js.isUndefined(enableThumbnailCompress)) __obj.updateDynamic("enableThumbnailCompress")(enableThumbnailCompress)
    if (fileTypes != null) __obj.updateDynamic("fileTypes")(fileTypes)
    if (filterSettings != null) __obj.updateDynamic("filterSettings")(filterSettings)
    if (getImage != null) __obj.updateDynamic("getImage")(getImage)
    if (gridSettings != null) __obj.updateDynamic("gridSettings")(gridSettings)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (keydown != null) __obj.updateDynamic("keydown")(keydown)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutChange != null) __obj.updateDynamic("layoutChange")(layoutChange)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (menuBeforeOpen != null) __obj.updateDynamic("menuBeforeOpen")(menuBeforeOpen)
    if (menuClick != null) __obj.updateDynamic("menuClick")(menuClick)
    if (menuOpen != null) __obj.updateDynamic("menuOpen")(menuOpen)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open)
    if (paste != null) __obj.updateDynamic("paste")(paste)
    if (path != null) __obj.updateDynamic("path")(path)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(resizeStart)
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(resizeStop)
    if (rootFolderName != null) __obj.updateDynamic("rootFolderName")(rootFolderName)
    if (select != null) __obj.updateDynamic("select")(select)
    if (selectedFolder != null) __obj.updateDynamic("selectedFolder")(selectedFolder)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    if (!js.isUndefined(showContextMenu)) __obj.updateDynamic("showContextMenu")(showContextMenu)
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter)
    if (!js.isUndefined(showNavigationPane)) __obj.updateDynamic("showNavigationPane")(showNavigationPane)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (!js.isUndefined(showThumbnail)) __obj.updateDynamic("showThumbnail")(showThumbnail)
    if (!js.isUndefined(showToolbar)) __obj.updateDynamic("showToolbar")(showToolbar)
    if (templateRefresh != null) __obj.updateDynamic("templateRefresh")(templateRefresh)
    if (tools != null) __obj.updateDynamic("tools")(tools)
    if (toolsList != null) __obj.updateDynamic("toolsList")(toolsList)
    if (unselect != null) __obj.updateDynamic("unselect")(unselect)
    if (uploadComplete != null) __obj.updateDynamic("uploadComplete")(uploadComplete)
    if (uploadError != null) __obj.updateDynamic("uploadError")(uploadError)
    if (uploadSettings != null) __obj.updateDynamic("uploadSettings")(uploadSettings)
    if (uploadSuccess != null) __obj.updateDynamic("uploadSuccess")(uploadSuccess)
    if (virtualItemCount != null) __obj.updateDynamic("virtualItemCount")(virtualItemCount.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

