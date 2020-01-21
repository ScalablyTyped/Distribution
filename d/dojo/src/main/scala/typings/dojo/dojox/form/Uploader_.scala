package typings.dojo.dojox.form

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.`aria-label`
import typings.dojo.dojoStrings.`type`
import typings.dojo.dojoStrings.active
import typings.dojo.dojoStrings.alt
import typings.dojo.dojoStrings.cssStateNodes
import typings.dojo.dojoStrings.deferredUploading
import typings.dojo.dojoStrings.devMode
import typings.dojo.dojoStrings.disabled
import typings.dojo.dojoStrings.errMsg
import typings.dojo.dojoStrings.flashFieldName
import typings.dojo.dojoStrings.focusedClass
import typings.dojo.dojoStrings.force
import typings.dojo.dojoStrings.hovering
import typings.dojo.dojoStrings.iconClass
import typings.dojo.dojoStrings.intermediateChanges
import typings.dojo.dojoStrings.isDebug
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.multiple
import typings.dojo.dojoStrings.name
import typings.dojo.dojoStrings.preventCache
import typings.dojo.dojoStrings.scrollOnFocus
import typings.dojo.dojoStrings.serverTimeout
import typings.dojo.dojoStrings.showInput
import typings.dojo.dojoStrings.showLabel
import typings.dojo.dojoStrings.skipServerCheck
import typings.dojo.dojoStrings.swfPath
import typings.dojo.dojoStrings.tabIndex
import typings.dojo.dojoStrings.uploadOnSelect
import typings.dojo.dojoStrings.uploadType
import typings.dojo.dojoStrings.url
import typings.dojo.dojoStrings.value
import typings.dojo.dojox.form.uploader.Base
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/Uploader.html
  *
  * A widget that creates a stylable file-input button, with optional multi-file selection,
  * using only HTML elements. Non-HTML5 browsers have fallback options of Flash or an iframe.
  * A bare-bones, stylable file-input button, with optional multi-file selection. The list
  * of files is not displayed, that is for you to handle by connecting to the onChange
  * event, or use the dojox.form.uploader.FileList.
  *
  * Uploader without plugins does not have any ability to upload - it is for use in forms
  * where you handle the upload either by a standard POST or with Ajax using an iFrame. This
  * class is for convenience of multiple files only. No progress events are available.
  *
  * If the browser supports a file-input with the "multiple" attribute, that will be used.
  * If the browser does not support "multiple" (ergo, IE) multiple inputs are used,
  * one for each selection.
  *
  * Version: 1.6
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.Destroyable because Already inherited
- typings.dojo.dojo.Stateful because Already inherited
- typings.dojo.dijit.AttachMixin because Already inherited
- typings.dojo.dijit.FocusMixin because Already inherited
- typings.dojo.dijit.OnDijitClickMixin because Already inherited
- typings.dojo.dijit.WidgetBase because Already inherited
- typings.dojo.dijit.form.FormWidgetMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.CssStateMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.TemplatedMixin because Already inherited
- typings.dojo.dijit.Widget because Already inherited
- typings.dojo.dijit.form.ButtonMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.form.FormWidget because Inheritance from two classes. Inlined create
- typings.dojo.dojox.form.uploader.Flash because Inheritance from two classes. Inlined deferredUploading, devMode, isDebug, preventCache, serverTimeout, skipServerCheck, swfPath, flashReset, getFlashFileList, onFileChange, onFileProgress, onLoad, onReady
- typings.dojo.dojox.form.uploader.IFrame because Inheritance from two classes. Inlined uploadIFrame
- typings.dojo.dojox.form.uploader._HTML5 because Inheritance from two classes. Inlined errMsg, uploadType, addDropTarget, createXhr, upload
- typings.dojo.dijit.form.Button because Inheritance from two classes. Inlined active, set_active, get_active, watch_active, alt, set_alt, get_alt, watch_alt, `aria-label`, set_arialabel, get_arialabel, watch_arialabel, set_attachScope, get_attachScope, watch_attachScope, set_attributeMap, get_attributeMap, watch_attributeMap, set_baseClass, get_baseClass, watch_baseClass, set_class, get_class, watch_class, set_containerNode, get_containerNode, watch_containerNode, cssStateNodes, set_cssStateNodes, get_cssStateNodes, watch_cssStateNodes, set_dir, get_dir, watch_dir, disabled, set_disabled, get_disabled, watch_disabled, set_domNode, get_domNode, watch_domNode, set_focused, get_focused, watch_focused, hovering, set_hovering, get_hovering, watch_hovering, iconClass, set_iconClass, get_iconClass, watch_iconClass, set_id, get_id, watch_id, intermediateChanges, set_intermediateChanges, get_intermediateChanges, watch_intermediateChanges, label, set_label, get_label, watch_label, set_lang, get_lang, watch_lang, name, set_name, get_name, watch_name, set_ownerDocument, get_ownerDocument, watch_ownerDocument, scrollOnFocus, set_scrollOnFocus, get_scrollOnFocus, watch_scrollOnFocus, set_searchContainerNode, get_searchContainerNode, watch_searchContainerNode, showLabel, set_showLabel, get_showLabel, watch_showLabel, set_srcNodeRef, get_srcNodeRef, watch_srcNodeRef, set_style, get_style, watch_style, tabIndex, set_tabIndex, get_tabIndex, watch_tabIndex, set_templatePath, get_templatePath, watch_templatePath, set_templateString, get_templateString, watch_templateString, set_title, get_title, watch_title, set_tooltip, get_tooltip, watch_tooltip, `type`, set_type, get_type, watch_type, value, set_value, get_value, watch_value, attr, attr, attr, attr, buildRendering, compare, connect, connect, connect, connect, connect, connect, connect, connect, defer, defer, destroy, destroy, destroyDescendants, destroyDescendants, destroyRecursive, destroyRecursive, destroyRendering, destroyRendering, disconnect, emit, emit, emit, focus, get, getChildren, getDescendants, getParent, getValue, isFocusable, isLeftToRight, on, on, own, placeAt, placeAt, placeAt, placeAt, placeAt, placeAt, placeAt, placeAt, placeAt, postCreate, postMixInProperties, set, setAttribute, setDisabled, setLabel, setValue, startup, subscribe, toString, uninitialize, unsubscribe, watch, getCachedTemplate, onBlur, onChange, onClick, onClose, onDblClick, onFocus, onHide, onKeyDown, onKeyPress, onKeyUp, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onShow */ @JSGlobal("dojox.form.Uploader")
@js.native
class Uploader_ () extends Base {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    *
    */
  var active: Boolean = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    *
    */
  var alt: String = js.native
  /**
    *
    */
  var `aria-label`: String = js.native
  /**
    * Subclasses may define a cssStateNodes property that lists sub-nodes within the widget that
    * need CSS classes applied on mouse hover/press and focus.
    *
    * Each entry in this optional hash is a an attach-point name (like "upArrowButton") mapped to a CSS class name
    * (like "dijitUpArrowButton"). Example:
    *
    * {
    *     "upArrowButton": "dijitUpArrowButton",
    *     "downArrowButton": "dijitDownArrowButton"
    * }
    * The above will set the CSS class dijitUpArrowButton to the this.upArrowButton DOMNode when it
    *
    * is hovered, etc.
    *
    */
  var cssStateNodes: js.Object = js.native
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
  var devMode: js.Object = js.native
  /**
    * Should this widget respond to user input?
    * In markup, this is specified as "disabled='disabled'", or just "disabled".
    *
    */
  var disabled: Boolean = js.native
  /**
    *
    */
  var errMsg: String = js.native
  /**
    * If set, this will be the name of the field of the flash uploaded files that the server
    * is expecting. If not set, "Flash" is appended to the "name" property.
    *
    */
  var flashFieldName: String = js.native
  /**
    * The class applied to the button when it is focused (via TAB key)
    *
    */
  var focusedClass: String = js.native
  /**
    * options: form, html5, iframe, flash
    * Empty string defaults to html5 if available, and iframe if not.
    * Use "flash" to always use Flash (and hopefully force the user to download the plugin
    * if they don't have it).
    * Use "iframe" to always use an iframe, and never flash nor html5. Sometimes preferred
    * for consistent results.
    * Use "form" to not use ajax and post to a page.
    *
    */
  var force: String = js.native
  /**
    * True if cursor is over this widget
    *
    */
  var hovering: Boolean = js.native
  /**
    * Class to apply to DOMNode in button to make it display an icon
    *
    */
  var iconClass: String = js.native
  /**
    * Fires onChange for each value change or only on demand
    *
    */
  var intermediateChanges: Boolean = js.native
  /**
    * If true, outputs traces from the SWF to console. What exactly gets passed
    * is very relative, and depends upon what traces have been left in the DEFT SWF.
    *
    */
  var isDebug: Boolean = js.native
  /**
    * The text used in the button that when clicked, opens a system Browse Dialog.
    *
    */
  var label: String = js.native
  /**
    * If true and flash mode, multiple files may be selected from the dialog.
    *
    */
  var multiple: Boolean = js.native
  /**
    * The name attribute needs to end with square brackets: [] as this is the standard way
    * of handling an attribute "array". This requires a slightly different technique on the
    * server.
    *
    */
  var name: String = js.native
  /**
    * If true, then flash request is sent with a value that changes with each request (timestamp)
    *
    */
  var preventCache: Boolean = js.native
  /**
    * On focus, should this widget scroll into view?
    *
    */
  var scrollOnFocus: Boolean = js.native
  /**
    * The amount of time given to the uploaded file
    * to wait for a server response. After this amount
    * of time, the onComplete is fired but with a 'server timeout'
    * error in the returned item.
    *
    */
  var serverTimeout: Double = js.native
  /**
    * Position to show an input which shows selected filename(s). Possible
    * values are "before", "after", which specifies where the input should
    * be placed with reference to the containerNode which contains the
    * label). By default, this is empty string (no such input will be
    * shown). Specify showInput="before" to mimic the look&feel of a
    * native file input element.
    *
    */
  var showInput: String = js.native
  /**
    * Set this to true to hide the label text and display only the icon.
    * (If showLabel=false then iconClass must be specified.)
    * Especially useful for toolbars.
    * If showLabel=true, the label will become the title (a.k.a. tooltip/hint) of the icon.
    *
    * The exception case is for computers in high-contrast mode, where the label
    * will still be displayed, since the icon doesn't appear.
    *
    */
  var showLabel: Boolean = js.native
  /**
    * If true, will not verify that the server was sent the correct format.
    * This can be safely set to true. The purpose of the server side check
    * is mainly to show the dev if they've implemented the different returns
    * correctly.
    *
    */
  var skipServerCheck: Boolean = js.native
  /**
    * Path to SWF. Can be overwritten or provided in djConfig.
    *
    */
  var swfPath: String = js.native
  /**
    * The tab order in the DOM.
    *
    */
  var tabIndex: String = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    *
    */
  var `type`: String = js.native
  /**
    * If true, uploads immediately after a file has been selected. If false,
    * waits for upload() to be called.
    *
    */
  var uploadOnSelect: Boolean = js.native
  /**
    * The type of uploader being used. As an alternative to determining the upload type on the
    * server based on the fieldName, this property could be sent to the server to help
    * determine what type of parsing should be used.
    * This is set based on the force property and what features are available in the browser.
    *
    */
  var uploadType: String = js.native
  /**
    * The url targeted for upload. An absolute URL is preferred. Relative URLs are
    * changed to absolute.
    *
    */
  var url: String = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    *
    */
  var value: String = js.native
  /**
    * Add a dom node which will act as the drop target area so user
    * can drop files to this node.
    * If onlyConnectDrop is true, dragenter/dragover/dragleave events
    * won't be connected to dojo.stopEvent, and they need to be
    * canceled by user code to allow DnD files to happen.
    * This API is only available in HTML5 plugin (only HTML5 allows
    * DnD files).
    *
    * @param node
    * @param onlyConnectDrop               Optional
    */
  /**
    * Add a dom node which will act as the drop target area so user
    * can drop files to this node.
    * If onlyConnectDrop is true, dragenter/dragover/dragleave events
    * won't be connected to dojo.stopEvent, and they need to be
    * canceled by user code to allow DnD files to happen.
    * This API is only available in HTML5 plugin (only HTML5 allows
    * DnD files).
    *
    * @param node
    * @param onlyConnectDrop               Optional
    */
  def addDropTarget(node: js.Any, onlyConnectDrop: Boolean): Unit = js.native
  /**
    * Compare 2 values (as returned by get('value') for this widget).
    *
    * @param val1
    * @param val2
    */
  /**
    * Compare 2 values (as returned by get('value') for this widget).
    * 
    * @param val1             
    * @param val2             
    */
  def compare(val1: js.Any, val2: js.Any): Double = js.native
  /**
    *
    */
  /**
    * 
    */
  def create(): Unit = js.native
  /**
    *
    */
  /**
    *
    */
  def createXhr(): js.Any = js.native
  /**
    *
    */
  /**
    *
    */
  def flashReset(): Unit = js.native
  /**
    * Put focus on this widget
    *
    */
  /**
    * Put focus on this widget
    * 
    */
  def focus(): Unit = js.native
  /**
    * Returns a list of selected files.
    *
    */
  def getFileList(): js.Array[_] = js.native
  /**
    * Returns list of currently selected files
    *
    */
  /**
    * Returns list of currently selected files
    *
    */
  def getFlashFileList(): js.Any = js.native
  /**
    * Deprecated.  Use get('value') instead.
    *
    */
  /**
    * Deprecated.  Use get('value') instead.
    * 
    */
  def getValue(): js.Any = js.native
  @JSName("get")
  def get_active(property: active): Boolean = js.native
  @JSName("get")
  def get_alt(property: alt): String = js.native
  @JSName("get")
  def get_arialabel(property: `aria-label`): String = js.native
  @JSName("get")
  def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
  @JSName("get")
  def get_deferredUploading(property: deferredUploading): Double = js.native
  @JSName("get")
  def get_devMode(property: devMode): js.Object = js.native
  @JSName("get")
  def get_disabled(property: disabled): Boolean = js.native
  @JSName("get")
  def get_errMsg(property: errMsg): String = js.native
  @JSName("get")
  def get_flashFieldName(property: flashFieldName): String = js.native
  @JSName("get")
  def get_focusedClass(property: focusedClass): String = js.native
  @JSName("get")
  def get_force(property: force): String = js.native
  @JSName("get")
  def get_hovering(property: hovering): Boolean = js.native
  @JSName("get")
  def get_iconClass(property: iconClass): String = js.native
  @JSName("get")
  def get_intermediateChanges(property: intermediateChanges): Boolean = js.native
  @JSName("get")
  def get_isDebug(property: isDebug): Boolean = js.native
  @JSName("get")
  def get_label(property: label): String = js.native
  @JSName("get")
  def get_multiple(property: multiple): Boolean = js.native
  @JSName("get")
  def get_name(property: name): String = js.native
  @JSName("get")
  def get_preventCache(property: preventCache): Boolean = js.native
  @JSName("get")
  def get_scrollOnFocus(property: scrollOnFocus): Boolean = js.native
  @JSName("get")
  def get_serverTimeout(property: serverTimeout): Double = js.native
  @JSName("get")
  def get_showInput(property: showInput): String = js.native
  @JSName("get")
  def get_showLabel(property: showLabel): Boolean = js.native
  @JSName("get")
  def get_skipServerCheck(property: skipServerCheck): Boolean = js.native
  @JSName("get")
  def get_swfPath(property: swfPath): String = js.native
  @JSName("get")
  def get_tabIndex(property: tabIndex): String = js.native
  @JSName("get")
  def get_type(property: `type`): String = js.native
  @JSName("get")
  def get_uploadOnSelect(property: uploadOnSelect): Boolean = js.native
  @JSName("get")
  def get_uploadType(property: uploadType): String = js.native
  @JSName("get")
  def get_url(property: url): String = js.native
  @JSName("get")
  def get_value(property: value): String = js.native
  /**
    * Stub to connect
    * Fires when upload in progress was canceled
    *
    */
  def onAbort(): Unit = js.native
  /**
    * Fires when upload begins
    *
    * @param dataArray
    */
  def onBegin(dataArray: js.Array[_]): Unit = js.native
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
    * @param fileArray
    */
  def onChange(fileArray: js.Array[_]): Unit = js.native
  /**
    * Callback when this widget's value is changed.
    * 
    * @param newValue             
    */
  def onChange(newValue: js.Any): Unit = js.native
  /**
    * Connect to this function to receive notifications of mouse click events.
    *
    * @param event mouse Event
    */
  /**
    * Connect to this function to receive notifications of mouse click events.
    * 
    * @param event mouse Event             
    */
  def onClick(event: Event_): Boolean = js.native
  /**
    * stub to connect
    * Fires when all files have uploaded
    * Event is an array of all files
    *
    * @param customEvent
    */
  def onComplete(customEvent: js.Object): Unit = js.native
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
    * Stub - Flash-specific event. Fires on each selection of files
    * and only provides the files selected on that event - not all files
    * selected, as with HTML5
    *
    * @param fileArray
    */
  /**
    * Stub - Flash-specific event. Fires on each selection of files
    * and only provides the files selected on that event - not all files
    * selected, as with HTML5
    *
    * @param fileArray
    */
  def onFileChange(fileArray: js.Any): Unit = js.native
  /**
    * Stub - Flash-specific event. Fires on progress of upload
    * and only provides a file-specific event
    *
    * @param fileArray
    */
  /**
    * Stub - Flash-specific event. Fires on progress of upload
    * and only provides a file-specific event
    *
    * @param fileArray
    */
  def onFileProgress(fileArray: js.Any): Unit = js.native
  /**
    * Stub - SWF has been downloaded 100%.
    *
    * @param uploader
    */
  /**
    * Stub - SWF has been downloaded 100%.
    *
    * @param uploader
    */
  def onLoad(uploader: FileUploader): Unit = js.native
  /**
    * Stub to connect
    * Fires on upload progress. Event is a normalized object of common properties
    * from HTML5 uploaders and the Flash uploader. Will not fire for IFrame.
    *
    * @param customEvent bytesLoaded: Number:  Amount of bytes uploaded so far of entire payload (all files)bytesTotal: Number:  Amount of bytes of entire payload (all files)type: String:  Type of event (progress or load)timeStamp: Number:  Timestamp of when event occurred
    */
  def onProgress(customEvent: js.Object): Unit = js.native
  /**
    * Stub - Fired when embedFlash has created the
    * Flash object, but it has not necessarilly finished
    * downloading, and is ready to be communicated with.
    *
    * @param uploader
    */
  /**
    * Stub - Fired when embedFlash has created the
    * Flash object, but it has not necessarilly finished
    * downloading, and is ready to be communicated with.
    *
    * @param uploader
    */
  def onReady(uploader: FileUploader): Unit = js.native
  /**
    * Resets entire input, clearing all files.
    * NOTE:
    * Removing individual files is not yet supported, because the HTML5 uploaders can't
    * be edited.
    * TODO:
    * Add this ability by effectively, not uploading them
    *
    */
  def reset(): Unit = js.native
  /**
    * Deprecated.  Use set('disabled', ...) instead.
    *
    * @param disabled
    */
  /**
    * Deprecated.  Use set('disabled', ...) instead.
    * 
    * @param disabled             
    */
  def setDisabled(disabled: Boolean): Unit = js.native
  /**
    * Deprecated.  Use set('label', ...) instead.
    *
    * @param content
    */
  /**
    * Deprecated.  Use set('label', ...) instead.
    * 
    * @param content             
    */
  def setLabel(content: String): Unit = js.native
  /**
    * Deprecated.  Use set('value', ...) instead.
    *
    * @param value
    */
  /**
    * Deprecated.  Use set('value', ...) instead.
    * 
    * @param value             
    */
  def setValue(value: String): Unit = js.native
  @JSName("set")
  def set_active(property: active, value: Boolean): Unit = js.native
  @JSName("set")
  def set_alt(property: alt, value: String): Unit = js.native
  @JSName("set")
  def set_arialabel(property: `aria-label`, value: String): Unit = js.native
  @JSName("set")
  def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
  @JSName("set")
  def set_deferredUploading(property: deferredUploading, value: Double): Unit = js.native
  @JSName("set")
  def set_devMode(property: devMode, value: js.Object): Unit = js.native
  @JSName("set")
  def set_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_errMsg(property: errMsg, value: String): Unit = js.native
  @JSName("set")
  def set_flashFieldName(property: flashFieldName, value: String): Unit = js.native
  @JSName("set")
  def set_focusedClass(property: focusedClass, value: String): Unit = js.native
  @JSName("set")
  def set_force(property: force, value: String): Unit = js.native
  @JSName("set")
  def set_hovering(property: hovering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_iconClass(property: iconClass, value: String): Unit = js.native
  @JSName("set")
  def set_intermediateChanges(property: intermediateChanges, value: Boolean): Unit = js.native
  @JSName("set")
  def set_isDebug(property: isDebug, value: Boolean): Unit = js.native
  @JSName("set")
  def set_label(property: label, value: String): Unit = js.native
  @JSName("set")
  def set_multiple(property: multiple, value: Boolean): Unit = js.native
  @JSName("set")
  def set_name(property: name, value: String): Unit = js.native
  @JSName("set")
  def set_preventCache(property: preventCache, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scrollOnFocus(property: scrollOnFocus, value: Boolean): Unit = js.native
  @JSName("set")
  def set_serverTimeout(property: serverTimeout, value: Double): Unit = js.native
  @JSName("set")
  def set_showInput(property: showInput, value: String): Unit = js.native
  @JSName("set")
  def set_showLabel(property: showLabel, value: Boolean): Unit = js.native
  @JSName("set")
  def set_skipServerCheck(property: skipServerCheck, value: Boolean): Unit = js.native
  @JSName("set")
  def set_swfPath(property: swfPath, value: String): Unit = js.native
  @JSName("set")
  def set_tabIndex(property: tabIndex, value: String): Unit = js.native
  @JSName("set")
  def set_type(property: `type`, value: String): Unit = js.native
  @JSName("set")
  def set_uploadOnSelect(property: uploadOnSelect, value: Boolean): Unit = js.native
  @JSName("set")
  def set_uploadType(property: uploadType, value: String): Unit = js.native
  @JSName("set")
  def set_url(property: url, value: String): Unit = js.native
  @JSName("set")
  def set_value(property: value, value: String): Unit = js.native
  /**
    * If Uploader is in a form, and other data should be sent along with the files, use
    * this instead of form submit.
    *
    * @param form               Optional
    */
  def submit(form: HTMLFormElement): Unit = js.native
  /**
    * When called, begins file upload. Only supported with plugins.
    *
    * @param formData               Optional
    */
  /**
    * See: dojox.form.Uploader.upload
    *
    * @param formData               Optional
    */
  def upload(formData: js.Object): Unit = js.native
  /**
    * Internal. You could use this, but you should use upload() or submit();
    * which can also handle the post data.
    *
    * @param data
    */
  /**
    * Internal. You could use this, but you should use upload() or submit();
    * which can also handle the post data.
    *
    * @param data
    */
  def uploadIFrame(data: js.Any): Unit = js.native
  @JSName("watch")
  def watch_active(
    property: active,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_alt(
    property: alt,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_arialabel(
    property: `aria-label`,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cssStateNodes(
    property: cssStateNodes,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_deferredUploading(
    property: deferredUploading,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_devMode(
    property: devMode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_disabled(
    property: disabled,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_errMsg(
    property: errMsg,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_flashFieldName(
    property: flashFieldName,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_focusedClass(
    property: focusedClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_force(
    property: force,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_hovering(
    property: hovering,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_iconClass(
    property: iconClass,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_intermediateChanges(
    property: intermediateChanges,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_isDebug(
    property: isDebug,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_label(
    property: label,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_multiple(
    property: multiple,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_name(
    property: name,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_preventCache(
    property: preventCache,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_scrollOnFocus(
    property: scrollOnFocus,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_serverTimeout(
    property: serverTimeout,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_showInput(
    property: showInput,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_showLabel(
    property: showLabel,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_skipServerCheck(
    property: skipServerCheck,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_swfPath(
    property: swfPath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_tabIndex(
    property: tabIndex,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_type(
    property: `type`,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_uploadOnSelect(
    property: uploadOnSelect,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_uploadType(
    property: uploadType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_url(
    property: url,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_value(
    property: value,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): AnonUnwatch = js.native
}

