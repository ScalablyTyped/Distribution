package typings.framerMotion.mod

import typings.framerMotion.anon.PartialBoundingBox
import typings.framerMotion.framerMotionBooleans.`false`
import typings.framerMotion.framerMotionStrings.x
import typings.framerMotion.framerMotionStrings.y
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
trait DraggableProps
  extends StObject
     with DragHandlers {
  
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
    * If `dragConstraints` is set to a React ref, this callback will call with the measured drag constraints.
    *
    * @public
    */
  var onMeasureDragConstraints: js.UndefOr[js.Function1[/* constraints */ BoundingBox, BoundingBox | Unit]] = js.undefined
  
  /**
    * Properties or variant label to animate to while the drag gesture is recognised.
    *
    * ```jsx
    * <motion.div whileDrag={{ scale: 1.2 }} />
    * ```
    */
  var whileDrag: js.UndefOr[VariantLabels | TargetAndTransition] = js.undefined
}
object DraggableProps {
  
  inline def apply(): DraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableProps] (val x: Self) extends AnyVal {
    
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
    
    inline def setOnMeasureDragConstraints(value: /* constraints */ BoundingBox => BoundingBox | Unit): Self = StObject.set(x, "onMeasureDragConstraints", js.Any.fromFunction1(value))
    
    inline def setOnMeasureDragConstraintsUndefined: Self = StObject.set(x, "onMeasureDragConstraints", js.undefined)
    
    inline def setWhileDrag(value: VariantLabels | TargetAndTransition): Self = StObject.set(x, "whileDrag", value.asInstanceOf[js.Any])
    
    inline def setWhileDragUndefined: Self = StObject.set(x, "whileDrag", js.undefined)
    
    inline def setWhileDragVarargs(value: String*): Self = StObject.set(x, "whileDrag", js.Array(value*))
    
    inline def set_dragX(value: MotionValue_[Double]): Self = StObject.set(x, "_dragX", value.asInstanceOf[js.Any])
    
    inline def set_dragXUndefined: Self = StObject.set(x, "_dragX", js.undefined)
    
    inline def set_dragY(value: MotionValue_[Double]): Self = StObject.set(x, "_dragY", value.asInstanceOf[js.Any])
    
    inline def set_dragYUndefined: Self = StObject.set(x, "_dragY", js.undefined)
  }
}
