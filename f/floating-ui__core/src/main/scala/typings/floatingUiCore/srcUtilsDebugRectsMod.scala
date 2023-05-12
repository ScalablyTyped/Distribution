package typings.floatingUiCore

import typings.floatingUiCore.srcTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsDebugRectsMod {
  
  @JSImport("@floating-ui/core/src/utils/debugRects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paintDebugRects(elementRect: Rect, clippingRect: Rect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paintDebugRects")(elementRect.asInstanceOf[js.Any], clippingRect.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
