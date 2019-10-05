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
    val __obj = js.Dynamic.literal(borderWidth = borderWidth, height = height, width = width, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[rect]
  }
}

