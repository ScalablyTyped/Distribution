package typings.dojo.dojox.geo.openlayers.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.Geometry.html
  *
  * A Geometry handles description of shapes to be rendered in a GfxLayer
  * using a GeometryFeature feature.
  * A Geometry can be:
  *
  * A point geometry of type dojox.geo.openlayers.Point. Coordinates are a an
  * Object {x, y}
  * A line string geometry of type dojox.geo.openlayers.LineString. Coordinates are
  * an array of {x, y} objects
  * A collection geometry of type dojox.geo.openlayers.Collection. Coordinates are an array of geometries.
  *
  * @param coords Coordinates of the geometry. {x:x, y:y} object for a point geometry, array of {x:x, y:y}objects for line string geometry, array of geometries for collection geometry.
  */
@JSGlobal("dojox.geo.openlayers._base.Geometry")
@js.native
class Geometry protected () extends js.Object {
  def this(coords: js.Object) = this()
  /**
    * The coordinates of the geometry, Object like {x, y} or Array.
    *
    */
  var coordinates: js.Object = js.native
}

