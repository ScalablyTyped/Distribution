package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.addDatabase
import typings.devtoolsProtocol.mod.Protocol.Database.AddDatabaseEvent
import typings.devtoolsProtocol.mod.Protocol.Database.ExecuteSQLRequest
import typings.devtoolsProtocol.mod.Protocol.Database.ExecuteSQLResponse
import typings.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesRequest
import typings.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseApi extends StObject {
  
  /**
    * Disables database tracking, prevents database events from being sent to the client.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables database tracking, database events will now be delivered to the client.
    */
  def enable(): js.Promise[Unit]
  
  def executeSQL(params: ExecuteSQLRequest): js.Promise[ExecuteSQLResponse]
  
  def getDatabaseTableNames(params: GetDatabaseTableNamesRequest): js.Promise[GetDatabaseTableNamesResponse]
  
  @JSName("on")
  def on_addDatabase(event: addDatabase, listener: js.Function1[/* params */ AddDatabaseEvent, Unit]): Unit
}
object DatabaseApi {
  
  inline def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    executeSQL: ExecuteSQLRequest => js.Promise[ExecuteSQLResponse],
    getDatabaseTableNames: GetDatabaseTableNamesRequest => js.Promise[GetDatabaseTableNamesResponse],
    on: (addDatabase, js.Function1[/* params */ AddDatabaseEvent, Unit]) => Unit
  ): DatabaseApi = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), executeSQL = js.Any.fromFunction1(executeSQL), getDatabaseTableNames = js.Any.fromFunction1(getDatabaseTableNames), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[DatabaseApi]
  }
  
  extension [Self <: DatabaseApi](x: Self) {
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setExecuteSQL(value: ExecuteSQLRequest => js.Promise[ExecuteSQLResponse]): Self = StObject.set(x, "executeSQL", js.Any.fromFunction1(value))
    
    inline def setGetDatabaseTableNames(value: GetDatabaseTableNamesRequest => js.Promise[GetDatabaseTableNamesResponse]): Self = StObject.set(x, "getDatabaseTableNames", js.Any.fromFunction1(value))
    
    inline def setOn(value: (addDatabase, js.Function1[/* params */ AddDatabaseEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
