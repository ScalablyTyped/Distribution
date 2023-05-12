package typings.electron.Electron

import typings.electron.electronStrings.alt
import typings.electron.electronStrings.capsLock
import typings.electron.electronStrings.char
import typings.electron.electronStrings.cmd
import typings.electron.electronStrings.command
import typings.electron.electronStrings.contextMenu
import typings.electron.electronStrings.control
import typings.electron.electronStrings.ctrl
import typings.electron.electronStrings.gestureDoubleTap
import typings.electron.electronStrings.gestureFlingCancel
import typings.electron.electronStrings.gestureFlingStart
import typings.electron.electronStrings.gestureLongPress
import typings.electron.electronStrings.gestureLongTap
import typings.electron.electronStrings.gesturePinchBegin
import typings.electron.electronStrings.gesturePinchEnd
import typings.electron.electronStrings.gesturePinchUpdate
import typings.electron.electronStrings.gestureScrollBegin
import typings.electron.electronStrings.gestureScrollEnd
import typings.electron.electronStrings.gestureScrollUpdate
import typings.electron.electronStrings.gestureShortPress
import typings.electron.electronStrings.gestureShowPress
import typings.electron.electronStrings.gestureTap
import typings.electron.electronStrings.gestureTapCancel
import typings.electron.electronStrings.gestureTapDown
import typings.electron.electronStrings.gestureTapUnconfirmed
import typings.electron.electronStrings.gestureTwoFingerTap
import typings.electron.electronStrings.isAutoRepeat
import typings.electron.electronStrings.isKeypad
import typings.electron.electronStrings.keyDown
import typings.electron.electronStrings.keyUp
import typings.electron.electronStrings.left
import typings.electron.electronStrings.leftButtonDown
import typings.electron.electronStrings.meta
import typings.electron.electronStrings.middleButtonDown
import typings.electron.electronStrings.mouseDown
import typings.electron.electronStrings.mouseEnter
import typings.electron.electronStrings.mouseLeave
import typings.electron.electronStrings.mouseMove
import typings.electron.electronStrings.mouseUp
import typings.electron.electronStrings.mouseWheel
import typings.electron.electronStrings.numLock
import typings.electron.electronStrings.pointerCancel
import typings.electron.electronStrings.pointerCausedUaAction
import typings.electron.electronStrings.pointerDown
import typings.electron.electronStrings.pointerMove
import typings.electron.electronStrings.pointerRawUpdate
import typings.electron.electronStrings.pointerUp
import typings.electron.electronStrings.rawKeyDown
import typings.electron.electronStrings.right
import typings.electron.electronStrings.rightButtonDown
import typings.electron.electronStrings.shift
import typings.electron.electronStrings.touchCancel
import typings.electron.electronStrings.touchEnd
import typings.electron.electronStrings.touchMove
import typings.electron.electronStrings.touchScrollStarted
import typings.electron.electronStrings.touchStart
import typings.electron.electronStrings.undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputEvent extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/input-event
  /**
    * An array of modifiers of the event, can be `shift`, `control`, `ctrl`, `alt`,
    * `meta`, `command`, `cmd`, `isKeypad`, `isAutoRepeat`, `leftButtonDown`,
    * `middleButtonDown`, `rightButtonDown`, `capsLock`, `numLock`, `left`, `right`.
    */
  var modifiers: js.UndefOr[
    js.Array[
      shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
    ]
  ] = js.undefined
  
  /**
    * Can be `undefined`, `mouseDown`, `mouseUp`, `mouseMove`, `mouseEnter`,
    * `mouseLeave`, `contextMenu`, `mouseWheel`, `rawKeyDown`, `keyDown`, `keyUp`,
    * `char`, `gestureScrollBegin`, `gestureScrollEnd`, `gestureScrollUpdate`,
    * `gestureFlingStart`, `gestureFlingCancel`, `gesturePinchBegin`,
    * `gesturePinchEnd`, `gesturePinchUpdate`, `gestureTapDown`, `gestureShowPress`,
    * `gestureTap`, `gestureTapCancel`, `gestureShortPress`, `gestureLongPress`,
    * `gestureLongTap`, `gestureTwoFingerTap`, `gestureTapUnconfirmed`,
    * `gestureDoubleTap`, `touchStart`, `touchMove`, `touchEnd`, `touchCancel`,
    * `touchScrollStarted`, `pointerDown`, `pointerUp`, `pointerMove`,
    * `pointerRawUpdate`, `pointerCancel` or `pointerCausedUaAction`.
    */
  var `type`: undefined | mouseDown | mouseUp | mouseMove | mouseEnter | mouseLeave | contextMenu | mouseWheel | rawKeyDown | keyDown | keyUp | char | gestureScrollBegin | gestureScrollEnd | gestureScrollUpdate | gestureFlingStart | gestureFlingCancel | gesturePinchBegin | gesturePinchEnd | gesturePinchUpdate | gestureTapDown | gestureShowPress | gestureTap | gestureTapCancel | gestureShortPress | gestureLongPress | gestureLongTap | gestureTwoFingerTap | gestureTapUnconfirmed | gestureDoubleTap | touchStart | touchMove | touchEnd | touchCancel | touchScrollStarted | pointerDown | pointerUp | pointerMove | pointerRawUpdate | pointerCancel | pointerCausedUaAction
}
object InputEvent {
  
  inline def apply(
    `type`: undefined | mouseDown | mouseUp | mouseMove | mouseEnter | mouseLeave | contextMenu | mouseWheel | rawKeyDown | keyDown | keyUp | char | gestureScrollBegin | gestureScrollEnd | gestureScrollUpdate | gestureFlingStart | gestureFlingCancel | gesturePinchBegin | gesturePinchEnd | gesturePinchUpdate | gestureTapDown | gestureShowPress | gestureTap | gestureTapCancel | gestureShortPress | gestureLongPress | gestureLongTap | gestureTwoFingerTap | gestureTapUnconfirmed | gestureDoubleTap | touchStart | touchMove | touchEnd | touchCancel | touchScrollStarted | pointerDown | pointerUp | pointerMove | pointerRawUpdate | pointerCancel | pointerCausedUaAction
  ): InputEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputEvent] (val x: Self) extends AnyVal {
    
    inline def setModifiers(
      value: js.Array[
          shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
        ]
    ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(
      value: (shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right)*
    ): Self = StObject.set(x, "modifiers", js.Array(value*))
    
    inline def setType(
      value: undefined | mouseDown | mouseUp | mouseMove | mouseEnter | mouseLeave | contextMenu | mouseWheel | rawKeyDown | keyDown | keyUp | char | gestureScrollBegin | gestureScrollEnd | gestureScrollUpdate | gestureFlingStart | gestureFlingCancel | gesturePinchBegin | gesturePinchEnd | gesturePinchUpdate | gestureTapDown | gestureShowPress | gestureTap | gestureTapCancel | gestureShortPress | gestureLongPress | gestureLongTap | gestureTwoFingerTap | gestureTapUnconfirmed | gestureDoubleTap | touchStart | touchMove | touchEnd | touchCancel | touchScrollStarted | pointerDown | pointerUp | pointerMove | pointerRawUpdate | pointerCancel | pointerCausedUaAction
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
