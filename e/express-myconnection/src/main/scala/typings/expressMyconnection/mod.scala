package typings.expressMyconnection

import typings.express.mod.RequestHandler
import typings.expressMyconnection.anon.Typeofmysql
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.mysql.mod.ConnectionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(mysqlInstance: Typeofmysql, dbConfig: ConnectionConfig, strategy: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(mysqlInstance.asInstanceOf[js.Any], dbConfig.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("express-myconnection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
