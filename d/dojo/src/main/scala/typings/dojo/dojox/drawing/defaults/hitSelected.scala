package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.hitSelected.html
  *
  * Selected style of a hit area
  *
  */
trait hitSelected extends js.Object {
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

object hitSelected {
  @scala.inline
  def apply(cap: String, color: String, fill: js.Object, style: String, width: Double): hitSelected = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[hitSelected]
  }
}

