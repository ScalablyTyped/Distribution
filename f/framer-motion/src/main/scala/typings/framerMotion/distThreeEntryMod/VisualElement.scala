package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StringDictionary
import typings.framerMotion.anon.MotionPropsPartialMotionCAnimate
import typings.framerMotion.framerMotionStrings.AnimationComplete
import typings.framerMotion.framerMotionStrings.AnimationStart
import typings.framerMotion.framerMotionStrings.BeforeLayoutMeasure
import typings.framerMotion.framerMotionStrings.LayoutAnimationComplete
import typings.framerMotion.framerMotionStrings.LayoutAnimationStart
import typings.framerMotion.framerMotionStrings.LayoutMeasure
import typings.framerMotion.framerMotionStrings.LayoutUpdate
import typings.framerMotion.framerMotionStrings.SetAxisTarget
import typings.framerMotion.framerMotionStrings.Unmount
import typings.react.mod.ComponentType
import typings.std.Map
import typings.std.Set
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A VisualElement is an imperative abstraction around UI elements such as
  * HTMLElement, SVGElement, Three.Object3D etc.
  */
@js.native
trait VisualElement[Instance, RenderState, Options /* <: js.Object */] extends StObject {
  
  /**
    * Add a motion value and bind it to this visual element.
    */
  def addValue(key: String, value: MotionValue[Any]): Unit = js.native
  
  /**
    * Add a child visual element to our set of children.
    */
  def addVariantChild(child: VisualElement[Any, Any, js.Object]): js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * The AnimationState, this is hydrated by the animation Feature.
    */
  var animationState: js.UndefOr[AnimationState] = js.native
  
  /**
    * When values are removed from all animation props we need to search
    * for a fallback value to animate to. These values are tracked in baseTarget.
    */
  /* private */ var baseTarget: Any = js.native
  
  /* private */ var bindToMotionValue: Any = js.native
  
  /**
    * This can be set by AnimatePresence to force components that mount
    * at the same time as it to mount as if they have initial={false} set.
    */
  var blockInitialAnimation: Boolean = js.native
  
  /**
    * Run before a React or VisualElement render, builds the latest motion
    * values into an Instance-specific format. For example, HTMLVisualElement
    * will use this step to build `style` and `var` values.
    */
  def build(renderState: RenderState, latestValues: ResolvedValues, options: Options, props: MotionProps): Unit = js.native
  
  /**
    * A set containing references to this VisualElement's children.
    */
  var children: Set[VisualElement[Any, Any, js.Object]] = js.native
  
  /**
    * A reference to the current underlying Instance, e.g. a HTMLElement
    * or Three.Mesh etc.
    */
  var current: Instance | Null = js.native
  
  /**
    * The depth of this VisualElement within the overall VisualElement tree.
    */
  var depth: Double = js.native
  
  /**
    * An object containing a SubscriptionManager for each active event.
    */
  /* private */ var events: Any = js.native
  
  /**
    * Cleanup functions for active features (hover/tap/exit etc)
    */
  /* private */ var features: Any = js.native
  
  /**
    * Find the base target for a value thats been removed from all animation
    * props.
    */
  def getBaseTarget(key: String): Any = js.native
  
  /**
    * When a value has been removed from all animation props we need to
    * pick a target to animate back to. For instance, for HTMLElements
    * we can look in the style prop.
    */
  def getBaseTargetFromProps(props: MotionProps, key: String): js.UndefOr[String | Double | MotionValue[Any]] = js.native
  
  def getClosestVariantNode(): js.UndefOr[VisualElement[Any, Any, js.Object]] = js.native
  
  /**
    * Returns the defined default transition on this component.
    */
  def getDefaultTransition(): js.UndefOr[Transition1] = js.native
  
  def getProps(): MotionProps = js.native
  
  def getStaticValue(key: String): String | Double = js.native
  
  def getTransformPagePoint(): Any = js.native
  
  /**
    * Get a motion value for this key. If called with a default
    * value, we'll create one if none exists.
    */
  def getValue(key: String): js.UndefOr[MotionValue[Any]] = js.native
  def getValue(key: String, defaultValue: String): MotionValue[Any] = js.native
  def getValue(key: String, defaultValue: Double): MotionValue[Any] = js.native
  
  /**
    * Returns the variant definition with a given name.
    */
  def getVariant(name: String): js.UndefOr[Variant] = js.native
  
  def getVariantContext(): js.UndefOr[VariantStateContext] = js.native
  def getVariantContext(startAtParent: Boolean): js.UndefOr[VariantStateContext] = js.native
  
  /**
    * If the component child is provided as a motion value, handle subscriptions
    * with the renderer-specific VisualElement.
    */
  var handleChildMotionValue: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Check whether we have a motion value for this key
    */
  def hasValue(key: String): Boolean = js.native
  
  /**
    * Create an object of the values we initially animated from (if initial prop present).
    */
  /* private */ var initialValues: Any = js.native
  
  var isControllingVariants: Boolean = js.native
  
  /**
    * Determine what role this visual element should take in the variant tree.
    */
  var isVariantNode: Boolean = js.native
  
  /**
    * An object containing the latest static values for each of this VisualElement's
    * MotionValues.
    */
  var latestValues: ResolvedValues = js.native
  
  def loadFeatures(param0: MotionProps, isStrict: Boolean): js.UndefOr[ComponentType[MotionProps]] = js.native
  def loadFeatures(
    param0: MotionProps,
    isStrict: Boolean,
    preloadedFeatures: Unit,
    initialLayoutGroupConfig: SwitchLayoutGroupContext
  ): js.UndefOr[ComponentType[MotionProps]] = js.native
  def loadFeatures(param0: MotionProps, isStrict: Boolean, preloadedFeatures: FeatureBundle): js.UndefOr[ComponentType[MotionProps]] = js.native
  def loadFeatures(
    param0: MotionProps,
    isStrict: Boolean,
    preloadedFeatures: FeatureBundle,
    initialLayoutGroupConfig: SwitchLayoutGroupContext
  ): js.UndefOr[ComponentType[MotionProps]] = js.native
  
  /**
    * Make a target animatable by Popmotion. For instance, if we're
    * trying to animate width from 100px to 100vw we need to measure 100vw
    * in pixels to determine what we really need to animate to. This is also
    * pluggable to support Framer's custom value types like Color,
    * and CSS variables.
    */
  def makeTargetAnimatable(target: TargetAndTransition): TargetAndTransition = js.native
  def makeTargetAnimatable(target: TargetAndTransition, canMutate: Boolean): TargetAndTransition = js.native
  
  /**
    * Take a target and make it animatable. For instance if provided
    * height: "auto" we need to measure height in pixels and animate that instead.
    */
  def makeTargetAnimatableFromInstance(target: TargetAndTransition, props: MotionProps, isLive: Boolean): TargetAndTransition = js.native
  
  /**
    * Normally, if a component is controlled by a parent's variants, it can
    * rely on that ancestor to trigger animations further down the tree.
    * However, if a component is created after its parent is mounted, the parent
    * won't trigger that mount animation so the child needs to.
    *
    * TODO: This might be better replaced with a method isParentMounted
    */
  var manuallyAnimateOnMount: Boolean = js.native
  
  /**
    * Measure the viewport-relative bounding box of the Instance.
    */
  def measureInstanceViewportBox(instance: Instance, props: MotionPropsPartialMotionCAnimate): Box = js.native
  
  /**
    * Measure the current viewport box with or without transforms.
    * Only measures axis-aligned boxes, rotate and skew must be manually
    * removed with a re-render to work.
    */
  def measureViewportBox(): Box = js.native
  
  def mount(instance: Instance): Unit = js.native
  
  def notify[EventName /* <: /* keyof framer-motion.framer-motion/dist/three-entry.VisualElementEventCallbacks */ BeforeLayoutMeasure | LayoutMeasure | LayoutUpdate | typings.framerMotion.framerMotionStrings.Update | AnimationStart | AnimationComplete | LayoutAnimationStart | LayoutAnimationComplete | SetAxisTarget | Unmount */](
    eventName: EventName,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Unit = js.native
  
  def notifyUpdate(): Unit = js.native
  
  def on[EventName /* <: /* keyof framer-motion.framer-motion/dist/three-entry.VisualElementEventCallbacks */ BeforeLayoutMeasure | LayoutMeasure | LayoutUpdate | typings.framerMotion.framerMotionStrings.Update | AnimationStart | AnimationComplete | LayoutAnimationStart | LayoutAnimationComplete | SetAxisTarget | Unmount */](
    eventName: EventName,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: framer-motion.framer-motion/dist/three-entry.VisualElementEventCallbacks[EventName] */ js.Any
  ): VoidFunction = js.native
  
  /**
    * The options used to create this VisualElement. The Options type is defined
    * by the inheriting VisualElement and is passed straight through to the render functions.
    */
  /* private */ val options: Any = js.native
  
  /**
    * A reference to the parent VisualElement (if exists).
    */
  var parent: js.UndefOr[VisualElement[Any, Any, js.Object]] = js.native
  
  var presenceContext: PresenceContextProps | Null = js.native
  
  /**
    * A reference to the previously-provided motion values as returned
    * from scrapeMotionValuesFromProps. We use the keys in here to determine
    * if any motion values need to be removed after props are updated.
    */
  /* private */ var prevMotionValues: Any = js.native
  
  var prevPresenceContext: js.UndefOr[PresenceContextProps | Null] = js.native
  
  var prevProps: js.UndefOr[MotionProps] = js.native
  
  /**
    * A reference to this VisualElement's projection node, used in layout animations.
    */
  var projection: js.UndefOr[IProjectionNode[Any]] = js.native
  
  /**
    * An object containing an unsubscribe function for each prop event subscription.
    * For example, every "Update" event can have multiple subscribers via
    * VisualElement.on(), but only one of those can be defined via the onUpdate prop.
    */
  /* private */ var propEventSubscriptions: Any = js.native
  
  /**
    * A reference to the latest props provided to the VisualElement's host React component.
    */
  var props: MotionProps = js.native
  
  /**
    * If we're trying to animate to a previously unencountered value,
    * we need to check for it in our state and as a last resort read it
    * directly from the instance (which might have performance implications).
    */
  def readValue(key: String): js.UndefOr[String | Double | Null] = js.native
  
  /**
    * When we first animate to a value we need to animate it *from* a value.
    * Often this have been specified via the initial prop but it might be
    * that the value needs to be read from the Instance.
    */
  def readValueFromInstance(instance: Instance, key: String, options: Options): js.UndefOr[String | Double | Null] = js.native
  
  /**
    * A reference to the ReducedMotionConfig passed to the VisualElement's host React component.
    */
  /* private */ var reducedMotionConfig: Any = js.native
  
  /**
    * On mount, this will be hydrated with a callback to disconnect
    * this visual element from its parent on unmount.
    */
  /* private */ var removeFromVariantTree: Any = js.native
  
  /**
    * Remove a motion value and unbind any active subscriptions.
    */
  def removeValue(key: String): Unit = js.native
  
  /**
    * When a value has been removed from the VisualElement we use this to remove
    * it from the inherting class' unique render state.
    */
  def removeValueFromRenderState(key: String, renderState: RenderState): Unit = js.native
  
  def render(): Unit = js.native
  
  /**
    * Apply the built values to the Instance. For example, HTMLElements will have
    * styles applied via `setProperty` and the style attribute, whereas SVGElements
    * will have values applied to attributes.
    */
  def renderInstance(instance: Instance, renderState: RenderState): Unit = js.native
  def renderInstance(instance: Instance, renderState: RenderState, styleProp: Unit, projection: IProjectionNode[Any]): Unit = js.native
  def renderInstance(instance: Instance, renderState: RenderState, styleProp: MotionStyle): Unit = js.native
  def renderInstance(
    instance: Instance,
    renderState: RenderState,
    styleProp: MotionStyle,
    projection: IProjectionNode[Any]
  ): Unit = js.native
  
  /**
    * The current render state of this VisualElement. Defined by inherting VisualElements.
    */
  var renderState: RenderState = js.native
  
  def scheduleRender(): Process = js.native
  
  /**
    * This method takes React props and returns found MotionValues. For example, HTML
    * MotionValues will be found within the style prop, whereas for Three.js within attribute arrays.
    *
    * This isn't an abstract method as it needs calling in the constructor, but it is
    * intended to be one.
    */
  def scrapeMotionValuesFromProps(_props: MotionProps, _prevProps: MotionProps): StringDictionary[MotionValue[Any] | String | Double] = js.native
  
  /**
    * Set the base target to later animate back to. This is currently
    * only hydrated on creation and when we first read a value.
    */
  def setBaseTarget(key: String, value: String): Unit = js.native
  def setBaseTarget(key: String, value: Double): Unit = js.native
  
  def setStaticValue(key: String, value: String): Unit = js.native
  def setStaticValue(key: String, value: Double): Unit = js.native
  
  /**
    * Decides whether this VisualElement should animate in reduced motion
    * mode.
    *
    * TODO: This is currently set on every individual VisualElement but feels
    * like it could be set globally.
    */
  var shouldReduceMotion: Boolean | Null = js.native
  
  /**
    * An `Array.sort` compatible function that will compare two Instances and
    * compare their respective positions within the tree.
    */
  def sortInstanceNodePosition(a: Instance, b: Instance): Double = js.native
  
  def sortNodePosition(other: VisualElement[Instance, Any, js.Object]): Double = js.native
  
  def triggerBuild(): Unit = js.native
  
  /**
    * VisualElements are arranged in trees mirroring that of the React tree.
    * Each type of VisualElement has a unique name, to detect when we're crossing
    * type boundaries within that tree.
    */
  var `type`: String = js.native
  
  def unmount(): Unit = js.native
  
  /**
    * Update the provided props. Ensure any newly-added motion values are
    * added to our map, old ones removed, and listeners updated.
    */
  def update(props: MotionProps): Unit = js.native
  def update(props: MotionProps, presenceContext: PresenceContextProps): Unit = js.native
  
  def updateFeatures(): Unit = js.native
  
  /**
    * A map of every subscription that binds the provided or generated
    * motion values onChange listeners to this visual element.
    */
  /* private */ var valueSubscriptions: Any = js.native
  
  /**
    * A map of all motion values attached to this visual element. Motion
    * values are source of truth for any given animated value. A motion
    * value might be provided externally by the component via props.
    */
  var values: Map[String, MotionValue[Any]] = js.native
  
  /**
    * If this component is part of the variant tree, it should track
    * any children that are also part of the tree. This is essentially
    * a shadow tree to simplify logic around how to stagger over children.
    */
  var variantChildren: js.UndefOr[Set[VisualElement[Any, Any, js.Object]]] = js.native
}
