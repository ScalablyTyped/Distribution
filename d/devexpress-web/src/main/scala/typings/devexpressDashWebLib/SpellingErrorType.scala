package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpellingErrorType extends js.Object

@JSGlobal("SpellingErrorType")
@js.native
object SpellingErrorType extends js.Object {
  @js.native
  sealed trait Misspelling
    extends devexpressDashWebLib.SpellingErrorType
  
  @js.native
  sealed trait Repeating
    extends devexpressDashWebLib.SpellingErrorType
  
  /* 0 */ val Misspelling: Misspelling with scala.Double = js.native
  /* 1 */ val Repeating: Repeating with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.SpellingErrorType with scala.Double] = js.native
}

