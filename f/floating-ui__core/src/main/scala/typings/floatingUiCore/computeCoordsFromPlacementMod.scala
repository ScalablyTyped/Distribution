package typings.floatingUiCore

import typings.floatingUiCore.typesMod.Coords
import typings.floatingUiCore.typesMod.ElementRects
import typings.floatingUiCore.typesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeCoordsFromPlacementMod {
  
  @JSImport("@floating-ui/core/src/computeCoordsFromPlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCoordsFromPlacement(hasReferenceFloating: ElementRects, placement: Placement): Coords = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCoordsFromPlacement")(hasReferenceFloating.asInstanceOf[js.Any], placement.asInstanceOf[js.Any])).asInstanceOf[Coords]
  inline def computeCoordsFromPlacement(hasReferenceFloating: ElementRects, placement: Placement, rtl: Boolean): Coords = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCoordsFromPlacement")(hasReferenceFloating.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[Coords]
}
