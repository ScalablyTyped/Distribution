package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultTextPath.html
  *
  * Defines the default TextPath prototype.
  *
  */
trait defaultTextPath extends js.Object {
  /**
    * The horizontal text alignment, one of 'start', 'end', 'center'. Default value 'start'.
    *
    */
  var align: String
  /**
    * The text decoration , one of 'none', ... . Default value 'none'.
    *
    */
  var decoration: String
  /**
    * Whether kerning is used on the text, boolean default value true.
    *
    */
  var kerning: Boolean
  /**
    * Whether the text is rotated, boolean default value false.
    *
    */
  var rotated: Boolean
  /**
    * The text to be displayed, default value empty string.
    *
    */
  var text: String
  /**
    * Specifies this is a TextPath, value 'textpath'.
    *
    */
  var `type`: String
}

object defaultTextPath {
  @scala.inline
  def apply(
    align: String,
    decoration: String,
    kerning: Boolean,
    rotated: Boolean,
    text: String,
    `type`: String
  ): defaultTextPath = {
    val __obj = js.Dynamic.literal(align = align, decoration = decoration, kerning = kerning, rotated = rotated, text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[defaultTextPath]
  }
}

