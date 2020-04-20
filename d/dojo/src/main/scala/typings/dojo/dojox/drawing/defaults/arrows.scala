package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.arrows.html
  *
  * Size of arrows on vectors.
  * length is in pixels
  * width is actually an angle
  * but is close to pixels in size
  *
  */
trait arrows extends js.Object {
  /**
    *
    */
  var length: Double
  /**
    *
    */
  var width: Double
}

object arrows {
  @scala.inline
  def apply(length: Double, width: Double): arrows = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[arrows]
  }
}

