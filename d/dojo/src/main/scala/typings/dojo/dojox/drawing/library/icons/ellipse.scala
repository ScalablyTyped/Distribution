package typings.dojo.dojox.drawing.library.icons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/library/icons.ellipse.html
  *
  *
  */
trait ellipse extends js.Object {
  /**
    *
    */
  var borderWidth: Double
  /**
    *
    */
  var cx: Double
  /**
    *
    */
  var cy: Double
  /**
    *
    */
  var rx: Double
  /**
    *
    */
  var ry: Double
  /**
    *
    */
  var `type`: String
}

object ellipse {
  @scala.inline
  def apply(borderWidth: Double, cx: Double, cy: Double, rx: Double, ry: Double, `type`: String): ellipse = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth, cx = cx, cy = cy, rx = rx, ry = ry)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ellipse]
  }
}

