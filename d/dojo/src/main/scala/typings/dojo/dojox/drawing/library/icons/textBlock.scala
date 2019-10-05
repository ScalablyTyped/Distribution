package typings.dojo.dojox.drawing.library.icons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/library/icons.textBlock.html
  *
  *
  */
trait textBlock extends js.Object {
  /**
    *
    */
  var borderWidth: Double
  /**
    *
    */
  var closePath: Boolean
  /**
    *
    */
  var points: js.Array[_]
  /**
    *
    */
  var `type`: String
}

object textBlock {
  @scala.inline
  def apply(borderWidth: Double, closePath: Boolean, points: js.Array[_], `type`: String): textBlock = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth, closePath = closePath, points = points)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[textBlock]
  }
}

