package typings.dojo.dojox.editor.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/SafePaste.html
  *
  * This plugin extends from the PasteFromWord plugin and provides
  * 'safe pasting', meaning that it will not allow keyboard/menu pasting
  * into the dijit editor.  It still runs all of the word cleanup code,
  * including script strippers.  If you use this plugin, you don't need to
  * use the 'PasteFromWord Plugin'
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.SafePaste")
@js.native
class SafePaste () extends PasteFromWord {
  def this(args: js.Object) = this()
}

