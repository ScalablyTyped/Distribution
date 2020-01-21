package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "TermsAggregation")
@js.native
class TermsAggregation protected () extends Aggregation {
  /*
    Defines an aggregation of unique values/terms.
    */
  def this(name: String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): TermsAggregation = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): TermsAggregation = js.native
  /*
    Allows you to filter out unwanted facet entries using a regular
    expression.  You can also optionally pass in a set of flags to apply
    to the regular expression.  Valid flags are: CASE_INSENSITIVE,
    MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL,
    COMMENTS, and UNICODE_CHAR_CLASS.  Separate multiple flags with a |
    character.
    */
  def exclude(exclude: String, flags: String): TermsAggregation = js.native
  /*
    Sets the execution hint determines how the aggregation is computed.
    Supported values are: map and ordinals.
    */
  def executionHint(h: String): TermsAggregation = js.native
  /*
    Sets the field to gather terms from.
    */
  def field(field: String): TermsAggregation = js.native
  /*
    Sets the format expression for the terms.  Use for number or date
    formatting
    */
  def format(f: String): TermsAggregation = js.native
  /*
    Allows you to allow only specific entries using a regular
    expression.  You can also optionally pass in a set of flags to apply
    to the regular expression.  Valid flags are: CASE_INSENSITIVE,
    MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL,
    COMMENTS, and UNICODE_CHAR_CLASS.  Separate multiple flags with a |
    character.
    */
  def include(include: String, flags: String): TermsAggregation = js.native
  /*
    The script language being used.
    */
  def lang(language: String): TermsAggregation = js.native
  /*
    Only return terms that match more than a configured number of hits.
    */
  def minDocCount(num: Double): TermsAggregation = js.native
  /*
    Sets order for the aggregated values.
    */
  def order(order: String, direction: String): TermsAggregation = js.native
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): TermsAggregation = js.native
  /*
    Allows you generate or modify the terms using a script.
    */
  def script(scriptCode: String): TermsAggregation = js.native
  /*
    Set to true to assume script values are unique.
    */
  def scriptValuesUnique(trueFalse: Boolean): TermsAggregation = js.native
  /*
    Determines how many terms the coordinating node will request from
    each shard.
    */
  def shardSize(shardSize: Double): TermsAggregation = js.native
  /*
    Sets the number of aggregation entries that will be returned.
    */
  def size(size: Double): TermsAggregation = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  /*
    Sets the type of the field value for use in scripts.  Current values are:
    string, double, float, long, integer, short, and byte.
    */
  def valueType(v: String): TermsAggregation = js.native
}

