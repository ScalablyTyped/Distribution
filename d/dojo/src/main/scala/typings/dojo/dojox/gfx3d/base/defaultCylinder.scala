package typings.dojo.dojox.gfx3d.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.defaultCylinder.html
  *
  *
  */
trait defaultCylinder extends js.Object {
  /**
    *
    */
  var center: Object
  /**
    *
    */
  var height: Double
  /**
    *
    */
  var radius: Double
  /**
    *
    */
  var `type`: String
}

object defaultCylinder {
  @scala.inline
  def apply(center: Object, height: Double, radius: Double, `type`: String): defaultCylinder = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultCylinder]
  }
}

