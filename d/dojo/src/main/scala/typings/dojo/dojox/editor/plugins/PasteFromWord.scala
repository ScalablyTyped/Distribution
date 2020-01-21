package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/PasteFromWord.html
  *
  * This plugin provides PasteFromWord capability to the editor.  When
  * clicked, a dialog opens with a spartan RichText instance to paste
  * word content into via the keyboard commands.  The contents are
  * then filtered to remove word style classes and other meta-junk
  * that tends to cause issues.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.PasteFromWord")
@js.native
class PasteFromWord () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * The height to use for the rich text area in the copy/pate dialog, in px.  Default is 300px.
    *
    */
  var height: String = js.native
  /**
    * The width to use for the rich text area in the copy/pate dialog, in px.  Default is 400px.
    *
    */
  var width: String = js.native
}

