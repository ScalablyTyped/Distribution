package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.norm.html
  *
  * Normal style of all shapes
  * will get overridden by
  * above andes styles
  *
  */
trait norm extends js.Object {
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

object norm {
  @scala.inline
  def apply(cap: String, color: String, fill: String, style: String, width: Double): norm = {
    val __obj = js.Dynamic.literal(cap = cap, color = color, fill = fill, style = style, width = width)
  
    __obj.asInstanceOf[norm]
  }
}

