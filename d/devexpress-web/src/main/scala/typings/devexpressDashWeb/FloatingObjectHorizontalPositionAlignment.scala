package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectHorizontalPositionAlignment extends js.Object

@JSGlobal("FloatingObjectHorizontalPositionAlignment")
@js.native
object FloatingObjectHorizontalPositionAlignment extends js.Object {
  @js.native
  sealed trait Center extends FloatingObjectHorizontalPositionAlignment
  
  @js.native
  sealed trait Inside extends FloatingObjectHorizontalPositionAlignment
  
  @js.native
  sealed trait Left extends FloatingObjectHorizontalPositionAlignment
  
  @js.native
  sealed trait None extends FloatingObjectHorizontalPositionAlignment
  
  @js.native
  sealed trait Outside extends FloatingObjectHorizontalPositionAlignment
  
  @js.native
  sealed trait Right extends FloatingObjectHorizontalPositionAlignment
  
  /* 2 */ val Center: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Center with Double = js.native
  /* 4 */ val Inside: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Inside with Double = js.native
  /* 1 */ val Left: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Left with Double = js.native
  /* 0 */ val None: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.None with Double = js.native
  /* 5 */ val Outside: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Outside with Double = js.native
  /* 3 */ val Right: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectHorizontalPositionAlignment with Double] = js.native
}

