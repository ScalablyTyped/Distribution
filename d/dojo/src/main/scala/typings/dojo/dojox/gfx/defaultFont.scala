package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultFont.html
  *
  * An object specifying the default properties for a Font used in text operations.
  *
  */
trait defaultFont extends js.Object {
  /**
    * The font family, one of 'serif', 'sanserif', ..., default value 'serif'.
    *
    */
  var family: String
  /**
    * The font size (including units), default value '10pt'.
    *
    */
  var size: String
  /**
    * The font style, one of 'normal', 'bold', default value 'normal'.
    *
    */
  var style: String
  /**
    * Specifies this object is a Font, value 'font'.
    *
    */
  var `type`: String
  /**
    * The font variant, one of 'normal', ... , default value 'normal'.
    *
    */
  var variant: String
  /**
    * The font weight, one of 'normal', ..., default value 'normal'.
    *
    */
  var weight: String
}

object defaultFont {
  @scala.inline
  def apply(family: String, size: String, style: String, `type`: String, variant: String, weight: String): defaultFont = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultFont]
  }
}

