package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StringDictionary
import typings.framerMotion.anon.PartialBoundingBox
import typings.framerMotion.distThreeEntryMod.^
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.react.mod.PropsWithChildren
import typings.std.AddEventListenerOptions
import typings.std.EventListener
import typings.std.EventTarget
import typings.std.Exclude
import typings.std.IntersectionObserverEntry
import typings.std.Pick
import typings.std.PointerEvent
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def MotionContext: Context[MotionContextProps[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("MotionContext").asInstanceOf[Context[MotionContextProps[Any]]]

inline def addPointerEvent(target: EventTarget, eventName: String, handler: EventListenerWithPointInfo): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addPointerEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
inline def addPointerEvent(
  target: EventTarget,
  eventName: String,
  handler: EventListenerWithPointInfo,
  options: AddEventListenerOptions
): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addPointerEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]

inline def addPointerInfo(handler: EventListenerWithPointInfo): EventListener = ^.asInstanceOf[js.Dynamic].applyDynamic("addPointerInfo")(handler.asInstanceOf[js.Any]).asInstanceOf[EventListener]

inline def animations: FeaturePackages = ^.asInstanceOf[js.Dynamic].selectDynamic("animations").asInstanceOf[FeaturePackages]

inline def calcLength(axis: Axis): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calcLength")(axis.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def checkTargetForNewValues(
  visualElement: VisualElement[Any, Any, js.Object],
  target: TargetWithKeyframes,
  origin: ResolvedValues
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkTargetForNewValues")(visualElement.asInstanceOf[js.Any], target.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def createBox(): Box = ^.asInstanceOf[js.Dynamic].applyDynamic("createBox")().asInstanceOf[Box]

inline def filterProps(props: MotionProps, isDom: Boolean, forwardMotionProps: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("filterProps")(props.asInstanceOf[js.Any], isDom.asInstanceOf[js.Any], forwardMotionProps.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def isBrowser: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("isBrowser").asInstanceOf[Boolean]

inline def isDragActive(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragActive")().asInstanceOf[Boolean]

inline def isMotionValue(value: Any): /* is framer-motion.framer-motion/dist/three-entry.MotionValue<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMotionValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is framer-motion.framer-motion/dist/three-entry.MotionValue<any> */ Boolean]

inline def makeUseVisualState[I, RS](config: UseVisualStateConfig[I, RS]): UseVisualState[I, RS] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeUseVisualState")(config.asInstanceOf[js.Any]).asInstanceOf[UseVisualState[I, RS]]

inline def useForceUpdate(): js.Tuple2[VoidFunction, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceUpdate")().asInstanceOf[js.Tuple2[VoidFunction, Double]]

/**
  * Accepts a function that contains imperative, possibly effectful code.
  *
  * @param effect Imperative function that can return a cleanup function
  * @param deps If present, effect will only activate if the values in the list change.
  *
  * @version 16.8.0
  * @see https://react.dev/reference/react/useEffect
  */
/* was `typeof useEffect` */
inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
/* was `typeof useEffect` */
inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useUnmountEffect(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUnmountEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

type AnimationDefinition = VariantLabels | TargetAndTransition | TargetResolver

type BezierDefinition = js.Tuple4[Double, Double, Double, Double]

type CreateVisualElement[Instance] = js.Function2[
/* Component */ String | ComponentType[PropsWithChildren[Any]], 
/* options */ VisualElementOptions[Instance, Any], 
VisualElement[Instance, Any, js.Object]]

type DragElastic = Boolean | Double | PartialBoundingBox

type Driver = js.Function1[/* update */ Update, DriverControls]

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
  - typings.framerMotion.distThreeEntryMod.BezierDefinition
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

type EventListenerWithPointInfo = js.Function2[/* e */ PointerEvent, /* info */ EventInfo, Unit]

type MakeMotion[T] = MakeCustomValueType[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] | framer-motion.framer-motion/dist/three-entry.MotionValue<number> | framer-motion.framer-motion/dist/three-entry.MotionValue<string> | framer-motion.framer-motion/dist/three-entry.MotionValue<any>} */ js.Any]

type Omit1[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

/**
  * @public
  */
type PermissiveTransitionDefinition = StringDictionary[Any]

type Process = js.Function1[/* data */ FrameData, Unit]

/**
  * A generic set of string/number values
  */
type ResolvedValues = StringDictionary[String | Double]

type ResolvedValues1 = StringDictionary[String | Double]

type ScrapeMotionValuesFromProps = js.Function2[
/* props */ MotionProps, 
/* prevProps */ MotionProps, 
StringDictionary[MotionValue[Any] | String | Double]]

/**
  * @public
  */
type Subscriber[T] = js.Function1[/* v */ T, Unit]

type TargetResolver = js.Function3[
/* custom */ Any, 
/* current */ Target, 
/* velocity */ Target, 
TargetAndTransition | String]

type TransformPoint = js.Function1[/* point */ Point, Point]

/**
  * Transition props
  *
  * @public
  */
type Transition1 = (Orchestration & Repeat & TransitionDefinition) | (Orchestration & Repeat & TransitionMap)

/**
  * @public
  */
/* Rewritten from type alias, can be one of: 
  - typings.framerMotion.distThreeEntryMod.Tween
  - typings.framerMotion.distThreeEntryMod.Spring
  - typings.framerMotion.distThreeEntryMod.Keyframes
  - typings.framerMotion.distThreeEntryMod.Inertia
  - typings.framerMotion.distThreeEntryMod.Just
  - typings.framerMotion.distThreeEntryMod.None
  - typings.framerMotion.distThreeEntryMod.PermissiveTransitionDefinition
*/
type TransitionDefinition = _TransitionDefinition | PermissiveTransitionDefinition

type TransitionMap = Orchestration & TransitionDefinition & StringDictionary[TransitionDefinition]

/**
  * An update function. It accepts a timestamp used to advance the animation.
  */
type Update = js.Function1[/* timestamp */ Double, Unit]

type UseVisualState[Instance, RenderState] = js.Function2[/* props */ MotionProps, /* isStatic */ Boolean, VisualState[Instance, RenderState]]

/**
  * @public
  */
type Variant = TargetAndTransition | TargetResolver

/**
  * Either a string, or array of strings, that reference variants defined via the `variants` prop.
  * @public
  */
type VariantLabels = String | js.Array[String]

/**
  * @public
  */
type Variants = StringDictionary[Variant]

type ViewportEventHandler = js.Function1[/* entry */ IntersectionObserverEntry | Null, Unit]
