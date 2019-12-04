package typings.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.anchors.html
  *
  * Style for the anchor resize-points
  *
  */
trait anchors extends js.Object {
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
  var marginZero: Double
  /**
    *
    */
  var minSize: Double
  /**
    *
    */
  var size: Double
  /**
    *
    */
  var style: String
  /**
    *
    */
  var width: Double
}

object anchors {
  @scala.inline
  def apply(
    cap: String,
    color: String,
    fill: String,
    marginZero: Double,
    minSize: Double,
    size: Double,
    style: String,
    width: Double
  ): anchors = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], marginZero = marginZero.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[anchors]
  }
}

