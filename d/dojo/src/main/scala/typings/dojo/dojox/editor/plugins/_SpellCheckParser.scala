package typings.dojo.dojox.editor.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/_SpellCheckParser.html
  *
  *
  */
@JSGlobal("dojox.editor.plugins._SpellCheckParser")
@js.native
class _SpellCheckParser () extends js.Object {
  /**
    *
    */
  var lang: String = js.native
  /**
    * Get the indices of the words. They are in one-to-one correspondence
    *
    */
  def getIndices(): js.Any = js.native
  /**
    * Parse the text into words
    *
    * @param text Plain text without html tags
    */
  def parseIntoWords(text: String): js.Any = js.native
}

