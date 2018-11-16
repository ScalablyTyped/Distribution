package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod.aNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agent extends js.Object {
  var currentTransaction: js.Any = js.native
  var logger: js.Any = js.native
  def addFilter(filter: js.Function1[/* payload */ js.Any, _]): scala.Unit = js.native
  def addTags(tags: js.Any): js.Any = js.native
  def captureError(error: java.lang.String): scala.Unit = js.native
  def captureError(error: java.lang.String, options: js.Object): scala.Unit = js.native
  def captureError(
    error: java.lang.String,
    options: js.Object,
    callback: js.Function1[/* err */ js.UndefOr[js.Any], _]
  ): scala.Unit = js.native
  def captureError(error: js.Object): scala.Unit = js.native
  def captureError(error: js.Object, options: js.Object): scala.Unit = js.native
  def captureError(error: js.Object, options: js.Object, callback: js.Function1[/* err */ js.UndefOr[js.Any], _]): scala.Unit = js.native
  def captureError(error: stdLib.Error): scala.Unit = js.native
  def captureError(error: stdLib.Error, options: js.Object): scala.Unit = js.native
  def captureError(error: stdLib.Error, options: js.Object, callback: js.Function1[/* err */ js.UndefOr[js.Any], _]): scala.Unit = js.native
  def endTransaction(): js.Any = js.native
  def endTransaction(result: js.Any): js.Any = js.native
  def flush(): js.Any = js.native
  def flush(callback: js.Any): js.Any = js.native
  def handleUncaughtExceptions(): js.Any = js.native
  def handleUncaughtExceptions(callback: js.Function1[/* err */ stdLib.Error, _]): js.Any = js.native
  def isStarted(): scala.Boolean = js.native
  def lambda(`type`: js.Any): js.Any = js.native
  def lambda(`type`: js.Any, handler: js.Any): js.Any = js.native
  def setCustomContext(context: js.Any): scala.Boolean = js.native
  def setTag(name: java.lang.String, value: java.lang.String): js.Any = js.native
  def setTransactionName(name: java.lang.String): js.Any = js.native
  def setUserContext(context: Context): scala.Boolean = js.native
  def start(): Agent = js.native
  def start(opts: AgentOptions): Agent = js.native
  def startSpan(): js.Any = js.native
  def startSpan(name: java.lang.String): js.Any = js.native
  def startSpan(name: java.lang.String, `type`: js.Any): js.Any = js.native
  def startTransaction(): js.Any = js.native
  def startTransaction(name: java.lang.String): js.Any = js.native
  def startTransaction(name: java.lang.String, `type`: java.lang.String): js.Any = js.native
}

