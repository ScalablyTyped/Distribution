package typings.floatingUiCore

import typings.floatingUiCore.typesMod.Axis
import typings.floatingUiCore.typesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMainAxisFromPlacementMod {
  
  @JSImport("@floating-ui/core/src/utils/getMainAxisFromPlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMainAxisFromPlacement(placement: Placement): Axis = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainAxisFromPlacement")(placement.asInstanceOf[js.Any]).asInstanceOf[Axis]
}
