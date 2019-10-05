package typings.dojo.dojox.drawing.library.icons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/library/icons.zoomIn.html
  *
  *
  */
trait zoomIn extends js.Object {
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

object zoomIn {
  @scala.inline
  def apply(borderWidth: Double, closePath: Boolean, points: js.Array[_], `type`: String): zoomIn = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth, closePath = closePath, points = points)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[zoomIn]
  }
}

