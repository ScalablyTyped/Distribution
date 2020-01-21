package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/InsertAnchor.html
  *
  * This plugin provides the basis for an insert anchor dialog for the
  * dijit.Editor
  * The command provided by this plugin is:
  *
  * insertAnchor
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.InsertAnchor")
@js.native
class InsertAnchor () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * String used for templating the HTML to insert at the desired point.
    *
    */
  var htmlTemplate: String = js.native
  /**
    * Over-ridable function for getting the style to apply to the anchor.
    * The default is a dashed border with an anchor symbol.
    *
    */
  def getAnchorStyle(): js.Any = js.native
}

