package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramFacet extends Facet {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: scala.Boolean): HistogramFacet
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): HistogramFacet
  /*
    Sets the field to be used to construct the this facet.
    */
  def field(fieldName: java.lang.String): HistogramFacet
  /*
    Sets the "from", "start", or lower bounds bucket.  For example if
    you have a value of 1023, an interval of 100, and a from value of
    1500, it will be placed into the 1500 bucket vs. the normal bucket
    of 1000.
    */
  def from(from: stdLib.Number): HistogramFacet
  /*
    Computes values across the entire index
    */
  def global(trueFalse: scala.Boolean): HistogramFacet
  /*
    Sets the bucket interval used to calculate the distribution.
    */
  def interval(numericInterval: stdLib.Number): HistogramFacet
  /*
    Allows you to specify a different key field to be used to group intervals.
    */
  def keyField(fieldName: java.lang.String): HistogramFacet
  /*
    Allows you modify the key field using a script. The modified value
    is then used to generate the interval.
    */
  def keyScript(scriptCode: java.lang.String): HistogramFacet
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  def lang(language: java.lang.String): HistogramFacet
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: java.lang.String): HistogramFacet
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: java.lang.String): HistogramFacet
  /*
    Sets the type of ordering that will be performed on the date
    buckets.  Valid values are:
    key - the default, sort by the bucket's key value
    count - sort by the number of items in the bucket
    total - sort by the sum/total of the items in the bucket
    */
  def order(o: java.lang.String): HistogramFacet
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): HistogramFacet
  /*
    Computes values across the the specified scope
    */
  def scope(scope: java.lang.String): HistogramFacet
  /*
    Sets the bucket interval used to calculate the distribution based
    on a time value such as "1d", "1w", etc.
    */
  def timeInterval(timeInterval: stdLib.Number): HistogramFacet
  /*
    Sets the "to", "end", or upper bounds bucket.  For example if
    you have a value of 1023, an interval of 100, and a to value of
    900, it will be placed into the 900 bucket vs. the normal bucket
    of 1000.
    */
  def to(to: stdLib.Number): HistogramFacet
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Allows you to specify a different value field to aggrerate over.
    */
  def valueField(fieldName: java.lang.String): HistogramFacet
  /*
    Allows you modify the value field using a script. The modified value
    is then used to compute the statistical data.
    */
  def valueScript(scriptCode: java.lang.String): HistogramFacet
}

object HistogramFacet {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    cacheFilter: scala.Boolean => HistogramFacet,
    facetFilter: js.Object => HistogramFacet,
    field: java.lang.String => HistogramFacet,
    from: stdLib.Number => HistogramFacet,
    global: scala.Boolean => HistogramFacet,
    interval: stdLib.Number => HistogramFacet,
    keyField: java.lang.String => HistogramFacet,
    keyScript: java.lang.String => HistogramFacet,
    lang: java.lang.String => HistogramFacet,
    mode: java.lang.String => HistogramFacet,
    nested: java.lang.String => HistogramFacet,
    order: java.lang.String => HistogramFacet,
    params: js.Object => HistogramFacet,
    scope: java.lang.String => HistogramFacet,
    timeInterval: stdLib.Number => HistogramFacet,
    to: stdLib.Number => HistogramFacet,
    toJSON: () => js.Any,
    valueField: java.lang.String => HistogramFacet,
    valueScript: java.lang.String => HistogramFacet
  ): HistogramFacet = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), cacheFilter = js.Any.fromFunction1(cacheFilter), facetFilter = js.Any.fromFunction1(facetFilter), field = js.Any.fromFunction1(field), from = js.Any.fromFunction1(from), global = js.Any.fromFunction1(global), interval = js.Any.fromFunction1(interval), keyField = js.Any.fromFunction1(keyField), keyScript = js.Any.fromFunction1(keyScript), lang = js.Any.fromFunction1(lang), mode = js.Any.fromFunction1(mode), nested = js.Any.fromFunction1(nested), order = js.Any.fromFunction1(order), params = js.Any.fromFunction1(params), scope = js.Any.fromFunction1(scope), timeInterval = js.Any.fromFunction1(timeInterval), to = js.Any.fromFunction1(to), toJSON = js.Any.fromFunction0(toJSON), valueField = js.Any.fromFunction1(valueField), valueScript = js.Any.fromFunction1(valueScript))
  
    __obj.asInstanceOf[HistogramFacet]
  }
}

