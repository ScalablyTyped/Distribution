package typings.floatingUiCore.srcTypesMod

import typings.floatingUiCore.anon.Floating
import typings.floatingUiCore.anon.OffsetParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platform extends StObject {
  
  var convertOffsetParentRelativeRectToViewportRelativeRect: js.UndefOr[js.Function1[/* args */ OffsetParent, Promisable[Rect]]] = js.undefined
  
  var getClientRects: js.UndefOr[js.Function1[/* element */ Any, Promisable[js.Array[ClientRectObject]]]] = js.undefined
  
  def getClippingRect(args: typings.floatingUiCore.anon.Boundary): Promisable[Rect]
  
  def getDimensions(element: Any): Promisable[Dimensions]
  
  var getDocumentElement: js.UndefOr[js.Function1[/* element */ Any, Promisable[Any]]] = js.undefined
  
  def getElementRects(args: Floating): Promisable[ElementRects]
  
  var getOffsetParent: js.UndefOr[js.Function1[/* element */ Any, Promisable[Any]]] = js.undefined
  
  var isElement: js.UndefOr[js.Function1[/* value */ Any, Promisable[Boolean]]] = js.undefined
  
  var isRTL: js.UndefOr[js.Function1[/* element */ Any, Promisable[Boolean]]] = js.undefined
}
object Platform {
  
  inline def apply(
    getClippingRect: typings.floatingUiCore.anon.Boundary => Promisable[Rect],
    getDimensions: Any => Promisable[Dimensions],
    getElementRects: Floating => Promisable[ElementRects]
  ): Platform = {
    val __obj = js.Dynamic.literal(getClippingRect = js.Any.fromFunction1(getClippingRect), getDimensions = js.Any.fromFunction1(getDimensions), getElementRects = js.Any.fromFunction1(getElementRects))
    __obj.asInstanceOf[Platform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Platform] (val x: Self) extends AnyVal {
    
    inline def setConvertOffsetParentRelativeRectToViewportRelativeRect(value: /* args */ OffsetParent => Promisable[Rect]): Self = StObject.set(x, "convertOffsetParentRelativeRectToViewportRelativeRect", js.Any.fromFunction1(value))
    
    inline def setConvertOffsetParentRelativeRectToViewportRelativeRectUndefined: Self = StObject.set(x, "convertOffsetParentRelativeRectToViewportRelativeRect", js.undefined)
    
    inline def setGetClientRects(value: /* element */ Any => Promisable[js.Array[ClientRectObject]]): Self = StObject.set(x, "getClientRects", js.Any.fromFunction1(value))
    
    inline def setGetClientRectsUndefined: Self = StObject.set(x, "getClientRects", js.undefined)
    
    inline def setGetClippingRect(value: typings.floatingUiCore.anon.Boundary => Promisable[Rect]): Self = StObject.set(x, "getClippingRect", js.Any.fromFunction1(value))
    
    inline def setGetDimensions(value: Any => Promisable[Dimensions]): Self = StObject.set(x, "getDimensions", js.Any.fromFunction1(value))
    
    inline def setGetDocumentElement(value: /* element */ Any => Promisable[Any]): Self = StObject.set(x, "getDocumentElement", js.Any.fromFunction1(value))
    
    inline def setGetDocumentElementUndefined: Self = StObject.set(x, "getDocumentElement", js.undefined)
    
    inline def setGetElementRects(value: Floating => Promisable[ElementRects]): Self = StObject.set(x, "getElementRects", js.Any.fromFunction1(value))
    
    inline def setGetOffsetParent(value: /* element */ Any => Promisable[Any]): Self = StObject.set(x, "getOffsetParent", js.Any.fromFunction1(value))
    
    inline def setGetOffsetParentUndefined: Self = StObject.set(x, "getOffsetParent", js.undefined)
    
    inline def setIsElement(value: /* value */ Any => Promisable[Boolean]): Self = StObject.set(x, "isElement", js.Any.fromFunction1(value))
    
    inline def setIsElementUndefined: Self = StObject.set(x, "isElement", js.undefined)
    
    inline def setIsRTL(value: /* element */ Any => Promisable[Boolean]): Self = StObject.set(x, "isRTL", js.Any.fromFunction1(value))
    
    inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
  }
}
