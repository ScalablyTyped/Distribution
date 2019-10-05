package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultPolyline.html
  *
  * Defines the default PolyLine prototype.
  *
  */
trait defaultPolyline extends js.Object {
  /**
    * An array of point objects [{x:0,y:0},...] defining the default polyline's line segments. Value is an empty array [].
    *
    */
  var points: js.Array[_]
  /**
    * Specifies this object is a PolyLine, default value 'polyline'.
    *
    */
  var `type`: String
}

object defaultPolyline {
  @scala.inline
  def apply(points: js.Array[_], `type`: String): defaultPolyline = {
    val __obj = js.Dynamic.literal(points = points)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[defaultPolyline]
  }
}

