package typings.expressDomainMiddleware

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], next: NextFunction): js.Any = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("express-domain-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
