package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.hitNorm.html
  *
  * Normal style of a hit area
  *
  */
trait hitNorm extends js.Object {
  /**
    *
    */
  var cap: String
  /**
    *
    */
  var color: js.Object
  /**
    *
    */
  var fill: js.Object
  /**
    *
    */
  var style: String
  /**
    *
    */
  var width: Double
}

object hitNorm {
  @scala.inline
  def apply(cap: String, color: js.Object, fill: js.Object, style: String, width: Double): hitNorm = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[hitNorm]
  }
}

