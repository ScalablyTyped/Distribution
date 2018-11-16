package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectTextWrapType extends js.Object

@JSGlobal("FloatingObjectTextWrapType")
@js.native
object FloatingObjectTextWrapType extends js.Object {
  @js.native
  sealed trait None
    extends devexpressDashWebLib.FloatingObjectTextWrapType
  
  @js.native
  sealed trait Square
    extends devexpressDashWebLib.FloatingObjectTextWrapType
  
  @js.native
  sealed trait Through
    extends devexpressDashWebLib.FloatingObjectTextWrapType
  
  @js.native
  sealed trait Tight
    extends devexpressDashWebLib.FloatingObjectTextWrapType
  
  @js.native
  sealed trait TopAndBottom
    extends devexpressDashWebLib.FloatingObjectTextWrapType
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val Square: Square with scala.Double = js.native
  /* 3 */ val Through: Through with scala.Double = js.native
  /* 2 */ val Tight: Tight with scala.Double = js.native
  /* 1 */ val TopAndBottom: TopAndBottom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.FloatingObjectTextWrapType with scala.Double] = js.native
}

