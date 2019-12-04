package typings.dojo.dojox.geo.openlayers._base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.Collection.html
  *
  * A collection of geometries.
  *
  * @param coords Coordinates of the geometry. {x:x, y:y} object for a point geometry, array of {x:x, y:y}objects for line string geometry, array of geometries for collection geometry.
  */
@JSGlobal("dojox.geo.openlayers._base.Collection")
@js.native
class Collection protected ()
  extends typings.dojo.dojox.geo.openlayers.Geometry {
  def this(coords: js.Object) = this()
  /**
    * An array of geometries.
    *
    */
  @JSName("coordinates")
  var coordinates_Collection: js.Array[_] = js.native
  /**
    * Returns the geometries.
    *
    */
  def getGeometries(): js.Any = js.native
  /**
    * Sets the geometries
    *
    * @param g The array of geometries.
    */
  def setGeometries(g: js.Array[_]): Unit = js.native
}

