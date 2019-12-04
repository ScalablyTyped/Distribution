package typings.dojo.dojox.geo.openlayers._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.Point.html
  *
  * A Point geometry handles description of points to be rendered in a GfxLayer
  *
  * @param coords Coordinates of the geometry. {x:x, y:y} object for a point geometry, array of {x:x, y:y}objects for line string geometry, array of geometries for collection geometry.
  */
@JSGlobal("dojox.geo.openlayers._base.Point")
@js.native
class Point protected ()
  extends typings.dojo.dojox.geo.openlayers.Geometry {
  def this(coords: js.Object) = this()
  /**
    * Gets the point defining this geometry.
    *
    */
  def getPoint(): js.Any = js.native
  /**
    * Sets the point for this geometry.
    *
    * @param p The point geometry expressed as a {x, y} object.
    */
  def setPoint(p: js.Object): Unit = js.native
}

