package typings.elasticDotJs.elasticDotJsMod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoDistanceFacet")
@js.native
class GeoDistanceFacet protected () extends Facet {
  /*
    A facet which provides information over a range of distances from a provided point.
    */
  def this(name: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Adds a new bounded range.
    */
  def addRange(from: Number, to: Number): GeoDistanceFacet = js.native
  /*
    Adds a new unbounded lower limit.
    */
  def addUnboundedFrom(from: Number): GeoDistanceFacet = js.native
  /*
    Adds a new unbounded upper limit.
    */
  def addUnboundedTo(to: Number): GeoDistanceFacet = js.native
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: Boolean): GeoDistanceFacet = js.native
  /*
    How to compute the distance. Can either be arc (better precision)
    or plane (faster). Defaults to arc.
    */
  def distanceType(`type`: String): GeoDistanceFacet = js.native
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): GeoDistanceFacet = js.native
  /*
    Sets the document field containing the geo-coordinate to be used
    to calculate the distance.  Defaults to "location".
    */
  def field(fieldName: String): GeoDistanceFacet = js.native
  /*
    Computes values across the entire index
    */
  def global(trueFalse: Boolean): GeoDistanceFacet = js.native
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  def lang(language: String): GeoDistanceFacet = js.native
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: String): GeoDistanceFacet = js.native
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: String): GeoDistanceFacet = js.native
  /*
    If the lat/long points should be normalized to lie within their
    respective normalized ranges.
    Normalized ranges are:
    lon = -180 (exclusive) to 180 (inclusive) range
    lat = -90 to 90 (both inclusive) range
    */
  def normalize(trueFalse: String): GeoDistanceFacet = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): GeoDistanceFacet = js.native
  /*
    Sets the point of origin from where distances will be measured.
    */
  def point(p: GeoPoint): GeoDistanceFacet = js.native
  /*
    Computes values across the the specified scope
    */
  def scope(scope: String): GeoDistanceFacet = js.native
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  /*
    Sets the distance unit.  Valid values are "mi" for miles or "km"
    for kilometers. Defaults to "km".
    */
  def unit(unit: String): GeoDistanceFacet = js.native
  /*
    Allows you to specify a different value field to aggrerate over.
    */
  def valueField(fieldName: String): GeoDistanceFacet = js.native
  /*
    Allows you modify the value field using a script. The modified value
    is then used to compute the statistical data.
    */
  def valueScript(scriptCode: String): GeoDistanceFacet = js.native
}

