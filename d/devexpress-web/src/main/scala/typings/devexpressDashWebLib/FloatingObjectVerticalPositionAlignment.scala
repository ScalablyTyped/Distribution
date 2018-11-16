package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectVerticalPositionAlignment extends js.Object

@JSGlobal("FloatingObjectVerticalPositionAlignment")
@js.native
object FloatingObjectVerticalPositionAlignment extends js.Object {
  @js.native
  sealed trait Bottom
    extends devexpressDashWebLib.FloatingObjectVerticalPositionAlignment
  
  @js.native
  sealed trait Center
    extends devexpressDashWebLib.FloatingObjectVerticalPositionAlignment
  
  @js.native
  sealed trait Inside
    extends devexpressDashWebLib.FloatingObjectVerticalPositionAlignment
  
  @js.native
  sealed trait None
    extends devexpressDashWebLib.FloatingObjectVerticalPositionAlignment
  
  @js.native
  sealed trait Outside
    extends devexpressDashWebLib.FloatingObjectVerticalPositionAlignment
  
  @js.native
  sealed trait Top
    extends devexpressDashWebLib.FloatingObjectVerticalPositionAlignment
  
  /* 3 */ val Bottom: Bottom with scala.Double = js.native
  /* 2 */ val Center: Center with scala.Double = js.native
  /* 4 */ val Inside: Inside with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 5 */ val Outside: Outside with scala.Double = js.native
  /* 1 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.FloatingObjectVerticalPositionAlignment with scala.Double] = js.native
}

