package typings.dojo.dojox.drawing.library.icons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/library/icons.line.html
  *
  *
  */
trait line extends js.Object {
  /**
    *
    */
  var borderWidth: Double
  /**
    *
    */
  var `type`: String
  /**
    *
    */
  var x1: Double
  /**
    *
    */
  var x2: Double
  /**
    *
    */
  var y1: Double
  /**
    *
    */
  var y2: Double
}

object line {
  @scala.inline
  def apply(borderWidth: Double, `type`: String, x1: Double, x2: Double, y1: Double, y2: Double): line = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[line]
  }
}

