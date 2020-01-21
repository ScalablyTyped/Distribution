package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/Save.html
  *
  * This plugin provides Save capability to the editor.  When
  * clicked, the document in the editor frame will be posted to the URL
  * provided, or none, if none provided.  Users who desire a different save
  * function can extend this plugin (via dojo.extend) and over-ride the
  * save method while save is in process, the save button is disabled.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.Save")
@js.native
class Save () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * Boolean flag to indicate that the default action for save and
    * error handlers is to just log to console.  Default is true.
    *
    */
  var logResults: Boolean = js.native
  /**
    * The URL to POST the content back to.  Used by the save function.
    *
    */
  var url: String = js.native
  /**
    * User over-ridable save success function for editor content.
    * Be sure to call this.inherited(arguments) if over-riding this method.
    *
    * @param error
    * @param ioargs
    */
  def onError(error: js.Any, ioargs: js.Any): Unit = js.native
  /**
    * User over-ridable save success function for editor content.
    * Be sure to call this.inherited(arguments) if over-riding this method.
    *
    * @param resp The response from the server, if any, in text format.
    * @param ioargs
    */
  def onSuccess(resp: js.Any, ioargs: js.Any): Unit = js.native
  /**
    * User over-ridable save function for the editor content.
    * Please note that the service URL provided should do content
    * filtering of the posted content to avoid XSS injection via
    * the data from the editor.
    *
    * @param content
    */
  def save(content: js.Any): Unit = js.native
}

