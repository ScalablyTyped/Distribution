package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "Shape")
@js.native
class Shape protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.Shape {
  /*
       Defines a shape
       */
  def this(`type`: java.lang.String, coords: js.Array[_]) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the coordinates for the shape definition.  Note, the coordinates
       are not validated in this api.  Please see GeoJSON and ElasticSearch
       documentation for correct coordinate definitions.
       */
  /* CompleteClass */
  override def coordinates(c: js.Array[_]): elasticDotJsLib.elasticDotJsMod.elasticjsNs.Shape = js.native
  /*
       Sets the radius for parsing a circle Shape.
       */
  /* CompleteClass */
  override def radius(r: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.Shape = js.native
  /*
       Retrieves the internal script object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /*
       Sets the shape type.  Can be set to one of:  point, linestring, polygon,
       multipoint, envelope, or multipolygon.
       */
  /* CompleteClass */
  override def `type`(t: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.Shape = js.native
}

