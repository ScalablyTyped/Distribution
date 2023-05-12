package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.popLayout
import typings.framerMotion.framerMotionStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait AnimatePresenceProps extends StObject {
  
  /**
    * When a component is removed, there's no longer a chance to update its props. So if a component's `exit`
    * prop is defined as a dynamic variant and you want to pass a new `custom` prop, you can do so via `AnimatePresence`.
    * This will ensure all leaving components animate using the latest data.
    *
    * @public
    */
  var custom: js.UndefOr[Any] = js.undefined
  
  /**
    * Replace with `mode="wait"`
    *
    * @deprecated
    *
    * Replace with `mode="wait"`
    */
  var exitBeforeEnter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By passing `initial={false}`, `AnimatePresence` will disable any initial animations on children
    * that are present when the component is first rendered.
    *
    * ```jsx
    * <AnimatePresence initial={false}>
    *   {isVisible && (
    *     <motion.div
    *       key="modal"
    *       initial={{ opacity: 0 }}
    *       animate={{ opacity: 1 }}
    *       exit={{ opacity: 0 }}
    *     />
    *   )}
    * </AnimatePresence>
    * ```
    *
    * @public
    */
  var initial: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines how to handle entering and exiting elements.
    *
    * - `"sync"`: Default. Elements animate in and out as soon as they're added/removed.
    * - `"popLayout"`: Exiting elements are "popped" from the page layout, allowing sibling
    *      elements to immediately occupy their new layouts.
    * - `"wait"`: Only renders one component at a time. Wait for the exiting component to animate out
    *      before animating the next component in.
    *
    * @public
    */
  var mode: js.UndefOr[typings.framerMotion.framerMotionStrings.sync | popLayout | wait] = js.undefined
  
  /**
    * Fires when all exiting nodes have completed animating out.
    *
    * @public
    */
  var onExitComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Internal. Used in Framer to flag that sibling children *shouldn't* re-render as a result of a
    * child being removed.
    */
  var presenceAffectsLayout: js.UndefOr[Boolean] = js.undefined
}
object AnimatePresenceProps {
  
  inline def apply(): AnimatePresenceProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatePresenceProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimatePresenceProps] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setExitBeforeEnter(value: Boolean): Self = StObject.set(x, "exitBeforeEnter", value.asInstanceOf[js.Any])
    
    inline def setExitBeforeEnterUndefined: Self = StObject.set(x, "exitBeforeEnter", js.undefined)
    
    inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setMode(value: typings.framerMotion.framerMotionStrings.sync | popLayout | wait): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnExitComplete(value: () => Unit): Self = StObject.set(x, "onExitComplete", js.Any.fromFunction0(value))
    
    inline def setOnExitCompleteUndefined: Self = StObject.set(x, "onExitComplete", js.undefined)
    
    inline def setPresenceAffectsLayout(value: Boolean): Self = StObject.set(x, "presenceAffectsLayout", value.asInstanceOf[js.Any])
    
    inline def setPresenceAffectsLayoutUndefined: Self = StObject.set(x, "presenceAffectsLayout", js.undefined)
  }
}
