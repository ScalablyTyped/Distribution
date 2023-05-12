package typings.framerMotion.distThreeEntryMod

import typings.framerMotion.framerMotionStrings.`preserve-aspect`
import typings.framerMotion.framerMotionStrings.position
import typings.framerMotion.framerMotionStrings.size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait LayoutProps extends StObject {
  
  /**
    * If `true`, this component will automatically animate to its new position when
    * its layout changes.
    *
    * ```jsx
    * <motion.div layout />
    * ```
    *
    * This will perform a layout animation using performant transforms. Part of this technique
    * involved animating an element's scale. This can introduce visual distortions on children,
    * `boxShadow` and `borderRadius`.
    *
    * To correct distortion on immediate children, add `layout` to those too.
    *
    * `boxShadow` and `borderRadius` will automatically be corrected if they are already being
    * animated on this component. Otherwise, set them directly via the `initial` prop.
    *
    * If `layout` is set to `"position"`, the size of the component will change instantly and
    * only its position will animate. If `layout` is set to `"size"`, the position of the
    * component will change instantly but its size will animate.
    *
    * If `layout` is set to `"size"`, the position of the component will change instantly and
    * only its size will animate.
    *
    * If `layout` is set to `"preserve-aspect"`, the component will animate size & position if
    * the aspect ratio remains the same between renders, and just position if the ratio changes.
    *
    * @public
    */
  var layout: js.UndefOr[Boolean | position | size | `preserve-aspect`] = js.undefined
  
  /**
    * @public
    */
  var layoutDependency: js.UndefOr[Any] = js.undefined
  
  /**
    * Enable shared layout transitions between different components with the same `layoutId`.
    *
    * When a component with a layoutId is removed from the React tree, and then
    * added elsewhere, it will visually animate from the previous component's bounding box
    * and its latest animated values.
    *
    * ```jsx
    *   {items.map(item => (
    *      <motion.li layout>
    *         {item.name}
    *         {item.isSelected && <motion.div layoutId="underline" />}
    *      </motion.li>
    *   ))}
    * ```
    *
    * If the previous component remains in the tree it will crossfade with the new component.
    *
    * @public
    */
  var layoutId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether an element should be considered a "layout root", where
    * all children will be forced to resolve relatively to it.
    * Currently used for `position: sticky` elements in Framer.
    */
  var layoutRoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether a projection node should measure its scroll when it or its descendants update their layout.
    *
    * @public
    */
  var layoutScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A callback that will fire when a layout animation on this component completes.
    *
    * @public
    */
  var onLayoutAnimationComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * A callback that will fire when a layout animation on this component starts.
    *
    * @public
    */
  var onLayoutAnimationStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object LayoutProps {
  
  inline def apply(): LayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutProps] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: Boolean | position | size | `preserve-aspect`): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutDependency(value: Any): Self = StObject.set(x, "layoutDependency", value.asInstanceOf[js.Any])
    
    inline def setLayoutDependencyUndefined: Self = StObject.set(x, "layoutDependency", js.undefined)
    
    inline def setLayoutId(value: String): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
    
    inline def setLayoutIdUndefined: Self = StObject.set(x, "layoutId", js.undefined)
    
    inline def setLayoutRoot(value: Boolean): Self = StObject.set(x, "layoutRoot", value.asInstanceOf[js.Any])
    
    inline def setLayoutRootUndefined: Self = StObject.set(x, "layoutRoot", js.undefined)
    
    inline def setLayoutScroll(value: Boolean): Self = StObject.set(x, "layoutScroll", value.asInstanceOf[js.Any])
    
    inline def setLayoutScrollUndefined: Self = StObject.set(x, "layoutScroll", js.undefined)
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setOnLayoutAnimationComplete(value: () => Unit): Self = StObject.set(x, "onLayoutAnimationComplete", js.Any.fromFunction0(value))
    
    inline def setOnLayoutAnimationCompleteUndefined: Self = StObject.set(x, "onLayoutAnimationComplete", js.undefined)
    
    inline def setOnLayoutAnimationStart(value: () => Unit): Self = StObject.set(x, "onLayoutAnimationStart", js.Any.fromFunction0(value))
    
    inline def setOnLayoutAnimationStartUndefined: Self = StObject.set(x, "onLayoutAnimationStart", js.undefined)
  }
}
