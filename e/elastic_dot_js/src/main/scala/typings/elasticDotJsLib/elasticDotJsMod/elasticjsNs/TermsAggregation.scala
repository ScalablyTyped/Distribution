package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermsAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): TermsAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): TermsAggregation
  /*
    Allows you to filter out unwanted facet entries using a regular
    expression.  You can also optionally pass in a set of flags to apply
    to the regular expression.  Valid flags are: CASE_INSENSITIVE,
    MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL,
    COMMENTS, and UNICODE_CHAR_CLASS.  Separate multiple flags with a |
    character.
    */
  def exclude(exclude: java.lang.String, flags: java.lang.String): TermsAggregation
  /*
    Sets the execution hint determines how the aggregation is computed.
    Supported values are: map and ordinals.
    */
  def executionHint(h: java.lang.String): TermsAggregation
  /*
    Sets the field to gather terms from.
    */
  def field(field: java.lang.String): TermsAggregation
  /*
    Sets the format expression for the terms.  Use for number or date
    formatting
    */
  def format(f: java.lang.String): TermsAggregation
  /*
    Allows you to allow only specific entries using a regular
    expression.  You can also optionally pass in a set of flags to apply
    to the regular expression.  Valid flags are: CASE_INSENSITIVE,
    MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL,
    COMMENTS, and UNICODE_CHAR_CLASS.  Separate multiple flags with a |
    character.
    */
  def include(include: java.lang.String, flags: java.lang.String): TermsAggregation
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): TermsAggregation
  /*
    Only return terms that match more than a configured number of hits.
    */
  def minDocCount(num: scala.Double): TermsAggregation
  /*
    Sets order for the aggregated values.
    */
  def order(order: java.lang.String, direction: java.lang.String): TermsAggregation
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): TermsAggregation
  /*
    Allows you generate or modify the terms using a script.
    */
  def script(scriptCode: java.lang.String): TermsAggregation
  /*
    Set to true to assume script values are unique.
    */
  def scriptValuesUnique(trueFalse: scala.Boolean): TermsAggregation
  /*
    Determines how many terms the coordinating node will request from
    each shard.
    */
  def shardSize(shardSize: scala.Double): TermsAggregation
  /*
    Sets the number of aggregation entries that will be returned.
    */
  def size(size: scala.Double): TermsAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
  /*
    Sets the type of the field value for use in scripts.  Current values are:
    string, double, float, long, integer, short, and byte.
    */
  def valueType(v: java.lang.String): TermsAggregation
}

