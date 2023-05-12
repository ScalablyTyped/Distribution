package typings.floatingUiCore

import typings.floatingUiCore.floatingUiCoreStrings.none
import typings.floatingUiCore.srcTypesMod.Alignment
import typings.floatingUiCore.srcTypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetOppositeAxisPlacementsMod {
  
  @JSImport("@floating-ui/core/src/utils/getOppositeAxisPlacements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOppositeAxisPlacements(placement: Placement, flipAlignment: Boolean, direction: Alignment): js.Array[Placement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOppositeAxisPlacements")(placement.asInstanceOf[js.Any], flipAlignment.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Array[Placement]]
  inline def getOppositeAxisPlacements(placement: Placement, flipAlignment: Boolean, direction: Alignment, rtl: Boolean): js.Array[Placement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOppositeAxisPlacements")(placement.asInstanceOf[js.Any], flipAlignment.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[js.Array[Placement]]
  
  inline def getOppositeAxisPlacements_none(placement: Placement, flipAlignment: Boolean, direction: none): js.Array[Placement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOppositeAxisPlacements")(placement.asInstanceOf[js.Any], flipAlignment.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Array[Placement]]
  inline def getOppositeAxisPlacements_none(placement: Placement, flipAlignment: Boolean, direction: none, rtl: Boolean): js.Array[Placement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOppositeAxisPlacements")(placement.asInstanceOf[js.Any], flipAlignment.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[js.Array[Placement]]
}
