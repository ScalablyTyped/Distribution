package typings.dojo.dojox.geo.openlayers._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.LineString.html
  *
  * The dojox.geo.openlayers.LineString geometry. This geometry holds an array
  * of coordinates.
  *
  * @param coords Coordinates of the geometry. {x:x, y:y} object for a point geometry, array of {x:x, y:y}objects for line string geometry, array of geometries for collection geometry.
  */
@JSGlobal("dojox.geo.openlayers._base.LineString")
@js.native
class LineString protected ()
  extends typings.dojo.dojox.geo.openlayers.Geometry {
  def this(coords: js.Object) = this()
  /**
    * Gets the points of this geometry.
    *
    */
  def getPoints(): js.Any = js.native
  /**
    * Sets the points for this geometry.
    *
    * @param p An array of {x, y} objects
    */
  def setPoints(p: js.Array[js.Object]): Unit = js.native
}

