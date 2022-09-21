package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createNodesFromMarkupMod {
  
  inline def apply(markup: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].apply(markup.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def apply(markup: String, handleScript: js.Function1[/* script */ String, Unit]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].apply(markup.asInstanceOf[js.Any], handleScript.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  @JSImport("fbjs/lib/createNodesFromMarkup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
