package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DateHistogramFacet extends Facet {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Enables caching of the facetFilter
       */
  def cacheFilter(trueFalse: scala.Boolean): DateHistogramFacet
  /*
       Allows you to reduce the documents used for computing facet results.
       */
  def facetFilter(oFilter: js.Object): DateHistogramFacet
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
  def factor(f: scala.Double): DateHistogramFacet
  /*
       Sets the field to be used to construct the this facet.
       */
  def field(fieldName: java.lang.String): DateHistogramFacet
  /*
       Computes values across the entire index
       */
  def global(trueFalse: scala.Boolean): DateHistogramFacet
  /*
       Sets the bucket interval used to calculate the distribution.
       */
  def interval(timeInterval: java.lang.String): DateHistogramFacet
  /*
       Allows you to specify a different key field to be used to group intervals.
       */
  def keyField(fieldName: java.lang.String): DateHistogramFacet
  /*
       The script language being used. Currently supported values are
       javascript, groovy, and mvel.
       */
  def lang(language: java.lang.String): DateHistogramFacet
  /*
       Sets the mode the facet will use.
  
  
       collector
       post
  
       */
  def mode(m: java.lang.String): DateHistogramFacet
  /*
       Sets the path to the nested document if faceting against a
       nested field.
       */
  def nested(path: java.lang.String): DateHistogramFacet
  /*
       Sets the type of ordering that will be performed on the date
       buckets.  Valid values are:
  
  
       time - the default, sort by the buckets start time in milliseconds.
       count - sort by the number of items in the bucket
       total - sort by the sum/total of the items in the bucket
  
       */
  def order(o: java.lang.String): DateHistogramFacet
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  def params(p: js.Object): DateHistogramFacet
  /*
       Set's a specific post-rounding offset.  Format is 1d, 1h, etc.
       */
  def postOffset(offset: java.lang.String): DateHistogramFacet
  /*
       By default, time values are stored in UTC format.
  
       This method allows users to set a time zone value that is then used to compute
       intervals after rounding on the interval value.  The value is an offset from UTC.
       The tz offset value is simply added to the resulting bucket's date value.
  
       For example, to use EST you would set the value to -5.
       */
  def postZone(tz: scala.Double): DateHistogramFacet
  /*
       Set's a specific pre-rounding offset.  Format is 1d, 1h, etc.
       */
  def preOffset(offset: java.lang.String): DateHistogramFacet
  /*
       By default, time values are stored in UTC format.
  
       This method allows users to set a time zone value that is then used to
       compute intervals before rounding on the interval value.  The value is an
       offset from UTC.
  
       For example, to use EST you would set the value to -5.
       */
  def preZone(tz: scala.Double): DateHistogramFacet
  /*
       Enables large date interval conversions (day and up).
  
       Set to true to enable and then set the interval to an
       interval greater than a day.
       */
  def preZoneAdjustLargeInterval(trueFalse: scala.Boolean): DateHistogramFacet
  /*
       Computes values across the the specified scope
       */
  def scope(scope: java.lang.String): DateHistogramFacet
  /*
       By default, time values are stored in UTC format.
  
       This method allows users to set a time zone value that is then used
       to compute intervals before rounding on the interval value. Equalivent to
       preZone.  Use preZone if possible. The
       value is an offset from UTC.
  
       For example, to use EST you would set the value to -5.
       */
  def timeZone(tz: scala.Double): DateHistogramFacet
  /*
       Retrieves the internal facet object. This is typically used by
       internal API functions so use with caution.
       */
  def toJSON(): js.Any
  /*
       Allows you to specify a different value field to aggrerate over.
       */
  def valueField(fieldName: java.lang.String): DateHistogramFacet
  /*
       Allows you modify the value field using a script. The modified value
       is then used to compute the statistical data.
       */
  def valueScript(scriptCode: java.lang.String): DateHistogramFacet
}

