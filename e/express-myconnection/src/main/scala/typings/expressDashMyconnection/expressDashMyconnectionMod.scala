package typings.expressDashMyconnection

import typings.express.expressMod.RequestHandler
import typings.mysql.mysqlMod.ConnectionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-myconnection", JSImport.Namespace)
@js.native
object expressDashMyconnectionMod extends js.Object {
  def apply(mysqlInstance: Typeofmysql, dbConfig: ConnectionConfig, strategy: String): RequestHandler = js.native
}

