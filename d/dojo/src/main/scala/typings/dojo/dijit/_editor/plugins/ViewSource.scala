package typings.dojo.dijit._editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/ViewSource.html
  *
  * This plugin provides a simple view source capability.  When view
  * source mode is enabled, it disables all other buttons/plugins on the RTE.
  * It also binds to the hotkey: CTRL-SHIFT-F11 for toggling ViewSource mode.
  * 
  * @param args       OptionalInitial settings for any of the attributes.     
  */
@JSGlobal("dijit._editor.plugins.ViewSource")
@js.native
class ViewSource () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * Boolean flag used to indicate if the source view should be readonly or not.
    * Cannot be changed after initialization of the plugin.
    * Defaults to false.
    * 
    */
  var readOnly: Boolean = js.native
  /**
    * Boolean flag used to indicate if comment tags should be stripped from the document.
    * Defaults to true.
    * 
    */
  var stripComments: Boolean = js.native
  /**
    * 
    */
  var stripIFrames: Boolean = js.native
  /**
    * Boolean flag used to indicate if script tags should be stripped from the document.
    * Defaults to true.
    * 
    */
  var stripScripts: Boolean = js.native
  /**
    * Internal function to set the caret in the sourceArea
    * to 0x0
    * 
    */
  def setSourceAreaCaret(): Unit = js.native
  /**
    * Function to allow programmatic toggling of the view.
    * 
    */
  def toggle(): Unit = js.native
}

