package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.queryMod.Query
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  val INTEGER_REGEXP_ : RegExp = js.native
  val MAX_NAME: /* "[MAX_NAME]" */ String = js.native
  val MIN_NAME: /* "[MIN_NAME]" */ String = js.native
  var logger: (js.Function1[/* a */ String, Unit]) | Null = js.native
  def LUIDGenerator(): Double = js.native
  def ObjectToUniqueKey(obj: js.Any): String = js.native
  def beingCrawled(): Boolean = js.native
  def bindCallback(callback: js.Function1[/* a */ js.Any, Unit]): js.Function = js.native
  def bindCallback(callback: js.Function1[/* a */ js.Any, Unit], context: js.Object): js.Function = js.native
  def callUserCallback(callback: js.UndefOr[scala.Nothing], varArgs: js.Any*): Unit = js.native
  def callUserCallback(callback: js.Function, varArgs: js.Any*): Unit = js.native
  def callUserCallback(callback: Null, varArgs: js.Any*): Unit = js.native
  def doubleToIEEE754String(v: Double): String = js.native
  def each(obj: js.Object, fn: js.Function2[/* k */ String, /* v */ js.Any, Unit]): Unit = js.native
  def enableLogging(): Unit = js.native
  def enableLogging(logger_ : js.UndefOr[scala.Nothing], persistent: Boolean): Unit = js.native
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit]): Unit = js.native
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit], persistent: Boolean): Unit = js.native
  def enableLogging(logger_ : Boolean): Unit = js.native
  def enableLogging(logger_ : Boolean, persistent: Boolean): Unit = js.native
  def error(varArgs: String*): Unit = js.native
  def errorForServerCode(code: String, query: Query): Error = js.native
  def exceptionGuard(fn: js.Function0[Unit]): Unit = js.native
  def executeWhenDOMReady(fn: js.Function0[Unit]): Unit = js.native
  def exportPropGetter(`object`: js.Object, name: String, fnGet: js.Function0[_]): Unit = js.native
  def fatal(varArgs: String*): scala.Nothing = js.native
  def isChromeExtensionContentScript(): Boolean = js.native
  def isInvalidJSONNumber(data: js.Any): Boolean = js.native
  def isWindowsStoreApp(): Boolean = js.native
  def log(varArgs: js.Any*): Unit = js.native
  def logWrapper(prefix: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def nameCompare(a: String, b: String): Double = js.native
  def requireKey(key: String, obj: StringDictionary[js.Any]): js.Any = js.native
  def setTimeoutNonBlocking(fn: js.Function, time: Double): Double | js.Object = js.native
  def sha1(str: String): String = js.native
  def splitStringBySize(str: String, segsize: Double): js.Array[String] = js.native
  def stringCompare(a: String, b: String): Double = js.native
  def tryParseInt(str: String): Double | Null = js.native
  def warn(varArgs: js.Any*): Unit = js.native
  def warnAboutUnsupportedMethod(methodName: String): Unit = js.native
  def warnIfPageIsSecure(): Unit = js.native
}

