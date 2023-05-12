package typings.floatingUiDom

import typings.floatingUiCore.srcTypesMod.ClientRectObject
import typings.floatingUiCore.srcTypesMod.Dimensions
import typings.floatingUiCore.srcTypesMod.ElementRects
import typings.floatingUiCore.srcTypesMod.Rect
import typings.floatingUiDom.anon.Boundary
import typings.floatingUiDom.anon.Floating
import typings.floatingUiDom.anon.OffsetParent
import typings.floatingUiDom.anon.X
import typings.floatingUiDom.srcTypesMod.Promisable
import typings.floatingUiDom.srcUtilsIsMod.global.Window
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPlatformMod {
  
  /* Inlined std.Required<@floating-ui/dom.@floating-ui/dom/src/types.Platform> */
  object platform {
    
    @JSImport("@floating-ui/dom/src/platform", "platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@floating-ui/dom/src/platform", "platform.convertOffsetParentRelativeRectToViewportRelativeRect")
    @js.native
    def convertOffsetParentRelativeRectToViewportRelativeRect: js.Function1[/* args */ OffsetParent, Promisable[Rect]] = js.native
    inline def convertOffsetParentRelativeRectToViewportRelativeRect(args: OffsetParent): Promisable[Rect] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertOffsetParentRelativeRectToViewportRelativeRect")(args.asInstanceOf[js.Any]).asInstanceOf[Promisable[Rect]]
    inline def convertOffsetParentRelativeRectToViewportRelativeRect_=(x: js.Function1[/* args */ OffsetParent, Promisable[Rect]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertOffsetParentRelativeRectToViewportRelativeRect")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/platform", "platform.getClientRects")
    @js.native
    def getClientRects: js.Function1[/* element */ Element, Promisable[js.Array[ClientRectObject]]] = js.native
    inline def getClientRects(element: Element): Promisable[js.Array[ClientRectObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientRects")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[js.Array[ClientRectObject]]]
    inline def getClientRects_=(x: js.Function1[/* element */ Element, Promisable[js.Array[ClientRectObject]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getClientRects")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/platform", "platform.getClippingRect")
    @js.native
    def getClippingRect: js.Function1[/* args */ Boundary, Promisable[Rect]] = js.native
    inline def getClippingRect(args: Boundary): Promisable[Rect] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClippingRect")(args.asInstanceOf[js.Any]).asInstanceOf[Promisable[Rect]]
    inline def getClippingRect_=(x: js.Function1[/* args */ Boundary, Promisable[Rect]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getClippingRect")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/platform", "platform.getDimensions")
    @js.native
    def getDimensions: js.Function1[/* element */ Element, Promisable[Dimensions]] = js.native
    inline def getDimensions(element: Element): Promisable[Dimensions] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[Dimensions]]
    inline def getDimensions_=(x: js.Function1[/* element */ Element, Promisable[Dimensions]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDimensions")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/platform", "platform.getDocumentElement")
    @js.native
    def getDocumentElement: js.Function1[/* element */ Element, Promisable[HTMLElement]] = js.native
    inline def getDocumentElement(element: Element): Promisable[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentElement")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[HTMLElement]]
    inline def getDocumentElement_=(x: js.Function1[/* element */ Element, Promisable[HTMLElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDocumentElement")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/platform", "platform.getElementRects")
    @js.native
    def getElementRects: js.Function1[/* args */ Floating, Promisable[ElementRects]] = js.native
    inline def getElementRects(args: Floating): Promisable[ElementRects] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementRects")(args.asInstanceOf[js.Any]).asInstanceOf[Promisable[ElementRects]]
    inline def getElementRects_=(x: js.Function1[/* args */ Floating, Promisable[ElementRects]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getElementRects")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/platform", "platform.getOffsetParent")
    @js.native
    def getOffsetParent: js.Function2[
        /* element */ Element, 
        /* polyfill */ js.UndefOr[js.Function1[/* element */ HTMLElement, Element | Null]], 
        Promisable[Element | Window]
      ] = js.native
    inline def getOffsetParent(element: Element): Promisable[Element | Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetParent")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[Element | Window]]
    inline def getOffsetParent(element: Element, polyfill: js.Function1[/* element */ HTMLElement, Element | Null]): Promisable[Element | Window] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetParent")(element.asInstanceOf[js.Any], polyfill.asInstanceOf[js.Any])).asInstanceOf[Promisable[Element | Window]]
    inline def getOffsetParent_=(
      x: js.Function2[
          /* element */ Element, 
          /* polyfill */ js.UndefOr[js.Function1[/* element */ HTMLElement, Element | Null]], 
          Promisable[Element | Window]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOffsetParent")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/platform", "platform.getScale")
    @js.native
    def getScale: js.Function1[/* element */ HTMLElement, Promisable[X]] = js.native
    inline def getScale(element: HTMLElement): Promisable[X] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[X]]
    inline def getScale_=(x: js.Function1[/* element */ HTMLElement, Promisable[X]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getScale")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/platform", "platform.isElement")
    @js.native
    def isElement: js.Function1[/* value */ Any, Promisable[Boolean]] = js.native
    inline def isElement(value: Any): Promisable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(value.asInstanceOf[js.Any]).asInstanceOf[Promisable[Boolean]]
    inline def isElement_=(x: js.Function1[/* value */ Any, Promisable[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isElement")(x.asInstanceOf[js.Any])
    
    @JSImport("@floating-ui/dom/src/platform", "platform.isRTL")
    @js.native
    def isRTL: js.Function1[/* element */ Element, Promisable[Boolean]] = js.native
    inline def isRTL(element: Element): Promisable[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isRTL")(element.asInstanceOf[js.Any]).asInstanceOf[Promisable[Boolean]]
    inline def isRTL_=(x: js.Function1[/* element */ Element, Promisable[Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(x.asInstanceOf[js.Any])
  }
}
