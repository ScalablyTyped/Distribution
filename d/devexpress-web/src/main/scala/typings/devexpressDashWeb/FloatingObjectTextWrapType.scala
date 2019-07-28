package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectTextWrapType extends js.Object

@JSGlobal("FloatingObjectTextWrapType")
@js.native
object FloatingObjectTextWrapType extends js.Object {
  @js.native
  sealed trait None extends FloatingObjectTextWrapType
  
  @js.native
  sealed trait Square extends FloatingObjectTextWrapType
  
  @js.native
  sealed trait Through extends FloatingObjectTextWrapType
  
  @js.native
  sealed trait Tight extends FloatingObjectTextWrapType
  
  @js.native
  sealed trait TopAndBottom extends FloatingObjectTextWrapType
  
  /* 0 */ val None: typings.devexpressDashWeb.FloatingObjectTextWrapType.None with Double = js.native
  /* 4 */ val Square: typings.devexpressDashWeb.FloatingObjectTextWrapType.Square with Double = js.native
  /* 3 */ val Through: typings.devexpressDashWeb.FloatingObjectTextWrapType.Through with Double = js.native
  /* 2 */ val Tight: typings.devexpressDashWeb.FloatingObjectTextWrapType.Tight with Double = js.native
  /* 1 */ val TopAndBottom: typings.devexpressDashWeb.FloatingObjectTextWrapType.TopAndBottom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectTextWrapType with Double] = js.native
}

