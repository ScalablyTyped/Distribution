package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultVectorText.html
  *
  *
  */
trait defaultVectorText extends js.Object {
  /**
    *
    */
  var align: String
  /**
    *
    */
  var decoration: String
  /**
    *
    */
  var fitting: Double
  /**
    *
    */
  var height: js.Object
  /**
    *
    */
  var leading: Double
  /**
    *
    */
  var text: String
  /**
    *
    */
  var `type`: String
  /**
    *
    */
  var width: js.Object
  /**
    *
    */
  var x: Double
  /**
    *
    */
  var y: Double
}

object defaultVectorText {
  @scala.inline
  def apply(
    align: String,
    decoration: String,
    fitting: Double,
    height: js.Object,
    leading: Double,
    text: String,
    `type`: String,
    width: js.Object,
    x: Double,
    y: Double
  ): defaultVectorText = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], decoration = decoration.asInstanceOf[js.Any], fitting = fitting.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultVectorText]
  }
}

