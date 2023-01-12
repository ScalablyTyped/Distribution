package typings.floatingUiCore

import typings.floatingUiCore.anon.PartialOptions
import typings.floatingUiCore.srcTypesMod.Boundary
import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.MiddlewareArguments
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiCore.srcTypesMod.RootBoundary
import typings.floatingUiCore.srcTypesMod.SideObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDetectOverflowMod {
  
  @JSImport("@floating-ui/core/src/detectOverflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectOverflow(middlewareArguments: MiddlewareArguments): js.Promise[SideObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(middlewareArguments.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SideObject]]
  inline def detectOverflow(middlewareArguments: MiddlewareArguments, options: PartialOptions): js.Promise[SideObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(middlewareArguments.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SideObject]]
  
  trait Options extends StObject {
    
    /**
      * Whether to check for overflow using the alternate element's boundary
      * (`clippingAncestors` boundary only).
      * @default false
      */
    var altBoundary: Boolean
    
    /**
      * The clipping element(s) in which overflow will be checked.
      * @default 'clippingAncestors'
      */
    var boundary: Boundary
    
    /**
      * The element in which overflow is being checked relative to a boundary.
      * @default 'floating'
      */
    var elementContext: ElementContext
    
    /**
      * Virtual padding for the resolved overflow offsets.
      * @default 0
      */
    var padding: Padding
    
    /**
      * The root clipping element in which overflow will be checked.
      * @default 'viewport'
      */
    var rootBoundary: RootBoundary
  }
  object Options {
    
    inline def apply(
      altBoundary: Boolean,
      boundary: Boundary,
      elementContext: ElementContext,
      padding: Padding,
      rootBoundary: RootBoundary
    ): Options = {
      val __obj = js.Dynamic.literal(altBoundary = altBoundary.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], elementContext = elementContext.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    }
  }
}
