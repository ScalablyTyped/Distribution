package typings.floatingUiCore

import typings.floatingUiCore.anon.Fn
import typings.floatingUiCore.srcDetectOverflowMod.Options
import typings.floatingUiCore.srcMiddlewareArrowMod.ArrowOptions
import typings.floatingUiCore.srcMiddlewareAutoPlacementMod.AutoPlacementOptions
import typings.floatingUiCore.srcMiddlewareFlipMod.FlipOptions
import typings.floatingUiCore.srcMiddlewareHideMod.HideOptions
import typings.floatingUiCore.srcMiddlewareInlineMod.InlineOptions
import typings.floatingUiCore.srcMiddlewareOffsetMod.OffsetOptions
import typings.floatingUiCore.srcMiddlewareShiftMod.LimitShiftOptions
import typings.floatingUiCore.srcMiddlewareShiftMod.ShiftOptions
import typings.floatingUiCore.srcMiddlewareSizeMod.SizeOptions
import typings.floatingUiCore.srcTypesMod.ClientRectObject
import typings.floatingUiCore.srcTypesMod.ComputePosition_
import typings.floatingUiCore.srcTypesMod.Derivable
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.MiddlewareState
import typings.floatingUiCore.srcTypesMod.Rect
import typings.floatingUiCore.srcTypesMod.SideObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@floating-ui/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrow(options: ArrowOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("arrow")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def arrow(options: Derivable[ArrowOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("arrow")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def autoPlacement(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")().asInstanceOf[Middleware]
  inline def autoPlacement(options: AutoPlacementOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def autoPlacement(options: Derivable[AutoPlacementOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  @JSImport("@floating-ui/core", "computePosition")
  @js.native
  val computePosition: ComputePosition_ = js.native
  
  inline def detectOverflow(state: MiddlewareState): js.Promise[SideObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SideObject]]
  inline def detectOverflow(state: MiddlewareState, options: Options): js.Promise[SideObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SideObject]]
  inline def detectOverflow(state: MiddlewareState, options: Derivable[Options]): js.Promise[SideObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SideObject]]
  
  inline def flip(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")().asInstanceOf[Middleware]
  inline def flip(options: FlipOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def flip(options: Derivable[FlipOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def hide(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Middleware]
  inline def hide(options: HideOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def hide(options: Derivable[HideOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def `inline`(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")().asInstanceOf[Middleware]
  inline def `inline`(options: InlineOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def `inline`(options: Derivable[InlineOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def limitShift(): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")().asInstanceOf[Fn]
  inline def limitShift(options: LimitShiftOptions): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[Fn]
  inline def limitShift(options: Derivable[LimitShiftOptions]): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[Fn]
  
  inline def offset(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[Middleware]
  inline def offset(options: OffsetOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def rectToClientRect(rect: Rect): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("rectToClientRect")(rect.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]
  
  inline def shift(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[Middleware]
  inline def shift(options: ShiftOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def shift(options: Derivable[ShiftOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def size(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Middleware]
  inline def size(options: SizeOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def size(options: Derivable[SizeOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
}
