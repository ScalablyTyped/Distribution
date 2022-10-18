package typings.devtools

import typings.devtools.anon.Height
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildScriptsGetElementRectMod {
  
  @JSImport("devtools/build/scripts/getElementRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(html: HTMLElement, elem: HTMLElement): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Height]
}
