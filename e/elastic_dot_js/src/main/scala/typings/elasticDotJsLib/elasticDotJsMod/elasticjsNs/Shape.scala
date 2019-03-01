package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends Geo {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the coordinates for the shape definition.  Note, the coordinates
    are not validated in this api.  Please see GeoJSON and ElasticSearch
    documentation for correct coordinate definitions.
    */
  def coordinates(c: js.Array[_]): Shape
  /*
    Sets the radius for parsing a circle Shape.
    */
  def radius(r: java.lang.String): Shape
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Sets the shape type.  Can be set to one of:  point, linestring, polygon,
    multipoint, envelope, or multipolygon.
    */
  def `type`(t: java.lang.String): Shape
}

object Shape {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    coordinates: js.Function1[js.Array[_], Shape],
    radius: js.Function1[java.lang.String, Shape],
    toJSON: js.Function0[js.Any],
    `type`: js.Function1[java.lang.String, Shape]
  ): Shape = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("_type")(_type)
    __obj.updateDynamic("coordinates")(coordinates)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[Shape]
  }
}

