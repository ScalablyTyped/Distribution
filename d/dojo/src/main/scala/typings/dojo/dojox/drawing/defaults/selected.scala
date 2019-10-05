package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.selected.html
  *
  * Selected style of all shapes
  * styles not shown will used from
  * norm
  *
  */
trait selected extends js.Object {
  /**
    *
    */
  var color: String
  /**
    *
    */
  var width: Double
}

object selected {
  @scala.inline
  def apply(color: String, width: Double): selected = {
    val __obj = js.Dynamic.literal(color = color, width = width)
  
    __obj.asInstanceOf[selected]
  }
}

