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
    val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ellipse]
  }
}

