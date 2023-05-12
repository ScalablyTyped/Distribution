package typings.framerMotion.distThreeEntryMod

import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait PanHandlers extends StObject {
  
  /**
    * Callback function that fires when the pan gesture is recognised on this element.
    *
    * **Note:** For pan gestures to work correctly with touch input, the element needs
    * touch scrolling to be disabled on either x/y or both axis with the
    * [touch-action](https://developer.mozilla.org/en-US/docs/Web/CSS/touch-action) CSS rule.
    *
    * ```jsx
    * function onPan(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onPan={onPan} />
    * ```
    *
    * @param event - The originating pointer event.
    * @param info - A {@link PanInfo} object containing `x` and `y` values for:
    *
    *   - `point`: Relative to the device or page.
    *   - `delta`: Distance moved since the last event.
    *   - `offset`: Offset from the original pan event.
    *   - `velocity`: Current velocity of the pointer.
    */
  var onPan: js.UndefOr[js.Function2[/* event */ PointerEvent, /* info */ PanInfo, Unit]] = js.undefined
  
  /**
    * Callback function that fires when the pan gesture ends on this element.
    *
    * ```jsx
    * function onPanEnd(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onPanEnd={onPanEnd} />
    * ```
    *
    * @param event - The originating pointer event.
    * @param info - A {@link PanInfo} object containing `x`/`y` values for:
    *
    *   - `point`: Relative to the device or page.
    *   - `delta`: Distance moved since the last event.
    *   - `offset`: Offset from the original pan event.
    *   - `velocity`: Current velocity of the pointer.
    */
  var onPanEnd: js.UndefOr[js.Function2[/* event */ PointerEvent, /* info */ PanInfo, Unit]] = js.undefined
  
  /**
    * Callback function that fires when we begin detecting a pan gesture. This
    * is analogous to `onMouseStart` or `onTouchStart`.
    *
    * ```jsx
    * function onPanSessionStart(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onPanSessionStart={onPanSessionStart} />
    * ```
    *
    * @param event - The originating pointer event.
    * @param info - An {@link EventInfo} object containing `x`/`y` values for:
    *
    *   - `point`: Relative to the device or page.
    */
  var onPanSessionStart: js.UndefOr[js.Function2[/* event */ PointerEvent, /* info */ EventInfo, Unit]] = js.undefined
  
  /**
    * Callback function that fires when the pan gesture begins on this element.
    *
    * ```jsx
    * function onPanStart(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onPanStart={onPanStart} />
    * ```
    *
    * @param event - The originating pointer event.
    * @param info - A {@link PanInfo} object containing `x`/`y` values for:
    *
    *   - `point`: Relative to the device or page.
    *   - `delta`: Distance moved since the last event.
    *   - `offset`: Offset from the original pan event.
    *   - `velocity`: Current velocity of the pointer.
    */
  var onPanStart: js.UndefOr[js.Function2[/* event */ PointerEvent, /* info */ PanInfo, Unit]] = js.undefined
}
object PanHandlers {
  
  inline def apply(): PanHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanHandlers] (val x: Self) extends AnyVal {
    
    inline def setOnPan(value: (/* event */ PointerEvent, /* info */ PanInfo) => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction2(value))
    
    inline def setOnPanEnd(value: (/* event */ PointerEvent, /* info */ PanInfo) => Unit): Self = StObject.set(x, "onPanEnd", js.Any.fromFunction2(value))
    
    inline def setOnPanEndUndefined: Self = StObject.set(x, "onPanEnd", js.undefined)
    
    inline def setOnPanSessionStart(value: (/* event */ PointerEvent, /* info */ EventInfo) => Unit): Self = StObject.set(x, "onPanSessionStart", js.Any.fromFunction2(value))
    
    inline def setOnPanSessionStartUndefined: Self = StObject.set(x, "onPanSessionStart", js.undefined)
    
    inline def setOnPanStart(value: (/* event */ PointerEvent, /* info */ PanInfo) => Unit): Self = StObject.set(x, "onPanStart", js.Any.fromFunction2(value))
    
    inline def setOnPanStartUndefined: Self = StObject.set(x, "onPanStart", js.undefined)
    
    inline def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
  }
}
