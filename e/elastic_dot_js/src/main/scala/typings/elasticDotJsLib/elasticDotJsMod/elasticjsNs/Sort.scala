package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sort extends js.Object {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Sets the sort order to ascending (asc).  Same as calling
    order('asc').
    */
  def asc(): Sort
  /*
    Sets the sort order to descending (desc).  Same as calling
    order('desc').
    */
  def desc(): Sort
  /*
    How to compute the distance. Can either be arc (better precision)
    or plane (faster). Defaults to arc.
    Valid during sort types:  geo distance
    */
  def distanceType(`type`: java.lang.String): Sort
  /*
    Set's the field to sort on
    */
  def field(f: java.lang.String): Sort
  /*
    Enables sorting based on a distance from a GeoPoint
    */
  def geoDistance(point: GeoPoint): Sort
  /*
    Sets if the sort should ignore unmapped fields vs throwing an error.
    Valid during sort types:  field
    */
  def ignoreUnmapped(trueFalse: scala.Boolean): Sort
  /*
    Sets the script language.
    Valid during sort types:  script
    */
  def lang(lang: java.lang.String): Sort
  /*
    Sets the value to use for missing fields.  Valid values are:
    _last - to put documents with the field missing last
    _first - to put documents with the field missing first
    {String} - any string value to use as the sort value.
    Valid during sort types:  field
    */
  def missing(m: java.lang.String): Sort
  /*
    Sets the sort mode.  Valid values are:
    min - sort by lowest value
    max - sort by highest value
    sum - sort by the sum of all values
    avg - sort by the average of all values
    Valid during sort types:  field, geo distance
    */
  def mode(m: java.lang.String): Sort
  /*
    Allows you to set a filter that nested objects must match
    in order to be considered during sorting.
    Valid during sort types: field, geo distance
    */
  def nestedFilter(oFilter: js.Object): Sort
  /*
    Sets the path of the nested object.
    Valid during sort types:  field, geo distance
    */
  def nestedPath(path: java.lang.String): Sort
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    Valid during sort types:  geo distance
    */
  def normalize(trueFalse: java.lang.String): Sort
  /*
    Sets the sort order.  Valid values are:
    asc - for ascending order
    desc - for descending order
    Valid during sort types:  field, geo distance, and script
    */
  def order(o: java.lang.String): Sort
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    Valid during sort types:  script
    */
  def params(p: js.Object): Sort
  /*
    Sets the order with a boolean value.
    true = descending sort order
    false = ascending sort order
    Valid during sort types:  field, geo distance, and script
    */
  def reverse(trueFalse: scala.Boolean): Sort
  /*
    Enables sorting based on a script.
    */
  def script(scriptCode: java.lang.String): Sort
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Sets the script sort type.  Valid values are:
    string - script return value is sorted as a string
    number - script return value is sorted as a number
    Valid during sort types:  script
    */
  def `type`(`type`: java.lang.String): Sort
  /*
    Sets the distance unit.  Valid values are "mi" for miles or "km"
    for kilometers. Defaults to "km".
    Valid during sort types:  geo distance
    */
  def unit(unit: java.lang.String): Sort
}

