package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import typings.devexpressDashWeb.SpellingErrorType.Misspelling
import typings.devexpressDashWeb.SpellingErrorType.Repeating
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpellingErrorType with Double] = js.native
  /* 0 */ @js.native
  object Misspelling extends TopLevel[Misspelling with Double]
  
  /* 1 */ @js.native
  object Repeating extends TopLevel[Repeating with Double]
  
}

