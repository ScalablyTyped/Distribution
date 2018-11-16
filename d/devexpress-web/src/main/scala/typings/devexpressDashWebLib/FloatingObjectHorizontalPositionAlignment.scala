package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectHorizontalPositionAlignment extends js.Object

@JSGlobal("FloatingObjectHorizontalPositionAlignment")
@js.native
object FloatingObjectHorizontalPositionAlignment extends js.Object {
  @js.native
  sealed trait Center
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionAlignment
  
  @js.native
  sealed trait Inside
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionAlignment
  
  @js.native
  sealed trait Left
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionAlignment
  
  @js.native
  sealed trait None
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionAlignment
  
  @js.native
  sealed trait Outside
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionAlignment
  
  @js.native
  sealed trait Right
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionAlignment
  
  /* 2 */ val Center: Center with scala.Double = js.native
  /* 4 */ val Inside: Inside with scala.Double = js.native
  /* 1 */ val Left: Left with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 5 */ val Outside: Outside with scala.Double = js.native
  /* 3 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.FloatingObjectHorizontalPositionAlignment with scala.Double] = js.native
}

