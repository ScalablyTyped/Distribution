package typings.fluentuiReactFocus

import typings.fluentuiReactFocus.fluentuiReactFocusNumbers.`0`
import typings.fluentuiReactFocus.fluentuiReactFocusNumbers.`1`
import typings.fluentuiReactFocus.fluentuiReactFocusNumbers.`2`
import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluentui/react-focus", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class FocusZone protected ()
    extends typings.fluentuiReactFocus.focusZoneMod.FocusZone {
    def this(props: IFocusZoneProps) = this()
  }
  
  /* static members */
  @js.native
  object FocusZone extends js.Object {
    var defaultProps: IFocusZoneProps = js.native
    /** Used for testing purposes only. */
    def getOuterZones(): Double = js.native
  }
  
  @js.native
  object FocusZoneDirection extends js.Object {
    /* 2 */ val bidirectional: typings.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.bidirectional with Double = js.native
    /* 3 */ val domOrder: typings.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.domOrder with Double = js.native
    /* 1 */ val horizontal: typings.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.horizontal with Double = js.native
    /* 0 */ val vertical: typings.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection with Double] = js.native
  }
  
  @js.native
  object FocusZoneTabbableElements extends js.Object {
    /** All tabbing action is allowed */
    var all: `1` = js.native
    /** Tabbing is allowed only on input elements */
    var inputOnly: `2` = js.native
    /** Tabbing is not allowed */
    var none: `0` = js.native
  }
  
}

