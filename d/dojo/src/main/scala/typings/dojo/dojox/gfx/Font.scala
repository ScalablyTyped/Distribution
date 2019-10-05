package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.Font.html
  *
  * An object specifying the properties for a Font used in text operations.
  *
  */
trait Font extends js.Object {
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

object Font {
  @scala.inline
  def apply(family: String, size: String, style: String, `type`: String, variant: String, weight: String): Font = {
    val __obj = js.Dynamic.literal(family = family, size = size, style = style, variant = variant, weight = weight)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Font]
  }
}

