package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectVerticalPositionAlignment extends js.Object

@JSGlobal("FloatingObjectVerticalPositionAlignment")
@js.native
object FloatingObjectVerticalPositionAlignment extends js.Object {
  @js.native
  sealed trait Bottom extends FloatingObjectVerticalPositionAlignment
  
  @js.native
  sealed trait Center extends FloatingObjectVerticalPositionAlignment
  
  @js.native
  sealed trait Inside extends FloatingObjectVerticalPositionAlignment
  
  @js.native
  sealed trait None extends FloatingObjectVerticalPositionAlignment
  
  @js.native
  sealed trait Outside extends FloatingObjectVerticalPositionAlignment
  
  @js.native
  sealed trait Top extends FloatingObjectVerticalPositionAlignment
  
  /* 3 */ val Bottom: typings.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.Bottom with Double = js.native
  /* 2 */ val Center: typings.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.Center with Double = js.native
  /* 4 */ val Inside: typings.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.Inside with Double = js.native
  /* 0 */ val None: typings.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.None with Double = js.native
  /* 5 */ val Outside: typings.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.Outside with Double = js.native
  /* 1 */ val Top: typings.devexpressDashWeb.FloatingObjectVerticalPositionAlignment.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectVerticalPositionAlignment with Double] = js.native
}

