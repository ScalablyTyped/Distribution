package typings.framerMotion.distThreeEntryMod

import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait TapHandlers extends StObject {
  
  /**
    * Callback when the tap gesture successfully ends on this element.
    *
    * ```jsx
    * function onTap(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onTap={onTap} />
    * ```
    *
    * @param event - The originating pointer event.
    * @param info - An {@link TapInfo} object containing `x` and `y` values for the `point` relative to the device or page.
    */
  var onTap: js.UndefOr[
    js.Function2[/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ TapInfo, Unit]
  ] = js.undefined
  
  /**
    * Callback when the tap gesture ends outside this element.
    *
    * ```jsx
    * function onTapCancel(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onTapCancel={onTapCancel} />
    * ```
    *
    * @param event - The originating pointer event.
    * @param info - An {@link TapInfo} object containing `x` and `y` values for the `point` relative to the device or page.
    */
  var onTapCancel: js.UndefOr[
    js.Function2[/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ TapInfo, Unit]
  ] = js.undefined
  
  /**
    * Callback when the tap gesture starts on this element.
    *
    * ```jsx
    * function onTapStart(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onTapStart={onTapStart} />
    * ```
    *
    * @param event - The originating pointer event.
    * @param info - An {@link TapInfo} object containing `x` and `y` values for the `point` relative to the device or page.
    */
  var onTapStart: js.UndefOr[
    js.Function2[/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ TapInfo, Unit]
  ] = js.undefined
  
  /**
    * Properties or variant label to animate to while the component is pressed.
    *
    * ```jsx
    * <motion.div whileTap={{ scale: 0.8 }} />
    * ```
    */
  var whileTap: js.UndefOr[VariantLabels | TargetAndTransition] = js.undefined
}
object TapHandlers {
  
  inline def apply(): TapHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TapHandlers] (val x: Self) extends AnyVal {
    
    inline def setOnTap(value: (/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ TapInfo) => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction2(value))
    
    inline def setOnTapCancel(value: (/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ TapInfo) => Unit): Self = StObject.set(x, "onTapCancel", js.Any.fromFunction2(value))
    
    inline def setOnTapCancelUndefined: Self = StObject.set(x, "onTapCancel", js.undefined)
    
    inline def setOnTapStart(value: (/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ TapInfo) => Unit): Self = StObject.set(x, "onTapStart", js.Any.fromFunction2(value))
    
    inline def setOnTapStartUndefined: Self = StObject.set(x, "onTapStart", js.undefined)
    
    inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
    
    inline def setWhileTap(value: VariantLabels | TargetAndTransition): Self = StObject.set(x, "whileTap", value.asInstanceOf[js.Any])
    
    inline def setWhileTapUndefined: Self = StObject.set(x, "whileTap", js.undefined)
    
    inline def setWhileTapVarargs(value: String*): Self = StObject.set(x, "whileTap", js.Array(value*))
  }
}
