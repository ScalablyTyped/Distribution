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
    _type: () => java.lang.String,
    coordinates: js.Array[_] => Shape,
    radius: java.lang.String => Shape,
    toJSON: () => js.Any,
    `type`: java.lang.String => Shape
  ): Shape = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), coordinates = js.Any.fromFunction1(coordinates), radius = js.Any.fromFunction1(radius), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Shape]
  }
}

