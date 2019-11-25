package typings.ejDotWebDotAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
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
  var ajaxSettings: js.UndefOr[js.Any] = js.undefined
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
  var selectedItems: js.UndefOr[String | js.Array[_]] = js.undefined
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
  var tools: js.UndefOr[js.Any] = js.undefined
  /** The toolsList property is used to arrange the toolbar items in the FileExplorer control.
    * @Default {[layout, creation, navigation, addressBar, editing, copyPaste, sortBy, getProperties, searchBar]}
    */
  var toolsList: js.UndefOr[js.Array[_]] = js.undefined
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
  @scala.inline
  def apply(
    ajaxAction: String = null,
    ajaxDataType: String = null,
    ajaxSettings: js.Any = null,
    allowDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    allowMultiSelection: js.UndefOr[Boolean] = js.undefined,
    beforeAjaxRequest: /* e */ BeforeAjaxRequestEventArgs => Unit = null,
    beforeDownload: /* e */ BeforeDownloadEventArgs => Unit = null,
    beforeGetImage: /* e */ BeforeGetImageEventArgs => Unit = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => Unit = null,
    beforeUpload: /* e */ BeforeUploadEventArgs => Unit = null,
    beforeUploadDialogOpen: /* e */ BeforeUploadDialogOpenEventArgs => Unit = null,
    beforeUploadSend: /* e */ BeforeUploadSendEventArgs => Unit = null,
    contextMenuSettings: ContextMenuSettings = null,
    copy: /* e */ CopyEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    createFolder: /* e */ CreateFolderEventArgs => Unit = null,
    cssClass: String = null,
    cut: /* e */ CutEventArgs => Unit = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    drag: /* e */ DragEventArgs => Unit = null,
    dragStart: /* e */ DragStartEventArgs => Unit = null,
    dragStop: /* e */ DragStopEventArgs => Unit = null,
    drop: /* e */ DropEventArgs => Unit = null,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableResize: js.UndefOr[Boolean] = js.undefined,
    enableThumbnailCompress: js.UndefOr[Boolean] = js.undefined,
    fileTypes: String = null,
    filterSettings: FilterSettings = null,
    getImage: /* e */ GetImageEventArgs => Unit = null,
    gridSettings: GridSettings = null,
    height: String | Double = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    keydown: /* e */ KeydownEventArgs => Unit = null,
    layout: layoutType | String = null,
    layoutChange: /* e */ LayoutChangeEventArgs => Unit = null,
    locale: String = null,
    maxHeight: String | Double = null,
    maxWidth: String | Double = null,
    menuBeforeOpen: /* e */ MenuBeforeOpenEventArgs => Unit = null,
    menuClick: /* e */ MenuClickEventArgs => Unit = null,
    menuOpen: /* e */ MenuOpenEventArgs => Unit = null,
    minHeight: String | Double = null,
    minWidth: String | Double = null,
    open: /* e */ OpenEventArgs => Unit = null,
    paste: /* e */ PasteEventArgs => Unit = null,
    path: String = null,
    remove: /* e */ RemoveEventArgs => Unit = null,
    resize: /* e */ ResizeEventArgs => Unit = null,
    resizeStart: /* e */ ResizeStartEventArgs => Unit = null,
    resizeStop: /* e */ ResizeStopEventArgs => Unit = null,
    rootFolderName: String = null,
    select: /* e */ SelectEventArgs => Unit = null,
    selectedFolder: String = null,
    selectedItems: String | js.Array[_] = null,
    showCheckbox: js.UndefOr[Boolean] = js.undefined,
    showContextMenu: js.UndefOr[Boolean] = js.undefined,
    showFooter: js.UndefOr[Boolean] = js.undefined,
    showNavigationPane: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    showThumbnail: js.UndefOr[Boolean] = js.undefined,
    showToolbar: js.UndefOr[Boolean] = js.undefined,
    templateRefresh: /* e */ TemplateRefreshEventArgs => Unit = null,
    tools: js.Any = null,
    toolsList: js.Array[_] = null,
    unselect: /* e */ UnselectEventArgs => Unit = null,
    uploadComplete: /* e */ UploadCompleteEventArgs => Unit = null,
    uploadError: /* e */ UploadErrorEventArgs => Unit = null,
    uploadSettings: UploadSettings = null,
    uploadSuccess: /* e */ UploadSuccessEventArgs => Unit = null,
    virtualItemCount: Int | Double = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (ajaxAction != null) __obj.updateDynamic("ajaxAction")(ajaxAction.asInstanceOf[js.Any])
    if (ajaxDataType != null) __obj.updateDynamic("ajaxDataType")(ajaxDataType.asInstanceOf[js.Any])
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiSelection)) __obj.updateDynamic("allowMultiSelection")(allowMultiSelection.asInstanceOf[js.Any])
    if (beforeAjaxRequest != null) __obj.updateDynamic("beforeAjaxRequest")(js.Any.fromFunction1(beforeAjaxRequest))
    if (beforeDownload != null) __obj.updateDynamic("beforeDownload")(js.Any.fromFunction1(beforeDownload))
    if (beforeGetImage != null) __obj.updateDynamic("beforeGetImage")(js.Any.fromFunction1(beforeGetImage))
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1(beforeOpen))
    if (beforeUpload != null) __obj.updateDynamic("beforeUpload")(js.Any.fromFunction1(beforeUpload))
    if (beforeUploadDialogOpen != null) __obj.updateDynamic("beforeUploadDialogOpen")(js.Any.fromFunction1(beforeUploadDialogOpen))
    if (beforeUploadSend != null) __obj.updateDynamic("beforeUploadSend")(js.Any.fromFunction1(beforeUploadSend))
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction1(copy))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (createFolder != null) __obj.updateDynamic("createFolder")(js.Any.fromFunction1(createFolder))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (cut != null) __obj.updateDynamic("cut")(js.Any.fromFunction1(cut))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1(dragStart))
    if (dragStop != null) __obj.updateDynamic("dragStop")(js.Any.fromFunction1(dragStop))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1(drop))
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableThumbnailCompress)) __obj.updateDynamic("enableThumbnailCompress")(enableThumbnailCompress.asInstanceOf[js.Any])
    if (fileTypes != null) __obj.updateDynamic("fileTypes")(fileTypes.asInstanceOf[js.Any])
    if (filterSettings != null) __obj.updateDynamic("filterSettings")(filterSettings.asInstanceOf[js.Any])
    if (getImage != null) __obj.updateDynamic("getImage")(js.Any.fromFunction1(getImage))
    if (gridSettings != null) __obj.updateDynamic("gridSettings")(gridSettings.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction1(keydown))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutChange != null) __obj.updateDynamic("layoutChange")(js.Any.fromFunction1(layoutChange))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (menuBeforeOpen != null) __obj.updateDynamic("menuBeforeOpen")(js.Any.fromFunction1(menuBeforeOpen))
    if (menuClick != null) __obj.updateDynamic("menuClick")(js.Any.fromFunction1(menuClick))
    if (menuOpen != null) __obj.updateDynamic("menuOpen")(js.Any.fromFunction1(menuOpen))
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1(paste))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction1(resizeStart))
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(js.Any.fromFunction1(resizeStop))
    if (rootFolderName != null) __obj.updateDynamic("rootFolderName")(rootFolderName.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectedFolder != null) __obj.updateDynamic("selectedFolder")(selectedFolder.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(showContextMenu)) __obj.updateDynamic("showContextMenu")(showContextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigationPane)) __obj.updateDynamic("showNavigationPane")(showNavigationPane.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (!js.isUndefined(showThumbnail)) __obj.updateDynamic("showThumbnail")(showThumbnail.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolbar)) __obj.updateDynamic("showToolbar")(showToolbar.asInstanceOf[js.Any])
    if (templateRefresh != null) __obj.updateDynamic("templateRefresh")(js.Any.fromFunction1(templateRefresh))
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    if (toolsList != null) __obj.updateDynamic("toolsList")(toolsList.asInstanceOf[js.Any])
    if (unselect != null) __obj.updateDynamic("unselect")(js.Any.fromFunction1(unselect))
    if (uploadComplete != null) __obj.updateDynamic("uploadComplete")(js.Any.fromFunction1(uploadComplete))
    if (uploadError != null) __obj.updateDynamic("uploadError")(js.Any.fromFunction1(uploadError))
    if (uploadSettings != null) __obj.updateDynamic("uploadSettings")(uploadSettings.asInstanceOf[js.Any])
    if (uploadSuccess != null) __obj.updateDynamic("uploadSuccess")(js.Any.fromFunction1(uploadSuccess))
    if (virtualItemCount != null) __obj.updateDynamic("virtualItemCount")(virtualItemCount.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

