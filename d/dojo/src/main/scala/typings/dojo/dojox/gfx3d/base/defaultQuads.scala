package typings.dojo.dojox.gfx3d.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.defaultQuads.html
  *
  *
  */
trait defaultQuads extends js.Object {
  /**
    *
    */
  var points: js.Array[_]
  /**
    *
    */
  var style: Object
  /**
    *
    */
  var `type`: String
}

object defaultQuads {
  @scala.inline
  def apply(points: js.Array[_], style: Object, `type`: String): defaultQuads = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultQuads]
  }
}

