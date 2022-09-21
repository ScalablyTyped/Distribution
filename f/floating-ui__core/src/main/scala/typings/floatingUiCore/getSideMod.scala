package typings.floatingUiCore

import typings.floatingUiCore.typesMod.Placement
import typings.floatingUiCore.typesMod.Side
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSideMod {
  
  @JSImport("@floating-ui/core/src/utils/getSide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSide(placement: Placement): Side = ^.asInstanceOf[js.Dynamic].applyDynamic("getSide")(placement.asInstanceOf[js.Any]).asInstanceOf[Side]
}
