package typings.framerMotion.distDomEntryMod

import typings.framerMotion.framerMotionStrings.animationCancel
import typings.framerMotion.framerMotionStrings.animationComplete_
import typings.framerMotion.framerMotionStrings.animationStart_
import typings.framerMotion.framerMotionStrings.change
import typings.framerMotion.framerMotionStrings.renderRequest
import typings.framerMotion.framerMotionStrings.velocityChange
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `MotionValue` is used to track the state and velocity of motion values.
  *
  * @public
  */
@JSImport("framer-motion/dist/dom-entry", "MotionValue")
@js.native
open class MotionValue_[V] () extends StObject {
  
  /* private */ var clearAnimation: Any = js.native
  
  def clearListeners(): Unit = js.native
  
  /**
    * Destroy and clean up subscribers to this `MotionValue`.
    *
    * The `MotionValue` hooks like `useMotionValue` and `useTransform` automatically
    * handle the lifecycle of the returned `MotionValue`, so this method is only necessary if you've manually
    * created a `MotionValue` via the `motionValue` function.
    *
    * @public
    */
  def destroy(): Unit = js.native
  
  /**
    * An object containing a SubscriptionManager for each active event.
    */
  /* private */ var events: Any = js.native
  
  /**
    * Returns the latest state of `MotionValue`
    *
    * @returns - The latest state of `MotionValue`
    *
    * @public
    */
  def get(): V = js.native
  
  /**
    * @public
    */
  def getPrevious(): V = js.native
  
  /**
    * Returns the latest velocity of `MotionValue`
    *
    * @returns - The latest velocity of `MotionValue`. Returns `0` if the state is non-numerical.
    *
    * @public
    */
  def getVelocity(): Double = js.native
  
  var hasAnimated: Boolean = js.native
  
  /**
    * Returns `true` if this value is currently animating.
    *
    * @public
    */
  def isAnimating(): Boolean = js.native
  
  /**
    * Set the state of the `MotionValue`, stopping any active animations,
    * effects, and resets velocity to `0`.
    */
  def jump(v: V): Unit = js.native
  
  def on[EventName /* <: /* keyof framer-motion.framer-motion/dist/dom-entry.MotionValueEventCallbacks<V> */ animationStart_ | animationComplete_ | animationCancel | change | renderRequest | velocityChange */](
    eventName: EventName,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: framer-motion.framer-motion/dist/dom-entry.MotionValueEventCallbacks<V>[EventName] */ js.Any
  ): VoidFunction = js.native
  
  /**
    * Adds a function that will be notified when the `MotionValue` is updated.
    *
    * It returns a function that, when called, will cancel the subscription.
    *
    * When calling `onChange` inside a React component, it should be wrapped with the
    * `useEffect` hook. As it returns an unsubscribe function, this should be returned
    * from the `useEffect` function to ensure you don't add duplicate subscribers..
    *
    * ```jsx
    * export const MyComponent = () => {
    *   const x = useMotionValue(0)
    *   const y = useMotionValue(0)
    *   const opacity = useMotionValue(1)
    *
    *   useEffect(() => {
    *     function updateOpacity() {
    *       const maxXY = Math.max(x.get(), y.get())
    *       const newOpacity = transform(maxXY, [0, 100], [1, 0])
    *       opacity.set(newOpacity)
    *     }
    *
    *     const unsubscribeX = x.on("change", updateOpacity)
    *     const unsubscribeY = y.on("change", updateOpacity)
    *
    *     return () => {
    *       unsubscribeX()
    *       unsubscribeY()
    *     }
    *   }, [])
    *
    *   return <motion.div style={{ x }} />
    * }
    * ```
    *
    * @param subscriber - A function that receives the latest value.
    * @returns A function that, when called, will cancel this subscription.
    *
    * @deprecated
    */
  def onChange(subscription: Subscriber[V]): js.Function0[Unit] = js.native
  
  /**
    * If a MotionValue has an owner, it was created internally within Framer Motion
    * and therefore has no external listeners. It is therefore safe to animate via WAAPI.
    */
  var owner: js.UndefOr[Owner] = js.native
  
  /**
    * Sets the state of the `MotionValue`.
    *
    * @remarks
    *
    * ```jsx
    * const x = useMotionValue(0)
    * x.set(10)
    * ```
    *
    * @param latest - Latest value to set.
    * @param render - Whether to notify render subscribers. Defaults to `true`
    *
    * @public
    */
  def set(v: V): Unit = js.native
  def set(v: V, render: Boolean): Unit = js.native
  
  def setWithVelocity(prev: V, current: V, delta: Double): Unit = js.native
  
  /**
    * Stop the currently active animation.
    *
    * @public
    */
  def stop(): Unit = js.native
  
  /* private */ var stopPassiveEffect: Any = js.native
  
  def updateAndNotify(v: V): Unit = js.native
  def updateAndNotify(v: V, render: Boolean): Unit = js.native
  
  /**
    * This will be replaced by the build step with the latest version number.
    * When MotionValues are provided to motion components, warn if versions are mixed.
    */
  var version: String = js.native
}
