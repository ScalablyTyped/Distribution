package typings.floatingUiDom

import typings.floatingUiCore.srcTypesMod.Rect
import typings.floatingUiDom.anon.RootBoundary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetClippingRectMod {
  
  @JSImport("@floating-ui/dom/src/utils/getClippingRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClippingRect(hasElementBoundaryRootBoundaryStrategy: RootBoundary): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("getClippingRect")(hasElementBoundaryRootBoundaryStrategy.asInstanceOf[js.Any]).asInstanceOf[Rect]
}
