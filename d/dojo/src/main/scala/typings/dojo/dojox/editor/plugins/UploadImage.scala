package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/UploadImage.html
  *
  * Adds an icon to the Editor toolbar that when clicked, opens a system dialog
  * Although the toolbar icon is a tiny "image" the uploader could be used for
  * any file type
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.UploadImage")
@js.native
class UploadImage () extends Plugin {
  def this(args: js.Object) = this()
  /**
    *
    */
  var label: String = js.native
  /**
    *
    */
  var tempImageUrl: String = js.native
  /**
    *
    */
  var uploadUrl: String = js.native
  /**
    *
    */
  def createFileInput(): Unit = js.native
  /**
    * inserting a "busy" image to show something is hapening
    * during upload and download of the image.
    *
    */
  def insertTempImage(): Unit = js.native
  /**
    *
    * @param data
    * @param ioArgs
    * @param widgetRef
    */
  def onComplete(data: js.Any, ioArgs: js.Any, widgetRef: js.Any): Unit = js.native
  /**
    *
    * @param toolbar
    */
  def setToolbar(toolbar: js.Any): Unit = js.native
}

