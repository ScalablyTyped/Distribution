package typings.fluentuiUtilities

import typings.fluentuiUtilities.libIrectangleMod.IRectangle
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomGetRectMod {
  
  @JSImport("@fluentui/utilities/lib/dom/getRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRect(): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")().asInstanceOf[js.UndefOr[IRectangle]]
  inline def getRect(element: HTMLElement): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IRectangle]]
  inline def getRect(element: Window): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IRectangle]]
}
