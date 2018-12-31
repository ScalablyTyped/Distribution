package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "CompletionSuggester")
@js.native
class CompletionSuggester protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester {
  /*
    A suggester that allows basic auto-complete functionality.
    */
  def this(name: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Sets analyzer used to analyze the suggest text.
    */
  /* CompleteClass */
  override def analyzer(analyzer: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester = js.native
  /*
    Maximum edit distance (fuzziness), defaults to 1.  Automatically
    enables fuzzy suggestions when set to any value.
    */
  /* CompleteClass */
  override def editDistance(d: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester = js.native
  /*
    Sets the field used to generate suggestions from.
    */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester = js.native
  /*
    Enable fuzzy completions which means a can spell a word
    incorrectly and still get a suggestion.
    */
  /* CompleteClass */
  override def fuzzy(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester = js.native
  /*
    Minimum length of the input before fuzzy suggestions are returned, defaults
    to 3.  Automatically enables fuzzy suggestions when set to any value.
    */
  /* CompleteClass */
  override def minLength(m: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester = js.native
  /*
    Minimum length of the input, which is not checked for fuzzy alternatives, defaults
    to 1.  Automatically enables fuzzy suggestions when set to any value.
    */
  /* CompleteClass */
  override def prefixLength(l: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester = js.native
  /*
    Sets the maximum number of suggestions to be retrieved from
    each individual shard.
    */
  /* CompleteClass */
  override def shardSize(s: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester = js.native
  /*
    Sets the number of suggestions returned for each token.
    */
  /* CompleteClass */
  override def size(s: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester = js.native
  /*
    Sets the text to get suggestions for.  If not set, the global
    suggestion text will be used.
    */
  /* CompleteClass */
  override def text(txt: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester = js.native
  /*
    Retrieves the internal suggest object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /*
    Sets if transpositions should be counted as one or two changes, defaults
    to true when fuzzy is enabled.  Automatically enables fuzzy suggestions
    when set to any value.
    */
  /* CompleteClass */
  override def transpositions(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester = js.native
  /*
    Sets all are measurements (like edit distance, transpositions and lengths)
    in unicode code points (actual letters) instead of bytes.  Automatically
    enables fuzzy suggestions when set to any value.
    */
  /* CompleteClass */
  override def unicodeAware(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.CompletionSuggester = js.native
}

