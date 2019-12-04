package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor._Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/ShowBlockNodes.html
  *
  * This plugin provides ShowBlockNodes capability to the editor.  When
  * clicked, the document in the editor will apply a class to specific
  * block nodes to make them visible in the layout.  This info is not
  * exposed/extracted when the editor value is obtained, it is purely for help
  * while working on the page.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.ShowBlockNodes")
@js.native
class ShowBlockNodes () extends _Plugin {
  def this(args: js.Object) = this()
  /**
    * Function to allow programmatic toggling of the view.
    *
    */
  def toggle(): Unit = js.native
}

