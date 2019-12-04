package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.Stroke.html
  *
  * A stroke defines stylistic properties that are used when drawing a path.
  *
  */
trait Stroke extends js.Object {
  /**
    * The endcap style of the path. One of 'butt', 'round', ... . Default value 'butt'.
    *
    */
  var cap: String
  /**
    * The color of the stroke, default value 'black'.
    *
    */
  var color: String
  /**
    * The join style to use when combining path segments. Default value 4.
    *
    */
  var join: Double
  /**
    * The style of the stroke, one of 'solid', ... . Default value 'solid'.
    *
    */
  var style: String
  /**
    * The width of a stroke, default value 1.
    *
    */
  var width: Double
}

object Stroke {
  @scala.inline
  def apply(cap: String, color: String, join: Double, style: String, width: Double): Stroke = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stroke]
  }
}

