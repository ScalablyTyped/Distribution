package typings.floatingUiDom

import typings.floatingUiCore.srcTypesMod.Coords
import typings.floatingUiDom.srcTypesMod.VirtualElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetScaleMod {
  
  @JSImport("@floating-ui/dom/src/utils/getScale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object FALLBACK_SCALE {
    
    @JSImport("@floating-ui/dom/src/utils/getScale", "FALLBACK_SCALE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@floating-ui/dom/src/utils/getScale", "FALLBACK_SCALE.x")
    @js.native
    def x: Double = js.native
    inline def x_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/utils/getScale", "FALLBACK_SCALE.y")
    @js.native
    def y: Double = js.native
    inline def y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("y")(x.asInstanceOf[js.Any])
  }
  
  inline def getScale(element: VirtualElement): Coords = ^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(element.asInstanceOf[js.Any]).asInstanceOf[Coords]
  inline def getScale(element: Element): Coords = ^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(element.asInstanceOf[js.Any]).asInstanceOf[Coords]
}
