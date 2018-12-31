package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "DateHistogramFacet")
@js.native
class DateHistogramFacet protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet {
  /*
    A facet which returns the N most frequent terms within a collection
    or set of collections.
    */
  def this(name: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Enables caching of the facetFilter
    */
  /* CompleteClass */
  override def cacheFilter(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  /* CompleteClass */
  override def facetFilter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    The date histogram works on numeric values (since time is stored
    in milliseconds since the epoch in UTC).
    But, sometimes, systems will store a different resolution (like seconds since UTC)
    in a numeric field. The factor parameter can be used to change the value in the field
    to milliseconds to actual do the relevant rounding, and then be applied again to get to
    the original unit.
    For example, when storing in a numeric field seconds resolution,
    the factor can be set to 1000.
    */
  /* CompleteClass */
  override def factor(f: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Sets the field to be used to construct the this facet.
    */
  /* CompleteClass */
  override def field(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Computes values across the entire index
    */
  /* CompleteClass */
  override def global(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Sets the bucket interval used to calculate the distribution.
    */
  /* CompleteClass */
  override def interval(timeInterval: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Allows you to specify a different key field to be used to group intervals.
    */
  /* CompleteClass */
  override def keyField(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  /* CompleteClass */
  override def mode(m: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  /* CompleteClass */
  override def nested(path: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Sets the type of ordering that will be performed on the date
    buckets.  Valid values are:
    time - the default, sort by the buckets start time in milliseconds.
    count - sort by the number of items in the bucket
    total - sort by the sum/total of the items in the bucket
    */
  /* CompleteClass */
  override def order(o: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Set's a specific post-rounding offset.  Format is 1d, 1h, etc.
    */
  /* CompleteClass */
  override def postOffset(offset: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    By default, time values are stored in UTC format.
    This method allows users to set a time zone value that is then used to compute
    intervals after rounding on the interval value.  The value is an offset from UTC.
    The tz offset value is simply added to the resulting bucket's date value.
    For example, to use EST you would set the value to -5.
    */
  /* CompleteClass */
  override def postZone(tz: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Set's a specific pre-rounding offset.  Format is 1d, 1h, etc.
    */
  /* CompleteClass */
  override def preOffset(offset: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    By default, time values are stored in UTC format.
    This method allows users to set a time zone value that is then used to
    compute intervals before rounding on the interval value.  The value is an
    offset from UTC.
    For example, to use EST you would set the value to -5.
    */
  /* CompleteClass */
  override def preZone(tz: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Enables large date interval conversions (day and up).
    Set to true to enable and then set the interval to an
    interval greater than a day.
    */
  /* CompleteClass */
  override def preZoneAdjustLargeInterval(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Computes values across the the specified scope
    */
  /* CompleteClass */
  override def scope(scope: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    By default, time values are stored in UTC format.
    This method allows users to set a time zone value that is then used
    to compute intervals before rounding on the interval value. Equalivent to
    preZone.  Use preZone if possible. The
    value is an offset from UTC.
    For example, to use EST you would set the value to -5.
    */
  /* CompleteClass */
  override def timeZone(tz: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /*
    Allows you to specify a different value field to aggrerate over.
    */
  /* CompleteClass */
  override def valueField(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
  /*
    Allows you modify the value field using a script. The modified value
    is then used to compute the statistical data.
    */
  /* CompleteClass */
  override def valueScript(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DateHistogramFacet = js.native
}

