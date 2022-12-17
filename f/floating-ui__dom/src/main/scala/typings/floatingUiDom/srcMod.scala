package typings.floatingUiDom

import typings.floatingUiCore.anon.PartialLimitShiftOptions
import typings.floatingUiCore.anon.PartialOptionsOptions
import typings.floatingUiCore.anon.PartialOptionsOptionsAltBoundary
import typings.floatingUiCore.anon.PartialOptionsOptionsApply
import typings.floatingUiCore.anon.PartialOptionsOptionsBoundary
import typings.floatingUiCore.anon.PartialOptionsOptionsCrossAxis
import typings.floatingUiCore.anon.PartialOptionsPadding
import typings.floatingUiCore.srcMiddlewareArrowMod.Options
import typings.floatingUiCore.srcTypesMod.ComputePositionReturn
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.MiddlewareArguments
import typings.floatingUiCore.srcTypesMod.SideObject
import typings.floatingUiDom.anon.PartialComputePositionCon
import typings.floatingUiDom.anon.PartialOptions
import typings.floatingUiDom.srcTypesMod.FloatingElement
import typings.floatingUiDom.srcTypesMod.Platform_
import typings.floatingUiDom.srcTypesMod.ReferenceElement
import typings.floatingUiDom.srcUtilsIsMod.global.Window
import typings.std.Element
import typings.std.Node
import typings.std.VisualViewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@floating-ui/dom/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrow(options: Options): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("arrow")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def autoPlacement(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")().asInstanceOf[Middleware]
  inline def autoPlacement(options: PartialOptionsOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def autoUpdate(reference: ReferenceElement, floating: FloatingElement, update: js.Function0[Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoUpdate")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def autoUpdate(
    reference: ReferenceElement,
    floating: FloatingElement,
    update: js.Function0[Unit],
    options: PartialOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoUpdate")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any], update.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def computePosition(reference: ReferenceElement, floating: FloatingElement): js.Promise[ComputePositionReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("computePosition")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComputePositionReturn]]
  inline def computePosition(reference: ReferenceElement, floating: FloatingElement, options: PartialComputePositionCon): js.Promise[ComputePositionReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("computePosition")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComputePositionReturn]]
  
  inline def detectOverflow(middlewareArguments: MiddlewareArguments): js.Promise[SideObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(middlewareArguments.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SideObject]]
  inline def detectOverflow(middlewareArguments: MiddlewareArguments, options: typings.floatingUiCore.anon.PartialOptions): js.Promise[SideObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(middlewareArguments.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SideObject]]
  
  inline def flip(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")().asInstanceOf[Middleware]
  inline def flip(options: PartialOptionsOptionsAltBoundary): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def getOverflowAncestors(node: Node): js.Array[Element | Window | VisualViewport] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element | Window | VisualViewport]]
  inline def getOverflowAncestors(node: Node, list: js.Array[Element | Window]): js.Array[Element | Window | VisualViewport] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowAncestors")(node.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element | Window | VisualViewport]]
  
  inline def hide(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Middleware]
  inline def hide(param0: PartialOptionsOptionsBoundary): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(param0.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def `inline`(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")().asInstanceOf[Middleware]
  inline def `inline`(options: PartialOptionsPadding): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def limitShift(): typings.floatingUiCore.anon.Options = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")().asInstanceOf[typings.floatingUiCore.anon.Options]
  inline def limitShift(options: PartialLimitShiftOptions): typings.floatingUiCore.anon.Options = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[typings.floatingUiCore.anon.Options]
  
  inline def offset(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[Middleware]
  inline def offset(value: typings.floatingUiCore.srcMiddlewareOffsetMod.Options): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(value.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  @JSImport("@floating-ui/dom/src", "platform")
  @js.native
  val platform: Platform_ = js.native
  
  inline def shift(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[Middleware]
  inline def shift(options: PartialOptionsOptionsCrossAxis): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def size(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Middleware]
  inline def size(options: PartialOptionsOptionsApply): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
}
