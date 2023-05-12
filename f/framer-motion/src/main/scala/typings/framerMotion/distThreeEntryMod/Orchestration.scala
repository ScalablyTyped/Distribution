package typings.framerMotion.distThreeEntryMod

import typings.framerMotion.framerMotionBooleans.`false`
import typings.framerMotion.framerMotionStrings.afterChildren
import typings.framerMotion.framerMotionStrings.beforeChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for orchestrating the timing of animations.
  *
  * @public
  */
trait Orchestration extends StObject {
  
  /**
    * Delay the animation by this duration (in seconds). Defaults to `0`.
    *
    * @remarks
    * ```javascript
    * const transition = {
    *   delay: 0.2
    * }
    * ```
    *
    * @public
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * When using variants, children animations will start after this duration
    * (in seconds). You can add the `transition` property to both the `Frame` and the `variant` directly. Adding it to the `variant` generally offers more flexibility, as it allows you to customize the delay per visual state.
    *
    * ```jsx
    * const container = {
    *   hidden: { opacity: 0 },
    *   show: {
    *     opacity: 1,
    *     transition: {
    *       delayChildren: 0.5
    *     }
    *   }
    * }
    *
    * const item = {
    *   hidden: { opacity: 0 },
    *   show: { opacity: 1 }
    * }
    *
    * return (
    *   <motion.ul
    *     variants={container}
    *     initial="hidden"
    *     animate="show"
    *   >
    *     <motion.li variants={item} />
    *     <motion.li variants={item} />
    *   </motion.ul>
    * )
    * ```
    *
    * @public
    */
  var delayChildren: js.UndefOr[Double] = js.undefined
  
  /**
    * When using variants, animations of child components can be staggered by this
    * duration (in seconds).
    *
    * For instance, if `staggerChildren` is `0.01`, the first child will be
    * delayed by `0` seconds, the second by `0.01`, the third by `0.02` and so
    * on.
    *
    * The calculated stagger delay will be added to `delayChildren`.
    *
    * ```jsx
    * const container = {
    *   hidden: { opacity: 0 },
    *   show: {
    *     opacity: 1,
    *     transition: {
    *       staggerChildren: 0.5
    *     }
    *   }
    * }
    *
    * const item = {
    *   hidden: { opacity: 0 },
    *   show: { opacity: 1 }
    * }
    *
    * return (
    *   <motion.ol
    *     variants={container}
    *     initial="hidden"
    *     animate="show"
    *   >
    *     <motion.li variants={item} />
    *     <motion.li variants={item} />
    *   </motion.ol>
    * )
    * ```
    *
    * @public
    */
  var staggerChildren: js.UndefOr[Double] = js.undefined
  
  /**
    * The direction in which to stagger children.
    *
    * A value of `1` staggers from the first to the last while `-1`
    * staggers from the last to the first.
    *
    * ```jsx
    * const container = {
    *   hidden: { opacity: 0 },
    *   show: {
    *     opacity: 1,
    *     transition: {
    *       staggerChildren: 0.5,
    *       staggerDirection: -1
    *     }
    *   }
    * }
    *
    * const item = {
    *   hidden: { opacity: 0 },
    *   show: { opacity: 1 }
    * }
    *
    * return (
    *   <motion.ul
    *     variants={container}
    *     initial="hidden"
    *     animate="show"
    *   >
    *     <motion.li variants={item} size={50} />
    *     <motion.li variants={item} size={50} />
    *   </motion.ul>
    * )
    * ```
    *
    * @public
    */
  var staggerDirection: js.UndefOr[Double] = js.undefined
  
  /**
    * Describes the relationship between the transition and its children. Set
    * to `false` by default.
    *
    * @remarks
    * When using variants, the transition can be scheduled in relation to its
    * children with either `"beforeChildren"` to finish this transition before
    * starting children transitions, `"afterChildren"` to finish children
    * transitions before starting this transition.
    *
    * ```jsx
    * const list = {
    *   hidden: {
    *     opacity: 0,
    *     transition: { when: "afterChildren" }
    *   }
    * }
    *
    * const item = {
    *   hidden: {
    *     opacity: 0,
    *     transition: { duration: 2 }
    *   }
    * }
    *
    * return (
    *   <motion.ul variants={list} animate="hidden">
    *     <motion.li variants={item} />
    *     <motion.li variants={item} />
    *   </motion.ul>
    * )
    * ```
    *
    * @public
    */
  var when: js.UndefOr[`false` | beforeChildren | afterChildren | String] = js.undefined
}
object Orchestration {
  
  inline def apply(): Orchestration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orchestration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Orchestration] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayChildren(value: Double): Self = StObject.set(x, "delayChildren", value.asInstanceOf[js.Any])
    
    inline def setDelayChildrenUndefined: Self = StObject.set(x, "delayChildren", js.undefined)
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setStaggerChildren(value: Double): Self = StObject.set(x, "staggerChildren", value.asInstanceOf[js.Any])
    
    inline def setStaggerChildrenUndefined: Self = StObject.set(x, "staggerChildren", js.undefined)
    
    inline def setStaggerDirection(value: Double): Self = StObject.set(x, "staggerDirection", value.asInstanceOf[js.Any])
    
    inline def setStaggerDirectionUndefined: Self = StObject.set(x, "staggerDirection", js.undefined)
    
    inline def setWhen(value: `false` | beforeChildren | afterChildren | String): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
