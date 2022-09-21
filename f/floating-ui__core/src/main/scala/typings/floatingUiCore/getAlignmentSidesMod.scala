package typings.floatingUiCore

import typings.floatingUiCore.anon.Cross
import typings.floatingUiCore.typesMod.ElementRects
import typings.floatingUiCore.typesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAlignmentSidesMod {
  
  @JSImport("@floating-ui/core/src/utils/getAlignmentSides", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAlignmentSides(placement: Placement, rects: ElementRects): Cross = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignmentSides")(placement.asInstanceOf[js.Any], rects.asInstanceOf[js.Any])).asInstanceOf[Cross]
  inline def getAlignmentSides(placement: Placement, rects: ElementRects, rtl: Boolean): Cross = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignmentSides")(placement.asInstanceOf[js.Any], rects.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[Cross]
}
