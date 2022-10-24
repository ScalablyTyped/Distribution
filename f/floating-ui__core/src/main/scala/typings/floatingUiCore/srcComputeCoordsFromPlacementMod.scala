package typings.floatingUiCore

import typings.floatingUiCore.srcTypesMod.Coords
import typings.floatingUiCore.srcTypesMod.ElementRects
import typings.floatingUiCore.srcTypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComputeCoordsFromPlacementMod {
  
  @JSImport("@floating-ui/core/src/computeCoordsFromPlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCoordsFromPlacement(param0: ElementRects, placement: Placement): Coords = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCoordsFromPlacement")(param0.asInstanceOf[js.Any], placement.asInstanceOf[js.Any])).asInstanceOf[Coords]
  inline def computeCoordsFromPlacement(param0: ElementRects, placement: Placement, rtl: Boolean): Coords = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCoordsFromPlacement")(param0.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[Coords]
}
