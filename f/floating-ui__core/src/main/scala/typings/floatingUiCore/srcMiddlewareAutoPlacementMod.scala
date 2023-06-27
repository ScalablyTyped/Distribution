package typings.floatingUiCore

import typings.floatingUiCore.srcTypesMod.Alignment
import typings.floatingUiCore.srcTypesMod.Boundary
import typings.floatingUiCore.srcTypesMod.Derivable
import typings.floatingUiCore.srcTypesMod.ElementContext
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.Padding
import typings.floatingUiCore.srcTypesMod.Placement
import typings.floatingUiCore.srcTypesMod.RootBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareAutoPlacementMod {
  
  @JSImport("@floating-ui/core/src/middleware/autoPlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoPlacement(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")().asInstanceOf[Middleware]
  inline def autoPlacement(options: AutoPlacementOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  inline def autoPlacement(options: Derivable[AutoPlacementOptions]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def getPlacementList(alignment: Null, autoAlignment: Boolean, allowedPlacements: js.Array[Placement]): js.Array[Placement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacementList")(alignment.asInstanceOf[js.Any], autoAlignment.asInstanceOf[js.Any], allowedPlacements.asInstanceOf[js.Any])).asInstanceOf[js.Array[Placement]]
  inline def getPlacementList(alignment: Alignment, autoAlignment: Boolean, allowedPlacements: js.Array[Placement]): js.Array[Placement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacementList")(alignment.asInstanceOf[js.Any], autoAlignment.asInstanceOf[js.Any], allowedPlacements.asInstanceOf[js.Any])).asInstanceOf[js.Array[Placement]]
  
  /* Inlined std.Partial<@floating-ui/core.@floating-ui/core/src/detectOverflow.Options & {  crossAxis :boolean,   alignment :@floating-ui/core.@floating-ui/core/src/types.Alignment | null,   autoAlignment :boolean,   allowedPlacements :std.Array<@floating-ui/core.@floating-ui/core/src/types.Placement>}> */
  trait AutoPlacementOptions extends StObject {
    
    var alignment: js.UndefOr[Alignment | Null] = js.undefined
    
    var allowedPlacements: js.UndefOr[js.Array[Placement]] = js.undefined
    
    var altBoundary: js.UndefOr[Boolean] = js.undefined
    
    var autoAlignment: js.UndefOr[Boolean] = js.undefined
    
    var boundary: js.UndefOr[Boundary] = js.undefined
    
    var crossAxis: js.UndefOr[Boolean] = js.undefined
    
    var elementContext: js.UndefOr[ElementContext] = js.undefined
    
    var padding: js.UndefOr[Padding] = js.undefined
    
    var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
  }
  object AutoPlacementOptions {
    
    inline def apply(): AutoPlacementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoPlacementOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoPlacementOptions] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentNull: Self = StObject.set(x, "alignment", null)
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setAllowedPlacements(value: js.Array[Placement]): Self = StObject.set(x, "allowedPlacements", value.asInstanceOf[js.Any])
      
      inline def setAllowedPlacementsUndefined: Self = StObject.set(x, "allowedPlacements", js.undefined)
      
      inline def setAllowedPlacementsVarargs(value: Placement*): Self = StObject.set(x, "allowedPlacements", js.Array(value*))
      
      inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
      
      inline def setAutoAlignment(value: Boolean): Self = StObject.set(x, "autoAlignment", value.asInstanceOf[js.Any])
      
      inline def setAutoAlignmentUndefined: Self = StObject.set(x, "autoAlignment", js.undefined)
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
      
      inline def setCrossAxisUndefined: Self = StObject.set(x, "crossAxis", js.undefined)
      
      inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
      
      inline def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
      
      inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
    }
  }
}
