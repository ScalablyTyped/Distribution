package typings.floatingUiCore

import typings.floatingUiCore.typesMod.Axis
import typings.floatingUiCore.typesMod.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLengthFromAxisMod {
  
  @JSImport("@floating-ui/core/src/utils/getLengthFromAxis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLengthFromAxis(axis: Axis): Length = ^.asInstanceOf[js.Dynamic].applyDynamic("getLengthFromAxis")(axis.asInstanceOf[js.Any]).asInstanceOf[Length]
}
