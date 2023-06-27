package typings.floatingUiDom

import typings.floatingUiCore.srcTypesMod.Dimensions
import typings.floatingUiCore.srcTypesMod.ElementRects
import typings.floatingUiCore.srcTypesMod.Rect
import typings.floatingUiDom.anon.Boundary
import typings.floatingUiDom.anon.Element
import typings.floatingUiDom.anon.Floating
import typings.floatingUiDom.srcTypesMod.Platform_
import typings.floatingUiDom.srcTypesMod.Promisable
import typings.floatingUiDom.srcTypesMod.ReferenceElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetClippingRectMod {
  
  @JSImport("@floating-ui/dom/src/utils/getClippingRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClippingRect(param1: Element): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("getClippingRect")(param1.asInstanceOf[js.Any]).asInstanceOf[Rect]
  
  trait PlatformWithCache
    extends StObject
       with Platform_ {
    
    var _c: Map[ReferenceElement, js.Array[typings.std.Element]]
  }
  object PlatformWithCache {
    
    inline def apply(
      _c: Map[ReferenceElement, js.Array[typings.std.Element]],
      getClippingRect: Boundary => Promisable[Rect],
      getDimensions: typings.std.Element => Promisable[Dimensions],
      getElementRects: Floating => Promisable[ElementRects]
    ): PlatformWithCache = {
      val __obj = js.Dynamic.literal(_c = _c.asInstanceOf[js.Any], getClippingRect = js.Any.fromFunction1(getClippingRect), getDimensions = js.Any.fromFunction1(getDimensions), getElementRects = js.Any.fromFunction1(getElementRects))
      __obj.asInstanceOf[PlatformWithCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlatformWithCache] (val x: Self) extends AnyVal {
      
      inline def set_c(value: Map[ReferenceElement, js.Array[typings.std.Element]]): Self = StObject.set(x, "_c", value.asInstanceOf[js.Any])
    }
  }
}
