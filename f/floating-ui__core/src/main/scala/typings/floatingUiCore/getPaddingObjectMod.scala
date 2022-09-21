package typings.floatingUiCore

import typings.floatingUiCore.typesMod.Padding
import typings.floatingUiCore.typesMod.SideObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPaddingObjectMod {
  
  @JSImport("@floating-ui/core/src/utils/getPaddingObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSideObjectFromPadding(padding: Padding): SideObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getSideObjectFromPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[SideObject]
}
