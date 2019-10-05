package typings.dojo.dojox.form

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dojoStrings.blurDelay
import typings.dojo.dojoStrings.duration
import typings.dojo.dojoStrings.triggerEvent
import typings.dojo.dojoStrings.uploadMessage
import typings.dojo.dojoStrings.url
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/FileInputAuto.html
  *
  * An extension on FileInput providing background upload progress
  * An extended version of FileInput - when the user focuses away from the input
  * the selected file is posted via ioIframe to the url. example implementation
  * comes with PHP solution for handling upload, and returning required data.
  *
  * notes: the return data from the io.iframe is used to populate the input element with
  * data regarding the results. it will be a JSON object, like:
  *
  * results = { size: "1024", filename: "file.txt" }
  * all the parameters allowed to FileInput apply
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.form.FileInputAuto")
@js.native
class FileInputAuto () extends FileInput {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * time in ms before an un-focused widget will wait before uploading the file to the url="" specified
    * default: 2 seconds
    *
    */
  var blurDelay: Double = js.native
  /**
    * The time in ms to use as the generic timing mechanism for the animations
    * set to 1 or 0 for "immediate response"
    *
    */
  var duration: Double = js.native
  /**
    * Event which triggers the upload. Defaults to onblur, sending the file selected
    * 'blurDelay' milliseconds after losing focus. Set to "onchange" with a low blurDelay
    * to send files immediately after uploading.
    *
    */
  var triggerEvent: String = js.native
  /**
    * FIXME: i18n somehow?
    *
    */
  var uploadMessage: String = js.native
  /**
    * the URL where our background FileUpload will be sent
    *
    */
  var url: String = js.native
  @JSName("get")
  def get_blurDelay(property: blurDelay): Double = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  @JSName("get")
  def get_triggerEvent(property: triggerEvent): String = js.native
  @JSName("get")
  def get_uploadMessage(property: uploadMessage): String = js.native
  @JSName("get")
  def get_url(property: url): String = js.native
  /**
    * Called immediately before a FileInput sends it's file via io.iframe.send.
    * The return of this function is passed as the content member in the io.iframe IOArgs
    * object.
    *
    */
  def onBeforeSend(): js.Object = js.native
  /**
    * stub function fired when an upload has finished.
    *
    * @param data the raw data found in the first [TEXTAREA] tag of the post url
    * @param ioArgs the Deferred data being passed from the handle: callback
    * @param widgetRef this widget pointer, so you can set this.overlay to a completed/error message easily
    */
  def onComplete(data: js.Any, ioArgs: js.Any, widgetRef: js.Any): Unit = js.native
  /**
    * accommodate our extra focusListeners
    *
    * @param e
    */
  def reset(e: js.Any): Unit = js.native
  /**
    * set the text of the progressbar
    *
    * @param title
    */
  def setMessage(title: String): Unit = js.native
  @JSName("set")
  def set_blurDelay(property: blurDelay, value: Double): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("set")
  def set_triggerEvent(property: triggerEvent, value: String): Unit = js.native
  @JSName("set")
  def set_uploadMessage(property: uploadMessage, value: String): Unit = js.native
  @JSName("set")
  def set_url(property: url, value: String): Unit = js.native
  @JSName("watch")
  def watch_blurDelay(property: blurDelay, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_duration(property: duration, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_triggerEvent(property: triggerEvent, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_uploadMessage(property: uploadMessage, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_url(property: url, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

