package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TermsFilter")
@js.native
class TermsFilter protected () extends Filter {
  /*
    A Filter that matches documents containing provided terms.
    */
  def this(field: String, terms: String) = this()
  def this(field: String, terms: js.Array[String]) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: Boolean): TermsFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: String): TermsFilter = js.native
  /*
    Enable or disable caching of the lookup
    */
  def cacheLookup(trueFalse: Boolean): TermsFilter = js.native
  /*
    Sets the way terms filter executes is by iterating over the terms
    provided and finding matches docs (loading into a bitset) and
    caching it.  Valid values are: plain, bool, bool_nocache, and,
    and_nocache, or, or_nocache.  Defaults to plain.
    */
  def execution(e: String): TermsFilter = js.native
  /*
    Sets the fields to filter against.
    */
  def field(f: String): TermsFilter = js.native
  /*
    Sets the document id of the document containing the terms to use
    when performing a terms lookup.
    */
  def id(id: String): TermsFilter = js.native
  /*
    Sets the index the document containing the terms is in when
    performing a terms lookup.  Defaults to the index currently
    being searched.
    */
  def index(idx: String): TermsFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: String): TermsFilter = js.native
  /*
    Sets the path/field name where the terms in the source document
    are located when performing a terms lookup.
    */
  def path(path: String): TermsFilter = js.native
  /*
    Sets the routing value for the source document when performing a
    terms lookup.
    */
  def routing(path: String): TermsFilter = js.native
  /*
    Sets the terms.  If t is a String, it is added to the existing
    list of terms.  If t is an array, the list of terms replaces the
    existing terms.
    */
  def terms(t: String): TermsFilter = js.native
  def terms(t: js.Array[String]): TermsFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): TermsFilter = js.native
  /*
    Sets the type the document containing the terms when performing a
    terms lookup.
    */
  def `type`(`type`: String): TermsFilter = js.native
}

