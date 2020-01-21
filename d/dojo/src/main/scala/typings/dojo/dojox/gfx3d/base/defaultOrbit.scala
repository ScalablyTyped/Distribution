package typings.dojo.dojox.gfx3d.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.defaultOrbit.html
  *
  *
  */
trait defaultOrbit extends js.Object {
  /**
    *
    */
  var center: Object
  /**
    *
    */
  var radius: Double
  /**
    *
    */
  var `type`: String
}

object defaultOrbit {
  @scala.inline
  def apply(center: Object, radius: Double, `type`: String): defaultOrbit = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultOrbit]
  }
}

