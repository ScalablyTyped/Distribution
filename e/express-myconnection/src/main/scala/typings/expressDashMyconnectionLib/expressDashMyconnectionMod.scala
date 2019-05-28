package typings
package expressDashMyconnectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-myconnection", JSImport.Namespace)
@js.native
object expressDashMyconnectionMod extends js.Object {
  def apply(
    mysqlInstance: expressDashMyconnectionLib.Typeofmysql,
    dbConfig: mysqlLib.mysqlMod.ConnectionConfig,
    strategy: java.lang.String
  ): expressLib.expressMod.RequestHandler = js.native
}

