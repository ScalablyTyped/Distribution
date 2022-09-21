package typings.focusLock

import typings.std.DOMStringMap
import typings.std.Element
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMod {
  
  @JSImport("focus-lock/dist/es5/utils/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDataset(node: Element): js.UndefOr[DOMStringMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataset")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DOMStringMap]]
  
  inline def isAutoFocusAllowed(node: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutoFocusAllowed")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAutoFocusAllowedCached(cache: VisibilityCache): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutoFocusAllowedCached")(cache.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isAutoFocusAllowedCached(cache: VisibilityCache, node: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAutoFocusAllowedCached")(cache.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")().asInstanceOf[/* is T */ Boolean]
  inline def isDefined[T](x: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(x.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isGuard(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGuard")().asInstanceOf[Boolean]
  inline def isGuard(node: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGuard")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHTMLButtonElement(node: Element): /* is std.HTMLInputElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLButtonElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLInputElement */ Boolean]
  
  inline def isHTMLInputElement(node: Element): /* is std.HTMLInputElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLInputElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLInputElement */ Boolean]
  
  inline def isNotAGuard(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotAGuard")().asInstanceOf[Boolean]
  inline def isNotAGuard(node: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotAGuard")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRadioElement(node: Element): /* is std.HTMLInputElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRadioElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLInputElement */ Boolean]
  
  inline def isVisibleCached(visibilityCache: VisibilityCache): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisibleCached")(visibilityCache.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isVisibleCached(visibilityCache: VisibilityCache, node: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVisibleCached")(visibilityCache.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def notHiddenInput(node: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notHiddenInput")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type VisibilityCache = Map[js.UndefOr[Element], Boolean]
}
