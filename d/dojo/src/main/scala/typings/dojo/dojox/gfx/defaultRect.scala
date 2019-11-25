package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultRect.html
  *
  * Defines the default Rect prototype.
  *
  */
trait defaultRect extends js.Object {
  /**
    * The height of the default rectangle, value 100.
    *
    */
  var height: Double
  /**
    * The corner radius for the default rectangle, value 0.
    *
    */
  var r: Double
  /**
    * Specifies this default object is a type of Rect. Value is 'rect'
    *
    */
  var `type`: String
  /**
    * The width of the default rectangle, value 100.
    *
    */
  var width: Double
  /**
    * The X coordinate of the default rectangles position, value 0.
    *
    */
  var x: Double
  /**
    * The Y coordinate of the default rectangle's position, value 0.
    *
    */
  var y: Double
}

object defaultRect {
  @scala.inline
  def apply(height: Double, r: Double, `type`: String, width: Double, x: Double, y: Double): defaultRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultRect]
  }
}

