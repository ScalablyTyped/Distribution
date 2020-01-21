package typings.dojo.dijit._editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/AlwaysShowToolbar.html
  *
  * This plugin is required for Editors in auto-expand mode.
  * It handles the auto-expansion as the user adds/deletes text,
  * and keeps the editor's toolbar visible even when the top of the editor
  * has scrolled off the top of the viewport (usually when editing a long
  * document).
  * Specify this in extraPlugins (or plugins) parameter and also set
  * height to "".
  * 
  * @param args       OptionalInitial settings for any of the attributes.     
  */
@JSGlobal("dijit._editor.plugins.AlwaysShowToolbar")
@js.native
class AlwaysShowToolbar () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * 
    * @param e             
    */
  def setEditor(e: js.Any): Unit = js.native
}

