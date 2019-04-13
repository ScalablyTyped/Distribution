package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TermsFacet")
@js.native
class TermsFacet protected () extends Facet {
  /*
    A facet which returns the N most frequent terms within a collection
    or set of collections.
    */
  def this(name: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Allows you to return all terms, even if the frequency count is 0. This should not be
    used on fields that contain a large number of unique terms because it could cause
    out-of-memory errors.
    */
  def allTerms(trueFalse: java.lang.String): TermsFacet = js.native
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: scala.Boolean): TermsFacet = js.native
  /*
    Allows you to filter out unwanted facet entries. When passed
    a single term, it is appended to the list of currently excluded
    terms.  If passed an array, it overwrites all existing values.
    */
  def exclude(exclude: java.lang.String): TermsFacet = js.native
  def exclude(exclude: js.Array[java.lang.String]): TermsFacet = js.native
  /*
    Sets the execution hint determines how the facet is computed.
    Currently only supported value is "map".
    */
  def executionHint(h: js.Object): TermsFacet = js.native
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): TermsFacet = js.native
  /*
    Sets the field to be used to construct the this facet.  Set to
    _index to return a facet count of hits per _index the search was
    executed on.
    */
  def field(fieldName: java.lang.String): TermsFacet = js.native
  /*
    Aggregate statistical info across a set of fields.
    */
  def fields(aFieldName: js.Array[_]): TermsFacet = js.native
  /*
    Computes values across the entire index
    */
  def global(trueFalse: scala.Boolean): TermsFacet = js.native
  /*
    The script language being used. Currently supported values are
    javascript, groovy, and mvel.
    */
  def lang(language: java.lang.String): TermsFacet = js.native
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: java.lang.String): TermsFacet = js.native
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: java.lang.String): TermsFacet = js.native
  /*
    Sets the type of ordering that will be performed on the date
    buckets.  Valid values are:
    count - default, sort by the number of items in the bucket
    term - sort by term value.
    reverse_count - reverse sort of the number of items in the bucket
    reverse_term - reverse sort of the term value.
    */
  def order(o: java.lang.String): TermsFacet = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): TermsFacet = js.native
  /*
    Allows you to only include facet entries matching a specified regular expression.
    */
  def regex(exp: java.lang.String): TermsFacet = js.native
  /*
    Allows you to set the regular expression flags to be used
    with the regex
    */
  def regexFlags(flags: java.lang.String): TermsFacet = js.native
  /*
    Computes values across the the specified scope
    */
  def scope(scope: java.lang.String): TermsFacet = js.native
  /*
    Allows you modify the term using a script. The modified value
    is then used in the facet collection.
    */
  def script(scriptCode: java.lang.String): TermsFacet = js.native
  /*
    Sets a script that will provide the terms for a given document.
    */
  def scriptField(script: java.lang.String): TermsFacet = js.native
  /*
    Determines how many terms the coordinating node will request from
    each shard.
    */
  def shardSize(shardSize: scala.Double): TermsFacet = js.native
  /*
    Sets the number of facet entries that will be returned for this facet. For instance, you
    might ask for only the top 5 authors although there might be hundreds of
    unique authors.
    */
  def size(facetSize: scala.Double): TermsFacet = js.native
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

