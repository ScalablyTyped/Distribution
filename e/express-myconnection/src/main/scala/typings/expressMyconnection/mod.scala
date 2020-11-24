package typings.expressMyconnection

import typings.express.mod.RequestHandler
import typings.expressMyconnection.anon.Typeofmysql
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.mysql.mod.ConnectionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-myconnection", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(mysqlInstance: Typeofmysql, dbConfig: ConnectionConfig, strategy: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}
