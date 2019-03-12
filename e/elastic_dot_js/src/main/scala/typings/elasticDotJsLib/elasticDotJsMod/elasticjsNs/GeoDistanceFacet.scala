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
    _type: () => java.lang.String,
    addRange: (stdLib.Number, stdLib.Number) => GeoDistanceFacet,
    addUnboundedFrom: stdLib.Number => GeoDistanceFacet,
    addUnboundedTo: stdLib.Number => GeoDistanceFacet,
    cacheFilter: scala.Boolean => GeoDistanceFacet,
    distanceType: java.lang.String => GeoDistanceFacet,
    facetFilter: js.Object => GeoDistanceFacet,
    field: java.lang.String => GeoDistanceFacet,
    global: scala.Boolean => GeoDistanceFacet,
    lang: java.lang.String => GeoDistanceFacet,
    mode: java.lang.String => GeoDistanceFacet,
    nested: java.lang.String => GeoDistanceFacet,
    normalize: java.lang.String => GeoDistanceFacet,
    params: js.Object => GeoDistanceFacet,
    point: GeoPoint => GeoDistanceFacet,
    scope: java.lang.String => GeoDistanceFacet,
    toJSON: () => js.Any,
    unit: java.lang.String => GeoDistanceFacet,
    valueField: java.lang.String => GeoDistanceFacet,
    valueScript: java.lang.String => GeoDistanceFacet
  ): GeoDistanceFacet = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), addRange = js.Any.fromFunction2(addRange), addUnboundedFrom = js.Any.fromFunction1(addUnboundedFrom), addUnboundedTo = js.Any.fromFunction1(addUnboundedTo), cacheFilter = js.Any.fromFunction1(cacheFilter), distanceType = js.Any.fromFunction1(distanceType), facetFilter = js.Any.fromFunction1(facetFilter), field = js.Any.fromFunction1(field), global = js.Any.fromFunction1(global), lang = js.Any.fromFunction1(lang), mode = js.Any.fromFunction1(mode), nested = js.Any.fromFunction1(nested), normalize = js.Any.fromFunction1(normalize), params = js.Any.fromFunction1(params), point = js.Any.fromFunction1(point), scope = js.Any.fromFunction1(scope), toJSON = js.Any.fromFunction0(toJSON), unit = js.Any.fromFunction1(unit), valueField = js.Any.fromFunction1(valueField), valueScript = js.Any.fromFunction1(valueScript))
  
    __obj.asInstanceOf[GeoDistanceFacet]
  }
}

