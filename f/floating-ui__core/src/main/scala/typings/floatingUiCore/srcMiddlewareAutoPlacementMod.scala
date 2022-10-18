package typings.floatingUiCore

import typings.floatingUiCore.anon.PartialOptionsOptions
import typings.floatingUiCore.srcTypesMod.Alignment
import typings.floatingUiCore.srcTypesMod.Middleware
import typings.floatingUiCore.srcTypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewareAutoPlacementMod {
  
  @JSImport("@floating-ui/core/src/middleware/autoPlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoPlacement(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")().asInstanceOf[Middleware]
  inline def autoPlacement(options: PartialOptionsOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def getPlacementList(alignment: Null, autoAlignment: Boolean, allowedPlacements: js.Array[Placement]): js.Array[Placement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacementList")(alignment.asInstanceOf[js.Any], autoAlignment.asInstanceOf[js.Any], allowedPlacements.asInstanceOf[js.Any])).asInstanceOf[js.Array[Placement]]
  inline def getPlacementList(alignment: Alignment, autoAlignment: Boolean, allowedPlacements: js.Array[Placement]): js.Array[Placement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacementList")(alignment.asInstanceOf[js.Any], autoAlignment.asInstanceOf[js.Any], allowedPlacements.asInstanceOf[js.Any])).asInstanceOf[js.Array[Placement]]
  
  trait Options extends StObject {
    
    /**
      * Choose placements with a particular alignment.
      * @default null
      */
    var alignment: Alignment | Null
    
    /**
      * Which placements are allowed to be chosen. Placements must be within the
      * `alignment` option set.
      * @default allPlacements (variable)
      */
    var allowedPlacements: js.Array[Placement]
    
    /**
      * Whether to choose placements with the opposite alignment if they will fit
      * better.
      * @default true
      */
    var autoAlignment: Boolean
  }
  object Options {
    
    inline def apply(allowedPlacements: js.Array[Placement], autoAlignment: Boolean): Options = {
      val __obj = js.Dynamic.literal(allowedPlacements = allowedPlacements.asInstanceOf[js.Any], autoAlignment = autoAlignment.asInstanceOf[js.Any], alignment = null)
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentNull: Self = StObject.set(x, "alignment", null)
      
      inline def setAllowedPlacements(value: js.Array[Placement]): Self = StObject.set(x, "allowedPlacements", value.asInstanceOf[js.Any])
      
      inline def setAllowedPlacementsVarargs(value: Placement*): Self = StObject.set(x, "allowedPlacements", js.Array(value*))
      
      inline def setAutoAlignment(value: Boolean): Self = StObject.set(x, "autoAlignment", value.asInstanceOf[js.Any])
    }
  }
}
