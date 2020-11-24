package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpellingErrorType extends js.Object
/**
  * Lists values specifying the spelling error type.
  */
@JSGlobal("SpellingErrorType")
@js.native
object SpellingErrorType extends js.Object {
  
  /**
    * A misspelled word is found.
    */
  @js.native
  sealed trait Misspelling extends SpellingErrorType
  
  /**
    * A repeating word is found.
    */
  @js.native
  sealed trait Repeating extends SpellingErrorType
}
