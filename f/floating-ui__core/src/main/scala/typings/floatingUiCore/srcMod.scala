package typings.floatingUiCore

import typings.floatingUiCore.anon.Fn
import typings.floatingUiCore.anon.PartialLimitShiftOptions
import typings.floatingUiCore.anon.PartialOptions
import typings.floatingUiCore.anon.PartialOptionsOptions
import typings.floatingUiCore.anon.PartialOptionsOptionsAltBoundary
import typings.floatingUiCore.anon.PartialOptionsOptionsApply
import typings.floatingUiCore.anon.PartialOptionsOptionsBoundary
import typings.floatingUiCore.anon.PartialOptionsOptionsCrossAxis
import typings.floatingUiCore.anon.PartialOptionsPadding
import typings.floatingUiCore.srcMiddlewareArrowMod.Options
import typings.floatingUiCore.srcTypesMod.ClientRectObject
import typings.floatingUiCore.srcTypesMod.ComputePosition_
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.MiddlewareArguments
import typings.floatingUiCore.srcTypesMod.Rect
import typings.floatingUiCore.srcTypesMod.SideObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@floating-ui/core/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrow(options: Options): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("arrow")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def autoPlacement(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")().asInstanceOf[Middleware]
  inline def autoPlacement(options: PartialOptionsOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  @JSImport("@floating-ui/core/src", "computePosition")
  @js.native
  val computePosition: ComputePosition_ = js.native
  
  inline def detectOverflow(middlewareArguments: MiddlewareArguments): js.Promise[SideObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(middlewareArguments.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SideObject]]
  inline def detectOverflow(middlewareArguments: MiddlewareArguments, options: PartialOptions): js.Promise[SideObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(middlewareArguments.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SideObject]]
  
  inline def flip(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")().asInstanceOf[Middleware]
  inline def flip(options: PartialOptionsOptionsAltBoundary): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def hide(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Middleware]
  inline def hide(param0: PartialOptionsOptionsBoundary): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(param0.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def `inline`(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")().asInstanceOf[Middleware]
  inline def `inline`(options: PartialOptionsPadding): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def limitShift(): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")().asInstanceOf[Fn]
  inline def limitShift(options: PartialLimitShiftOptions): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[Fn]
  
  inline def offset(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[Middleware]
  inline def offset(value: typings.floatingUiCore.srcMiddlewareOffsetMod.Options): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(value.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def rectToClientRect(rect: Rect): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("rectToClientRect")(rect.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]
  
  inline def shift(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[Middleware]
  inline def shift(options: PartialOptionsOptionsCrossAxis): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def size(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Middleware]
  inline def size(options: PartialOptionsOptionsApply): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
}
