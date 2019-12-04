package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.disabled.html
  *
  * Disabled or "locked" or "fade" style of all shapes
  *
  */
trait disabled extends js.Object {
  /**
    *
    */
  var cap: String
  /**
    *
    */
  var color: String
  /**
    *
    */
  var fill: String
  /**
    *
    */
  var style: String
  /**
    *
    */
  var width: Double
}

object disabled {
  @scala.inline
  def apply(cap: String, color: String, fill: String, style: String, width: Double): disabled = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[disabled]
  }
}

