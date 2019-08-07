package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val Misspelling: typings.devexpressDashWeb.SpellingErrorType.Misspelling with Double = js.native
  /* 1 */ val Repeating: typings.devexpressDashWeb.SpellingErrorType.Repeating with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpellingErrorType with Double] = js.native
}

