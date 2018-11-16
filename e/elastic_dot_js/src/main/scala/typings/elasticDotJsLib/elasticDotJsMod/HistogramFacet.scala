package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "HistogramFacet")
@js.native
class HistogramFacet protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet {
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
  override def cacheFilter(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Allows you to reduce the documents used for computing facet results.
       */
  /* CompleteClass */
  override def facetFilter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Sets the field to be used to construct the this facet.
       */
  /* CompleteClass */
  override def field(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Sets the "from", "start", or lower bounds bucket.  For example if
       you have a value of 1023, an interval of 100, and a from value of
       1500, it will be placed into the 1500 bucket vs. the normal bucket
       of 1000.
       */
  /* CompleteClass */
  override def from(from: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Computes values across the entire index
       */
  /* CompleteClass */
  override def global(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Sets the bucket interval used to calculate the distribution.
       */
  /* CompleteClass */
  override def interval(numericInterval: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Allows you to specify a different key field to be used to group intervals.
       */
  /* CompleteClass */
  override def keyField(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Allows you modify the key field using a script. The modified value
       is then used to generate the interval.
       */
  /* CompleteClass */
  override def keyScript(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       The script language being used. Currently supported values are
       javascript, groovy, and mvel.
       */
  /* CompleteClass */
  override def lang(language: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Sets the mode the facet will use.
  
  
       collector
       post
  
       */
  /* CompleteClass */
  override def mode(m: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Sets the path to the nested document if faceting against a
       nested field.
       */
  /* CompleteClass */
  override def nested(path: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Sets the type of ordering that will be performed on the date
       buckets.  Valid values are:
  
       key - the default, sort by the bucket's key value
       count - sort by the number of items in the bucket
       total - sort by the sum/total of the items in the bucket
       */
  /* CompleteClass */
  override def order(o: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Sets parameters that will be applied to the script.  Overwrites
       any existing params.
       */
  /* CompleteClass */
  override def params(p: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Computes values across the the specified scope
       */
  /* CompleteClass */
  override def scope(scope: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Sets the bucket interval used to calculate the distribution based
       on a time value such as "1d", "1w", etc.
       */
  /* CompleteClass */
  override def timeInterval(timeInterval: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Sets the "to", "end", or upper bounds bucket.  For example if
       you have a value of 1023, an interval of 100, and a to value of
       900, it will be placed into the 900 bucket vs. the normal bucket
       of 1000.
       */
  /* CompleteClass */
  override def to(to: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
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
  override def valueField(fieldName: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
  /*
       Allows you modify the value field using a script. The modified value
       is then used to compute the statistical data.
       */
  /* CompleteClass */
  override def valueScript(scriptCode: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.HistogramFacet = js.native
}

