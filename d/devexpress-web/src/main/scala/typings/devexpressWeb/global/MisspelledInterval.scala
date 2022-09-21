package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the settings defining a misspelled interval.
  */
@JSGlobal("MisspelledInterval")
@js.native
open class MisspelledInterval ()
  extends StObject
     with typings.devexpressWeb.MisspelledInterval {
  
  /**
    * Gets the spelling error type.
    */
  /* CompleteClass */
  override val errorType: typings.devexpressWeb.SpellingErrorType = js.native
  
  /**
    * Gets the text buffer interval occupied by the current element.
    */
  /* CompleteClass */
  override val interval: typings.devexpressWeb.Interval = js.native
  
  /**
    * Gets the length of the misspelled interval.
    */
  /* CompleteClass */
  override val length: Double = js.native
  
  /**
    * Gets the start position of the misspelled word in the interval.
    */
  /* CompleteClass */
  override val start: Double = js.native
  
  /**
    * Gets a list of suggested words to replace the misspelled word.
    */
  /* CompleteClass */
  override val suggestions: js.Array[String] = js.native
  
  /**
    * Gets an erroneous word found during spell check.
    */
  /* CompleteClass */
  override val word: String = js.native
}
