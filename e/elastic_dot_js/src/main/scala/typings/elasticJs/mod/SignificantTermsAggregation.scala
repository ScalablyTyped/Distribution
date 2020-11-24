package typings.elasticJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "SignificantTermsAggregation")
@js.native
class SignificantTermsAggregation protected () extends Aggregation {
  /*
    An aggregation that returns interesting or unusual occurrences of terms in
    a set.
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
  def agg(agg: Aggregation): SignificantTermsAggregation = js.native
  
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): SignificantTermsAggregation = js.native
  
  /*
    Allows you to filter out unwanted facet entries using a regular
    expression.  You can also optionally pass in a set of flags to apply
    to the regular expression.  Valid flags are: CASE_INSENSITIVE,
    MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL,
    COMMENTS, and UNICODE_CHAR_CLASS.  Separate multiple flags with a |
    character.
    */
  def exclude(exclude: String, flags: String): SignificantTermsAggregation = js.native
  
  /*
    Sets the execution hint determines how the aggregation is computed.
    Supported values are: map and ordinals.
    */
  def executionHint(h: String): SignificantTermsAggregation = js.native
  
  /*
    Sets the field to gather terms from.
    */
  def field(field: String): SignificantTermsAggregation = js.native
  
  /*
    Sets the format expression for the terms.  Use for number or date
    formatting.
    */
  def format(f: String): SignificantTermsAggregation = js.native
  
  /*
    Allows you to allow only specific entries using a regular
    expression.  You can also optionally pass in a set of flags to apply
    to the regular expression.  Valid flags are: CASE_INSENSITIVE,
    MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL,
    COMMENTS, and UNICODE_CHAR_CLASS.  Separate multiple flags with a |
    character.
    */
  def include(include: String, flags: String): SignificantTermsAggregation = js.native
  
  /*
    Only return terms that match more than a configured number of hits.
    */
  def minDocCount(num: Double): SignificantTermsAggregation = js.native
  
  /*
    Determines how many terms the coordinating node will request from
    each shard.
    */
  def shardSize(shardSize: Double): SignificantTermsAggregation = js.native
  
  /*
    Sets the number of aggregation entries that will be returned.
    */
  def size(size: Double): SignificantTermsAggregation = js.native
  
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
