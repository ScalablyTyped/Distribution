package typings
package expressDashMysqlDashSessionLib.expressDashMysqlDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MySQLStore extends js.Object {
  def clear(): scala.Unit = js.native
  def clear(callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def clearExpirationInterval(): scala.Unit = js.native
  def clearExpiredSessions(): scala.Unit = js.native
  def clearExpiredSessions(callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def clone(`object`: js.Any): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def createDatabaseTable(): scala.Unit = js.native
  def createDatabaseTable(callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def default(`object`: js.Any, defaultValues: js.Any): scala.Unit = js.native
  def default(`object`: js.Any, defaultValues: js.Any, options: js.Any): scala.Unit = js.native
  def destroy(sessionId: java.lang.String): scala.Unit = js.native
  def destroy(sessionId: java.lang.String, callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def get(sessionId: java.lang.String): scala.Unit = js.native
  def get(
    sessionId: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* session */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def isObject(value: js.Any): scala.Unit = js.native
  def length(): scala.Unit = js.native
  def length(callback: js.Function2[/* error */ js.Any, /* count */ js.Any, scala.Unit]): scala.Unit = js.native
  def set(sessionId: java.lang.String, data: js.Any): scala.Unit = js.native
  def set(sessionId: java.lang.String, data: js.Any, callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def setDefaultOptions(): scala.Unit = js.native
  def setExpirationInterval(interval: scala.Double): scala.Unit = js.native
  def touch(sessionId: java.lang.String, data: js.Any): scala.Unit = js.native
  def touch(sessionId: java.lang.String, data: js.Any, callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
}

