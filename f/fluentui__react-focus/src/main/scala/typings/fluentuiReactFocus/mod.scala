package typings.fluentuiReactFocus

import typings.fluentuiReactFocus.fluentuiReactFocusInts.`0`
import typings.fluentuiReactFocus.fluentuiReactFocusInts.`1`
import typings.fluentuiReactFocus.fluentuiReactFocusInts.`2`
import typings.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.IFocusZoneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/react-focus", "FocusZone")
  @js.native
  open class FocusZone protected ()
    extends typings.fluentuiReactFocus.libComponentsFocusZoneMod.FocusZone {
    def this(props: IFocusZoneProps) = this()
  }
  /* static members */
  object FocusZone {
    
    @JSImport("@fluentui/react-focus", "FocusZone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handle global tab presses so that we can patch tabindexes on the fly.
      * HEADS UP: This must not be an arrow function in order to be referentially equal among instances
      * for ref counting to work correctly!
      */
    @JSImport("@fluentui/react-focus", "FocusZone._onKeyDownCapture")
    @js.native
    def _onKeyDownCapture: Any = js.native
    inline def _onKeyDownCapture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_onKeyDownCapture")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-focus", "FocusZone.defaultProps")
    @js.native
    def defaultProps: IFocusZoneProps = js.native
    inline def defaultProps_=(x: IFocusZoneProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /** Used for testing purposes only. */
    inline def getOuterZones(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterZones")().asInstanceOf[Double]
  }
  
  @JSImport("@fluentui/react-focus", "FocusZoneDirection")
  @js.native
  object FocusZoneDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection & Double
      ] = js.native
    
    /* 2 */ val bidirectional: typings.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.bidirectional & Double = js.native
    
    /* 3 */ val domOrder: typings.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.domOrder & Double = js.native
    
    /* 1 */ val horizontal: typings.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.horizontal & Double = js.native
    
    /* 0 */ val vertical: typings.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.FocusZoneDirection.vertical & Double = js.native
  }
  
  object FocusZoneTabbableElements {
    
    @JSImport("@fluentui/react-focus", "FocusZoneTabbableElements")
    @js.native
    val ^ : js.Any = js.native
    
    /** All tabbing action is allowed */
    @JSImport("@fluentui/react-focus", "FocusZoneTabbableElements.all")
    @js.native
    def all: `1` = js.native
    inline def all_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    /** Tabbing is allowed only on input elements */
    @JSImport("@fluentui/react-focus", "FocusZoneTabbableElements.inputOnly")
    @js.native
    def inputOnly: `2` = js.native
    inline def inputOnly_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputOnly")(x.asInstanceOf[js.Any])
    
    /** Tabbing is not allowed */
    @JSImport("@fluentui/react-focus", "FocusZoneTabbableElements.none")
    @js.native
    def none: `0` = js.native
    inline def none_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
}
