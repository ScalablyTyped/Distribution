package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor._Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/NormalizeStyle.html
  *
  * This plugin provides NormalizeStyle capability to the editor.  It is
  * a headless plugin that tries to normalize how content is styled when
  * it comes out of th editor ('b' or css).   It also auto-converts
  * incoming content to the proper one expected by the browser as well so
  * that the native styling buttons work.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.NormalizeStyle")
@js.native
class NormalizeStyle () extends _Plugin {
  def this(args: js.Object) = this()
  /**
    * A boolean variable indicating if it should try to condense
    * 'span''span''span' styles  when in css mode
    * The default is true, it will try to combine where it can.
    *
    */
  var condenseSpans: Boolean = js.native
  /**
    * A String variable indicating if it should use semantic tags 'b', 'i', etc, or
    * CSS styling.  The default is semantic.
    *
    */
  var mode: String = js.native
}

