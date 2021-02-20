package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "Highlight")
@js.native
class Highlight protected () extends StObject {
  /*
    Allows to highlight search results on one or more fields.
    */
  def this(fields: String) = this()
  def this(fields: js.Array[String]) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Set's the boundary characters.  When highlighting a field that is
    mapped with term vectors, boundary_chars can be configured to
    define what constitutes a boundary for highlighting. It’s a single
    string with each boundary character defined in it. You can apply
    the option to a specific field by passing the field name in to
    the oField parameter. It defaults to ".,!? \t\n".
    */
  def boundaryChars(charStr: String, oField: String): Highlight = js.native
  
  /*
    Sets the max number of characters to scan while looking for the
    start of a boundary character. You can apply the option to a
    specific field by passing the field name in to the
    oField parameter. Default:  20
    */
  def boundaryMaxScan(cnt: Double, oField: String): Highlight = js.native
  
  /*
    Sets highlight encoder.  Valid values are:
    default - the default, no encoding
    html - to encode html characters if you use html tags
    */
  def encoder(e: String): Highlight = js.native
  
  /*
    Allows you to set the fields that will be highlighted.  You can
    specify a single field or an array of fields.  All fields are
    added to the current list of fields.
    */
  def fields(vals: String): Highlight = js.native
  def fields(vals: js.Array[String]): Highlight = js.native
  
  /*
    Sets the size of each highlight fragment in characters.
    You can apply the option to a specific field by passing the field
    name in to the oField parameter. Default:  100
    */
  def fragmentSize(size: Double, oField: String): Highlight = js.native
  
  /*
    Sets the fragmenter type.  You can apply the option
    to a specific field by passing the field name in to the
    oField parameter.  Valid values for order are:
    simple - breaks text up into same-size fragments with no concerns
    over spotting sentence boundaries.
    span - breaks text up into same-size fragments but does not split
    up Spans.
    */
  def fragmenter(f: String, oField: String): Highlight = js.native
  
  /*
    Enables highlights in documents matched by a filter.
    You can apply the option to a specific field by passing the field
    name in to the oField parameter.  Defaults to false.
    */
  def highlightFilter(trueFalse: Boolean, oField: String): Highlight = js.native
  
  /*
    Sets the number of highlight fragments.
    You can apply the option to a specific field by passing the field
    name in to the oField parameter. Default:  5
    */
  def numberOfFragments(cnt: Double, oField: String): Highlight = js.native
  
  /*
    Sets arbitrary options that can be passed to the highlighter
    implementation in use.
    */
  def options(opts: String, oField: String): Highlight = js.native
  
  /*
    Sets the order of highlight fragments.  You can apply the option
    to a specific field by passing the field name in to the
    oField parameter.  Valid values for order are:
    score - the score calculated by Lucene's highlighting framework.
    */
  def order(o: String, oField: String): Highlight = js.native
  
  /*
    Sets the post tags for highlighted fragments.  You can apply the
    tags to a specific field by passing the field name in to the
    oField parameter.
    */
  def postTags(tags: String, oField: String): Highlight = js.native
  def postTags(tags: js.Array[String], oField: String): Highlight = js.native
  
  /*
    Sets the pre tags for highlighted fragments.  You can apply the
    tags to a specific field by passing the field name in to the
    oField parameter.
    */
  def preTags(tags: String, oField: String): Highlight = js.native
  def preTags(tags: js.Array[String], oField: String): Highlight = js.native
  
  /*
    When enabled it will cause a field to be highlighted only if a
    query matched that field. false means that terms are highlighted
    on all requested fields regardless if the query matches
    specifically on them.  You can apply the option to a specific
    field by passing the field name in to the oField
    parameter.  Defaults to false.
    */
  def requireFieldMatch(trueFalse: Boolean, oField: String): Highlight = js.native
  
  /*
    Sets the schema to be used for the tags. Valid values are:
    styled - 10  pre tags with css class of hltN, where N is 1-10
    */
  def tagsSchema(s: String): Highlight = js.native
  
  /*
    Retrieves the internal script object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  
  /*
    Sets the highligher type.  You can apply the option
    to a specific field by passing the field name in to the
    oField parameter.  Valid values for order are:
    fast-vector-highlighter - the fast vector based highligher
    highlighter - the slower plain highligher
    */
  def `type`(t: String, oField: String): Highlight = js.native
}
