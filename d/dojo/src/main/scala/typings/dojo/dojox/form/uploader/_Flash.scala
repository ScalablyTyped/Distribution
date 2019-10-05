package typings.dojo.dojox.form.uploader

import typings.dojo.dojox.form.FileUploader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/uploader/_Flash.html
  *
  * A mixin for dojox/form/Uploader that utilizes a Flash SWF for handling to upload in IE.
  * All other browsers will use the HTML5 plugin, unless force="flash" is used, then Flash
  * will be used in all browsers. force="flash" is provided because Flash has some features
  * that HTML5 does not yet have. But it is still not recommended because of the many problems
  * that Firefox and Webkit have with the Flash plugin.
  * All properties and methods listed here are specific to the Flash version only.
  *
  *
  */
@JSGlobal("dojox.form.uploader._Flash")
@js.native
class _Flash () extends js.Object {
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
    * If true, outputs traces from the SWF to console. What exactly gets passed
    * is very relative, and depends upon what traces have been left in the DEFT SWF.
    *
    */
  var isDebug: Boolean = js.native
  /**
    * If true, then flash request is sent with a value that changes with each request (timestamp)
    *
    */
  var preventCache: Boolean = js.native
  /**
    * The amount of time given to the uploaded file
    * to wait for a server response. After this amount
    * of time, the onComplete is fired but with a 'server timeout'
    * error in the returned item.
    *
    */
  var serverTimeout: Double = js.native
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
    *
    */
  def flashReset(): Unit = js.native
  /**
    * Returns list of currently selected files
    *
    */
  def getFlashFileList(): js.Any = js.native
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
  def onFileProgress(fileArray: js.Any): Unit = js.native
  /**
    * Stub - SWF has been downloaded 100%.
    *
    * @param uploader
    */
  def onLoad(uploader: FileUploader): Unit = js.native
  /**
    * Stub - Fired when embedFlash has created the
    * Flash object, but it has not necessarilly finished
    * downloading, and is ready to be communicated with.
    *
    * @param uploader
    */
  def onReady(uploader: FileUploader): Unit = js.native
  /**
    *
    */
  def postMixInProperties(): Unit = js.native
}

