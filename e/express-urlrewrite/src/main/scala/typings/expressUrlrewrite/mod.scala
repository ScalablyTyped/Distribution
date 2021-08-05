package typings.expressUrlrewrite

import typings.express.mod.Handler
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(s: String): Handler = ^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any]).asInstanceOf[Handler]
  inline def apply(s: String, t: String): Handler = (^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Handler]
  inline def apply(s: RegExp, t: String): Handler = (^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  @JSImport("express-urlrewrite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
