package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/StatusBar.html
  *
  * This plugin provides StatusBar capability to the editor.
  * Basically a footer bar where status can be published.  It also
  * puts a resize handle on the status bar, allowing you to resize the
  * editor via mouse.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.StatusBar")
@js.native
class StatusBar_ () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * Flag indicating that a resizer should be shown or not.  Default is true.
    * There are cases (such as using center pane border container to autoresize the editor
    * That a resizer is not valued.
    *
    */
  var resizer: Boolean = js.native
  /**
    * The status bar and resizer.
    *
    */
  var statusBar: js.Object = js.native
  /**
    * Quick and dirty implementation of 'set' pattern
    *
    * @param attr The attribute to set.
    * @param val The value to set it to.
    */
  def set(attr: js.Any, `val`: js.Any): Unit = js.native
}

