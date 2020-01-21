package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/SpellCheck.html
  *
  * This plugin provides a spelling check capability for the editor.
  *
  */
@JSGlobal("dojox.editor.plugins.SpellCheck")
@js.native
class SpellCheck_ () extends Plugin {
  /**
    * The max length of each XHR request. It is used to divide the large
    * text into pieces so that the server-side piece can hold.
    *
    */
  var bufferLength: Double = js.native
  /**
    * Indicate if the interactive spelling check is enabled
    *
    */
  var interactive: Boolean = js.native
  /**
    * The minutes to waiting for the response. The default value is 30 seconds.
    *
    */
  var timeout: Double = js.native
  /**
    * The url of the spelling check service
    *
    */
  var url: String = js.native
}

