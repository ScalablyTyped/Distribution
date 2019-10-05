package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultText.html
  *
  * Defines the default Text prototype.
  *
  */
trait defaultText extends js.Object {
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
    * Specifies this is a Text shape, value 'text'.
    *
    */
  var `type`: String
  /**
    * The X coordinate of the text position, default value 0.
    *
    */
  var x: Double
  /**
    * The Y coordinate of the text position, default value 0.
    *
    */
  var y: Double
}

object defaultText {
  @scala.inline
  def apply(
    align: String,
    decoration: String,
    kerning: Boolean,
    rotated: Boolean,
    text: String,
    `type`: String,
    x: Double,
    y: Double
  ): defaultText = {
    val __obj = js.Dynamic.literal(align = align, decoration = decoration, kerning = kerning, rotated = rotated, text = text, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[defaultText]
  }
}

