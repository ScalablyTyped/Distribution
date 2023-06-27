package typings.floatingUiCore

import typings.floatingUiCore.anon.MiddlewareStateavailableW
import typings.floatingUiCore.srcTypesMod.Boundary
import typings.floatingUiCore.srcTypesMod.Derivable
import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiCore.srcTypesMod.RootBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareSizeMod {
  
  @JSImport("@floating-ui/core/src/middleware/size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def size(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Middleware]
  inline def size(options: SizeOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def size(options: Derivable[SizeOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  /* Inlined std.Partial<@floating-ui/core.@floating-ui/core/src/detectOverflow.Options & {apply (args : @floating-ui/core.@floating-ui/core/src/types.MiddlewareState & {  availableWidth :number,   availableHeight :number}): void | std.Promise<void>}> */
  trait SizeOptions extends StObject {
    
    var altBoundary: js.UndefOr[Boolean] = js.undefined
    
    @JSName("apply")
    var apply: js.UndefOr[js.Function1[/* args */ MiddlewareStateavailableW, Unit | js.Promise[Unit]]] = js.undefined
    
    var boundary: js.UndefOr[Boundary] = js.undefined
    
    var elementContext: js.UndefOr[ElementContext] = js.undefined
    
    var padding: js.UndefOr[Padding] = js.undefined
    
    var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
  }
  object SizeOptions {
    
    inline def apply(): SizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeOptions] (val x: Self) extends AnyVal {
      
      inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
      
      inline def setApply(value: /* args */ MiddlewareStateavailableW => Unit | js.Promise[Unit]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
      
      inline def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
      
      inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
    }
  }
}
