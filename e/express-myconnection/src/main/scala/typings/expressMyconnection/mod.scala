package typings.expressMyconnection

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.mysql.mod.ConnectionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-myconnection", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(mysqlInstance: Typeofmysql, dbConfig: ConnectionConfig, strategy: String): RequestHandler[ParamsDictionary] = js.native
}

