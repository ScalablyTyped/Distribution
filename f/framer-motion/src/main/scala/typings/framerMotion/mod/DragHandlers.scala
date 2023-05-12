package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.x
import typings.framerMotion.framerMotionStrings.y
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait DragHandlers extends StObject {
  
  /**
    * Callback function that fires a drag direction is determined.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragDirectionLock
    *   onDirectionLock={axis => console.log(axis)}
    * />
    * ```
    *
    * @public
    */
  var onDirectionLock: js.UndefOr[js.Function1[/* axis */ x | y, Unit]] = js.undefined
  
  /**
    * Callback function that fires when the component is dragged.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   onDrag={
    *     (event, info) => console.log(info.point.x, info.point.y)
    *   }
    * />
    * ```
    *
    * @public
    */
  var onDrag: js.UndefOr[
    js.Function2[/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ PanInfo, Unit]
  ] = js.undefined
  
  /**
    * Callback function that fires when dragging ends.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   onDragEnd={
    *     (event, info) => console.log(info.point.x, info.point.y)
    *   }
    * />
    * ```
    *
    * @public
    */
  var onDragEnd: js.UndefOr[
    js.Function2[/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ PanInfo, Unit]
  ] = js.undefined
  
  /**
    * Callback function that fires when dragging starts.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   onDragStart={
    *     (event, info) => console.log(info.point.x, info.point.y)
    *   }
    * />
    * ```
    *
    * @public
    */
  var onDragStart: js.UndefOr[
    js.Function2[/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ PanInfo, Unit]
  ] = js.undefined
  
  /**
    * Callback function that fires when drag momentum/bounce transition finishes.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   onDragTransitionEnd={() => console.log('Drag transition complete')}
    * />
    * ```
    *
    * @public
    */
  var onDragTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DragHandlers {
  
  inline def apply(): DragHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragHandlers] (val x: Self) extends AnyVal {
    
    inline def setOnDirectionLock(value: /* axis */ typings.framerMotion.framerMotionStrings.x | y => Unit): Self = StObject.set(x, "onDirectionLock", js.Any.fromFunction1(value))
    
    inline def setOnDirectionLockUndefined: Self = StObject.set(x, "onDirectionLock", js.undefined)
    
    inline def setOnDrag(value: (/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ PanInfo) => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
    
    inline def setOnDragEnd(value: (/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ PanInfo) => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction2(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragStart(value: (/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ PanInfo) => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragTransitionEnd(value: () => Unit): Self = StObject.set(x, "onDragTransitionEnd", js.Any.fromFunction0(value))
    
    inline def setOnDragTransitionEndUndefined: Self = StObject.set(x, "onDragTransitionEnd", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
  }
}
