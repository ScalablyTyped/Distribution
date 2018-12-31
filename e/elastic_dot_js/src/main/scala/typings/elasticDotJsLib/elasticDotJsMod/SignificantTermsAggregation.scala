package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SignificantTermsAggregation")
@js.native
class SignificantTermsAggregation protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.SignificantTermsAggregation {
  /*
    An aggregation that returns interesting or unusual occurrences of terms in
    a set.
    */
  def this(name: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  /* CompleteClass */
  override def agg(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SignificantTermsAggregation = js.native
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  /* CompleteClass */
  override def aggregation(agg: elasticDotJsLib.elasticDotJsMod.elasticjsNs.Aggregation): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SignificantTermsAggregation = js.native
  /*
    Allows you to filter out unwanted facet entries using a regular
    expression.  You can also optionally pass in a set of flags to apply
    to the regular expression.  Valid flags are: CASE_INSENSITIVE,
    MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL,
    COMMENTS, and UNICODE_CHAR_CLASS.  Separate multiple flags with a |
    character.
    */
  /* CompleteClass */
  override def exclude(exclude: java.lang.String, flags: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SignificantTermsAggregation = js.native
  /*
    Sets the execution hint determines how the aggregation is computed.
    Supported values are: map and ordinals.
    */
  /* CompleteClass */
  override def executionHint(h: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SignificantTermsAggregation = js.native
  /*
    Sets the field to gather terms from.
    */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SignificantTermsAggregation = js.native
  /*
    Sets the format expression for the terms.  Use for number or date
    formatting.
    */
  /* CompleteClass */
  override def format(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SignificantTermsAggregation = js.native
  /*
    Allows you to allow only specific entries using a regular
    expression.  You can also optionally pass in a set of flags to apply
    to the regular expression.  Valid flags are: CASE_INSENSITIVE,
    MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL,
    COMMENTS, and UNICODE_CHAR_CLASS.  Separate multiple flags with a |
    character.
    */
  /* CompleteClass */
  override def include(include: java.lang.String, flags: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SignificantTermsAggregation = js.native
  /*
    Only return terms that match more than a configured number of hits.
    */
  /* CompleteClass */
  override def minDocCount(num: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SignificantTermsAggregation = js.native
  /*
    Determines how many terms the coordinating node will request from
    each shard.
    */
  /* CompleteClass */
  override def shardSize(shardSize: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SignificantTermsAggregation = js.native
  /*
    Sets the number of aggregation entries that will be returned.
    */
  /* CompleteClass */
  override def size(size: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.SignificantTermsAggregation = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

