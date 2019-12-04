package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultStroke.html
  *
  * A stroke defines stylistic properties that are used when drawing a path.
  * This object defines the default Stroke prototype.
  *
  */
trait defaultStroke extends js.Object {
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
    * Specifies this object is a type of Stroke, value 'stroke'.
    *
    */
  var `type`: String
  /**
    * The width of a stroke, default value 1.
    *
    */
  var width: Double
}

object defaultStroke {
  @scala.inline
  def apply(cap: String, color: String, join: Double, style: String, `type`: String, width: Double): defaultStroke = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultStroke]
  }
}

