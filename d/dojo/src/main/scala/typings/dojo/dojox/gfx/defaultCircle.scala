package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultCircle.html
  *
  * An object defining the default Circle prototype.
  *
  */
trait defaultCircle extends js.Object {
  /**
    * The X coordinate of the center of the circle, default value 0.
    *
    */
  var cx: Double
  /**
    * The Y coordinate of the center of the circle, default value 0.
    *
    */
  var cy: Double
  /**
    * The radius, default value 100.
    *
    */
  var r: Double
  /**
    * Specifies this object is a circle, value 'circle'
    *
    */
  var `type`: String
}

object defaultCircle {
  @scala.inline
  def apply(cx: Double, cy: Double, r: Double, `type`: String): defaultCircle = {
    val __obj = js.Dynamic.literal(cx = cx, cy = cy, r = r)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[defaultCircle]
  }
}

