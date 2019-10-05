package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.hitHighlighted.html
  *
  * Highlighted style of a hit area
  *
  */
trait hitHighlighted extends js.Object {
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

object hitHighlighted {
  @scala.inline
  def apply(cap: String, color: String, fill: js.Object, style: String, width: Double): hitHighlighted = {
    val __obj = js.Dynamic.literal(cap = cap, color = color, fill = fill, style = style, width = width)
  
    __obj.asInstanceOf[hitHighlighted]
  }
}

