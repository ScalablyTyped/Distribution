package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermStatsFacet extends Facet {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Allows you to return all terms, even if the frequency count is 0. This should not be
    used on fields that contain a large number of unique terms because it could cause
    out-of-memory errors.
    */
  def allTerms(trueFalse: java.lang.String): TermStatsFacet
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: scala.Boolean): TermStatsFacet
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): TermStatsFacet
  /*
    Computes values across the entire index
    */
  def global(trueFalse: scala.Boolean): TermStatsFacet
  /*
    Sets the field which will be used to pivot on (group-by).
    */
  def keyField(fieldName: java.lang.String): TermStatsFacet
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  def lang(language: java.lang.String): TermStatsFacet
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: java.lang.String): TermStatsFacet
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: java.lang.String): TermStatsFacet
  /*
    Sets the type of ordering that will be performed on the date
    buckets.  Valid values are:
    count - default, sort by the number of items in the bucket
    term - sort by term value.
    reverse_count - reverse sort of the number of items in the bucket
    reverse_term - reverse sort of the term value.
    total - sorts by the total value of the bucket contents
    reverse_total - reverse sort of the total value of bucket contents
    min - the minimum value in the bucket
    reverse_min - the reverse sort of the minimum value
    max - the maximum value in the bucket
    reverse_max - the reverse sort of the maximum value
    mean - the mean value of the bucket contents
    reverse_mean - the reverse sort of the mean value of bucket contents.
    */
  def order(o: java.lang.String): TermStatsFacet
  /*
    Allows you to set script parameters to be used during the execution of the script.
    */
  def params(oParams: js.Object): TermStatsFacet
  /*
    Computes values across the the specified scope
    */
  def scope(scope: java.lang.String): TermStatsFacet
  /*
    Sets a script that will provide the terms for a given document.
    */
  def scriptField(script: java.lang.String): TermStatsFacet
  /*
    Sets the number of facet entries that will be returned for this facet. For instance, you
    might ask for only the top 5 aggregate keys although there might be hundreds of
    unique keys. Higher settings could cause memory strain.
    */
  def size(facetSize: scala.Double): TermStatsFacet
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Sets the field for which statistical information will be generated.
    */
  def valueField(fieldName: java.lang.String): TermStatsFacet
  /*
    Define a script to evaluate of which the result will be used to generate
    the statistical information.
    */
  def valueScript(code: java.lang.String): TermStatsFacet
}

object TermStatsFacet {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    allTerms: java.lang.String => TermStatsFacet,
    cacheFilter: scala.Boolean => TermStatsFacet,
    facetFilter: js.Object => TermStatsFacet,
    global: scala.Boolean => TermStatsFacet,
    keyField: java.lang.String => TermStatsFacet,
    lang: java.lang.String => TermStatsFacet,
    mode: java.lang.String => TermStatsFacet,
    nested: java.lang.String => TermStatsFacet,
    order: java.lang.String => TermStatsFacet,
    params: js.Object => TermStatsFacet,
    scope: java.lang.String => TermStatsFacet,
    scriptField: java.lang.String => TermStatsFacet,
    size: scala.Double => TermStatsFacet,
    toJSON: () => js.Any,
    valueField: java.lang.String => TermStatsFacet,
    valueScript: java.lang.String => TermStatsFacet
  ): TermStatsFacet = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), allTerms = js.Any.fromFunction1(allTerms), cacheFilter = js.Any.fromFunction1(cacheFilter), facetFilter = js.Any.fromFunction1(facetFilter), global = js.Any.fromFunction1(global), keyField = js.Any.fromFunction1(keyField), lang = js.Any.fromFunction1(lang), mode = js.Any.fromFunction1(mode), nested = js.Any.fromFunction1(nested), order = js.Any.fromFunction1(order), params = js.Any.fromFunction1(params), scope = js.Any.fromFunction1(scope), scriptField = js.Any.fromFunction1(scriptField), size = js.Any.fromFunction1(size), toJSON = js.Any.fromFunction0(toJSON), valueField = js.Any.fromFunction1(valueField), valueScript = js.Any.fromFunction1(valueScript))
  
    __obj.asInstanceOf[TermStatsFacet]
  }
}

