package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoDistanceFacet")
@js.native
class GeoDistanceFacet protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet {
  /*
       A facet which provides information over a range of distances from a provided point.
       */
  def this(name: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Adds a new bounded range.
       */
  /* CompleteClass */
  override def addRange(from: stdLib.Number, to: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Adds a new unbounded lower limit.
       */
  /* CompleteClass */
  override def addUnboundedFrom(from: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Adds a new unbounded upper limit.
       */
  /* CompleteClass */
  override def addUnboundedTo(to: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Enables caching of the facetFilter
       */
  /* CompleteClass */
  override def cacheFilter(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       How to compute the distance. Can either be arc (better precision)
       or plane (faster). Defaults to arc.
       */
  /* CompleteClass */
  override def distanceType(`type`: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Allows you to reduce the documents used for computing facet results.
       */
  /* CompleteClass */
  override def facetFilter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Sets the document field containing the geo-coordinate to be used
       to calculate the distance.  Defaults to "location".
       */
  /* CompleteClass */
  override def field(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Computes values across the entire index
       */
  /* CompleteClass */
  override def global(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       The script language being used. Currently supported values are
       javascript, groovy, and mvel.
       */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Sets the mode the facet will use.
  
  
       collector
       post
  
       */
  /* CompleteClass */
  override def mode(m: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Sets the path to the nested document if faceting against a
       nested field.
       */
  /* CompleteClass */
  override def nested(path: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       If the lat/long points should be normalized to lie within their
       respective normalized ranges.
  
       Normalized ranges are:
       lon = -180 (exclusive) to 180 (inclusive) range
       lat = -90 to 90 (both inclusive) range
       */
  /* CompleteClass */
  override def normalize(trueFalse: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Sets the point of origin from where distances will be measured.
       */
  /* CompleteClass */
  override def point(p: elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoPoint): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Computes values across the the specified scope
       */
  /* CompleteClass */
  override def scope(scope: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Retrieves the internal facet object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /*
       Sets the distance unit.  Valid values are "mi" for miles or "km"
       for kilometers. Defaults to "km".
       */
  /* CompleteClass */
  override def unit(unit: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Allows you to specify a different value field to aggrerate over.
       */
  /* CompleteClass */
  override def valueField(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
  /*
       Allows you modify the value field using a script. The modified value
       is then used to compute the statistical data.
       */
  /* CompleteClass */
  override def valueScript(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoDistanceFacet = js.native
}

