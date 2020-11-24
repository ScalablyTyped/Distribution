package typings.expressMysqlSession.mod

import typings.expressSession.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MySQLStoreClass extends Store {
  
  @JSName("all")
  def all_MMySQLStoreClass(): Unit = js.native
  @JSName("all")
  def all_MMySQLStoreClass(callback: js.Function2[/* error */ js.Any, /* sessions */ js.Any, Unit]): Unit = js.native
  
  def clearExpirationInterval(): Unit = js.native
  
  def clearExpiredSessions(): Unit = js.native
  def clearExpiredSessions(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  @JSName("clear")
  def clear_MMySQLStoreClass(): Unit = js.native
  @JSName("clear")
  def clear_MMySQLStoreClass(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  def createDatabaseTable(): Unit = js.native
  def createDatabaseTable(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def get(sessionId: String): Unit = js.native
  
  @JSName("length")
  def length_MMySQLStoreClass(): Unit = js.native
  @JSName("length")
  def length_MMySQLStoreClass(callback: js.Function2[/* error */ js.Any, /* count */ js.Any, Unit]): Unit = js.native
  
  def query(sql: String, params: js.Any): Unit = js.native
  def query(
    sql: String,
    params: js.Any,
    callback: js.Function3[/* error */ js.Any, /* rows */ js.Any, /* fields */ js.Any, Unit]
  ): Unit = js.native
  
  def set(sessionId: String, data: js.Any): Unit = js.native
  def set(sessionId: String, data: js.Any, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def setDefaultOptions(): Unit = js.native
  
  def setExpirationInterval(interval: Double): Unit = js.native
  
  def setOptions(options: Options): Unit = js.native
  
  @JSName("touch")
  def touch_MMySQLStoreClass(sessionId: String, data: js.Any): Unit = js.native
  @JSName("touch")
  def touch_MMySQLStoreClass(sessionId: String, data: js.Any, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def validateOptions(options: Options): Unit = js.native
}
