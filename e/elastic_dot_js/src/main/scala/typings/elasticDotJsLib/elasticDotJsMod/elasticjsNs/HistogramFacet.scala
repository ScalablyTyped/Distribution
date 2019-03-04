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
    _type: js.Function0[java.lang.String],
    cacheFilter: js.Function1[scala.Boolean, HistogramFacet],
    facetFilter: js.Function1[js.Object, HistogramFacet],
    field: js.Function1[java.lang.String, HistogramFacet],
    from: js.Function1[stdLib.Number, HistogramFacet],
    global: js.Function1[scala.Boolean, HistogramFacet],
    interval: js.Function1[stdLib.Number, HistogramFacet],
    keyField: js.Function1[java.lang.String, HistogramFacet],
    keyScript: js.Function1[java.lang.String, HistogramFacet],
    lang: js.Function1[java.lang.String, HistogramFacet],
    mode: js.Function1[java.lang.String, HistogramFacet],
    nested: js.Function1[java.lang.String, HistogramFacet],
    order: js.Function1[java.lang.String, HistogramFacet],
    params: js.Function1[js.Object, HistogramFacet],
    scope: js.Function1[java.lang.String, HistogramFacet],
    timeInterval: js.Function1[stdLib.Number, HistogramFacet],
    to: js.Function1[stdLib.Number, HistogramFacet],
    toJSON: js.Function0[js.Any],
    valueField: js.Function1[java.lang.String, HistogramFacet],
    valueScript: js.Function1[java.lang.String, HistogramFacet]
  ): HistogramFacet = {
    val __obj = js.Dynamic.literal(_type = _type, cacheFilter = cacheFilter, facetFilter = facetFilter, field = field, from = from, global = global, interval = interval, keyField = keyField, keyScript = keyScript, lang = lang, mode = mode, nested = nested, order = order, params = params, scope = scope, timeInterval = timeInterval, to = to, toJSON = toJSON, valueField = valueField, valueScript = valueScript)
  
    __obj.asInstanceOf[HistogramFacet]
  }
}

