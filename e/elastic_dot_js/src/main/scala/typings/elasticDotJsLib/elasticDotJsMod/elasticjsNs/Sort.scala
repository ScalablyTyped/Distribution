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

object Sort {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    asc: () => Sort,
    desc: () => Sort,
    distanceType: java.lang.String => Sort,
    field: java.lang.String => Sort,
    geoDistance: GeoPoint => Sort,
    ignoreUnmapped: scala.Boolean => Sort,
    lang: java.lang.String => Sort,
    missing: java.lang.String => Sort,
    mode: java.lang.String => Sort,
    nestedFilter: js.Object => Sort,
    nestedPath: java.lang.String => Sort,
    normalize: java.lang.String => Sort,
    order: java.lang.String => Sort,
    params: js.Object => Sort,
    reverse: scala.Boolean => Sort,
    script: java.lang.String => Sort,
    toJSON: () => js.Any,
    `type`: java.lang.String => Sort,
    unit: java.lang.String => Sort
  ): Sort = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), asc = js.Any.fromFunction0(asc), desc = js.Any.fromFunction0(desc), distanceType = js.Any.fromFunction1(distanceType), field = js.Any.fromFunction1(field), geoDistance = js.Any.fromFunction1(geoDistance), ignoreUnmapped = js.Any.fromFunction1(ignoreUnmapped), lang = js.Any.fromFunction1(lang), missing = js.Any.fromFunction1(missing), mode = js.Any.fromFunction1(mode), nestedFilter = js.Any.fromFunction1(nestedFilter), nestedPath = js.Any.fromFunction1(nestedPath), normalize = js.Any.fromFunction1(normalize), order = js.Any.fromFunction1(order), params = js.Any.fromFunction1(params), reverse = js.Any.fromFunction1(reverse), script = js.Any.fromFunction1(script), toJSON = js.Any.fromFunction0(toJSON), unit = js.Any.fromFunction1(unit))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Sort]
  }
}

