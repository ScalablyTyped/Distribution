package typings
package atFirebaseDatabaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/util", JSImport.Namespace)
@js.native
object distSrcCoreUtilUtilMod extends js.Object {
  val `INTEGER_REGEXP_`: stdLib.RegExp = js.native
  val MAX_NAME: /* [MAX_NAME] */ java.lang.String = js.native
  val MIN_NAME: /* [MIN_NAME] */ java.lang.String = js.native
  var logger: (js.Function1[/* a */ java.lang.String, scala.Unit]) | scala.Null = js.native
  def LUIDGenerator(): scala.Double = js.native
  def ObjectToUniqueKey(obj: js.Any): java.lang.String = js.native
  def beingCrawled(): scala.Boolean = js.native
  def bindCallback(callback: js.Function1[/* a */ js.Any, scala.Unit]): js.Function = js.native
  def bindCallback(callback: js.Function1[/* a */ js.Any, scala.Unit], context: js.Object): js.Function = js.native
  def callUserCallback(): scala.Unit = js.native
  def callUserCallback(callback: js.Function, var_args: js.Any*): scala.Unit = js.native
  def doubleToIEEE754String(v: scala.Double): java.lang.String = js.native
  def each(
    obj: js.Array[_],
    fn: js.Function2[/* v */ js.UndefOr[js.Any], /* k */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def each(
    obj: js.Object,
    fn: js.Function2[/* v */ js.UndefOr[js.Any], /* k */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def enableLogging(): scala.Unit = js.native
  def enableLogging(`logger_`: js.Function1[/* a */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def enableLogging(`logger_`: js.Function1[/* a */ java.lang.String, scala.Unit], persistent: scala.Boolean): scala.Unit = js.native
  def enableLogging(`logger_`: scala.Boolean): scala.Unit = js.native
  def enableLogging(`logger_`: scala.Boolean, persistent: scala.Boolean): scala.Unit = js.native
  def error(var_args: java.lang.String*): scala.Unit = js.native
  def errorForServerCode(code: java.lang.String, query: atFirebaseDatabaseLib.distSrcApiQueryMod.Query): stdLib.Error = js.native
  def exceptionGuard(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def executeWhenDOMReady(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def exportPropGetter(`object`: js.Object, name: java.lang.String, fnGet: js.Function0[_]): scala.Unit = js.native
  def fatal(var_args: java.lang.String*): scala.Nothing = js.native
  def isChromeExtensionContentScript(): scala.Boolean = js.native
  def isInvalidJSONNumber(data: js.Any): scala.Boolean = js.native
  def isWindowsStoreApp(): scala.Boolean = js.native
  def log(var_args: java.lang.String*): scala.Unit = js.native
  def logWrapper(prefix: java.lang.String): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def nameCompare(a: java.lang.String, b: java.lang.String): scala.Double = js.native
  def requireKey(key: java.lang.String, obj: ScalablyTyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def setTimeoutNonBlocking(fn: js.Function, time: scala.Double): scala.Double | js.Object = js.native
  def sha1(str: java.lang.String): java.lang.String = js.native
  def splitStringBySize(str: java.lang.String, segsize: scala.Double): js.Array[java.lang.String] = js.native
  def stringCompare(a: java.lang.String, b: java.lang.String): scala.Double = js.native
  def tryParseInt(str: java.lang.String): scala.Double = js.native
  def warn(var_args: js.Any*): scala.Unit = js.native
  def warnAboutUnsupportedMethod(methodName: java.lang.String): scala.Unit = js.native
  def warnIfPageIsSecure(): scala.Unit = js.native
}

