package typings.dojo.dojox.editor.plugins

import typings.dojo.dijit._editor.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/NormalizeIndentOutdent.html
  *
  * This plugin provides improved indent and outdent handling to
  * the editor.  It tries to generate valid HTML, as well as be
  * consistent about how it indents and outdents lists and blocks/elements.
  *
  * @param args       OptionalInitial settings for any of the attributes.
  */
@JSGlobal("dojox.editor.plugins.NormalizeIndentOutdent")
@js.native
class NormalizeIndentOutdent () extends Plugin {
  def this(args: js.Object) = this()
  /**
    * The amount to indent by.  Valid values are 1+.  This is combined with
    * the indentUnits parameter to determine how much to indent or outdent
    * by for regular text.  It does not affect lists.
    *
    */
  var indentBy: Double = js.native
  /**
    * The units to apply to the indent amount.  Usually 'px', but can also
    * be em.
    *
    */
  var indentUnits: String = js.native
}

