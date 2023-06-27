package typings.floatingUiDom

import typings.floatingUiCore.srcMiddlewareInlineMod.InlineOptions
import typings.floatingUiCore.srcMiddlewareOffsetMod.OffsetOptions
import typings.floatingUiCore.srcMiddlewareShiftMod.LimitShiftOptions
import typings.floatingUiCore.srcTypesMod.ClientRectObject
import typings.floatingUiCore.srcTypesMod.ComputePositionReturn
import typings.floatingUiCore.srcTypesMod.Dimensions
import typings.floatingUiCore.srcTypesMod.ElementRects
import typings.floatingUiCore.srcTypesMod.Rect
import typings.floatingUiCore.srcTypesMod.SideObject
import typings.floatingUiDom.anon.Boundary
import typings.floatingUiDom.anon.Floating
import typings.floatingUiDom.anon.Fn
import typings.floatingUiDom.anon.OffsetParent
import typings.floatingUiDom.anon.PartialComputePositionCon
import typings.floatingUiDom.anon.X
import typings.floatingUiDom.srcAutoUpdateMod.Options
import typings.floatingUiDom.srcTypesMod.ArrowOptions
import typings.floatingUiDom.srcTypesMod.AutoPlacementOptions
import typings.floatingUiDom.srcTypesMod.Derivable
import typings.floatingUiDom.srcTypesMod.DetectOverflowOptions
import typings.floatingUiDom.srcTypesMod.FlipOptions
import typings.floatingUiDom.srcTypesMod.FloatingElement
import typings.floatingUiDom.srcTypesMod.HideOptions
import typings.floatingUiDom.srcTypesMod.Middleware
import typings.floatingUiDom.srcTypesMod.MiddlewareState
import typings.floatingUiDom.srcTypesMod.Promisable
import typings.floatingUiDom.srcTypesMod.ReferenceElement
import typings.floatingUiDom.srcTypesMod.ShiftOptions
import typings.floatingUiDom.srcTypesMod.SizeOptions
import typings.floatingUiDom.srcUtilsGetOverflowAncestorsMod.OverflowAncestors
import typings.floatingUiDom.srcUtilsIsMod.global.Window
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@floating-ui/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides data to position an inner element of the floating element so that it
    * appears centered to the reference element.
    * @see https://floating-ui.com/docs/arrow
    */
  inline def arrow(options: ArrowOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("arrow")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def arrow(options: Derivable[ArrowOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("arrow")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /**
    * Optimizes the visibility of the floating element by choosing the placement
    * that has the most space available automatically, without needing to specify a
    * preferred placement. Alternative to `flip`.
    * @see https://floating-ui.com/docs/autoPlacement
    */
  inline def autoPlacement(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")().asInstanceOf[Middleware]
  inline def autoPlacement(options: AutoPlacementOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def autoPlacement(options: Derivable[AutoPlacementOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def autoUpdate(reference: ReferenceElement, floating: FloatingElement, update: js.Function0[Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoUpdate")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def autoUpdate(
    reference: ReferenceElement,
    floating: FloatingElement,
    update: js.Function0[Unit],
    options: Options
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
  inline def detectOverflow(state: MiddlewareState, options: DetectOverflowOptions): js.Promise[SideObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SideObject]]
  
  /**
    * Optimizes the visibility of the floating element by flipping the `placement`
    * in order to keep it in view when the preferred placement(s) will overflow the
    * clipping boundary. Alternative to `autoPlacement`.
    * @see https://floating-ui.com/docs/flip
    */
  inline def flip(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")().asInstanceOf[Middleware]
  inline def flip(options: Derivable[FlipOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def flip(options: FlipOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def getOverflowAncestors(node: Node): OverflowAncestors = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any]).asInstanceOf[OverflowAncestors]
  inline def getOverflowAncestors(node: Node, list: OverflowAncestors): OverflowAncestors = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[OverflowAncestors]
  
  /**
    * Provides data to hide the floating element in applicable situations, such as
    * when it is not in the same clipping context as the reference element.
    * @see https://floating-ui.com/docs/hide
    */
  inline def hide(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Middleware]
  inline def hide(options: Derivable[HideOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def hide(options: HideOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /**
    * Provides improved positioning for inline reference elements that can span
    * over multiple lines, such as hyperlinks or range selections.
    * @see https://floating-ui.com/docs/inline
    */
  inline def `inline`(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")().asInstanceOf[Middleware]
  inline def `inline`(options: InlineOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def `inline`(options: Derivable[InlineOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /**
    * Built-in `limiter` that will stop `shift()` at a certain point.
    */
  inline def limitShift(): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")().asInstanceOf[Fn]
  inline def limitShift(options: LimitShiftOptions): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[Fn]
  inline def limitShift(options: Derivable[LimitShiftOptions]): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[Fn]
  
  inline def offset(): typings.floatingUiCore.srcTypesMod.Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[typings.floatingUiCore.srcTypesMod.Middleware]
  inline def offset(options: OffsetOptions): typings.floatingUiCore.srcTypesMod.Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(options.asInstanceOf[js.Any]).asInstanceOf[typings.floatingUiCore.srcTypesMod.Middleware]
  
  /* Inlined std.Required<@floating-ui/dom.@floating-ui/dom/src/types.Platform> */
  object platform {
    
    @JSImport("@floating-ui/dom", "platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@floating-ui/dom", "platform.convertOffsetParentRelativeRectToViewportRelativeRect")
    @js.native
    def convertOffsetParentRelativeRectToViewportRelativeRect: js.Function1[/* args */ OffsetParent, Promisable[Rect]] = js.native
    inline def convertOffsetParentRelativeRectToViewportRelativeRect(args: OffsetParent): Promisable[Rect] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertOffsetParentRelativeRectToViewportRelativeRect")(args.asInstanceOf[js.Any]).asInstanceOf[Promisable[Rect]]
    inline def convertOffsetParentRelativeRectToViewportRelativeRect_=(x: js.Function1[/* args */ OffsetParent, Promisable[Rect]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertOffsetParentRelativeRectToViewportRelativeRect")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom", "platform.getClientRects")
    @js.native
    def getClientRects: js.Function1[/* element */ Element, Promisable[js.Array[ClientRectObject]]] = js.native
    inline def getClientRects(element: Element): Promisable[js.Array[ClientRectObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientRects")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[js.Array[ClientRectObject]]]
    inline def getClientRects_=(x: js.Function1[/* element */ Element, Promisable[js.Array[ClientRectObject]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getClientRects")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom", "platform.getClippingRect")
    @js.native
    def getClippingRect: js.Function1[/* args */ Boundary, Promisable[Rect]] = js.native
    inline def getClippingRect(args: Boundary): Promisable[Rect] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClippingRect")(args.asInstanceOf[js.Any]).asInstanceOf[Promisable[Rect]]
    inline def getClippingRect_=(x: js.Function1[/* args */ Boundary, Promisable[Rect]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getClippingRect")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom", "platform.getDimensions")
    @js.native
    def getDimensions: js.Function1[/* element */ Element, Promisable[Dimensions]] = js.native
    inline def getDimensions(element: Element): Promisable[Dimensions] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[Dimensions]]
    inline def getDimensions_=(x: js.Function1[/* element */ Element, Promisable[Dimensions]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDimensions")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom", "platform.getDocumentElement")
    @js.native
    def getDocumentElement: js.Function1[/* element */ Element, Promisable[HTMLElement]] = js.native
    inline def getDocumentElement(element: Element): Promisable[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentElement")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[HTMLElement]]
    inline def getDocumentElement_=(x: js.Function1[/* element */ Element, Promisable[HTMLElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDocumentElement")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom", "platform.getElementRects")
    @js.native
    def getElementRects: js.Function1[/* args */ Floating, Promisable[ElementRects]] = js.native
    inline def getElementRects(args: Floating): Promisable[ElementRects] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRects")(args.asInstanceOf[js.Any]).asInstanceOf[Promisable[ElementRects]]
    inline def getElementRects_=(x: js.Function1[/* args */ Floating, Promisable[ElementRects]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getElementRects")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom", "platform.getOffsetParent")
    @js.native
    def getOffsetParent: js.Function2[
        /* element */ Element, 
        /* polyfill */ js.UndefOr[js.Function1[/* element */ HTMLElement, Element | Null]], 
        Promisable[Element | Window]
      ] = js.native
    inline def getOffsetParent(element: Element): Promisable[Element | Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetParent")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[Element | Window]]
    inline def getOffsetParent(element: Element, polyfill: js.Function1[/* element */ HTMLElement, Element | Null]): Promisable[Element | Window] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetParent")(element.asInstanceOf[js.Any], polyfill.asInstanceOf[js.Any])).asInstanceOf[Promisable[Element | Window]]
    inline def getOffsetParent_=(
      x: js.Function2[
          /* element */ Element, 
          /* polyfill */ js.UndefOr[js.Function1[/* element */ HTMLElement, Element | Null]], 
          Promisable[Element | Window]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOffsetParent")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom", "platform.getScale")
    @js.native
    def getScale: js.Function1[/* element */ HTMLElement, Promisable[X]] = js.native
    inline def getScale(element: HTMLElement): Promisable[X] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[X]]
    inline def getScale_=(x: js.Function1[/* element */ HTMLElement, Promisable[X]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom", "platform.isElement")
    @js.native
    def isElement: js.Function1[/* value */ Any, Promisable[Boolean]] = js.native
    inline def isElement(value: Any): Promisable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(value.asInstanceOf[js.Any]).asInstanceOf[Promisable[Boolean]]
    inline def isElement_=(x: js.Function1[/* value */ Any, Promisable[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isElement")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom", "platform.isRTL")
    @js.native
    def isRTL: js.Function1[/* element */ Element, Promisable[Boolean]] = js.native
    inline def isRTL(element: Element): Promisable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[Boolean]]
    inline def isRTL_=(x: js.Function1[/* element */ Element, Promisable[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Optimizes the visibility of the floating element by shifting it in order to
    * keep it in view when it will overflow the clipping boundary.
    * @see https://floating-ui.com/docs/shift
    */
  inline def shift(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[Middleware]
  inline def shift(options: Derivable[ShiftOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def shift(options: ShiftOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /**
    * Provides data that allows you to change the size of the floating element —
    * for instance, prevent it from overflowing the clipping boundary or match the
    * width of the reference element.
    * @see https://floating-ui.com/docs/size
    */
  inline def size(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Middleware]
  inline def size(options: Derivable[SizeOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def size(options: SizeOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
}
