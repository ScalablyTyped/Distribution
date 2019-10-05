package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor._Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/Preview.html
  *
  * This plugin provides Preview capability to the editor.  When
  * clicked, the document in the editor frame will displayed in a separate
  * window/tab
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.Preview")
@js.native
class Preview () extends _Plugin {
  def this(args: js.Object) = this()
  /**
    * A string of CSS styles to apply to the previewed content, if any.
    *
    */
  var styles: String = js.native
  /**
    * An array of stylesheets to import into the preview, if any.
    *
    */
  var stylesheets: js.Array[_] = js.native
}

