package typings.dojo.dojox.gfx3d._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.defaultPolygon.html
  *
  *
  */
trait defaultPolygon extends js.Object {
  /**
    *
    */
  var path: js.Array[_]
  /**
    *
    */
  var `type`: String
}

object defaultPolygon {
  @scala.inline
  def apply(path: js.Array[_], `type`: String): defaultPolygon = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultPolygon]
  }
}

