package typings.fbjs

import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getActiveElementMod {
  
  inline def apply(): js.UndefOr[HTMLElement | Null] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.UndefOr[HTMLElement | Null]]
  inline def apply(doc: Document): js.UndefOr[HTMLElement | Null] = ^.asInstanceOf[js.Dynamic].apply(doc.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLElement | Null]]
  
  @JSImport("fbjs/lib/getActiveElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
