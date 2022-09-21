package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "Shape")
@js.native
open class Shape protected ()
  extends StObject
     with Geo {
  /*
    Defines a shape
    */
  def this(`type`: String, coords: js.Array[Any]) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the coordinates for the shape definition.  Note, the coordinates
    are not validated in this api.  Please see GeoJSON and ElasticSearch
    documentation for correct coordinate definitions.
    */
  def coordinates(c: js.Array[Any]): Shape = js.native
  
  /*
    Sets the radius for parsing a circle Shape.
    */
  def radius(r: String): Shape = js.native
  
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): Any = js.native
  
  /*
    Sets the shape type.  Can be set to one of:  point, linestring, polygon,
    multipoint, envelope, or multipolygon.
    */
  def `type`(t: String): Shape = js.native
}
