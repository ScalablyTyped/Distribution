package typings.fluentuiReactFocus

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZone
import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typings.react.mod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusZoneFocusZoneMod {
  
  @JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone", "FocusZone")
  @js.native
  open class FocusZone protected ()
    extends Component[IFocusZoneProps, js.Object, Any]
       with IFocusZone {
    def this(props: IFocusZoneProps) = this()
    
    /** The most recently focused child element. */
    /* private */ var _activeElement: Any = js.native
    
    /** The child element with tabindex=0. */
    /* private */ var _defaultFocusElement: Any = js.native
    
    /* private */ var _evaluateFocusBeforeRender: Any = js.native
    
    /* private */ var _focusAlignment: Any = js.native
    
    /* private */ var _getDocument: Any = js.native
    
    /**
      * Traverse to find first child zone.
      */
    /* private */ var _getFirstInnerZone: Any = js.native
    
    /* private */ var _getHorizontalDistanceFromCenter: Any = js.native
    
    /* private */ var _getOwnerZone: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _isContentEditableElement: Any = js.native
    
    /* private */ var _isElementInput: Any = js.native
    
    /* private */ var _isImmediateDescendantOfZone: Any = js.native
    
    /* private */ var _isInnerZone: Any = js.native
    
    /**
      * Flag to define when we've intentionally parked focus on the root element to temporarily
      * hold focus until items appear within the zone.
      */
    /* private */ var _isParked: Any = js.native
    
    /**
      * The index path to the last focused child element.
      */
    /* private */ var _lastIndexPath: Any = js.native
    
    /* private */ var _mergedRef: Any = js.native
    
    /* private */ var _moveFocus: Any = js.native
    
    /* private */ var _moveFocusDown: Any = js.native
    
    /* private */ var _moveFocusLeft: Any = js.native
    
    /* private */ var _moveFocusPaging: Any = js.native
    
    /* private */ var _moveFocusRight: Any = js.native
    
    /* private */ var _moveFocusUp: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onFocus: Any = js.native
    
    /**
      * Handle the keystrokes.
      */
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onMouseDown: Any = js.native
    
    /* private */ var _parkedTabIndex: Any = js.native
    
    /**
      * Returns true if the element is a descendant of the FocusZone through a React portal.
      */
    /* private */ var _portalContainsElement: Any = js.native
    
    /* private */ var _preventDefaultWhenHandled: Any = js.native
    
    /** Used to allow moving to next focusable element even when we're focusing on a input element when pressing tab */
    /* private */ var _processingTabKey: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _setActiveElement: Any = js.native
    
    /* private */ var _setFocusAlignment: Any = js.native
    
    /**
      * When focus is in the zone at render time but then all focusable elements are removed,
      * we "park" focus temporarily on the root. Once we update with focusable children, we restore
      * focus to the closest path from previous. If the user tabs away from the parked container,
      * we restore focusability to the pre-parked state.
      */
    /* private */ var _setParkedFocus: Any = js.native
    
    /* private */ var _shouldInputLoseFocus: Any = js.native
    
    /** Provides granular control over `shouldRaiseClicks` and should be preferred over `props.shouldRaiseClicks`. */
    /* private */ var _shouldRaiseClicksOnEnter: Any = js.native
    
    /* private */ var _shouldRaiseClicksOnSpace: Any = js.native
    
    /* private */ var _shouldWrapFocus: Any = js.native
    
    /**
      * Walk up the dom try to find a focusable element.
      */
    /* private */ var _tryInvokeClickForFocusable: Any = js.native
    
    /* private */ var _updateTabIndexes: Any = js.native
    
    def activeElement: HTMLElement | Null = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MFocusZone(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MFocusZone(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MFocusZone(): Unit = js.native
    
    def defaultFocusElement: HTMLElement | Null = js.native
  }
  /* static members */
  object FocusZone {
    
    @JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone", "FocusZone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handle global tab presses so that we can patch tabindexes on the fly.
      * HEADS UP: This must not be an arrow function in order to be referentially equal among instances
      * for ref counting to work correctly!
      */
    @JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone", "FocusZone._onKeyDownCapture")
    @js.native
    def _onKeyDownCapture: Any = js.native
    inline def _onKeyDownCapture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_onKeyDownCapture")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone", "FocusZone.defaultProps")
    @js.native
    def defaultProps: IFocusZoneProps = js.native
    inline def defaultProps_=(x: IFocusZoneProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /** Used for testing purposes only. */
    inline def getOuterZones(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterZones")().asInstanceOf[Double]
  }
}
