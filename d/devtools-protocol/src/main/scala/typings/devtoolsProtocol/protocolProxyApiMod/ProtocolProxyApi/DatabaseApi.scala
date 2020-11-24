package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.addDatabase
import typings.devtoolsProtocol.mod.Protocol.Database.AddDatabaseEvent
import typings.devtoolsProtocol.mod.Protocol.Database.ExecuteSQLRequest
import typings.devtoolsProtocol.mod.Protocol.Database.ExecuteSQLResponse
import typings.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesRequest
import typings.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseApi extends js.Object {
  
  /**
    * Disables database tracking, prevents database events from being sent to the client.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables database tracking, database events will now be delivered to the client.
    */
  def enable(): js.Promise[Unit] = js.native
  
  def executeSQL(params: ExecuteSQLRequest): js.Promise[ExecuteSQLResponse] = js.native
  
  def getDatabaseTableNames(params: GetDatabaseTableNamesRequest): js.Promise[GetDatabaseTableNamesResponse] = js.native
  
  @JSName("on")
  def on_addDatabase(event: addDatabase, listener: js.Function1[/* params */ AddDatabaseEvent, Unit]): Unit = js.native
}
object DatabaseApi {
  
  @scala.inline
  def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    executeSQL: ExecuteSQLRequest => js.Promise[ExecuteSQLResponse],
    getDatabaseTableNames: GetDatabaseTableNamesRequest => js.Promise[GetDatabaseTableNamesResponse],
    on: (addDatabase, js.Function1[/* params */ AddDatabaseEvent, Unit]) => Unit
  ): DatabaseApi = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), executeSQL = js.Any.fromFunction1(executeSQL), getDatabaseTableNames = js.Any.fromFunction1(getDatabaseTableNames), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[DatabaseApi]
  }
  
  @scala.inline
  implicit class DatabaseApiOps[Self <: DatabaseApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisable(value: () => js.Promise[Unit]): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => js.Promise[Unit]): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecuteSQL(value: ExecuteSQLRequest => js.Promise[ExecuteSQLResponse]): Self = this.set("executeSQL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDatabaseTableNames(value: GetDatabaseTableNamesRequest => js.Promise[GetDatabaseTableNamesResponse]): Self = this.set("getDatabaseTableNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: (addDatabase, js.Function1[/* params */ AddDatabaseEvent, Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
