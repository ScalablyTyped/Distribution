package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoDistanceFacet extends Facet {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Adds a new bounded range.
    */
  def addRange(from: stdLib.Number, to: stdLib.Number): GeoDistanceFacet
  /*
    Adds a new unbounded lower limit.
    */
  def addUnboundedFrom(from: stdLib.Number): GeoDistanceFacet
  /*
    Adds a new unbounded upper limit.
    */
  def addUnboundedTo(to: stdLib.Number): GeoDistanceFacet
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: scala.Boolean): GeoDistanceFacet
  /*
    How to compute the distance. Can either be arc (better precision)
    or plane (faster). Defaults to arc.
    */
  def distanceType(`type`: java.lang.String): GeoDistanceFacet
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): GeoDistanceFacet
  /*
    Sets the document field containing the geo-coordinate to be used
    to calculate the distance.  Defaults to "location".
    */
  def field(fieldName: java.lang.String): GeoDistanceFacet
  /*
    Computes values across the entire index
    */
  def global(trueFalse: scala.Boolean): GeoDistanceFacet
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  def lang(language: java.lang.String): GeoDistanceFacet
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: java.lang.String): GeoDistanceFacet
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: java.lang.String): GeoDistanceFacet
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  def normalize(trueFalse: java.lang.String): GeoDistanceFacet
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): GeoDistanceFacet
  /*
    Sets the point of origin from where distances will be measured.
    */
  def point(p: GeoPoint): GeoDistanceFacet
  /*
    Computes values across the the specified scope
    */
  def scope(scope: java.lang.String): GeoDistanceFacet
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Sets the distance unit.  Valid values are "mi" for miles or "km"
    for kilometers. Defaults to "km".
    */
  def unit(unit: java.lang.String): GeoDistanceFacet
  /*
    Allows you to specify a different value field to aggrerate over.
    */
  def valueField(fieldName: java.lang.String): GeoDistanceFacet
  /*
    Allows you modify the value field using a script. The modified value
    is then used to compute the statistical data.
    */
  def valueScript(scriptCode: java.lang.String): GeoDistanceFacet
}

object GeoDistanceFacet {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    addRange: js.Function2[stdLib.Number, stdLib.Number, GeoDistanceFacet],
    addUnboundedFrom: js.Function1[stdLib.Number, GeoDistanceFacet],
    addUnboundedTo: js.Function1[stdLib.Number, GeoDistanceFacet],
    cacheFilter: js.Function1[scala.Boolean, GeoDistanceFacet],
    distanceType: js.Function1[java.lang.String, GeoDistanceFacet],
    facetFilter: js.Function1[js.Object, GeoDistanceFacet],
    field: js.Function1[java.lang.String, GeoDistanceFacet],
    global: js.Function1[scala.Boolean, GeoDistanceFacet],
    lang: js.Function1[java.lang.String, GeoDistanceFacet],
    mode: js.Function1[java.lang.String, GeoDistanceFacet],
    nested: js.Function1[java.lang.String, GeoDistanceFacet],
    normalize: js.Function1[java.lang.String, GeoDistanceFacet],
    params: js.Function1[js.Object, GeoDistanceFacet],
    point: js.Function1[GeoPoint, GeoDistanceFacet],
    scope: js.Function1[java.lang.String, GeoDistanceFacet],
    toJSON: js.Function0[js.Any],
    unit: js.Function1[java.lang.String, GeoDistanceFacet],
    valueField: js.Function1[java.lang.String, GeoDistanceFacet],
    valueScript: js.Function1[java.lang.String, GeoDistanceFacet]
  ): GeoDistanceFacet = {
    val __obj = js.Dynamic.literal(_type = _type, addRange = addRange, addUnboundedFrom = addUnboundedFrom, addUnboundedTo = addUnboundedTo, cacheFilter = cacheFilter, distanceType = distanceType, facetFilter = facetFilter, field = field, global = global, lang = lang, mode = mode, nested = nested, normalize = normalize, params = params, point = point, scope = scope, toJSON = toJSON, unit = unit, valueField = valueField, valueScript = valueScript)
  
    __obj.asInstanceOf[GeoDistanceFacet]
  }
}

