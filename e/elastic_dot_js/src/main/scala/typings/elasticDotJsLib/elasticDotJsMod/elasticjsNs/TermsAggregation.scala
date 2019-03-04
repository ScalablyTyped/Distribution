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

object TermsAggregation {
  @scala.inline
  def apply(
    _type: js.Function0[java.lang.String],
    agg: js.Function1[Aggregation, TermsAggregation],
    aggregation: js.Function1[Aggregation, TermsAggregation],
    exclude: js.Function2[java.lang.String, java.lang.String, TermsAggregation],
    executionHint: js.Function1[java.lang.String, TermsAggregation],
    field: js.Function1[java.lang.String, TermsAggregation],
    format: js.Function1[java.lang.String, TermsAggregation],
    include: js.Function2[java.lang.String, java.lang.String, TermsAggregation],
    lang: js.Function1[java.lang.String, TermsAggregation],
    minDocCount: js.Function1[scala.Double, TermsAggregation],
    order: js.Function2[java.lang.String, java.lang.String, TermsAggregation],
    params: js.Function1[js.Object, TermsAggregation],
    script: js.Function1[java.lang.String, TermsAggregation],
    scriptValuesUnique: js.Function1[scala.Boolean, TermsAggregation],
    shardSize: js.Function1[scala.Double, TermsAggregation],
    size: js.Function1[scala.Double, TermsAggregation],
    toJSON: js.Function0[js.Any],
    valueType: js.Function1[java.lang.String, TermsAggregation]
  ): TermsAggregation = {
    val __obj = js.Dynamic.literal(_type = _type, agg = agg, aggregation = aggregation, exclude = exclude, executionHint = executionHint, field = field, format = format, include = include, lang = lang, minDocCount = minDocCount, order = order, params = params, script = script, scriptValuesUnique = scriptValuesUnique, shardSize = shardSize, size = size, toJSON = toJSON, valueType = valueType)
  
    __obj.asInstanceOf[TermsAggregation]
  }
}

