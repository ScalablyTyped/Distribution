package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StringDictionary
import typings.framerMotion.anon.FnCall
import typings.framerMotion.distDomEntryMod.^
import typings.framerMotion.framerMotionStrings.Lessthansign
import typings.std.Element
import typings.std.IntersectionObserverEntry
import typings.std.NodeListOf
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def animate(sequence: AnimationSequence): AnimationPlaybackControls = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(sequence.asInstanceOf[js.Any]).asInstanceOf[AnimationPlaybackControls]
inline def animate(sequence: AnimationSequence, options: SequenceOptions): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(sequence.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
inline def animate(value: ElementOrSelector, keyframes: DOMKeyframesDefinition): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(value.asInstanceOf[js.Any], keyframes.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
inline def animate(value: ElementOrSelector, keyframes: DOMKeyframesDefinition, options: DynamicAnimationOptions): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(value.asInstanceOf[js.Any], keyframes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
inline def animate[V](from: V, to: GenericKeyframesTarget[V] | V): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
inline def animate[V](from: V, to: GenericKeyframesTarget[V] | V, options: ValueAnimationTransition[V]): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
inline def animate[V_1](value: MotionValue_[V_1], keyframes: GenericKeyframesTarget[V_1] | V_1): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(value.asInstanceOf[js.Any], keyframes.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]
inline def animate[V_1](
  value: MotionValue_[V_1],
  keyframes: GenericKeyframesTarget[V_1] | V_1,
  options: ValueAnimationTransition[V_1]
): AnimationPlaybackControls = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(value.asInstanceOf[js.Any], keyframes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationPlaybackControls]

inline def anticipate(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("anticipate")(p.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def backIn: EasingFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("backIn").asInstanceOf[EasingFunction]

inline def backInOut: EasingFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("backInOut").asInstanceOf[EasingFunction]

inline def backOut(t: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("backOut")(t.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def cancelFrame(process: Process): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelFrame")(process.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def circIn: EasingFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("circIn").asInstanceOf[EasingFunction]

inline def circInOut: EasingFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("circInOut").asInstanceOf[EasingFunction]

inline def circOut: EasingFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("circOut").asInstanceOf[EasingFunction]

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

inline def frame: Frameloop = ^.asInstanceOf[js.Dynamic].selectDynamic("frame").asInstanceOf[Frameloop]

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

inline def invariant: DevMessage = ^.asInstanceOf[js.Dynamic].selectDynamic("invariant").asInstanceOf[DevMessage]
inline def invariant_=(x: DevMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invariant")(x.asInstanceOf[js.Any])

inline def mirrorEasing: EasingModifier = ^.asInstanceOf[js.Dynamic].selectDynamic("mirrorEasing").asInstanceOf[EasingModifier]

inline def mix(from: Double, to: Double, progress: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def motionValue[V](init: V): MotionValue_[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("motionValue")(init.asInstanceOf[js.Any]).asInstanceOf[MotionValue_[V]]
inline def motionValue[V](init: V, options: MotionValueOptions): MotionValue_[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("motionValue")(init.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MotionValue_[V]]

inline def pipe(transformers: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(transformers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function]

inline def progress(from: Double, to: Double, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("progress")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def reverseEasing: EasingModifier = ^.asInstanceOf[js.Dynamic].selectDynamic("reverseEasing").asInstanceOf[EasingModifier]

inline def scroll(onScroll: OnScroll): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(onScroll.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
inline def scroll(onScroll: OnScroll, param1: ScrollOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(onScroll.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]

inline def stagger(): DynamicOption[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")().asInstanceOf[DynamicOption[Double]]
inline def stagger(duration: Double): DynamicOption[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(duration.asInstanceOf[js.Any]).asInstanceOf[DynamicOption[Double]]
inline def stagger(duration: Double, param1: StaggerOptions): DynamicOption[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(duration.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[DynamicOption[Double]]
inline def stagger(duration: Unit, param1: StaggerOptions): DynamicOption[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(duration.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[DynamicOption[Double]]

inline def steps: Steps_ = ^.asInstanceOf[js.Dynamic].selectDynamic("steps").asInstanceOf[Steps_]

inline def stepsOrder: js.Array[StepId] = ^.asInstanceOf[js.Dynamic].selectDynamic("stepsOrder").asInstanceOf[js.Array[StepId]]

/**
  * @deprecated
  *
  * Import as `frame` instead.
  */
inline def sync: Frameloop = ^.asInstanceOf[js.Dynamic].selectDynamic("sync").asInstanceOf[Frameloop]

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

inline def warning: DevMessage = ^.asInstanceOf[js.Dynamic].selectDynamic("warning").asInstanceOf[DevMessage]
inline def warning_=(x: DevMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])

inline def wrap(min: Double, max: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]

type AnimationSequence = js.Array[Segment]

type BezierDefinition = js.Tuple4[Double, Double, Double, Double]

type DOMSegment = js.Tuple2[ElementOrSelector, DOMKeyframesDefinition]

type DOMSegmentWithTransition = js.Tuple3[ElementOrSelector, DOMKeyframesDefinition, DynamicAnimationOptions & At]

type DelayedFunction = js.Function1[/* overshoot */ Double, Unit]

type DevMessage = js.Function2[/* check */ Boolean, /* message */ String, Unit]

type Driver = js.Function1[/* update */ Update, DriverControls]

type DynamicOption[T] = js.Function2[/* i */ Double, /* total */ Double, T]

/**
  * The easing function to use. Set as one of:
  *
  * - The name of an in-built easing function.
  * - An array of four numbers to define a cubic bezier curve.
  * - An easing function, that accepts and returns a progress value between `0` and `1`.
  *
  * @public
  */
type Easing = EasingDefinition | EasingFunction

/* Rewritten from type alias, can be one of: 
  - typings.framerMotion.distDomEntryMod.BezierDefinition
  - typings.framerMotion.framerMotionStrings.linear
  - typings.framerMotion.framerMotionStrings.easeIn
  - typings.framerMotion.framerMotionStrings.easeOut
  - typings.framerMotion.framerMotionStrings.easeInOut
  - typings.framerMotion.framerMotionStrings.circIn
  - typings.framerMotion.framerMotionStrings.circOut
  - typings.framerMotion.framerMotionStrings.circInOut
  - typings.framerMotion.framerMotionStrings.backIn
  - typings.framerMotion.framerMotionStrings.backOut
  - typings.framerMotion.framerMotionStrings.backInOut
  - typings.framerMotion.framerMotionStrings.anticipate
*/
type EasingDefinition = _EasingDefinition | BezierDefinition

type EasingFunction = js.Function1[/* v */ Double, Double]

type EasingModifier = js.Function1[/* easing */ EasingFunction, EasingFunction]

type Edge = EdgeString | Double

type EdgeString = NamedEdges | EdgeUnit | (/* template literal string: ${number} */ String)

type EdgeUnit = /* template literal string: ${number}${SupportedEdgeUnit} */ String

type ElementOrSelector = Element | js.Array[Element] | NodeListOf[Element] | String

type GenericKeyframesTarget[V] = (Array[Null | V]) | js.Array[V]

type Intersection = /* template literal string: ${Edge} ${Edge} */ String

type Mix_[T] = js.Function1[/* v */ Double, T]

type MixerFactory[T] = js.Function2[/* from */ T, /* to */ T, Mix_[T]]

type MotionValueSegment = js.Tuple2[MotionValue_[Any], UnresolvedValueKeyframe | js.Array[UnresolvedValueKeyframe]]

type MotionValueSegmentWithTransition = js.Tuple3[
MotionValue_[Any], 
UnresolvedValueKeyframe | js.Array[UnresolvedValueKeyframe], 
Transition & At]

type OnScroll = js.Function1[/* info */ ScrollInfo, Unit]

/**
  * @public
  */
type PassiveEffect[T] = js.Function2[/* v */ T, /* safeSetter */ js.Function1[/* v */ T, Unit], Unit]

type Process = js.Function1[/* data */ FrameData_, Unit]

type ProgressIntersection = js.Tuple2[Double, Double]

type ResolvedValues = StringDictionary[String | Double]

type Schedule = js.Function3[
/* process */ Process, 
/* keepAlive */ js.UndefOr[Boolean], 
/* immediate */ js.UndefOr[Boolean], 
Process]

type ScrollOffset = js.Array[Edge | Intersection | ProgressIntersection]

type Segment = MotionValueSegment | MotionValueSegmentWithTransition | DOMSegment | DOMSegmentWithTransition | SequenceLabel | SequenceLabelWithTime

type SequenceLabel = String

type SequenceTime = Double | Lessthansign | (/* template literal string: +${number} */ String)

/* Rewritten from type alias, can be one of: 
  - typings.framerMotion.framerMotionStrings.first
  - typings.framerMotion.framerMotionStrings.last
  - typings.framerMotion.framerMotionStrings.center
  - scala.Double
*/
type StaggerOrigin = _StaggerOrigin | Double

/**
  * @public
  */
type Subscriber[T] = js.Function1[/* v */ T, Unit]

type UnresolvedValueKeyframe = ValueKeyframe | Null

/**
  * An update function. It accepts a timestamp used to advance the animation.
  */
type Update = js.Function1[/* timestamp */ Double, Unit]

type ValueKeyframe = String | Double

type ValueKeyframesDefinition = ValueKeyframe | (js.Array[UnresolvedValueKeyframe | ValueKeyframe])

type VariableKeyframesDefinition = StringDictionary[ValueKeyframesDefinition]

type VariableTransitions = StringDictionary[Transition]

type ViewChangeHandler = js.Function1[/* entry */ IntersectionObserverEntry, Unit]
