package typings.fluentuiReactFocus.focusZoneTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FocusZoneDirection extends js.Object
@JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone.types", "FocusZoneDirection")
@js.native
object FocusZoneDirection extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FocusZoneDirection with Double] = js.native
  
  /** React to all arrows. */
  @js.native
  sealed trait bidirectional extends FocusZoneDirection
  /* 2 */ @js.native
  object bidirectional extends TopLevel[bidirectional with Double]
  
  /**
    * React to all arrows. Navigate next item in DOM on right/down arrow keys and previous - left/up arrow keys.
    * Right and Left arrow keys are swapped in RTL mode.
    */
  @js.native
  sealed trait domOrder extends FocusZoneDirection
  /* 3 */ @js.native
  object domOrder extends TopLevel[domOrder with Double]
  
  /** Only react to left/right arrows. */
  @js.native
  sealed trait horizontal extends FocusZoneDirection
  /* 1 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  /** Only react to up/down arrows. */
  @js.native
  sealed trait vertical extends FocusZoneDirection
  /* 0 */ @js.native
  object vertical extends TopLevel[vertical with Double]
}
