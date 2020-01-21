package typings.dojo.dijit._editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FullScreen.html
  *
  * This plugin provides FullScreen capability to the editor.  When
  * toggled on, it will render the editor into the full window and
  * overlay everything.  It also binds to the hotkey: CTRL-SHIFT-F11
  * for toggling fullscreen mode.
  * 
  * @param args       OptionalInitial settings for any of the attributes.     
  */
@JSGlobal("dijit._editor.plugins.FullScreen")
@js.native
class FullScreen () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * Read-Only variable used to denote of the editor is in fullscreen mode or not.
    * 
    */
  var isFullscreen: Boolean = js.native
  /**
    * zIndex value used for overlaying the full page.
    * default is 500.
    * 
    */
  var zIndex: Double = js.native
  /**
    * Function to allow programmatic toggling of the view.
    * 
    */
  def toggle(): Unit = js.native
}

