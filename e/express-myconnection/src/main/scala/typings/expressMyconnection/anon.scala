package typings.expressMyconnection

import typings.mysql.anon.ToSqlString
import typings.mysql.mod.Connection
import typings.mysql.mod.ConnectionConfig
import typings.mysql.mod.Pool
import typings.mysql.mod.PoolCluster
import typings.mysql.mod.PoolClusterConfig
import typings.mysql.mod.PoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Typeofmysql extends js.Object {
    
    def createConnection(connectionUri: String): Connection = js.native
    def createConnection(connectionUri: ConnectionConfig): Connection = js.native
    
    def createPool(config: String): Pool = js.native
    def createPool(config: PoolConfig): Pool = js.native
    
    def createPoolCluster(): PoolCluster = js.native
    def createPoolCluster(config: PoolClusterConfig): PoolCluster = js.native
    
    def escape(value: js.Any): String = js.native
    def escape(value: js.Any, stringifyObjects: js.UndefOr[scala.Nothing], timeZone: String): String = js.native
    def escape(value: js.Any, stringifyObjects: Boolean): String = js.native
    def escape(value: js.Any, stringifyObjects: Boolean, timeZone: String): String = js.native
    
    def escapeId(value: String): String = js.native
    def escapeId(value: String, forbidQualified: Boolean): String = js.native
    
    def format(sql: String, values: js.Array[_]): String = js.native
    def format(sql: String, values: js.Array[_], stringifyObjects: js.UndefOr[scala.Nothing], timeZone: String): String = js.native
    def format(sql: String, values: js.Array[_], stringifyObjects: Boolean): String = js.native
    def format(sql: String, values: js.Array[_], stringifyObjects: Boolean, timeZone: String): String = js.native
    
    def raw(sql: String): ToSqlString = js.native
  }
}
