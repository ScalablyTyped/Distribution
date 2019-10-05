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
    val __obj = js.Dynamic.literal(align = align, decoration = decoration, fitting = fitting, height = height, leading = leading, text = text, width = width, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[defaultVectorText]
  }
}

