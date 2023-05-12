package typings.floatingUiDom

import typings.floatingUiCore.anon.Fn
import typings.floatingUiCore.anon.PartialLimitShiftOptions
import typings.floatingUiCore.anon.PartialOptionsPadding
import typings.floatingUiCore.srcMiddlewareOffsetMod.Options
import typings.floatingUiCore.srcTypesMod.ClientRectObject
import typings.floatingUiCore.srcTypesMod.ComputePositionReturn
import typings.floatingUiCore.srcTypesMod.Dimensions
import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.ElementRects
import typings.floatingUiCore.srcTypesMod.MiddlewareData
import typings.floatingUiCore.srcTypesMod.MiddlewareReturn
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiCore.srcTypesMod.Placement
import typings.floatingUiCore.srcTypesMod.Platform
import typings.floatingUiCore.srcTypesMod.Rect
import typings.floatingUiCore.srcTypesMod.RootBoundary
import typings.floatingUiCore.srcTypesMod.SideObject
import typings.floatingUiCore.srcTypesMod.Strategy
import typings.floatingUiDom.anon.Element
import typings.floatingUiDom.anon.Floating
import typings.floatingUiDom.anon.MiddlewareStateavailableW
import typings.floatingUiDom.anon.OffsetParent
import typings.floatingUiDom.anon.PartialAutoPlacementOptio
import typings.floatingUiDom.anon.PartialComputePositionCon
import typings.floatingUiDom.anon.PartialDetectOverflowOpti
import typings.floatingUiDom.anon.PartialFlipOptionsDetectO
import typings.floatingUiDom.anon.PartialHideOptionsDetectO
import typings.floatingUiDom.anon.PartialOptions
import typings.floatingUiDom.anon.PartialShiftOptionsDetect
import typings.floatingUiDom.anon.PartialSizeOptionsDetectO
import typings.floatingUiDom.anon.X
import typings.floatingUiDom.floatingUiDomBooleans.`false`
import typings.floatingUiDom.floatingUiDomStrings.clippingAncestors
import typings.floatingUiDom.srcUtilsGetOverflowAncestorsMod.OverflowAncestors
import typings.floatingUiDom.srcUtilsIsMod.global.Window
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypesMod {
  
  @JSImport("@floating-ui/dom/src/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides data to position an inner element of the floating element so that it
    * appears centered to the reference element.
    * @see https://floating-ui.com/docs/arrow
    */
  inline def arrow(options: Element): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("arrow")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /**
    * Optimizes the visibility of the floating element by choosing the placement
    * that has the most space available automatically, without needing to specify a
    * preferred placement. Alternative to `flip`.
    * @see https://floating-ui.com/docs/autoPlacement
    */
  inline def autoPlacement(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")().asInstanceOf[Middleware]
  inline def autoPlacement(options: PartialAutoPlacementOptio): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def autoUpdate(reference: ReferenceElement, floating: FloatingElement, update: js.Function0[Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoUpdate")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def autoUpdate(
    reference: ReferenceElement,
    floating: FloatingElement,
    update: js.Function0[Unit],
    options: PartialOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoUpdate")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any], update.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def computePosition(reference: ReferenceElement, floating: FloatingElement): js.Promise[ComputePositionReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("computePosition")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComputePositionReturn]]
  inline def computePosition(reference: ReferenceElement, floating: FloatingElement, options: PartialComputePositionCon): js.Promise[ComputePositionReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("computePosition")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComputePositionReturn]]
  
  /**
    * Resolves with an object of overflow side offsets that determine how much the
    * element is overflowing a given clipping boundary on each side.
    * - positive = overflowing the boundary by that number of pixels
    * - negative = how many pixels left before it will overflow
    * - 0 = lies flush with the boundary
    * @see https://floating-ui.com/docs/detectOverflow
    */
  inline def detectOverflow(state: MiddlewareState): js.Promise[SideObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SideObject]]
  inline def detectOverflow(state: MiddlewareState, options: PartialDetectOverflowOpti): js.Promise[SideObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SideObject]]
  
  /**
    * Optimizes the visibility of the floating element by flipping the `placement`
    * in order to keep it in view when the preferred placement(s) will overflow the
    * clipping boundary. Alternative to `autoPlacement`.
    * @see https://floating-ui.com/docs/flip
    */
  inline def flip(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")().asInstanceOf[Middleware]
  inline def flip(options: PartialFlipOptionsDetectO): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def getOverflowAncestors(node: Node): OverflowAncestors = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any]).asInstanceOf[OverflowAncestors]
  inline def getOverflowAncestors(node: Node, list: OverflowAncestors): OverflowAncestors = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[OverflowAncestors]
  
  /**
    * Provides data to hide the floating element in applicable situations, such as
    * when it is not in the same clipping context as the reference element.
    * @see https://floating-ui.com/docs/hide
    */
  inline def hide(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Middleware]
  inline def hide(options: PartialHideOptionsDetectO): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def `inline`(): typings.floatingUiCore.srcTypesMod.Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")().asInstanceOf[typings.floatingUiCore.srcTypesMod.Middleware]
  inline def `inline`(options: PartialOptionsPadding): typings.floatingUiCore.srcTypesMod.Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[typings.floatingUiCore.srcTypesMod.Middleware]
  
  inline def limitShift(): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")().asInstanceOf[Fn]
  inline def limitShift(options: PartialLimitShiftOptions): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[Fn]
  
  inline def offset(): typings.floatingUiCore.srcTypesMod.Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[typings.floatingUiCore.srcTypesMod.Middleware]
  inline def offset(value: Options): typings.floatingUiCore.srcTypesMod.Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(value.asInstanceOf[js.Any]).asInstanceOf[typings.floatingUiCore.srcTypesMod.Middleware]
  
  /* Inlined std.Required<@floating-ui/dom.@floating-ui/dom/src/types.Platform> */
  object platform {
    
    @JSImport("@floating-ui/dom/src/types", "platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@floating-ui/dom/src/types", "platform.convertOffsetParentRelativeRectToViewportRelativeRect")
    @js.native
    def convertOffsetParentRelativeRectToViewportRelativeRect: js.Function1[/* args */ OffsetParent, Promisable[Rect]] = js.native
    inline def convertOffsetParentRelativeRectToViewportRelativeRect(args: OffsetParent): Promisable[Rect] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertOffsetParentRelativeRectToViewportRelativeRect")(args.asInstanceOf[js.Any]).asInstanceOf[Promisable[Rect]]
    inline def convertOffsetParentRelativeRectToViewportRelativeRect_=(x: js.Function1[/* args */ OffsetParent, Promisable[Rect]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertOffsetParentRelativeRectToViewportRelativeRect")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/types", "platform.getClientRects")
    @js.native
    def getClientRects: js.Function1[/* element */ typings.std.Element, Promisable[js.Array[ClientRectObject]]] = js.native
    inline def getClientRects(element: typings.std.Element): Promisable[js.Array[ClientRectObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientRects")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[js.Array[ClientRectObject]]]
    inline def getClientRects_=(x: js.Function1[/* element */ typings.std.Element, Promisable[js.Array[ClientRectObject]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getClientRects")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/types", "platform.getClippingRect")
    @js.native
    def getClippingRect: js.Function1[/* args */ typings.floatingUiDom.anon.Boundary, Promisable[Rect]] = js.native
    inline def getClippingRect(args: typings.floatingUiDom.anon.Boundary): Promisable[Rect] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClippingRect")(args.asInstanceOf[js.Any]).asInstanceOf[Promisable[Rect]]
    inline def getClippingRect_=(x: js.Function1[/* args */ typings.floatingUiDom.anon.Boundary, Promisable[Rect]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getClippingRect")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/types", "platform.getDimensions")
    @js.native
    def getDimensions: js.Function1[/* element */ typings.std.Element, Promisable[Dimensions]] = js.native
    inline def getDimensions(element: typings.std.Element): Promisable[Dimensions] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[Dimensions]]
    inline def getDimensions_=(x: js.Function1[/* element */ typings.std.Element, Promisable[Dimensions]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDimensions")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/types", "platform.getDocumentElement")
    @js.native
    def getDocumentElement: js.Function1[/* element */ typings.std.Element, Promisable[HTMLElement]] = js.native
    inline def getDocumentElement(element: typings.std.Element): Promisable[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentElement")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[HTMLElement]]
    inline def getDocumentElement_=(x: js.Function1[/* element */ typings.std.Element, Promisable[HTMLElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDocumentElement")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/types", "platform.getElementRects")
    @js.native
    def getElementRects: js.Function1[/* args */ Floating, Promisable[ElementRects]] = js.native
    inline def getElementRects(args: Floating): Promisable[ElementRects] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRects")(args.asInstanceOf[js.Any]).asInstanceOf[Promisable[ElementRects]]
    inline def getElementRects_=(x: js.Function1[/* args */ Floating, Promisable[ElementRects]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getElementRects")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/types", "platform.getOffsetParent")
    @js.native
    def getOffsetParent: js.Function2[
        /* element */ typings.std.Element, 
        /* polyfill */ js.UndefOr[js.Function1[/* element */ HTMLElement, typings.std.Element | Null]], 
        Promisable[typings.std.Element | Window]
      ] = js.native
    inline def getOffsetParent(element: typings.std.Element): Promisable[typings.std.Element | Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetParent")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[typings.std.Element | Window]]
    inline def getOffsetParent(
      element: typings.std.Element,
      polyfill: js.Function1[/* element */ HTMLElement, typings.std.Element | Null]
    ): Promisable[typings.std.Element | Window] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetParent")(element.asInstanceOf[js.Any], polyfill.asInstanceOf[js.Any])).asInstanceOf[Promisable[typings.std.Element | Window]]
    inline def getOffsetParent_=(
      x: js.Function2[
          /* element */ typings.std.Element, 
          /* polyfill */ js.UndefOr[js.Function1[/* element */ HTMLElement, typings.std.Element | Null]], 
          Promisable[typings.std.Element | Window]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOffsetParent")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/types", "platform.getScale")
    @js.native
    def getScale: js.Function1[/* element */ HTMLElement, Promisable[X]] = js.native
    inline def getScale(element: HTMLElement): Promisable[X] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[X]]
    inline def getScale_=(x: js.Function1[/* element */ HTMLElement, Promisable[X]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/types", "platform.isElement")
    @js.native
    def isElement: js.Function1[/* value */ Any, Promisable[Boolean]] = js.native
    inline def isElement(value: Any): Promisable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(value.asInstanceOf[js.Any]).asInstanceOf[Promisable[Boolean]]
    inline def isElement_=(x: js.Function1[/* value */ Any, Promisable[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isElement")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/types", "platform.isRTL")
    @js.native
    def isRTL: js.Function1[/* element */ typings.std.Element, Promisable[Boolean]] = js.native
    inline def isRTL(element: typings.std.Element): Promisable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[Boolean]]
    inline def isRTL_=(x: js.Function1[/* element */ typings.std.Element, Promisable[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Optimizes the visibility of the floating element by shifting it in order to
    * keep it in view when it will overflow the clipping boundary.
    * @see https://floating-ui.com/docs/shift
    */
  inline def shift(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[Middleware]
  inline def shift(options: PartialShiftOptionsDetect): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /**
    * Provides data that allows you to change the size of the floating element —
    * for instance, prevent it from overflowing the clipping boundary or match the
    * width of the reference element.
    * @see https://floating-ui.com/docs/size
    */
  inline def size(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Middleware]
  inline def size(options: PartialSizeOptionsDetectO): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  type Boundary = clippingAncestors | typings.std.Element | js.Array[typings.std.Element] | Rect
  
  /* Inlined @floating-ui/dom.@floating-ui/dom/src/types.Prettify<std.Omit<@floating-ui/core.@floating-ui/core.ComputePositionConfig, 'middleware' | 'platform'> & {  middleware :std.Array<@floating-ui/dom.@floating-ui/dom/src/types.Middleware | null | undefined | false> | undefined,   platform :@floating-ui/dom.@floating-ui/dom/src/types.Platform | undefined}> */
  trait ComputePositionConfig extends StObject {
    
    var middleware: js.UndefOr[js.Array[js.UndefOr[Middleware | Null | `false`]]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var platform: js.UndefOr[Platform_] = js.undefined
    
    var strategy: js.UndefOr[Strategy] = js.undefined
  }
  object ComputePositionConfig {
    
    inline def apply(): ComputePositionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComputePositionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputePositionConfig] (val x: Self) extends AnyVal {
      
      inline def setMiddleware(value: js.Array[js.UndefOr[Middleware | Null | `false`]]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      inline def setMiddlewareVarargs(value: (js.UndefOr[Middleware | Null | `false`])*): Self = StObject.set(x, "middleware", js.Array(value*))
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPlatform(value: Platform_): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  /* Inlined @floating-ui/dom.@floating-ui/dom/src/types.Prettify<std.Omit<@floating-ui/core.@floating-ui/core.DetectOverflowOptions, 'boundary'> & {  boundary :@floating-ui/dom.@floating-ui/dom/src/types.Boundary}> */
  trait DetectOverflowOptions extends StObject {
    
    var altBoundary: Boolean
    
    var boundary: Boundary
    
    var elementContext: ElementContext
    
    var padding: Padding
    
    var rootBoundary: RootBoundary
  }
  object DetectOverflowOptions {
    
    inline def apply(
      altBoundary: Boolean,
      boundary: Boundary,
      elementContext: ElementContext,
      padding: Padding,
      rootBoundary: RootBoundary
    ): DetectOverflowOptions = {
      val __obj = js.Dynamic.literal(altBoundary = altBoundary.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], elementContext = elementContext.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectOverflowOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetectOverflowOptions] (val x: Self) extends AnyVal {
      
      inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryVarargs(value: typings.std.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
      
      inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    }
  }
  
  trait Elements extends StObject {
    
    var floating: FloatingElement
    
    var reference: ReferenceElement
  }
  object Elements {
    
    inline def apply(floating: FloatingElement, reference: ReferenceElement): Elements = {
      val __obj = js.Dynamic.literal(floating = floating.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elements]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Elements] (val x: Self) extends AnyVal {
      
      inline def setFloating(value: FloatingElement): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setReference(value: ReferenceElement): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  type FloatingElement = HTMLElement
  
  /* Inlined @floating-ui/dom.@floating-ui/dom/src/types.Prettify<std.Omit<@floating-ui/core.@floating-ui/core.Middleware, 'fn'> & {fn (state : @floating-ui/dom.@floating-ui/dom/src/types.MiddlewareState): @floating-ui/dom.@floating-ui/dom/src/types.Promisable<@floating-ui/core.@floating-ui/core.MiddlewareReturn>}> */
  trait Middleware extends StObject {
    
    def fn(state: MiddlewareState): Promisable[MiddlewareReturn]
    @JSName("fn")
    var fn_Original: js.Function1[/* state */ MiddlewareState, Promisable[MiddlewareReturn]]
    
    var name: String
    
    var options: js.UndefOr[Any] = js.undefined
  }
  object Middleware {
    
    inline def apply(fn: /* state */ MiddlewareState => Promisable[MiddlewareReturn], name: String): Middleware = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Middleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Middleware] (val x: Self) extends AnyVal {
      
      inline def setFn(value: /* state */ MiddlewareState => Promisable[MiddlewareReturn]): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /* Inlined @floating-ui/dom.@floating-ui/dom/src/types.MiddlewareState */
  trait MiddlewareArguments extends StObject {
    
    var elements: Elements
    
    var initialPlacement: Placement
    
    var middlewareData: MiddlewareData
    
    var placement: Placement
    
    var platform: Platform
    
    var rects: ElementRects
    
    var strategy: Strategy
    
    var x: Double
    
    var y: Double
  }
  object MiddlewareArguments {
    
    inline def apply(
      elements: Elements,
      initialPlacement: Placement,
      middlewareData: MiddlewareData,
      placement: Placement,
      platform: Platform,
      rects: ElementRects,
      strategy: Strategy,
      x: Double,
      y: Double
    ): MiddlewareArguments = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], initialPlacement = initialPlacement.asInstanceOf[js.Any], middlewareData = middlewareData.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], rects = rects.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MiddlewareArguments] (val x: Self) extends AnyVal {
      
      inline def setElements(value: Elements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setInitialPlacement(value: Placement): Self = StObject.set(x, "initialPlacement", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareData(value: MiddlewareData): Self = StObject.set(x, "middlewareData", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setRects(value: ElementRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @floating-ui/dom.@floating-ui/dom/src/types.Prettify<std.Omit<@floating-ui/core.@floating-ui/core.MiddlewareState, 'elements'> & {  elements :@floating-ui/dom.@floating-ui/dom/src/types.Elements}> */
  trait MiddlewareState extends StObject {
    
    var elements: Elements
    
    var initialPlacement: Placement
    
    var middlewareData: MiddlewareData
    
    var placement: Placement
    
    var platform: Platform
    
    var rects: ElementRects
    
    var strategy: Strategy
    
    var x: Double
    
    var y: Double
  }
  object MiddlewareState {
    
    inline def apply(
      elements: Elements,
      initialPlacement: Placement,
      middlewareData: MiddlewareData,
      placement: Placement,
      platform: Platform,
      rects: ElementRects,
      strategy: Strategy,
      x: Double,
      y: Double
    ): MiddlewareState = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], initialPlacement = initialPlacement.asInstanceOf[js.Any], middlewareData = middlewareData.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], rects = rects.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MiddlewareState] (val x: Self) extends AnyVal {
      
      inline def setElements(value: Elements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setInitialPlacement(value: Placement): Self = StObject.set(x, "initialPlacement", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareData(value: MiddlewareData): Self = StObject.set(x, "middlewareData", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setRects(value: ElementRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeScroll extends StObject {
    
    var scrollLeft: Double
    
    var scrollTop: Double
  }
  object NodeScroll {
    
    inline def apply(scrollLeft: Double, scrollTop: Double): NodeScroll = {
      val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeScroll]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeScroll] (val x: Self) extends AnyVal {
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait Platform_ extends StObject {
    
    var convertOffsetParentRelativeRectToViewportRelativeRect: js.UndefOr[js.Function1[/* args */ OffsetParent, Promisable[Rect]]] = js.undefined
    
    var getClientRects: js.UndefOr[
        js.Function1[/* element */ typings.std.Element, Promisable[js.Array[ClientRectObject]]]
      ] = js.undefined
    
    def getClippingRect(args: typings.floatingUiDom.anon.Boundary): Promisable[Rect]
    
    def getDimensions(element: typings.std.Element): Promisable[Dimensions]
    
    var getDocumentElement: js.UndefOr[js.Function1[/* element */ typings.std.Element, Promisable[HTMLElement]]] = js.undefined
    
    def getElementRects(args: Floating): Promisable[ElementRects]
    
    var getOffsetParent: js.UndefOr[
        js.Function2[
          /* element */ typings.std.Element, 
          /* polyfill */ js.UndefOr[js.Function1[/* element */ HTMLElement, typings.std.Element | Null]], 
          Promisable[typings.std.Element | Window]
        ]
      ] = js.undefined
    
    var getScale: js.UndefOr[js.Function1[/* element */ HTMLElement, Promisable[X]]] = js.undefined
    
    var isElement: js.UndefOr[js.Function1[/* value */ Any, Promisable[Boolean]]] = js.undefined
    
    var isRTL: js.UndefOr[js.Function1[/* element */ typings.std.Element, Promisable[Boolean]]] = js.undefined
  }
  object Platform_ {
    
    inline def apply(
      getClippingRect: typings.floatingUiDom.anon.Boundary => Promisable[Rect],
      getDimensions: typings.std.Element => Promisable[Dimensions],
      getElementRects: Floating => Promisable[ElementRects]
    ): Platform_ = {
      val __obj = js.Dynamic.literal(getClippingRect = js.Any.fromFunction1(getClippingRect), getDimensions = js.Any.fromFunction1(getDimensions), getElementRects = js.Any.fromFunction1(getElementRects))
      __obj.asInstanceOf[Platform_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Platform_] (val x: Self) extends AnyVal {
      
      inline def setConvertOffsetParentRelativeRectToViewportRelativeRect(value: /* args */ OffsetParent => Promisable[Rect]): Self = StObject.set(x, "convertOffsetParentRelativeRectToViewportRelativeRect", js.Any.fromFunction1(value))
      
      inline def setConvertOffsetParentRelativeRectToViewportRelativeRectUndefined: Self = StObject.set(x, "convertOffsetParentRelativeRectToViewportRelativeRect", js.undefined)
      
      inline def setGetClientRects(value: /* element */ typings.std.Element => Promisable[js.Array[ClientRectObject]]): Self = StObject.set(x, "getClientRects", js.Any.fromFunction1(value))
      
      inline def setGetClientRectsUndefined: Self = StObject.set(x, "getClientRects", js.undefined)
      
      inline def setGetClippingRect(value: typings.floatingUiDom.anon.Boundary => Promisable[Rect]): Self = StObject.set(x, "getClippingRect", js.Any.fromFunction1(value))
      
      inline def setGetDimensions(value: typings.std.Element => Promisable[Dimensions]): Self = StObject.set(x, "getDimensions", js.Any.fromFunction1(value))
      
      inline def setGetDocumentElement(value: /* element */ typings.std.Element => Promisable[HTMLElement]): Self = StObject.set(x, "getDocumentElement", js.Any.fromFunction1(value))
      
      inline def setGetDocumentElementUndefined: Self = StObject.set(x, "getDocumentElement", js.undefined)
      
      inline def setGetElementRects(value: Floating => Promisable[ElementRects]): Self = StObject.set(x, "getElementRects", js.Any.fromFunction1(value))
      
      inline def setGetOffsetParent(
        value: (/* element */ typings.std.Element, /* polyfill */ js.UndefOr[js.Function1[/* element */ HTMLElement, typings.std.Element | Null]]) => Promisable[typings.std.Element | Window]
      ): Self = StObject.set(x, "getOffsetParent", js.Any.fromFunction2(value))
      
      inline def setGetOffsetParentUndefined: Self = StObject.set(x, "getOffsetParent", js.undefined)
      
      inline def setGetScale(value: /* element */ HTMLElement => Promisable[X]): Self = StObject.set(x, "getScale", js.Any.fromFunction1(value))
      
      inline def setGetScaleUndefined: Self = StObject.set(x, "getScale", js.undefined)
      
      inline def setIsElement(value: /* value */ Any => Promisable[Boolean]): Self = StObject.set(x, "isElement", js.Any.fromFunction1(value))
      
      inline def setIsElementUndefined: Self = StObject.set(x, "isElement", js.undefined)
      
      inline def setIsRTL(value: /* element */ typings.std.Element => Promisable[Boolean]): Self = StObject.set(x, "isRTL", js.Any.fromFunction1(value))
      
      inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
    }
  }
  
  type Prettify[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any
  
  type Promisable[T] = T | js.Promise[T]
  
  type ReferenceElement = typings.std.Element | VirtualElement
  
  /* Inlined @floating-ui/dom.@floating-ui/dom/src/types.Prettify<std.Omit<@floating-ui/core.@floating-ui/core.SizeOptions, 'apply'> & {apply (args : @floating-ui/dom.@floating-ui/dom/src/types.MiddlewareState & {  availableWidth :number,   availableHeight :number}): @floating-ui/dom.@floating-ui/dom/src/types.Promisable<void>}> */
  trait SizeOptions extends StObject {
    
    @JSName("apply")
    def apply(args: MiddlewareStateavailableW): Promisable[Unit]
    @JSName("apply")
    var apply_Original: js.Function1[/* args */ MiddlewareStateavailableW, Promisable[Unit]]
  }
  object SizeOptions {
    
    inline def apply(apply: /* args */ MiddlewareStateavailableW => Promisable[Unit]): SizeOptions = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[SizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeOptions] (val x: Self) extends AnyVal {
      
      inline def setApply(value: /* args */ MiddlewareStateavailableW => Promisable[Unit]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  trait VirtualElement extends StObject {
    
    var contextElement: js.UndefOr[typings.std.Element] = js.undefined
    
    def getBoundingClientRect(): ClientRectObject
  }
  object VirtualElement {
    
    inline def apply(getBoundingClientRect: () => ClientRectObject): VirtualElement = {
      val __obj = js.Dynamic.literal(getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect))
      __obj.asInstanceOf[VirtualElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualElement] (val x: Self) extends AnyVal {
      
      inline def setContextElement(value: typings.std.Element): Self = StObject.set(x, "contextElement", value.asInstanceOf[js.Any])
      
      inline def setContextElementUndefined: Self = StObject.set(x, "contextElement", js.undefined)
      
      inline def setGetBoundingClientRect(value: () => ClientRectObject): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
    }
  }
}
