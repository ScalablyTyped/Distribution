package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the settings defining a misspelled interval.
  */
@js.native
trait MisspelledInterval extends StObject {
  
  /**
    * Gets the spelling error type.
    */
  val errorType: SpellingErrorType = js.native
  
  /**
    * Gets the text buffer interval occupied by the current element.
    */
  val interval: Interval = js.native
  
  /**
    * Gets the length of the misspelled interval.
    */
  val length: Double = js.native
  
  /**
    * Gets the start position of the misspelled word in the interval.
    */
  val start: Double = js.native
  
  /**
    * Gets a list of suggested words to replace the misspelled word.
    */
  val suggestions: js.Array[String] = js.native
  
  /**
    * Gets an erroneous word found during spell check.
    */
  val word: String = js.native
}
object MisspelledInterval {
  
  @scala.inline
  def apply(
    errorType: SpellingErrorType,
    interval: Interval,
    length: Double,
    start: Double,
    suggestions: js.Array[String],
    word: String
  ): MisspelledInterval = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[MisspelledInterval]
  }
  
  @scala.inline
  implicit class MisspelledIntervalMutableBuilder[Self <: MisspelledInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorType(value: SpellingErrorType): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Interval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
    
    @scala.inline
    def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
  }
}
