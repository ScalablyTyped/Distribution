package typings.elasticJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elastic.js", "DirectGenerator")
@js.native
/*
  A candidate generator that generates terms based on edit distance.
  */
class DirectGenerator () extends Generator {
  
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): String = js.native
  
  /*
    Sets the accuracy.  How similar the suggested terms at least
    need to be compared to the original suggest text.
    */
  def accuracy(a: Double): DirectGenerator = js.native
  
  /*
    Sets the field used to generate suggestions from.
    */
  def field(field: String): DirectGenerator = js.native
  
  /*
    Sets the maximum edit distance candidate suggestions can have
    in order to be considered as a suggestion.
    */
  def maxEdits(max: Double): DirectGenerator = js.native
  
  /*
    The factor that is used to multiply with the size in order
    to inspect more candidate suggestions.
    */
  def maxInspections(max: Double): DirectGenerator = js.native
  
  /*
    Sets a maximum threshold in number of documents a suggest text
    token can exist in order to be corrected.
    */
  def maxTermFreq(max: Double): DirectGenerator = js.native
  
  /*
    Sets a minimal threshold of the number of documents a suggested
    term should appear in.
    */
  def minDocFreq(min: Double): DirectGenerator = js.native
  
  /*
    Sets the minimum length a suggest text term must have in order
    to be corrected.
    */
  def minWordLen(len: Double): DirectGenerator = js.native
  
  /*
    Sets an analyzer that is applied to each of the generated tokens
    before they are passed to the actual phrase scorer.
    */
  def postFilter(analyzer: String): DirectGenerator = js.native
  
  /*
    Sets an analyzer that is applied to each of the tokens passed to
    this generator.  The analyzer is applied to the original tokens,
    not the generated tokens.
    */
  def preFilter(analyzer: String): DirectGenerator = js.native
  
  /*
    Sets the number of suggestions returned for each token.
    */
  def size(s: Double): DirectGenerator = js.native
  
  /*
    Sets the sort mode.  Valid values are:
    score - Sort by score first, then document frequency, and then the term itself
    frequency - Sort by document frequency first, then simlarity score and then the term itself
    */
  def sort(s: String): DirectGenerator = js.native
  
  /*
    Sets what string distance implementation to use for comparing
    how similar suggested terms are.  Valid values are:
    internal - based on damerau_levenshtein but but highly optimized for comparing string distance for terms inside the index
    damerau_levenshtein - String distance algorithm based on Damerau-Levenshtein algorithm
    levenstein - String distance algorithm based on Levenstein edit distance algorithm
    jarowinkler - String distance algorithm based on Jaro-Winkler algorithm
    ngram - String distance algorithm based on character n-grams
    */
  def stringDistance(s: String): DirectGenerator = js.native
  
  /*
    Sets the suggest mode.  Valid values are:
    missing - Only suggest terms in the suggest text that aren't in the index
    popular - Only suggest suggestions that occur in more docs then the original suggest text term
    always - Suggest any matching suggestions based on terms in the suggest text
    */
  def suggestMode(m: String): DirectGenerator = js.native
  
  /*
    Retrieves the internal generator object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}
