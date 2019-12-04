package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultEllipse.html
  *
  * Defines the default Ellipse prototype.
  *
  */
trait defaultEllipse extends js.Object {
  /**
    * The X coordinate of the center of the ellipse, default value 0.
    *
    */
  var cx: Double
  /**
    * The Y coordinate of the center of the ellipse, default value 0.
    *
    */
  var cy: Double
  /**
    * The radius of the ellipse in the X direction, default value 200.
    *
    */
  var rx: Double
  /**
    * The radius of the ellipse in the Y direction, default value 200.
    *
    */
  var ry: Double
  /**
    * Specifies that this object is a type of Ellipse, value is 'ellipse'
    *
    */
  var `type`: String
}

object defaultEllipse {
  @scala.inline
  def apply(cx: Double, cy: Double, rx: Double, ry: Double, `type`: String): defaultEllipse = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultEllipse]
  }
}

