package typings.framerMotion

import typings.framerMotion.anon.FnCall
import typings.framerMotion.distDomEntryMod.AnimationPlaybackControls
import typings.framerMotion.distDomEntryMod.AnimationScope
import typings.framerMotion.distDomEntryMod.AnimationSequence
import typings.framerMotion.distDomEntryMod.DOMKeyframesDefinition
import typings.framerMotion.distDomEntryMod.DelayedFunction
import typings.framerMotion.distDomEntryMod.DevMessage
import typings.framerMotion.distDomEntryMod.DynamicAnimationOptions
import typings.framerMotion.distDomEntryMod.DynamicOption
import typings.framerMotion.distDomEntryMod.EasingFunction
import typings.framerMotion.distDomEntryMod.EasingModifier
import typings.framerMotion.distDomEntryMod.ElementOrSelector
import typings.framerMotion.distDomEntryMod.Frameloop
import typings.framerMotion.distDomEntryMod.GenericKeyframesTarget
import typings.framerMotion.distDomEntryMod.InViewOptions
import typings.framerMotion.distDomEntryMod.InterpolateOptions
import typings.framerMotion.distDomEntryMod.MotionValueOptions
import typings.framerMotion.distDomEntryMod.OnScroll
import typings.framerMotion.distDomEntryMod.Point
import typings.framerMotion.distDomEntryMod.Process
import typings.framerMotion.distDomEntryMod.ScrollOptions
import typings.framerMotion.distDomEntryMod.SequenceOptions
import typings.framerMotion.distDomEntryMod.StaggerOptions
import typings.framerMotion.distDomEntryMod.StepId
import typings.framerMotion.distDomEntryMod.Steps_
import typings.framerMotion.distDomEntryMod.TransformOptions
import typings.framerMotion.distDomEntryMod.ValueAnimationTransition
import typings.framerMotion.distDomEntryMod.ViewChangeHandler
import typings.std.IntersectionObserverEntry
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object domMod {
  
  @JSImport("framer-motion/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `MotionValue` is used to track the state and velocity of motion values.
    *
    * @public
    */
  @JSImport("framer-motion/dom", "MotionValue")
  @js.native
  open class MotionValue_[V] ()
    extends typings.framerMotion.distDomEntryMod.MotionValue_[V]
  
  inline def animate(sequence: AnimationSequence): AnimationPlaybackControls = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(sequence.asInstanceOf[js.Any]).asInstanceOf[AnimationPlaybackControls]
  inline def animate(sequence: AnimationSequence, options: SequenceOptions): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(sequence.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
  inline def animate(value: ElementOrSelector, keyframes: DOMKeyframesDefinition): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(value.asInstanceOf[js.Any], keyframes.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
  inline def animate(value: ElementOrSelector, keyframes: DOMKeyframesDefinition, options: DynamicAnimationOptions): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(value.asInstanceOf[js.Any], keyframes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
  inline def animate[V](from: V, to: GenericKeyframesTarget[V] | V): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
  inline def animate[V](from: V, to: GenericKeyframesTarget[V] | V, options: ValueAnimationTransition[V]): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
  inline def animate[V_1](
    value: typings.framerMotion.distDomEntryMod.MotionValue_[V_1],
    keyframes: GenericKeyframesTarget[V_1] | V_1
  ): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(value.asInstanceOf[js.Any], keyframes.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
  inline def animate[V_1](
    value: typings.framerMotion.distDomEntryMod.MotionValue_[V_1],
    keyframes: GenericKeyframesTarget[V_1] | V_1,
    options: ValueAnimationTransition[V_1]
  ): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(value.asInstanceOf[js.Any], keyframes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
  
  inline def anticipate(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("anticipate")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("framer-motion/dom", "backIn")
  @js.native
  val backIn: EasingFunction = js.native
  
  @JSImport("framer-motion/dom", "backInOut")
  @js.native
  val backInOut: EasingFunction = js.native
  
  inline def backOut(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("backOut")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def cancelFrame(process: Process): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelFrame")(process.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("framer-motion/dom", "circIn")
  @js.native
  val circIn: EasingFunction = js.native
  
  @JSImport("framer-motion/dom", "circInOut")
  @js.native
  val circInOut: EasingFunction = js.native
  
  @JSImport("framer-motion/dom", "circOut")
  @js.native
  val circOut: EasingFunction = js.native
  
  inline def clamp(min: Double, max: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createScopedAnimate(): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createScopedAnimate")().asInstanceOf[FnCall]
  inline def createScopedAnimate(scope: AnimationScope[Any]): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createScopedAnimate")(scope.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  
  inline def cubicBezier(mX1: Double, mY1: Double, mX2: Double, mY2: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicBezier")(mX1.asInstanceOf[js.Any], mY1.asInstanceOf[js.Any], mX2.asInstanceOf[js.Any], mY2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  
  /**
    * Timeout defined in ms
    */
  inline def delay(callback: DelayedFunction, timeout: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def distance(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def distance2D(a: Point, b: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance2D")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def easeIn(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeIn")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def easeInOut(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def easeOut(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOut")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("framer-motion/dom", "frame")
  @js.native
  val frame: Frameloop = js.native
  
  object frameData {
    
    @JSImport("framer-motion/dom", "frameData")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("framer-motion/dom", "frameData.delta")
    @js.native
    def delta: Double = js.native
    inline def delta_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delta")(x.asInstanceOf[js.Any])
    
    @JSImport("framer-motion/dom", "frameData.isProcessing")
    @js.native
    def isProcessing: Boolean = js.native
    inline def isProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isProcessing")(x.asInstanceOf[js.Any])
    
    @JSImport("framer-motion/dom", "frameData.timestamp")
    @js.native
    def timestamp: Double = js.native
    inline def timestamp_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(x.asInstanceOf[js.Any])
  }
  
  inline def inView(
    elementOrSelector: ElementOrSelector,
    onStart: js.Function1[/* entry */ IntersectionObserverEntry, Unit | ViewChangeHandler]
  ): VoidFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("inView")(elementOrSelector.asInstanceOf[js.Any], onStart.asInstanceOf[js.Any])).asInstanceOf[VoidFunction]
  inline def inView(
    elementOrSelector: ElementOrSelector,
    onStart: js.Function1[/* entry */ IntersectionObserverEntry, Unit | ViewChangeHandler],
    param2: InViewOptions
  ): VoidFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("inView")(elementOrSelector.asInstanceOf[js.Any], onStart.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[VoidFunction]
  
  /**
    * Create a function that maps from a numerical input array to a generic output array.
    *
    * Accepts:
    *   - Numbers
    *   - Colors (hex, hsl, hsla, rgb, rgba)
    *   - Complex (combinations of one or more numbers or strings)
    *
    * ```jsx
    * const mixColor = interpolate([0, 1], ['#fff', '#000'])
    *
    * mixColor(0.5) // 'rgba(128, 128, 128, 1)'
    * ```
    *
    * TODO Revist this approach once we've moved to data models for values,
    * probably not needed to pregenerate mixer functions.
    *
    * @public
    */
  inline def interpolate[T](input: js.Array[Double], output: js.Array[T]): js.Function1[/* v */ Double, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, T]]
  inline def interpolate[T](input: js.Array[Double], output: js.Array[T], param2: InterpolateOptions[T]): js.Function1[/* v */ Double, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, T]]
  
  @JSImport("framer-motion/dom", "invariant")
  @js.native
  def invariant: DevMessage = js.native
  inline def invariant_=(x: DevMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invariant")(x.asInstanceOf[js.Any])
  
  @JSImport("framer-motion/dom", "mirrorEasing")
  @js.native
  val mirrorEasing: EasingModifier = js.native
  
  inline def mix(from: Double, to: Double, progress: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def motionValue[V](init: V): typings.framerMotion.distDomEntryMod.MotionValue_[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("motionValue")(init.asInstanceOf[js.Any]).asInstanceOf[typings.framerMotion.distDomEntryMod.MotionValue_[V]]
  inline def motionValue[V](init: V, options: MotionValueOptions): typings.framerMotion.distDomEntryMod.MotionValue_[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("motionValue")(init.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.framerMotion.distDomEntryMod.MotionValue_[V]]
  
  inline def pipe(transformers: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(transformers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function]
  
  inline def progress(from: Double, to: Double, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("progress")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("framer-motion/dom", "reverseEasing")
  @js.native
  val reverseEasing: EasingModifier = js.native
  
  inline def scroll(onScroll: OnScroll): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(onScroll.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def scroll(onScroll: OnScroll, param1: ScrollOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(onScroll.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def stagger(): DynamicOption[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")().asInstanceOf[DynamicOption[Double]]
  inline def stagger(duration: Double): DynamicOption[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(duration.asInstanceOf[js.Any]).asInstanceOf[DynamicOption[Double]]
  inline def stagger(duration: Double, param1: StaggerOptions): DynamicOption[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(duration.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[DynamicOption[Double]]
  inline def stagger(duration: Unit, param1: StaggerOptions): DynamicOption[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(duration.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[DynamicOption[Double]]
  
  @JSImport("framer-motion/dom", "steps")
  @js.native
  val steps: Steps_ = js.native
  
  @JSImport("framer-motion/dom", "stepsOrder")
  @js.native
  val stepsOrder: js.Array[StepId] = js.native
  
  /**
    * @deprecated
    *
    * Import as `frame` instead.
    */
  @JSImport("framer-motion/dom", "sync")
  @js.native
  val sync: Frameloop = js.native
  
  /**
    *
    * Transforms numbers into other values by mapping them from an input range to an output range.
    *
    * Given an input range of `[0, 200]` and an output range of
    * `[0, 1]`, this function will return a value between `0` and `1`.
    * The input range must be a linear series of numbers. The output range
    * can be any supported value type, such as numbers, colors, shadows, arrays, objects and more.
    * Every value in the output range must be of the same type and in the same format.
    *
    * ```jsx
    * import * as React from "react"
    * import { Frame, transform } from "framer"
    *
    * export function MyComponent() {
    *     const inputRange = [-200, -100, 100, 200]
    *     const outputRange = [0, 1, 1, 0]
    *     const convertRange = transform(inputRange, outputRange)
    *     const output = convertRange(-150)
    *
    *     // Returns 0.5
    *     return <div>{output}</div>
    * }
    *
    * ```
    *
    * @param inputRange - A linear series of numbers (either all increasing or decreasing).
    * @param outputRange - A series of numbers, colors or strings. Must be the same length as `inputRange`.
    * @param options - Clamp: clamp values to within the given range. Defaults to `true`.
    *
    * @public
    */
  inline def transform[T](inputRange: js.Array[Double], outputRange: js.Array[T]): js.Function1[/* inputValue */ Double, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* inputValue */ Double, T]]
  inline def transform[T](inputRange: js.Array[Double], outputRange: js.Array[T], options: TransformOptions[T]): js.Function1[/* inputValue */ Double, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* inputValue */ Double, T]]
  /**
    * Transforms numbers into other values by mapping them from an input range to an output range.
    * Returns the type of the input provided.
    *
    * @remarks
    *
    * Given an input range of `[0, 200]` and an output range of
    * `[0, 1]`, this function will return a value between `0` and `1`.
    * The input range must be a linear series of numbers. The output range
    * can be any supported value type, such as numbers, colors, shadows, arrays, objects and more.
    * Every value in the output range must be of the same type and in the same format.
    *
    * ```jsx
    * import * as React from "react"
    * import { transform } from "framer-motion"
    *
    * export function MyComponent() {
    *    const inputRange = [0, 200]
    *    const outputRange = [0, 1]
    *    const output = transform(100, inputRange, outputRange)
    *
    *    // Returns 0.5
    *    return <div>{output}</div>
    * }
    * ```
    *
    * @param inputValue - A number to transform between the input and output ranges.
    * @param inputRange - A linear series of numbers (either all increasing or decreasing).
    * @param outputRange - A series of numbers, colors, strings, or arrays/objects of those. Must be the same length as `inputRange`.
    * @param options - Clamp: Clamp values to within the given range. Defaults to `true`.
    *
    * @public
    */
  inline def transform[T](inputValue: Double, inputRange: js.Array[Double], outputRange: js.Array[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(inputValue.asInstanceOf[js.Any], inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def transform[T](
    inputValue: Double,
    inputRange: js.Array[Double],
    outputRange: js.Array[T],
    options: TransformOptions[T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(inputValue.asInstanceOf[js.Any], inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("framer-motion/dom", "warning")
  @js.native
  def warning: DevMessage = js.native
  inline def warning_=(x: DevMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  
  inline def wrap(min: Double, max: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
}
