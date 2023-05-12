package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait AnimationProps extends StObject {
  
  /**
    * Values to animate to, variant label(s), or `AnimationControls`.
    *
    * ```jsx
    * // As values
    * <motion.div animate={{ opacity: 1 }} />
    *
    * // As variant
    * <motion.div animate="visible" variants={variants} />
    *
    * // Multiple variants
    * <motion.div animate={["visible", "active"]} variants={variants} />
    *
    * // AnimationControls
    * <motion.div animate={animation} />
    * ```
    */
  var animate: js.UndefOr[AnimationControls | TargetAndTransition | VariantLabels | Boolean] = js.undefined
  
  /**
    * A target to animate to when this component is removed from the tree.
    *
    * This component **must** be the first animatable child of an `AnimatePresence` to enable this exit animation.
    *
    * This limitation exists because React doesn't allow components to defer unmounting until after
    * an animation is complete. Once this limitation is fixed, the `AnimatePresence` component will be unnecessary.
    *
    * ```jsx
    * import { AnimatePresence, motion } from 'framer-motion'
    *
    * export const MyComponent = ({ isVisible }) => {
    *   return (
    *     <AnimatePresence>
    *        {isVisible && (
    *          <motion.div
    *            initial={{ opacity: 0 }}
    *            animate={{ opacity: 1 }}
    *            exit={{ opacity: 0 }}
    *          />
    *        )}
    *     </AnimatePresence>
    *   )
    * }
    * ```
    */
  var exit: js.UndefOr[TargetAndTransition | VariantLabels] = js.undefined
  
  /**
    * Properties, variant label or array of variant labels to start in.
    *
    * Set to `false` to initialise with the values in `animate` (disabling the mount animation)
    *
    * ```jsx
    * // As values
    * <motion.div initial={{ opacity: 1 }} />
    *
    * // As variant
    * <motion.div initial="visible" variants={variants} />
    *
    * // Multiple variants
    * <motion.div initial={["visible", "active"]} variants={variants} />
    *
    * // As false (disable mount animation)
    * <motion.div initial={false} animate={{ opacity: 0 }} />
    * ```
    */
  var initial: js.UndefOr[Boolean | Target | VariantLabels] = js.undefined
  
  /**
    * Default transition. If no `transition` is defined in `animate`, it will use the transition defined here.
    * ```jsx
    * const spring = {
    *   type: "spring",
    *   damping: 10,
    *   stiffness: 100
    * }
    *
    * <motion.div transition={spring} animate={{ scale: 1.2 }} />
    * ```
    */
  var transition: js.UndefOr[Transition1] = js.undefined
  
  /**
    * Variants allow you to define animation states and organise them by name. They allow
    * you to control animations throughout a component tree by switching a single `animate` prop.
    *
    * Using `transition` options like `delayChildren` and `staggerChildren`, you can orchestrate
    * when children animations play relative to their parent.
    *
    * After passing variants to one or more `motion` component's `variants` prop, these variants
    * can be used in place of values on the `animate`, `initial`, `whileFocus`, `whileTap` and `whileHover` props.
    *
    * ```jsx
    * const variants = {
    *   active: {
    *       backgroundColor: "#f00"
    *   },
    *   inactive: {
    *     backgroundColor: "#fff",
    *     transition: { duration: 2 }
    *   }
    * }
    *
    * <motion.div variants={variants} animate="active" />
    * ```
    */
  var variants: js.UndefOr[Variants] = js.undefined
}
object AnimationProps {
  
  inline def apply(): AnimationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationProps] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: AnimationControls | TargetAndTransition | VariantLabels | Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnimateVarargs(value: String*): Self = StObject.set(x, "animate", js.Array(value*))
    
    inline def setExit(value: TargetAndTransition | VariantLabels): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setExitVarargs(value: String*): Self = StObject.set(x, "exit", js.Array(value*))
    
    inline def setInitial(value: Boolean | Target | VariantLabels): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setInitialVarargs(value: String*): Self = StObject.set(x, "initial", js.Array(value*))
    
    inline def setTransition(value: Transition1): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setVariants(value: Variants): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
  }
}
