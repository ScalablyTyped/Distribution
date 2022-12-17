package typings.floatingUiDom

import typings.floatingUiCore.anon.Options
import typings.floatingUiCore.anon.PartialLimitShiftOptions
import typings.floatingUiCore.anon.PartialOptionsPadding
import typings.floatingUiCore.srcTypesMod.ComputePositionReturn
import typings.floatingUiCore.srcTypesMod.SideObject
import typings.floatingUiDom.anon.Element
import typings.floatingUiDom.anon.PartialAutoPlacementOptio
import typings.floatingUiDom.anon.PartialComputePositionCon
import typings.floatingUiDom.anon.PartialDetectOverflowOpti
import typings.floatingUiDom.anon.PartialFlipOptionsDetectO
import typings.floatingUiDom.anon.PartialHideOptionsDetectO
import typings.floatingUiDom.anon.PartialOptions
import typings.floatingUiDom.anon.PartialShiftOptionsDetect
import typings.floatingUiDom.anon.PartialSizeOptionsDetectO
import typings.floatingUiDom.srcTypesMod.FloatingElement
import typings.floatingUiDom.srcTypesMod.Middleware
import typings.floatingUiDom.srcTypesMod.MiddlewareArguments
import typings.floatingUiDom.srcTypesMod.Platform_
import typings.floatingUiDom.srcTypesMod.ReferenceElement
import typings.floatingUiDom.srcUtilsIsMod.global.Window
import typings.std.Node
import typings.std.VisualViewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@floating-ui/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Positions an inner element of the floating element such that it is centered
    * to the reference element.
    * @see https://floating-ui.com/docs/arrow
    */
  inline def arrow(options: Element): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("arrow")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /**
    * Automatically chooses the `placement` which has the most space available.
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
    * element is overflowing a given clipping boundary.
    * - positive = overflowing the boundary by that number of pixels
    * - negative = how many pixels left before it will overflow
    * - 0 = lies flush with the boundary
    * @see https://floating-ui.com/docs/detectOverflow
    */
  inline def detectOverflow(middlewareArguments: MiddlewareArguments): js.Promise[SideObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(middlewareArguments.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SideObject]]
  inline def detectOverflow(middlewareArguments: MiddlewareArguments, options: PartialDetectOverflowOpti): js.Promise[SideObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(middlewareArguments.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SideObject]]
  
  /**
    * Changes the placement of the floating element to one that will fit if the
    * initially specified `placement` does not.
    * @see https://floating-ui.com/docs/flip
    */
  inline def flip(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")().asInstanceOf[Middleware]
  inline def flip(options: PartialFlipOptionsDetectO): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def getOverflowAncestors(node: Node): js.Array[typings.std.Element | Window | VisualViewport] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.std.Element | Window | VisualViewport]]
  inline def getOverflowAncestors(node: Node, list: js.Array[typings.std.Element | Window]): js.Array[typings.std.Element | Window | VisualViewport] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.std.Element | Window | VisualViewport]]
  
  /**
    * Provides data to hide the floating element in applicable situations, such as
    * when it is not in the same clipping context as the reference element.
    * @see https://floating-ui.com/docs/hide
    */
  inline def hide(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Middleware]
  inline def hide(options: PartialHideOptionsDetectO): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def `inline`(): typings.floatingUiCore.srcTypesMod.Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")().asInstanceOf[typings.floatingUiCore.srcTypesMod.Middleware]
  inline def `inline`(options: PartialOptionsPadding): typings.floatingUiCore.srcTypesMod.Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[typings.floatingUiCore.srcTypesMod.Middleware]
  
  inline def limitShift(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")().asInstanceOf[Options]
  inline def limitShift(options: PartialLimitShiftOptions): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[Options]
  
  inline def offset(): typings.floatingUiCore.srcTypesMod.Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[typings.floatingUiCore.srcTypesMod.Middleware]
  inline def offset(value: typings.floatingUiCore.srcMiddlewareOffsetMod.Options): typings.floatingUiCore.srcTypesMod.Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(value.asInstanceOf[js.Any]).asInstanceOf[typings.floatingUiCore.srcTypesMod.Middleware]
  
  @JSImport("@floating-ui/dom", "platform")
  @js.native
  val platform: Platform_ = js.native
  
  /**
    * Shifts the floating element in order to keep it in view when it will overflow
    * a clipping boundary.
    * @see https://floating-ui.com/docs/shift
    */
  inline def shift(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[Middleware]
  inline def shift(options: PartialShiftOptionsDetect): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /**
    * Provides data to change the size of the floating element. For instance,
    * prevent it from overflowing its clipping boundary or match the width of the
    * reference element.
    * @see https://floating-ui.com/docs/size
    */
  inline def size(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Middleware]
  inline def size(options: PartialSizeOptionsDetectO): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
}
