package typings.dojo.dojox.form

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.activeClass
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.deferredUploading
import typings.dojo.dojoStrings.devMode
import typings.dojo.dojoStrings.disabledClass
import typings.dojo.dojoStrings.fileListId
import typings.dojo.dojoStrings.fileMask
import typings.dojo.dojoStrings.flashFieldName
import typings.dojo.dojoStrings.flashMovie
import typings.dojo.dojoStrings.flashObject
import typings.dojo.dojoStrings.force
import typings.dojo.dojoStrings.hoverClass
import typings.dojo.dojoStrings.htmlFieldName
import typings.dojo.dojoStrings.insideNode
import typings.dojo.dojoStrings.isDebug
import typings.dojo.dojoStrings.minFlashVersion
import typings.dojo.dojoStrings.progressBackgroundColor
import typings.dojo.dojoStrings.progressBackgroundUrl
import typings.dojo.dojoStrings.progressMessage
import typings.dojo.dojoStrings.progressWidgetId
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.selectMultipleFiles
import typings.dojo.dojoStrings.serverTimeout
import typings.dojo.dojoStrings.showProgress
import typings.dojo.dojoStrings.skipServerCheck
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.swfPath
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.uploadOnChange
import typings.dojo.dojoStrings.uploadUrl
import typings.dojo.dojoStrings.uploaderType
import typings.dojo.dojoStrings.version
import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/FileUploader.html
  *
  * Handles File Uploading to a server (PHP script included for testing)
  *
  * FileUploader is now a WIDGET. You do not have to pass a button
  * in. Passing a button is still supported until version 1.5 to maintain
  * backwards compatibility, but it is not recommended. Just create your
  * uploader like any other widget.
  * If the correct version of Flash Player is available (> 9.0) , a SWF
  * is used. If Flash Player is not installed or is outdated, a typical
  * html fileInput is used. This process can be overridden with
  * force:"flash" or force:"html".
  *
  * FileUploader works with Flash 10.
  *
  * The button styles are now recreated in Flash, so there is no longer
  * using an invisible Flash movie with wmode=transparent. This way the Flash button
  * is actually placed inline with the DOM, not floating above it and constantly
  * resetting its position. The "Windows Firefox clickable bug" should be fixed (and
  * hopefully some Linux problems).
  *
  * The HTML button is created in a new way and it is now inline as is the
  * FLash button. Styling is much easier and more versatile.
  *
  * Dependencies
  * FileUploader no longer uses FileInput.css. It now uses FileUploader.css
  * See requires for JavaScript dependencies.
  *
  * NEW FEATURES
  * There are a ton of features and fixes in this version:
  *
  * Disabled: Can be toggled with widget.set("disabled", true|false)
  * Submit: A convenience method has been added for if the uploader is in a form.
  *   Instead of submitting the form, call uploader.submit(theForm), and the
  *   Uploader will handle all of the form values and post the data.
  * Selected List: If passing the ID of a container, the Uploaders will populate it
  *   with the selected files.
  * Deleting Files: You can now delete pending files.
  * Progress Built in: showProgress:true will change the button to a progress
  *   bar on upload.
  * Progress Attach: Passing progressWidgetId will tell the Uploader of a progress
  *   widget. If the Progress widget is initially hidden, it will change to
  *   visible and then restored after upload.
  * A11Y: The Flash button can be accessed with the TAB key. (The HTML cannot due
  *   to browser limitations)
  * Deferred Uploading: (Flash only) throttles the upload to one file at a time
  * CDN USERS
  * FileUpload now works with the CDN but with limitations. The SWF must
  * be from the same domain as the HTML page. 'swfPath' has been exposed
  * so that you may link to that file (could of course be the same SWF in
  * dojox resource folder). The SWF will NOT work from the
  * CDN server. This would require a special XML file that would allow
  * access to your server, and the logistics to that is impossible.
  *
  * LIMITATIONS
  * This is not designed to be a part of a form, it contains its own. (See submit())
  * Currently does not in a Dialog box or a Tab where it is not initially visible,
  * The default style inherits font sizes - but a parent container should have a font size
  *   set somewhere of the results could be inconsistent.
  * OPERA USERS
  * It works better than the 1.3 version. fileInputs apperantly can't have opacity
  * set to zero. The Flash uploader works but files are auto-uploaded. Must be a
  * flashVar problem.
  *
  * Safari Bug note:
  * The bug is in the way Safari handles the connection:
  * https://bugs.webkit.org/show_bug.cgi?id=5760
  * I added this to the virtual host in the Apache conf file, and now it
  * works like a charm:
  *
  * BrowserMatch Safari nokeepalive
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.form.FileUploader")
@js.native
class FileUploader () extends _Widget {
  /**
    * The name of the class that will style the button in a "press" state. A specific
    * class should be made to do this. Do not rely on a target like button:active{...}
    *
    */
  var activeClass: String = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * (Flash only) throttles the upload to a certain amount of files at a time.
    * By default, Flash uploads file one at a time to the server, but in parallel.
    * Firefox will try to queue all files at once, leading to problems. Set this
    * to the amount to upload in parallel at a time.
    * Generally, 1 should work fine, but you can experiment with queuing more than
    * one at a time.
    * This is of course ignored if selectMultipleFiles equals false.
    *
    */
  var deferredUploading: Double = js.native
  /**
    * Re-implemented. devMode increases the logging, adding style tracing from the SWF.
    *
    */
  var devMode: Boolean = js.native
  /**
    * The name of the class that will style the button when its disabled.
    *
    */
  var disabledClass: String = js.native
  /**
    * The id of a dom node to be used as a container for the pending file list.
    *
    */
  var fileListId: String = js.native
  /**
    * (an array, or an array of arrays)
    * Restrict file selection to certain file types
    * Empty array defaults to "All Files"
    *
    * example:
    *
    * fileMask = ["Images", "*.jpg;*.jpeg;*.gif;*.png"]
    * or
    *
    * fileMask = [
    *     ["Jpeg File",   "*.jpg;*.jpeg"],
    *     ["GIF File",    "*.gif"],
    *     ["PNG File",    "*.png"],
    *     ["All Images",  "*.jpg;*.jpeg;*.gif;*.png"],
    * ]
    * NOTE: MacType is not supported, as it does not work very well.
    * fileMask will work on a Mac, but differently than
    * Windows.
    *
    */
  var fileMask: js.Object = js.native
  /**
    * The name of the field of the flash uploaded files that the server is expecting
    *
    */
  var flashFieldName: String = js.native
  /**
    * The SWF. Mostly Internal.
    *
    */
  var flashMovie: js.Function = js.native
  /**
    * The object that creates the SWF embed object. Mostly Internal.
    *
    */
  var flashObject: js.Object = js.native
  /**
    * Use "flash" to always use Flash (and hopefully force the user to download the plugin
    * if they don't have it). Use "html" to always use the HTML uploader. An empty string
    * (default) will check for the right version of Flash and use HTML if not available.
    *
    */
  var force: String = js.native
  /**
    * The name of the class that will style the button in a "hover" state. A specific
    * class should be made to do this. Do not rely on a target like button:hover{...}
    *
    */
  var hoverClass: String = js.native
  /**
    * The name of the field of the fileInput that the server is expecting
    *
    */
  var htmlFieldName: String = js.native
  /**
    * The div that holds the SWF and form/fileInput
    *
    */
  var insideNode: js.Object = js.native
  /**
    * If true, outputs traces from the SWF to console. What exactly gets passed
    * is very relative, and depends upon what traces have been left in the DEFT SWF.
    *
    */
  var isDebug: Boolean = js.native
  /**
    * The minimum of version of Flash player to target. 0 would always install Flash, 100
    * would never install it. The Flash Player has supported multiple uploads since
    * version 8, so it could go as low as that safely.
    *
    */
  var minFlashVersion: Double = js.native
  /**
    * The background color to use for the button-progress
    *
    */
  var progressBackgroundColor: String = js.native
  /**
    * The background image to use for the button-progress
    *
    */
  var progressBackgroundUrl: String = js.native
  /**
    * The message shown while the button is changed to a progress bar
    *
    */
  var progressMessage: String = js.native
  /**
    * The widget id of a Dijit Progress bar. The Uploader will bind to it and update it
    * automatically.
    *
    */
  var progressWidgetId: String = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * If true and flash mode, multiple files may be selected from the dialog.
    * If html mode, files are not uploaded until upload() is called. The references
    * to each file is incremented:uploadedfile0, uploadedfile1, uploadedfile2... etc.
    *
    */
  var selectMultipleFiles: Boolean = js.native
  /**
    * The amount of time given to the uploaded file
    * to wait for a server response. After this amount
    * of time, the onComplete is fired but with a 'server timeout'
    * error in the returned item.
    *
    */
  var serverTimeout: Double = js.native
  /**
    * If true, the button changes to a progress bar during upload.
    *
    */
  var showProgress: Boolean = js.native
  /**
    * If true, will not verify that the server was sent the correct format.
    * This can be safely set to true. The purpose of the server side check
    * is mainly to show the dev if they've implemented the different returns
    * correctly.
    *
    */
  var skipServerCheck: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_FileUploader: String = js.native
  /**
    *
    */
  var swfPath: js.Object = js.native
  /**
    * The tab order in the DOM. Only supported by Flash. HTML Uploaders have security
    * protection to prevent you from tabbing to the uploader. Stupid.
    *
    */
  var tabIndex: Double = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    *
    */
  var templatePath: String = js.native
  /**
    *
    */
  var templateString: String = js.native
  /**
    * If true, uploads immediately after a file has been selected. If false,
    * waits for upload() to be called.
    *
    */
  var uploadOnChange: Boolean = js.native
  /**
    * The url targeted for upload. An absolute URL is preferred. Relative URLs are
    * changed to absolute.
    *
    */
  var uploadUrl: String = js.native
  /**
    * Internal. What type of uploader is being used: "flash" or "html"
    *
    */
  var uploaderType: String = js.native
  /**
    * 1.5 (deprecated)
    *
    */
  var version: js.Object = js.native
  /**
    * Internal. Creates Flash Uploader
    *
    */
  def createFlashUploader(): Unit = js.native
  /**
    * Internal. Fires of methods to build HTML Uploader.
    *
    */
  def createHtmlUploader(): Unit = js.native
  /**
    * Internal.
    * Get necessary style information from srcRefNode and
    * assigned styles
    *
    */
  def getButtonStyle(): Unit = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    * 
    * @param templateString The template             
    * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
    * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
    */
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
  /**
    * Internal.
    * If a parent node is styled as display:none,
    * returns that node. This node will be temporarilly
    * changed to display:block. Note if the node is in
    * a widget that has an onShow event, this is
    * overridden.
    *
    * @param node
    */
  def getHiddenNode(node: HTMLElement): js.Any = js.native
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    *
    */
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    * 
    */
  def getIndexInParent(): js.Any = js.native
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    *
    */
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    * 
    */
  def getNextSibling(): js.Any = js.native
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    *
    */
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    * 
    */
  def getPreviousSibling(): js.Any = js.native
  /**
    *
    * @param node
    */
  def getStyle(node: js.Any): js.Object = js.native
  /**
    *
    * @param node
    * @param _class
    * @param isDijitButton
    */
  def getTempNodeStyle(node: js.Any, _class: js.Any, isDijitButton: js.Any): js.Any = js.native
  /**
    *
    * @param node
    */
  def getText(node: js.Any): js.Any = js.native
  /**
    *
    * @param node
    */
  def getTextStyle(node: js.Any): js.Object = js.native
  @JSName("get")
  def get_activeClass(property: activeClass): String = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_deferredUploading(property: deferredUploading): Double = js.native
  @JSName("get")
  def get_devMode(property: devMode): Boolean = js.native
  @JSName("get")
  def get_disabledClass(property: disabledClass): String = js.native
  @JSName("get")
  def get_fileListId(property: fileListId): String = js.native
  @JSName("get")
  def get_fileMask(property: fileMask): js.Object = js.native
  @JSName("get")
  def get_flashFieldName(property: flashFieldName): String = js.native
  @JSName("get")
  def get_flashMovie(property: flashMovie): js.Function = js.native
  @JSName("get")
  def get_flashObject(property: flashObject): js.Object = js.native
  @JSName("get")
  def get_force(property: force): String = js.native
  @JSName("get")
  def get_hoverClass(property: hoverClass): String = js.native
  @JSName("get")
  def get_htmlFieldName(property: htmlFieldName): String = js.native
  @JSName("get")
  def get_insideNode(property: insideNode): js.Object = js.native
  @JSName("get")
  def get_isDebug(property: isDebug): Boolean = js.native
  @JSName("get")
  def get_minFlashVersion(property: minFlashVersion): Double = js.native
  @JSName("get")
  def get_progressBackgroundColor(property: progressBackgroundColor): String = js.native
  @JSName("get")
  def get_progressBackgroundUrl(property: progressBackgroundUrl): String = js.native
  @JSName("get")
  def get_progressMessage(property: progressMessage): String = js.native
  @JSName("get")
  def get_progressWidgetId(property: progressWidgetId): String = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_selectMultipleFiles(property: selectMultipleFiles): Boolean = js.native
  @JSName("get")
  def get_serverTimeout(property: serverTimeout): Double = js.native
  @JSName("get")
  def get_showProgress(property: showProgress): Boolean = js.native
  @JSName("get")
  def get_skipServerCheck(property: skipServerCheck): Boolean = js.native
  @JSName("get")
  def get_swfPath(property: swfPath): js.Object = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): Double = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_uploadOnChange(property: uploadOnChange): Boolean = js.native
  @JSName("get")
  def get_uploadUrl(property: uploadUrl): String = js.native
  @JSName("get")
  def get_uploaderType(property: uploaderType): String = js.native
  @JSName("get")
  def get_version(property: version): js.Object = js.native
  /**
    *
    * @param node
    */
  def isButton(node: js.Any): Boolean = js.native
  /**
    * Due to the excessive logging necessary to make this code happen,
    * It's easier to turn it on and off here in one place.
    * Also helpful if there are multiple uploaders on one page.
    *
    */
  def log(): Unit = js.native
  /**
    * Stub to connect
    * Fires when dialog box has been closed
    * without a file selection
    *
    */
  def onCancel(): Unit = js.native
  /**
    * stub to connect
    * Fires when files are selected
    * Event is an array of last files selected
    *
    * @param dataArray
    */
  def onChange(dataArray: js.Any): Unit = js.native
  /**
    * stub to connect
    * Fires when all files have uploaded
    * Event is an array of all files
    *
    * @param dataArray
    */
  def onComplete(dataArray: js.Any): Unit = js.native
  /**
    * Fires on errors
    *
    * @param evtObject
    */
  def onError(evtObject: String): Unit = js.native
  /**
    * Fires on errors
    *
    * @param evtObject
    */
  def onError(evtObject: js.Object): Unit = js.native
  /**
    * Stub - SWF has been downloaded 100%.
    *
    * @param uploader
    */
  def onLoad(uploader: FileUploader): Unit = js.native
  /**
    * Stub to connect
    * Fires as progress returns from SWF
    * Event is an array of all files uploading
    * Can be connected to for HTML uploader,
    * but will not return anything.
    *
    * @param dataArray
    */
  def onProgress(dataArray: js.Any): Unit = js.native
  /**
    * Stub - Fired when embedFlash has created the
    * Flash object, but it has not necessarilly finished
    * downloading, and is ready to be communicated with.
    *
    * @param uploader
    */
  def onReady(uploader: FileUploader): Unit = js.native
  /**
    * Removes a file from the pending file list.
    * Removes pending data from the Flash movie
    * and fileInputes from the HTML uploader.
    * If a file container node is bound, the file
    * will also be removed.
    *
    * @param name The name of the file to be removed. Typically the file name,such as: picture01.png
    * @param noListEdit Internal. If true don't remove files from list.
    */
  def removeFile(name: String, noListEdit: Boolean): Unit = js.native
  /**
    * Internal.
    * Set up internal dom nodes for button construction.
    *
    */
  def setButtonStyle(): Unit = js.native
  @JSName("set")
  def set_activeClass(property: activeClass, value: String): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_deferredUploading(property: deferredUploading, value: Double): Unit = js.native
  @JSName("set")
  def set_devMode(property: devMode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_disabledClass(property: disabledClass, value: String): Unit = js.native
  @JSName("set")
  def set_fileListId(property: fileListId, value: String): Unit = js.native
  @JSName("set")
  def set_fileMask(property: fileMask, value: js.Object): Unit = js.native
  @JSName("set")
  def set_flashFieldName(property: flashFieldName, value: String): Unit = js.native
  @JSName("set")
  def set_flashMovie(property: flashMovie, value: js.Function): Unit = js.native
  @JSName("set")
  def set_flashObject(property: flashObject, value: js.Object): Unit = js.native
  @JSName("set")
  def set_force(property: force, value: String): Unit = js.native
  @JSName("set")
  def set_hoverClass(property: hoverClass, value: String): Unit = js.native
  @JSName("set")
  def set_htmlFieldName(property: htmlFieldName, value: String): Unit = js.native
  @JSName("set")
  def set_insideNode(property: insideNode, value: js.Object): Unit = js.native
  @JSName("set")
  def set_isDebug(property: isDebug, value: Boolean): Unit = js.native
  @JSName("set")
  def set_minFlashVersion(property: minFlashVersion, value: Double): Unit = js.native
  @JSName("set")
  def set_progressBackgroundColor(property: progressBackgroundColor, value: String): Unit = js.native
  @JSName("set")
  def set_progressBackgroundUrl(property: progressBackgroundUrl, value: String): Unit = js.native
  @JSName("set")
  def set_progressMessage(property: progressMessage, value: String): Unit = js.native
  @JSName("set")
  def set_progressWidgetId(property: progressWidgetId, value: String): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selectMultipleFiles(property: selectMultipleFiles, value: Boolean): Unit = js.native
  @JSName("set")
  def set_serverTimeout(property: serverTimeout, value: Double): Unit = js.native
  @JSName("set")
  def set_showProgress(property: showProgress, value: Boolean): Unit = js.native
  @JSName("set")
  def set_skipServerCheck(property: skipServerCheck, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_swfPath(property: swfPath, value: js.Object): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: Double): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_uploadOnChange(property: uploadOnChange, value: Boolean): Unit = js.native
  @JSName("set")
  def set_uploadUrl(property: uploadUrl, value: String): Unit = js.native
  @JSName("set")
  def set_uploaderType(property: uploaderType, value: String): Unit = js.native
  @JSName("set")
  def set_version(property: version, value: js.Object): Unit = js.native
  /**
    * If FileUploader is in a form, and other data should be sent
    * along with the files, use this instead of form submit.
    *
    * @param form               Optional
    */
  def submit(form: HTMLFormElement): Boolean = js.native
  /**
    * When called, begins file upload
    *
    * @param data               OptionalpostData to be sent to server
    */
  def upload(data: js.Object): Boolean = js.native
  /**
    * Internal. You should use upload() or submit();
    *
    */
  def uploadFlash(): Unit = js.native
  /**
    * Internal. You could use this, but you should use upload() or submit();
    * which can also handle the post data.
    *
    */
  def uploadHTML(): Unit = js.native
  /**
    *
    * @param url
    */
  def urlencode(url: js.Any): js.Any = js.native
  @JSName("watch")
  def watch_activeClass(
    property: activeClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_deferredUploading(
    property: deferredUploading,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_devMode(
    property: devMode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_disabledClass(
    property: disabledClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_fileListId(
    property: fileListId,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_fileMask(
    property: fileMask,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_flashFieldName(
    property: flashFieldName,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_flashMovie(
    property: flashMovie,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_flashObject(
    property: flashObject,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_force(
    property: force,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hoverClass(
    property: hoverClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_htmlFieldName(
    property: htmlFieldName,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_insideNode(
    property: insideNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isDebug(
    property: isDebug,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minFlashVersion(
    property: minFlashVersion,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_progressBackgroundColor(
    property: progressBackgroundColor,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_progressBackgroundUrl(
    property: progressBackgroundUrl,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_progressMessage(
    property: progressMessage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_progressWidgetId(
    property: progressWidgetId,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectMultipleFiles(
    property: selectMultipleFiles,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_serverTimeout(
    property: serverTimeout,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_showProgress(
    property: showProgress,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_skipServerCheck(
    property: skipServerCheck,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_swfPath(
    property: swfPath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tabIndex(
    property: tabIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_uploadOnChange(
    property: uploadOnChange,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_uploadUrl(
    property: uploadUrl,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_uploaderType(
    property: uploaderType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_version(
    property: version,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

