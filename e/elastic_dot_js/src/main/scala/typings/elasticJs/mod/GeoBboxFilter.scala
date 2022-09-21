package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "GeoBboxFilter")
@js.native
open class GeoBboxFilter protected ()
  extends StObject
     with Filter {
  /*
    Filter results to those which are contained within the defined bounding box.
    */
  def this(fieldName: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the bottom-right coordinate of the bounding box
    */
  def bottomRight(p: GeoPoint): GeoBboxFilter = js.native
  
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): GeoBboxFilter = js.native
  
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): GeoBboxFilter = js.native
  
  /*
    Sets the fields to filter against.
    */
  def field(f: String): GeoBboxFilter = js.native
  
  /*
    Sets the filter name.
    */
  def name(name: String): GeoBboxFilter = js.native
  
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  def normalize(trueFalse: String): GeoBboxFilter = js.native
  
  /*
    Returns the filter object.
    */
  def toJSON(): GeoBboxFilter = js.native
  
  /*
    Sets the top-left coordinate of the bounding box
    */
  def topLeft(p: GeoPoint): GeoBboxFilter = js.native
  
  /*
    Sets the type of the bounding box execution. Valid values are
    "memory" and "indexed".  Default is memory.
    */
  def `type`(`type`: String): GeoBboxFilter = js.native
}
