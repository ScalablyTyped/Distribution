package typings.floatingUiDom.srcTypesMod

import typings.floatingUiCore.srcTypesMod.ClientRectObject
import typings.floatingUiCore.srcTypesMod.Dimensions
import typings.floatingUiCore.srcTypesMod.ElementRects
import typings.floatingUiCore.srcTypesMod.Rect
import typings.floatingUiDom.anon.Floating
import typings.floatingUiDom.anon.OffsetParent
import typings.floatingUiDom.anon.X
import typings.floatingUiDom.srcUtilsIsMod.global.Window
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platform_ extends StObject {
  
  var convertOffsetParentRelativeRectToViewportRelativeRect: js.UndefOr[js.Function1[/* args */ OffsetParent, Promisable[Rect]]] = js.undefined
  
  var getClientRects: js.UndefOr[js.Function1[/* element */ Element, Promisable[js.Array[ClientRectObject]]]] = js.undefined
  
  def getClippingRect(args: typings.floatingUiDom.anon.Boundary): Promisable[Rect]
  
  def getDimensions(element: Element): Promisable[Dimensions]
  
  var getDocumentElement: js.UndefOr[js.Function1[/* element */ Element, Promisable[HTMLElement]]] = js.undefined
  
  def getElementRects(args: Floating): Promisable[ElementRects]
  
  var getOffsetParent: js.UndefOr[
    js.Function2[
      /* element */ Element, 
      /* polyfill */ js.UndefOr[js.Function1[/* element */ HTMLElement, Element | Null]], 
      Promisable[Element | Window]
    ]
  ] = js.undefined
  
  var getScale: js.UndefOr[js.Function1[/* element */ HTMLElement, Promisable[X]]] = js.undefined
  
  var isElement: js.UndefOr[js.Function1[/* value */ Any, Promisable[Boolean]]] = js.undefined
  
  var isRTL: js.UndefOr[js.Function1[/* element */ Element, Promisable[Boolean]]] = js.undefined
}
object Platform_ {
  
  inline def apply(
    getClippingRect: typings.floatingUiDom.anon.Boundary => Promisable[Rect],
    getDimensions: Element => Promisable[Dimensions],
    getElementRects: Floating => Promisable[ElementRects]
  ): Platform_ = {
    val __obj = js.Dynamic.literal(getClippingRect = js.Any.fromFunction1(getClippingRect), getDimensions = js.Any.fromFunction1(getDimensions), getElementRects = js.Any.fromFunction1(getElementRects))
    __obj.asInstanceOf[Platform_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Platform_] (val x: Self) extends AnyVal {
    
    inline def setConvertOffsetParentRelativeRectToViewportRelativeRect(value: /* args */ OffsetParent => Promisable[Rect]): Self = StObject.set(x, "convertOffsetParentRelativeRectToViewportRelativeRect", js.Any.fromFunction1(value))
    
    inline def setConvertOffsetParentRelativeRectToViewportRelativeRectUndefined: Self = StObject.set(x, "convertOffsetParentRelativeRectToViewportRelativeRect", js.undefined)
    
    inline def setGetClientRects(value: /* element */ Element => Promisable[js.Array[ClientRectObject]]): Self = StObject.set(x, "getClientRects", js.Any.fromFunction1(value))
    
    inline def setGetClientRectsUndefined: Self = StObject.set(x, "getClientRects", js.undefined)
    
    inline def setGetClippingRect(value: typings.floatingUiDom.anon.Boundary => Promisable[Rect]): Self = StObject.set(x, "getClippingRect", js.Any.fromFunction1(value))
    
    inline def setGetDimensions(value: Element => Promisable[Dimensions]): Self = StObject.set(x, "getDimensions", js.Any.fromFunction1(value))
    
    inline def setGetDocumentElement(value: /* element */ Element => Promisable[HTMLElement]): Self = StObject.set(x, "getDocumentElement", js.Any.fromFunction1(value))
    
    inline def setGetDocumentElementUndefined: Self = StObject.set(x, "getDocumentElement", js.undefined)
    
    inline def setGetElementRects(value: Floating => Promisable[ElementRects]): Self = StObject.set(x, "getElementRects", js.Any.fromFunction1(value))
    
    inline def setGetOffsetParent(
      value: (/* element */ Element, /* polyfill */ js.UndefOr[js.Function1[/* element */ HTMLElement, Element | Null]]) => Promisable[Element | Window]
    ): Self = StObject.set(x, "getOffsetParent", js.Any.fromFunction2(value))
    
    inline def setGetOffsetParentUndefined: Self = StObject.set(x, "getOffsetParent", js.undefined)
    
    inline def setGetScale(value: /* element */ HTMLElement => Promisable[X]): Self = StObject.set(x, "getScale", js.Any.fromFunction1(value))
    
    inline def setGetScaleUndefined: Self = StObject.set(x, "getScale", js.undefined)
    
    inline def setIsElement(value: /* value */ Any => Promisable[Boolean]): Self = StObject.set(x, "isElement", js.Any.fromFunction1(value))
    
    inline def setIsElementUndefined: Self = StObject.set(x, "isElement", js.undefined)
    
    inline def setIsRTL(value: /* element */ Element => Promisable[Boolean]): Self = StObject.set(x, "isRTL", js.Any.fromFunction1(value))
    
    inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
  }
}
