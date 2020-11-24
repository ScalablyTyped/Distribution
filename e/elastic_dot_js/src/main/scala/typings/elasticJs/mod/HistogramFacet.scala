package typings.elasticJs.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "HistogramFacet")
@js.native
class HistogramFacet protected () extends Facet {
  /*
    A facet which returns the N most frequent terms within a collection
    or set of collections.
    */
  def this(name: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: Boolean): HistogramFacet = js.native
  
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): HistogramFacet = js.native
  
  /*
    Sets the field to be used to construct the this facet.
    */
  def field(fieldName: String): HistogramFacet = js.native
  
  /*
    Sets the "from", "start", or lower bounds bucket.  For example if
    you have a value of 1023, an interval of 100, and a from value of
    1500, it will be placed into the 1500 bucket vs. the normal bucket
    of 1000.
    */
  def from(from: Number): HistogramFacet = js.native
  
  /*
    Computes values across the entire index
    */
  def global(trueFalse: Boolean): HistogramFacet = js.native
  
  /*
    Sets the bucket interval used to calculate the distribution.
    */
  def interval(numericInterval: Number): HistogramFacet = js.native
  
  /*
    Allows you to specify a different key field to be used to group intervals.
    */
  def keyField(fieldName: String): HistogramFacet = js.native
  
  /*
    Allows you modify the key field using a script. The modified value
    is then used to generate the interval.
    */
  def keyScript(scriptCode: String): HistogramFacet = js.native
  
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  def lang(language: String): HistogramFacet = js.native
  
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: String): HistogramFacet = js.native
  
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: String): HistogramFacet = js.native
  
  /*
    Sets the type of ordering that will be performed on the date
    buckets.  Valid values are:
    key - the default, sort by the bucket's key value
    count - sort by the number of items in the bucket
    total - sort by the sum/total of the items in the bucket
    */
  def order(o: String): HistogramFacet = js.native
  
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): HistogramFacet = js.native
  
  /*
    Computes values across the the specified scope
    */
  def scope(scope: String): HistogramFacet = js.native
  
  /*
    Sets the bucket interval used to calculate the distribution based
    on a time value such as "1d", "1w", etc.
    */
  def timeInterval(timeInterval: Number): HistogramFacet = js.native
  
  /*
    Sets the "to", "end", or upper bounds bucket.  For example if
    you have a value of 1023, an interval of 100, and a to value of
    900, it will be placed into the 900 bucket vs. the normal bucket
    of 1000.
    */
  def to(to: Number): HistogramFacet = js.native
  
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  
  /*
    Allows you to specify a different value field to aggrerate over.
    */
  def valueField(fieldName: String): HistogramFacet = js.native
  
  /*
    Allows you modify the value field using a script. The modified value
    is then used to compute the statistical data.
    */
  def valueScript(scriptCode: String): HistogramFacet = js.native
}
