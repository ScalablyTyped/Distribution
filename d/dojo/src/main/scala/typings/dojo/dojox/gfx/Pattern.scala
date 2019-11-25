package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.Pattern.html
  *
  * An object specifying the default properties for a Pattern using in fill operations.
  *
  */
trait Pattern extends js.Object {
  /**
    * The height of the pattern image, default value is 0.
    *
    */
  var height: Double
  /**
    * A url specifying the image to use for the pattern.
    *
    */
  var src: String
  /**
    * Specifies this object is a Pattern, value 'pattern'.
    *
    */
  var `type`: String
  /**
    * The width of the pattern image, default value is 0.
    *
    */
  var width: Double
  /**
    * The X coordinate of the position of the pattern, default value is 0.
    *
    */
  var x: Double
  /**
    * The Y coordinate of the position of the pattern, default value is 0.
    *
    */
  var y: Double
}

object Pattern {
  @scala.inline
  def apply(height: Double, src: String, `type`: String, width: Double, x: Double, y: Double): Pattern = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

