package typings.easySession

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
    def apply(options: SessionOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  }
}
