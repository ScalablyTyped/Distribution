package typings.expressMysqlSession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MySQLStoreClass extends js.Object {
  def all(): Unit = js.native
  def all(callback: js.Function2[/* error */ js.Any, /* sessions */ js.Any, Unit]): Unit = js.native
  def clear(): Unit = js.native
  def clear(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def clearExpirationInterval(): Unit = js.native
  def clearExpiredSessions(): Unit = js.native
  def clearExpiredSessions(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def createDatabaseTable(): Unit = js.native
  def createDatabaseTable(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def destroy(sessionId: String): Unit = js.native
  def destroy(sessionId: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def get(sessionId: String): Unit = js.native
  def get(sessionId: String, callback: js.Function2[/* error */ js.Any, /* session */ js.Any, Unit]): Unit = js.native
  def length(): Unit = js.native
  def length(callback: js.Function2[/* error */ js.Any, /* count */ js.Any, Unit]): Unit = js.native
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
  def touch(sessionId: String, data: js.Any): Unit = js.native
  def touch(sessionId: String, data: js.Any, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def validateOptions(options: Options): Unit = js.native
}

