package typings.expressUrlrewrite

import org.scalablytyped.runtime.Shortcut
import typings.expressUrlrewrite.mod.urlRewrite.urlrewrite
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("express-urlrewrite", JSImport.Namespace)
  @js.native
  val ^ : urlrewrite = js.native
  
  type _To = urlrewrite
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: urlrewrite = ^
  
  object urlRewrite {
    
    type expressUrlRewriteInstance = js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* cb */ js.Function0[Any], 
        Unit
      ]
    
    type urlrewrite = js.Function2[/* from */ String, /* to */ js.UndefOr[String], expressUrlRewriteInstance]
  }
}
