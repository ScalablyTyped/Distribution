package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/InsertEntity.html
  *
  * This plugin allows the user to select from standard Symbols (HTML Entities)
  * to insert at the current cursor position.  It binds to the key pattern:
  * ctrl-shift-s for opening the insert symbol dropdown.
  * The commands provided by this plugin are:
  *
  * insertEntity - inserts the selected HTML entity character
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.InsertEntity")
@js.native
class InsertEntity () extends Plugin {
  def this(args: js.Object) = this()
}

