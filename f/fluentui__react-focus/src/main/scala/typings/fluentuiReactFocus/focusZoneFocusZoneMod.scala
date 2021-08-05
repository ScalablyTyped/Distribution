package typings.fluentuiReactFocus

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZone
import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusZoneFocusZoneMod {
  
  @JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone", "FocusZone")
  @js.native
  class FocusZone protected ()
    extends Component[IFocusZoneProps, js.Object, js.Any]
       with IFocusZone {
    def this(props: IFocusZoneProps) = this()
    
    /** The most recently focused child element. */
    /* private */ var _activeElement: js.Any = js.native
    
    /** The child element with tabindex=0. */
    /* private */ var _defaultFocusElement: js.Any = js.native
    
    /* private */ var _evaluateFocusBeforeRender: js.Any = js.native
    
    /* private */ var _focusAlignment: js.Any = js.native
    
    /* private */ var _getDocument: js.Any = js.native
    
    /**
      * Traverse to find first child zone.
      */
    /* private */ var _getFirstInnerZone: js.Any = js.native
    
    /* private */ var _getHorizontalDistanceFromCenter: js.Any = js.native
    
    /* private */ var _getOwnerZone: js.Any = js.native
    
    /* private */ var _id: js.Any = js.native
    
    /* private */ var _isContentEditableElement: js.Any = js.native
    
    /* private */ var _isElementInput: js.Any = js.native
    
    /* private */ var _isImmediateDescendantOfZone: js.Any = js.native
    
    /* private */ var _isInnerZone: js.Any = js.native
    
    /**
      * Flag to define when we've intentionally parked focus on the root element to temporarily
      * hold focus until items appear within the zone.
      */
    /* private */ var _isParked: js.Any = js.native
    
    /**
      * The index path to the last focused child element.
      */
    /* private */ var _lastIndexPath: js.Any = js.native
    
    /* private */ var _mergedRef: js.Any = js.native
    
    /* private */ var _moveFocus: js.Any = js.native
    
    /* private */ var _moveFocusDown: js.Any = js.native
    
    /* private */ var _moveFocusLeft: js.Any = js.native
    
    /* private */ var _moveFocusPaging: js.Any = js.native
    
    /* private */ var _moveFocusRight: js.Any = js.native
    
    /* private */ var _moveFocusUp: js.Any = js.native
    
    /* private */ var _onBlur: js.Any = js.native
    
    /* private */ var _onFocus: js.Any = js.native
    
    /**
      * Handle the keystrokes.
      */
    /* private */ var _onKeyDown: js.Any = js.native
    
    /* private */ var _onMouseDown: js.Any = js.native
    
    /* private */ var _parkedTabIndex: js.Any = js.native
    
    /**
      * Returns true if the element is a descendant of the FocusZone through a React portal.
      */
    /* private */ var _portalContainsElement: js.Any = js.native
    
    /* private */ var _preventDefaultWhenHandled: js.Any = js.native
    
    /** Used to allow moving to next focusable element even when we're focusing on a input element when pressing tab */
    /* private */ var _processingTabKey: js.Any = js.native
    
    /* private */ var _root: js.Any = js.native
    
    /* private */ var _setActiveElement: js.Any = js.native
    
    /* private */ var _setFocusAlignment: js.Any = js.native
    
    /**
      * When focus is in the zone at render time but then all focusable elements are removed,
      * we "park" focus temporarily on the root. Once we update with focusable children, we restore
      * focus to the closest path from previous. If the user tabs away from the parked container,
      * we restore focusability to the pre-parked state.
      */
    /* private */ var _setParkedFocus: js.Any = js.native
    
    /* private */ var _shouldInputLoseFocus: js.Any = js.native
    
    /* private */ var _shouldWrapFocus: js.Any = js.native
    
    /**
      * Walk up the dom try to find a focusable element.
      */
    /* private */ var _tryInvokeClickForFocusable: js.Any = js.native
    
    /* private */ var _updateTabIndexes: js.Any = js.native
    
    /* private */ var _windowElement: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MFocusZone(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MFocusZone(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MFocusZone(): Unit = js.native
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
    def _onKeyDownCapture: js.Any = js.native
    inline def _onKeyDownCapture_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_onKeyDownCapture")(x.asInstanceOf[js.Any])
    
    @JSImport("@fluentui/react-focus/lib/components/FocusZone/FocusZone", "FocusZone.defaultProps")
    @js.native
    def defaultProps: IFocusZoneProps = js.native
    inline def defaultProps_=(x: IFocusZoneProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /** Used for testing purposes only. */
    inline def getOuterZones(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterZones")().asInstanceOf[Double]
  }
}
