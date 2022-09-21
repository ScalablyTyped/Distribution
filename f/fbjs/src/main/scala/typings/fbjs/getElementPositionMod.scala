package typings.fbjs

import typings.fbjs.anon.Height
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getElementPositionMod {
  
  inline def apply(element: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  @JSImport("fbjs/lib/getElementPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
