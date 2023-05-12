package typings.framerMotion.anon

import typings.framerMotion.framerMotionBooleans.`false`
import typings.framerMotion.framerMotionStrings.`preserve-aspect`
import typings.framerMotion.framerMotionStrings.position
import typings.framerMotion.framerMotionStrings.size
import typings.framerMotion.framerMotionStrings.x
import typings.framerMotion.framerMotionStrings.y
import typings.framerMotion.mod.AnimationControls_
import typings.framerMotion.mod.AnimationDefinition
import typings.framerMotion.mod.BoundingBox
import typings.framerMotion.mod.Box
import typings.framerMotion.mod.DragControls
import typings.framerMotion.mod.DragElastic
import typings.framerMotion.mod.EventInfo
import typings.framerMotion.mod.InertiaOptions1
import typings.framerMotion.mod.MotionStyle
import typings.framerMotion.mod.MotionValue_
import typings.framerMotion.mod.PanInfo
import typings.framerMotion.mod.Point
import typings.framerMotion.mod.ReducedMotionConfig
import typings.framerMotion.mod.RefObject
import typings.framerMotion.mod.ResolvedValues
import typings.framerMotion.mod.TapInfo
import typings.framerMotion.mod.Target
import typings.framerMotion.mod.TargetAndTransition
import typings.framerMotion.mod.TransformPoint
import typings.framerMotion.mod.TransformProperties
import typings.framerMotion.mod.Transition1
import typings.framerMotion.mod.VariantLabels
import typings.framerMotion.mod.Variants
import typings.framerMotion.mod.ViewportEventHandler
import typings.framerMotion.mod.ViewportOptions
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.IntersectionObserverEntry
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined framer-motion.framer-motion.MotionProps & std.Partial<framer-motion.framer-motion.MotionConfigContext> */
trait MotionPropsPartialMotionC extends StObject {
  
  /**
    * Usually, dragging uses the layout project engine, and applies transforms to the underlying VisualElement.
    * Passing MotionValues as _dragX and _dragY instead applies drag updates to these motion values.
    * This allows you to manually control how updates from a drag gesture on an element is applied.
    *
    * @public
    */
  var _dragX: js.UndefOr[MotionValue_[Double]] = js.undefined
  
  /**
    * Usually, dragging uses the layout project engine, and applies transforms to the underlying VisualElement.
    * Passing MotionValues as _dragX and _dragY instead applies drag updates to these motion values.
    * This allows you to manually control how updates from a drag gesture on an element is applied.
    *
    * @public
    */
  var _dragY: js.UndefOr[MotionValue_[Double]] = js.undefined
  
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
  var animate: js.UndefOr[AnimationControls_ | TargetAndTransition | VariantLabels | Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode | (MotionValue_[Double | String])] = js.undefined
  
  /**
    * Custom data to use to resolve dynamic variants differently for each animating component.
    *
    * ```jsx
    * const variants = {
    *   visible: (custom) => ({
    *     opacity: 1,
    *     transition: { delay: custom * 0.2 }
    *   })
    * }
    *
    * <motion.div custom={0} animate="visible" variants={variants} />
    * <motion.div custom={1} animate="visible" variants={variants} />
    * <motion.div custom={2} animate="visible" variants={variants} />
    * ```
    *
    * @public
    */
  var custom: js.UndefOr[Any] = js.undefined
  
  /**
    * Enable dragging for this element. Set to `false` by default.
    * Set `true` to drag in both directions.
    * Set `"x"` or `"y"` to only drag in a specific direction.
    *
    * ```jsx
    * <motion.div drag="x" />
    * ```
    */
  var drag: js.UndefOr[Boolean | x | y] = js.undefined
  
  /**
    * Applies constraints on the permitted draggable area.
    *
    * It can accept an object of optional `top`, `left`, `right`, and `bottom` values, measured in pixels.
    * This will define a distance the named edge of the draggable component.
    *
    * Alternatively, it can accept a `ref` to another component created with React's `useRef` hook.
    * This `ref` should be passed both to the draggable component's `dragConstraints` prop, and the `ref`
    * of the component you want to use as constraints.
    *
    * ```jsx
    * // In pixels
    * <motion.div
    *   drag="x"
    *   dragConstraints={{ left: 0, right: 300 }}
    * />
    *
    * // As a ref to another component
    * const MyComponent = () => {
    *   const constraintsRef = useRef(null)
    *
    *   return (
    *      <motion.div ref={constraintsRef}>
    *          <motion.div drag dragConstraints={constraintsRef} />
    *      </motion.div>
    *   )
    * }
    * ```
    */
  var dragConstraints: js.UndefOr[`false` | PartialBoundingBox | RefObject[Element]] = js.undefined
  
  /**
    * Usually, dragging is initiated by pressing down on a component and moving it. For some
    * use-cases, for instance clicking at an arbitrary point on a video scrubber, we
    * might want to initiate dragging from a different component than the draggable one.
    *
    * By creating a `dragControls` using the `useDragControls` hook, we can pass this into
    * the draggable component's `dragControls` prop. It exposes a `start` method
    * that can start dragging from pointer events on other components.
    *
    * ```jsx
    * const dragControls = useDragControls()
    *
    * function startDrag(event) {
    *   dragControls.start(event, { snapToCursor: true })
    * }
    *
    * return (
    *   <>
    *     <div onPointerDown={startDrag} />
    *     <motion.div drag="x" dragControls={dragControls} />
    *   </>
    * )
    * ```
    */
  var dragControls: js.UndefOr[DragControls] = js.undefined
  
  /**
    * If `true`, this will lock dragging to the initially-detected direction. Defaults to `false`.
    *
    * ```jsx
    * <motion.div drag dragDirectionLock />
    * ```
    */
  var dragDirectionLock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The degree of movement allowed outside constraints. 0 = no movement, 1 =
    * full movement.
    *
    * Set to `0.5` by default. Can also be set as `false` to disable movement.
    *
    * By passing an object of `top`/`right`/`bottom`/`left`, individual values can be set
    * per constraint. Any missing values will be set to `0`.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragConstraints={{ left: 0, right: 300 }}
    *   dragElastic={0.2}
    * />
    * ```
    */
  var dragElastic: js.UndefOr[DragElastic] = js.undefined
  
  /**
    * By default, if `drag` is defined on a component then an event listener will be attached
    * to automatically initiate dragging when a user presses down on it.
    *
    * By setting `dragListener` to `false`, this event listener will not be created.
    *
    * ```jsx
    * const dragControls = useDragControls()
    *
    * function startDrag(event) {
    *   dragControls.start(event, { snapToCursor: true })
    * }
    *
    * return (
    *   <>
    *     <div onPointerDown={startDrag} />
    *     <motion.div
    *       drag="x"
    *       dragControls={dragControls}
    *       dragListener={false}
    *     />
    *   </>
    * )
    * ```
    */
  var dragListener: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Apply momentum from the pan gesture to the component when dragging
    * finishes. Set to `true` by default.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragConstraints={{ left: 0, right: 300 }}
    *   dragMomentum={false}
    * />
    * ```
    */
  var dragMomentum: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows drag gesture propagation to child components. Set to `false` by
    * default.
    *
    * ```jsx
    * <motion.div drag="x" dragPropagation />
    * ```
    */
  var dragPropagation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, element will snap back to its origin when dragging ends.
    *
    * Enabling this is the equivalent of setting all `dragConstraints` axes to `0`
    * with `dragElastic={1}`, but when used together `dragConstraints` can define
    * a wider draggable area and `dragSnapToOrigin` will ensure the element
    * animates back to its origin on release.
    */
  var dragSnapToOrigin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows you to change dragging inertia parameters.
    * When releasing a draggable Frame, an animation with type `inertia` starts. The animation is based on your dragging velocity. This property allows you to customize it.
    * See {@link https://framer.com/api/animation/#inertia | Inertia} for all properties you can use.
    *
    * ```jsx
    * <motion.div
    *   drag
    *   dragTransition={{ bounceStiffness: 600, bounceDamping: 10 }}
    * />
    * ```
    */
  var dragTransition: js.UndefOr[InertiaOptions1] = js.undefined
  
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
    * @public
    * Set to `false` to prevent throwing an error when a `motion` component is used within a `LazyMotion` set to strict.
    */
  var ignoreStrict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @public
    * Set to `false` to prevent inheriting variant changes from its parent.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  
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
  
  var isStatic: js.UndefOr[Boolean] = js.undefined
  
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
    * Callback when animation defined in `animate` is complete.
    *
    * The provided callback will be called with the triggering animation definition.
    * If this is a variant, it'll be the variant name, and if a target object
    * then it'll be the target object.
    *
    * This way, it's possible to figure out which animation has completed.
    *
    * ```jsx
    * function onComplete() {
    *   console.log("Animation completed")
    * }
    *
    * <motion.div
    *   animate={{ x: 100 }}
    *   onAnimationComplete={definition => {
    *     console.log('Completed animating', definition)
    *   }}
    * />
    * ```
    */
  var onAnimationComplete: js.UndefOr[js.Function1[/* definition */ AnimationDefinition, Unit]] = js.undefined
  
  /**
    * Callback when animation defined in `animate` begins.
    *
    * The provided callback will be called with the triggering animation definition.
    * If this is a variant, it'll be the variant name, and if a target object
    * then it'll be the target object.
    *
    * This way, it's possible to figure out which animation has started.
    *
    * ```jsx
    * function onStart() {
    *   console.log("Animation started")
    * }
    *
    * <motion.div animate={{ x: 100 }} onAnimationStart={onStart} />
    * ```
    */
  var onAnimationStart: js.UndefOr[js.Function1[/* definition */ AnimationDefinition, Unit]] = js.undefined
  
  var onBeforeLayoutMeasure: js.UndefOr[js.Function1[/* box */ Box, Unit]] = js.undefined
  
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
  
  /**
    * Callback function that fires when pointer stops hovering over the component.
    *
    * ```jsx
    * <motion.div onHoverEnd={() => console.log("Hover ends")} />
    * ```
    */
  var onHoverEnd: js.UndefOr[js.Function2[/* event */ MouseEvent, /* info */ EventInfo, Unit]] = js.undefined
  
  /**
    * Callback function that fires when pointer starts hovering over the component.
    *
    * ```jsx
    * <motion.div onHoverStart={() => console.log('Hover starts')} />
    * ```
    */
  var onHoverStart: js.UndefOr[js.Function2[/* event */ MouseEvent, /* info */ EventInfo, Unit]] = js.undefined
  
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
  
  var onLayoutMeasure: js.UndefOr[js.Function2[/* box */ Box, /* prevBox */ Box, Unit]] = js.undefined
  
  /**
    * If `dragConstraints` is set to a React ref, this callback will call with the measured drag constraints.
    *
    * @public
    */
  var onMeasureDragConstraints: js.UndefOr[js.Function1[/* constraints */ BoundingBox, BoundingBox | Unit]] = js.undefined
  
  /**
    * Callback function that fires when the pan gesture is recognised on this element.
    *
    * **Note:** For pan gestures to work correctly with touch input, the element needs
    * touch scrolling to be disabled on either x/y or both axis with the
    * [touch-action](https://developer.mozilla.org/en-US/docs/Web/CSS/touch-action) CSS rule.
    *
    * ```jsx
    * function onPan(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onPan={onPan} />
    * ```
    *
    * @param event - The originating pointer event.
    * @param info - A {@link PanInfo} object containing `x` and `y` values for:
    *
    *   - `point`: Relative to the device or page.
    *   - `delta`: Distance moved since the last event.
    *   - `offset`: Offset from the original pan event.
    *   - `velocity`: Current velocity of the pointer.
    */
  var onPan: js.UndefOr[js.Function2[/* event */ PointerEvent, /* info */ PanInfo, Unit]] = js.undefined
  
  /**
    * Callback function that fires when the pan gesture ends on this element.
    *
    * ```jsx
    * function onPanEnd(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onPanEnd={onPanEnd} />
    * ```
    *
    * @param event - The originating pointer event.
    * @param info - A {@link PanInfo} object containing `x`/`y` values for:
    *
    *   - `point`: Relative to the device or page.
    *   - `delta`: Distance moved since the last event.
    *   - `offset`: Offset from the original pan event.
    *   - `velocity`: Current velocity of the pointer.
    */
  var onPanEnd: js.UndefOr[js.Function2[/* event */ PointerEvent, /* info */ PanInfo, Unit]] = js.undefined
  
  /**
    * Callback function that fires when we begin detecting a pan gesture. This
    * is analogous to `onMouseStart` or `onTouchStart`.
    *
    * ```jsx
    * function onPanSessionStart(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onPanSessionStart={onPanSessionStart} />
    * ```
    *
    * @param event - The originating pointer event.
    * @param info - An {@link EventInfo} object containing `x`/`y` values for:
    *
    *   - `point`: Relative to the device or page.
    */
  var onPanSessionStart: js.UndefOr[js.Function2[/* event */ PointerEvent, /* info */ EventInfo, Unit]] = js.undefined
  
  /**
    * Callback function that fires when the pan gesture begins on this element.
    *
    * ```jsx
    * function onPanStart(event, info) {
    *   console.log(info.point.x, info.point.y)
    * }
    *
    * <motion.div onPanStart={onPanStart} />
    * ```
    *
    * @param event - The originating pointer event.
    * @param info - A {@link PanInfo} object containing `x`/`y` values for:
    *
    *   - `point`: Relative to the device or page.
    *   - `delta`: Distance moved since the last event.
    *   - `offset`: Offset from the original pan event.
    *   - `velocity`: Current velocity of the pointer.
    */
  var onPanStart: js.UndefOr[js.Function2[/* event */ PointerEvent, /* info */ PanInfo, Unit]] = js.undefined
  
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
    * Callback with latest motion values, fired max once per frame.
    *
    * ```jsx
    * function onUpdate(latest) {
    *   console.log(latest.x, latest.opacity)
    * }
    *
    * <motion.div animate={{ x: 100, opacity: 0 }} onUpdate={onUpdate} />
    * ```
    */
  var onUpdate: js.UndefOr[js.Function1[/* latest */ ResolvedValues, Unit]] = js.undefined
  
  var onViewportEnter: js.UndefOr[ViewportEventHandler] = js.undefined
  
  var onViewportLeave: js.UndefOr[ViewportEventHandler] = js.undefined
  
  var reducedMotion: js.UndefOr[ReducedMotionConfig] = js.undefined
  
  /**
    *
    * The React DOM `style` prop, enhanced with support for `MotionValue`s and separate `transform` values.
    *
    * ```jsx
    * export const MyComponent = () => {
    *   const x = useMotionValue(0)
    *
    *   return <motion.div style={{ x, opacity: 1, scale: 0.5 }} />
    * }
    * ```
    */
  var style: js.UndefOr[MotionStyle] = js.undefined
  
  var transformPagePoint: js.UndefOr[TransformPoint] = js.undefined
  
  /**
    * By default, Framer Motion generates a `transform` property with a sensible transform order. `transformTemplate`
    * can be used to create a different order, or to append/preprend the automatically generated `transform` property.
    *
    * ```jsx
    * <motion.div
    *   style={{ x: 0, rotate: 180 }}
    *   transformTemplate={
    *     ({ x, rotate }) => `rotate(${rotate}deg) translateX(${x}px)`
    *   }
    * />
    * ```
    *
    * @param transform - The latest animated transform props.
    * @param generatedTransform - The transform string as automatically generated by Framer Motion
    *
    * @public
    */
  var transformTemplate: js.UndefOr[
    js.Function2[/* transform */ TransformProperties, /* generatedTransform */ String, String]
  ] = js.undefined
  
  /**
    * Internal.
    *
    * This allows values to be transformed before being animated or set as styles.
    *
    * For instance, this allows custom values in Framer Library like `size` to be converted into `width` and `height`.
    * It also allows us a chance to take a value like `Color` and convert it to an animatable color string.
    *
    * A few structural typing changes need making before this can be a public property:
    * - Allow `Target` values to be appended by user-defined types (delete `CustomStyles` - does `size` throw a type error?)
    * - Extract `CustomValueType` as a separate user-defined type (delete `CustomValueType` and animate a `Color` - does this throw a type error?).
    *
    * @param values -
    */
  var transformValues: js.UndefOr[js.Function1[/* values */ ResolvedValues, ResolvedValues]] = js.undefined
  
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
  
  var viewport: js.UndefOr[ViewportOptions] = js.undefined
  
  /**
    * Properties or variant label to animate to while the drag gesture is recognised.
    *
    * ```jsx
    * <motion.div whileDrag={{ scale: 1.2 }} />
    * ```
    */
  var whileDrag: js.UndefOr[VariantLabels | TargetAndTransition] = js.undefined
  
  /**
    * Properties or variant label to animate to while the focus gesture is recognised.
    *
    * ```jsx
    * <motion.input whileFocus={{ scale: 1.2 }} />
    * ```
    */
  var whileFocus: js.UndefOr[VariantLabels | TargetAndTransition] = js.undefined
  
  /**
    * Properties or variant label to animate to while the hover gesture is recognised.
    *
    * ```jsx
    * <motion.div whileHover={{ scale: 1.2 }} />
    * ```
    */
  var whileHover: js.UndefOr[VariantLabels | TargetAndTransition] = js.undefined
  
  var whileInView: js.UndefOr[VariantLabels | TargetAndTransition] = js.undefined
  
  /**
    * Properties or variant label to animate to while the component is pressed.
    *
    * ```jsx
    * <motion.div whileTap={{ scale: 0.8 }} />
    * ```
    */
  var whileTap: js.UndefOr[VariantLabels | TargetAndTransition] = js.undefined
}
object MotionPropsPartialMotionC {
  
  inline def apply(): MotionPropsPartialMotionC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionPropsPartialMotionC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionPropsPartialMotionC] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: AnimationControls_ | TargetAndTransition | VariantLabels | Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnimateVarargs(value: String*): Self = StObject.set(x, "animate", js.Array(value*))
    
    inline def setChildren(value: ReactNode | (MotionValue_[Double | String])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCustom(value: Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDrag(value: Boolean | typings.framerMotion.framerMotionStrings.x | y): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragConstraints(value: `false` | PartialBoundingBox | RefObject[Element]): Self = StObject.set(x, "dragConstraints", value.asInstanceOf[js.Any])
    
    inline def setDragConstraintsUndefined: Self = StObject.set(x, "dragConstraints", js.undefined)
    
    inline def setDragControls(value: DragControls): Self = StObject.set(x, "dragControls", value.asInstanceOf[js.Any])
    
    inline def setDragControlsUndefined: Self = StObject.set(x, "dragControls", js.undefined)
    
    inline def setDragDirectionLock(value: Boolean): Self = StObject.set(x, "dragDirectionLock", value.asInstanceOf[js.Any])
    
    inline def setDragDirectionLockUndefined: Self = StObject.set(x, "dragDirectionLock", js.undefined)
    
    inline def setDragElastic(value: DragElastic): Self = StObject.set(x, "dragElastic", value.asInstanceOf[js.Any])
    
    inline def setDragElasticUndefined: Self = StObject.set(x, "dragElastic", js.undefined)
    
    inline def setDragListener(value: Boolean): Self = StObject.set(x, "dragListener", value.asInstanceOf[js.Any])
    
    inline def setDragListenerUndefined: Self = StObject.set(x, "dragListener", js.undefined)
    
    inline def setDragMomentum(value: Boolean): Self = StObject.set(x, "dragMomentum", value.asInstanceOf[js.Any])
    
    inline def setDragMomentumUndefined: Self = StObject.set(x, "dragMomentum", js.undefined)
    
    inline def setDragPropagation(value: Boolean): Self = StObject.set(x, "dragPropagation", value.asInstanceOf[js.Any])
    
    inline def setDragPropagationUndefined: Self = StObject.set(x, "dragPropagation", js.undefined)
    
    inline def setDragSnapToOrigin(value: Boolean): Self = StObject.set(x, "dragSnapToOrigin", value.asInstanceOf[js.Any])
    
    inline def setDragSnapToOriginUndefined: Self = StObject.set(x, "dragSnapToOrigin", js.undefined)
    
    inline def setDragTransition(value: InertiaOptions1): Self = StObject.set(x, "dragTransition", value.asInstanceOf[js.Any])
    
    inline def setDragTransitionUndefined: Self = StObject.set(x, "dragTransition", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setExit(value: TargetAndTransition | VariantLabels): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setExitVarargs(value: String*): Self = StObject.set(x, "exit", js.Array(value*))
    
    inline def setIgnoreStrict(value: Boolean): Self = StObject.set(x, "ignoreStrict", value.asInstanceOf[js.Any])
    
    inline def setIgnoreStrictUndefined: Self = StObject.set(x, "ignoreStrict", js.undefined)
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    inline def setInitial(value: Boolean | Target | VariantLabels): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setInitialVarargs(value: String*): Self = StObject.set(x, "initial", js.Array(value*))
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
    
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
    
    inline def setOnAnimationComplete(value: /* definition */ AnimationDefinition => Unit): Self = StObject.set(x, "onAnimationComplete", js.Any.fromFunction1(value))
    
    inline def setOnAnimationCompleteUndefined: Self = StObject.set(x, "onAnimationComplete", js.undefined)
    
    inline def setOnAnimationStart(value: /* definition */ AnimationDefinition => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnBeforeLayoutMeasure(value: /* box */ Box => Unit): Self = StObject.set(x, "onBeforeLayoutMeasure", js.Any.fromFunction1(value))
    
    inline def setOnBeforeLayoutMeasureUndefined: Self = StObject.set(x, "onBeforeLayoutMeasure", js.undefined)
    
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
    
    inline def setOnHoverEnd(value: (/* event */ MouseEvent, /* info */ EventInfo) => Unit): Self = StObject.set(x, "onHoverEnd", js.Any.fromFunction2(value))
    
    inline def setOnHoverEndUndefined: Self = StObject.set(x, "onHoverEnd", js.undefined)
    
    inline def setOnHoverStart(value: (/* event */ MouseEvent, /* info */ EventInfo) => Unit): Self = StObject.set(x, "onHoverStart", js.Any.fromFunction2(value))
    
    inline def setOnHoverStartUndefined: Self = StObject.set(x, "onHoverStart", js.undefined)
    
    inline def setOnLayoutAnimationComplete(value: () => Unit): Self = StObject.set(x, "onLayoutAnimationComplete", js.Any.fromFunction0(value))
    
    inline def setOnLayoutAnimationCompleteUndefined: Self = StObject.set(x, "onLayoutAnimationComplete", js.undefined)
    
    inline def setOnLayoutAnimationStart(value: () => Unit): Self = StObject.set(x, "onLayoutAnimationStart", js.Any.fromFunction0(value))
    
    inline def setOnLayoutAnimationStartUndefined: Self = StObject.set(x, "onLayoutAnimationStart", js.undefined)
    
    inline def setOnLayoutMeasure(value: (/* box */ Box, /* prevBox */ Box) => Unit): Self = StObject.set(x, "onLayoutMeasure", js.Any.fromFunction2(value))
    
    inline def setOnLayoutMeasureUndefined: Self = StObject.set(x, "onLayoutMeasure", js.undefined)
    
    inline def setOnMeasureDragConstraints(value: /* constraints */ BoundingBox => BoundingBox | Unit): Self = StObject.set(x, "onMeasureDragConstraints", js.Any.fromFunction1(value))
    
    inline def setOnMeasureDragConstraintsUndefined: Self = StObject.set(x, "onMeasureDragConstraints", js.undefined)
    
    inline def setOnPan(value: (/* event */ PointerEvent, /* info */ PanInfo) => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction2(value))
    
    inline def setOnPanEnd(value: (/* event */ PointerEvent, /* info */ PanInfo) => Unit): Self = StObject.set(x, "onPanEnd", js.Any.fromFunction2(value))
    
    inline def setOnPanEndUndefined: Self = StObject.set(x, "onPanEnd", js.undefined)
    
    inline def setOnPanSessionStart(value: (/* event */ PointerEvent, /* info */ EventInfo) => Unit): Self = StObject.set(x, "onPanSessionStart", js.Any.fromFunction2(value))
    
    inline def setOnPanSessionStartUndefined: Self = StObject.set(x, "onPanSessionStart", js.undefined)
    
    inline def setOnPanStart(value: (/* event */ PointerEvent, /* info */ PanInfo) => Unit): Self = StObject.set(x, "onPanStart", js.Any.fromFunction2(value))
    
    inline def setOnPanStartUndefined: Self = StObject.set(x, "onPanStart", js.undefined)
    
    inline def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
    
    inline def setOnTap(value: (/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ TapInfo) => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction2(value))
    
    inline def setOnTapCancel(value: (/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ TapInfo) => Unit): Self = StObject.set(x, "onTapCancel", js.Any.fromFunction2(value))
    
    inline def setOnTapCancelUndefined: Self = StObject.set(x, "onTapCancel", js.undefined)
    
    inline def setOnTapStart(value: (/* event */ MouseEvent | TouchEvent | PointerEvent, /* info */ TapInfo) => Unit): Self = StObject.set(x, "onTapStart", js.Any.fromFunction2(value))
    
    inline def setOnTapStartUndefined: Self = StObject.set(x, "onTapStart", js.undefined)
    
    inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
    
    inline def setOnUpdate(value: /* latest */ ResolvedValues => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    inline def setOnViewportEnter(value: /* entry */ IntersectionObserverEntry | Null => Unit): Self = StObject.set(x, "onViewportEnter", js.Any.fromFunction1(value))
    
    inline def setOnViewportEnterUndefined: Self = StObject.set(x, "onViewportEnter", js.undefined)
    
    inline def setOnViewportLeave(value: /* entry */ IntersectionObserverEntry | Null => Unit): Self = StObject.set(x, "onViewportLeave", js.Any.fromFunction1(value))
    
    inline def setOnViewportLeaveUndefined: Self = StObject.set(x, "onViewportLeave", js.undefined)
    
    inline def setReducedMotion(value: ReducedMotionConfig): Self = StObject.set(x, "reducedMotion", value.asInstanceOf[js.Any])
    
    inline def setReducedMotionUndefined: Self = StObject.set(x, "reducedMotion", js.undefined)
    
    inline def setStyle(value: MotionStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTransformPagePoint(value: /* point */ Point => Point): Self = StObject.set(x, "transformPagePoint", js.Any.fromFunction1(value))
    
    inline def setTransformPagePointUndefined: Self = StObject.set(x, "transformPagePoint", js.undefined)
    
    inline def setTransformTemplate(value: (/* transform */ TransformProperties, /* generatedTransform */ String) => String): Self = StObject.set(x, "transformTemplate", js.Any.fromFunction2(value))
    
    inline def setTransformTemplateUndefined: Self = StObject.set(x, "transformTemplate", js.undefined)
    
    inline def setTransformValues(value: /* values */ ResolvedValues => ResolvedValues): Self = StObject.set(x, "transformValues", js.Any.fromFunction1(value))
    
    inline def setTransformValuesUndefined: Self = StObject.set(x, "transformValues", js.undefined)
    
    inline def setTransition(value: Transition1): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setVariants(value: Variants): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setViewport(value: ViewportOptions): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    
    inline def setWhileDrag(value: VariantLabels | TargetAndTransition): Self = StObject.set(x, "whileDrag", value.asInstanceOf[js.Any])
    
    inline def setWhileDragUndefined: Self = StObject.set(x, "whileDrag", js.undefined)
    
    inline def setWhileDragVarargs(value: String*): Self = StObject.set(x, "whileDrag", js.Array(value*))
    
    inline def setWhileFocus(value: VariantLabels | TargetAndTransition): Self = StObject.set(x, "whileFocus", value.asInstanceOf[js.Any])
    
    inline def setWhileFocusUndefined: Self = StObject.set(x, "whileFocus", js.undefined)
    
    inline def setWhileFocusVarargs(value: String*): Self = StObject.set(x, "whileFocus", js.Array(value*))
    
    inline def setWhileHover(value: VariantLabels | TargetAndTransition): Self = StObject.set(x, "whileHover", value.asInstanceOf[js.Any])
    
    inline def setWhileHoverUndefined: Self = StObject.set(x, "whileHover", js.undefined)
    
    inline def setWhileHoverVarargs(value: String*): Self = StObject.set(x, "whileHover", js.Array(value*))
    
    inline def setWhileInView(value: VariantLabels | TargetAndTransition): Self = StObject.set(x, "whileInView", value.asInstanceOf[js.Any])
    
    inline def setWhileInViewUndefined: Self = StObject.set(x, "whileInView", js.undefined)
    
    inline def setWhileInViewVarargs(value: String*): Self = StObject.set(x, "whileInView", js.Array(value*))
    
    inline def setWhileTap(value: VariantLabels | TargetAndTransition): Self = StObject.set(x, "whileTap", value.asInstanceOf[js.Any])
    
    inline def setWhileTapUndefined: Self = StObject.set(x, "whileTap", js.undefined)
    
    inline def setWhileTapVarargs(value: String*): Self = StObject.set(x, "whileTap", js.Array(value*))
    
    inline def set_dragX(value: MotionValue_[Double]): Self = StObject.set(x, "_dragX", value.asInstanceOf[js.Any])
    
    inline def set_dragXUndefined: Self = StObject.set(x, "_dragX", js.undefined)
    
    inline def set_dragY(value: MotionValue_[Double]): Self = StObject.set(x, "_dragY", value.asInstanceOf[js.Any])
    
    inline def set_dragYUndefined: Self = StObject.set(x, "_dragY", js.undefined)
  }
}
