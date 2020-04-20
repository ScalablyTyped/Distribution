package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.highlighted.html
  *
  * Highlighted style of all shapes
  * NOT CURRENTLY BEING USED
  *
  */
trait highlighted extends js.Object {
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

object highlighted {
  @scala.inline
  def apply(cap: String, color: String, fill: String, style: String, width: Double): highlighted = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[highlighted]
  }
}

