package typings.dojo.dojox.drawing.library.icons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/library/icons.rect.html
  *
  *
  */
trait rect extends js.Object {
  /**
    *
    */
  var borderWidth: Double
  /**
    *
    */
  var height: Double
  /**
    *
    */
  var `type`: String
  /**
    *
    */
  var width: Double
  /**
    *
    */
  var x: Double
  /**
    *
    */
  var y: Double
}

object rect {
  @scala.inline
  def apply(borderWidth: Double, height: Double, `type`: String, width: Double, x: Double, y: Double): rect = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[rect]
  }
}

