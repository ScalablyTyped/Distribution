package typings.floatingUiCore.anon

import typings.floatingUiCore.typesMod.Alignment
import typings.floatingUiCore.typesMod.ElementContext
import typings.floatingUiCore.typesMod.Padding
import typings.floatingUiCore.typesMod.RootBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@floating-ui/core.@floating-ui/core/src/middleware/autoPlacement.Options & @floating-ui/core.@floating-ui/core/src/detectOverflow.Options> */
trait PartialOptionsOptions extends StObject {
  
  var alignment: js.UndefOr[Alignment | Null] = js.undefined
  
  var allowedPlacements: js.UndefOr[js.Array[typings.floatingUiCore.typesMod.Placement]] = js.undefined
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  var autoAlignment: js.UndefOr[Boolean] = js.undefined
  
  var boundary: js.UndefOr[typings.floatingUiCore.typesMod.Boundary] = js.undefined
  
  var elementContext: js.UndefOr[ElementContext] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
}
object PartialOptionsOptions {
  
  inline def apply(): PartialOptionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsOptions]
  }
  
  extension [Self <: PartialOptionsOptions](x: Self) {
    
    inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentNull: Self = StObject.set(x, "alignment", null)
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAllowedPlacements(value: js.Array[typings.floatingUiCore.typesMod.Placement]): Self = StObject.set(x, "allowedPlacements", value.asInstanceOf[js.Any])
    
    inline def setAllowedPlacementsUndefined: Self = StObject.set(x, "allowedPlacements", js.undefined)
    
    inline def setAllowedPlacementsVarargs(value: typings.floatingUiCore.typesMod.Placement*): Self = StObject.set(x, "allowedPlacements", js.Array(value*))
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setAutoAlignment(value: Boolean): Self = StObject.set(x, "autoAlignment", value.asInstanceOf[js.Any])
    
    inline def setAutoAlignmentUndefined: Self = StObject.set(x, "autoAlignment", js.undefined)
    
    inline def setBoundary(value: typings.floatingUiCore.typesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
    
    inline def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
  }
}
