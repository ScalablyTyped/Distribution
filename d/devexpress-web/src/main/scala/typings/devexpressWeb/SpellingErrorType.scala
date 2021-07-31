package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpellingErrorType extends StObject
/**
  * Lists values specifying the spelling error type.
  */
@JSGlobal("SpellingErrorType")
@js.native
object SpellingErrorType extends StObject {
  
  /**
    * A misspelled word is found.
    */
  @js.native
  sealed trait Misspelling
    extends StObject
       with SpellingErrorType
  
  /**
    * A repeating word is found.
    */
  @js.native
  sealed trait Repeating
    extends StObject
       with SpellingErrorType
}
