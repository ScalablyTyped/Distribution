package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/FindReplace.html
  *
  * This plugin provides a Find/Replace capability for the editor.
  * Note that this plugin is NOT supported on Opera currently, as opera
  * does not implement a window.find or equiv function.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.FindReplace")
@js.native
class FindReplace_ () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * This is a callback handler that set a reference to the editor this plugin
    * hosts in
    *
    * @param editor
    */
  def setEditor(editor: js.Any): Unit = js.native
  /**
    * Function to allow programmatic toggling of the find toolbar.
    *
    */
  def toggle(): Unit = js.native
}

