package typings.floatingUiCore

import typings.floatingUiCore.srcTypesMod.Placement
import typings.floatingUiCore.srcTypesMod.Side
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetSideMod {
  
  @JSImport("@floating-ui/core/src/utils/getSide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSide(placement: Placement): Side = ^.asInstanceOf[js.Dynamic].applyDynamic("getSide")(placement.asInstanceOf[js.Any]).asInstanceOf[Side]
}
