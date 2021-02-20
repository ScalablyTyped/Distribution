package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "CompletionSuggester")
@js.native
class CompletionSuggester protected () extends Suggest {
  /*
    A suggester that allows basic auto-complete functionality.
    */
  def this(name: String) = this()
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets analyzer used to analyze the suggest text.
    */
  def analyzer(analyzer: String): CompletionSuggester = js.native
  
  /*
    Maximum edit distance (fuzziness), defaults to 1.  Automatically
    enables fuzzy suggestions when set to any value.
    */
  def editDistance(d: Double): CompletionSuggester = js.native
  
  /*
    Sets the field used to generate suggestions from.
    */
  def field(field: String): CompletionSuggester = js.native
  
  /*
    Enable fuzzy completions which means a can spell a word
    incorrectly and still get a suggestion.
    */
  def fuzzy(trueFalse: Boolean): CompletionSuggester = js.native
  
  /*
    Minimum length of the input before fuzzy suggestions are returned, defaults
    to 3.  Automatically enables fuzzy suggestions when set to any value.
    */
  def minLength(m: Double): CompletionSuggester = js.native
  
  /*
    Minimum length of the input, which is not checked for fuzzy alternatives, defaults
    to 1.  Automatically enables fuzzy suggestions when set to any value.
    */
  def prefixLength(l: Double): CompletionSuggester = js.native
  
  /*
    Sets the maximum number of suggestions to be retrieved from
    each individual shard.
    */
  def shardSize(s: Double): CompletionSuggester = js.native
  
  /*
    Sets the number of suggestions returned for each token.
    */
  def size(s: Double): CompletionSuggester = js.native
  
  /*
    Sets the text to get suggestions for.  If not set, the global
    suggestion text will be used.
    */
  def text(txt: String): CompletionSuggester = js.native
  
  /*
    Retrieves the internal suggest object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
  
  /*
    Sets if transpositions should be counted as one or two changes, defaults
    to true when fuzzy is enabled.  Automatically enables fuzzy suggestions
    when set to any value.
    */
  def transpositions(trueFalse: Boolean): CompletionSuggester = js.native
  
  /*
    Sets all are measurements (like edit distance, transpositions and lengths)
    in unicode code points (actual letters) instead of bytes.  Automatically
    enables fuzzy suggestions when set to any value.
    */
  def unicodeAware(trueFalse: Boolean): CompletionSuggester = js.native
}
