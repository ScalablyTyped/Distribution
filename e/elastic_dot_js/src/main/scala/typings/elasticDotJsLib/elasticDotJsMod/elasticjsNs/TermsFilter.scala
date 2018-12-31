package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermsFilter extends Filter {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): TermsFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): TermsFilter = js.native
  /*
    Enable or disable caching of the lookup
    */
  def cacheLookup(trueFalse: scala.Boolean): TermsFilter = js.native
  /*
    Sets the way terms filter executes is by iterating over the terms
    provided and finding matches docs (loading into a bitset) and
    caching it.  Valid values are: plain, bool, bool_nocache, and,
    and_nocache, or, or_nocache.  Defaults to plain.
    */
  def execution(e: java.lang.String): TermsFilter = js.native
  /*
    Sets the fields to filter against.
    */
  def field(f: java.lang.String): TermsFilter = js.native
  /*
    Sets the document id of the document containing the terms to use
    when performing a terms lookup.
    */
  def id(id: java.lang.String): TermsFilter = js.native
  /*
    Sets the index the document containing the terms is in when
    performing a terms lookup.  Defaults to the index currently
    being searched.
    */
  def index(idx: java.lang.String): TermsFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): TermsFilter = js.native
  /*
    Sets the path/field name where the terms in the source document
    are located when performing a terms lookup.
    */
  def path(path: java.lang.String): TermsFilter = js.native
  /*
    Sets the routing value for the source document when performing a
    terms lookup.
    */
  def routing(path: java.lang.String): TermsFilter = js.native
  /*
    Sets the terms.  If t is a String, it is added to the existing
    list of terms.  If t is an array, the list of terms replaces the
    existing terms.
    */
  def terms(t: java.lang.String): TermsFilter = js.native
  def terms(t: js.Array[java.lang.String]): TermsFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): TermsFilter = js.native
  /*
    Sets the type the document containing the terms when performing a
    terms lookup.
    */
  def `type`(`type`: java.lang.String): TermsFilter = js.native
}

