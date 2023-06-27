package typings.floatingUiDom.srcTypesMod

import typings.floatingUiCore.srcMiddlewareInlineMod.InlineOptions
import typings.floatingUiCore.srcMiddlewareOffsetMod.OffsetOptions
import typings.floatingUiCore.srcMiddlewareShiftMod.LimitShiftOptions
import typings.floatingUiCore.srcTypesMod.ComputePositionReturn
import typings.floatingUiCore.srcTypesMod.Rect
import typings.floatingUiCore.srcTypesMod.SideObject
import typings.floatingUiDom.anon.Fn
import typings.floatingUiDom.anon.PartialComputePositionCon
import typings.floatingUiDom.floatingUiDomStrings.clippingAncestors
import typings.floatingUiDom.srcAutoUpdateMod.Options
import typings.floatingUiDom.srcTypesMod.^
import typings.floatingUiDom.srcUtilsGetOverflowAncestorsMod.OverflowAncestors
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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

type Boundary = clippingAncestors | Element | js.Array[Element] | Rect

type Derivable[T] = js.Function1[/* state */ MiddlewareState, T]

type FloatingElement = HTMLElement

type Prettify[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any

type Promisable[T] = T | js.Promise[T]

type ReferenceElement = Element | VirtualElement
