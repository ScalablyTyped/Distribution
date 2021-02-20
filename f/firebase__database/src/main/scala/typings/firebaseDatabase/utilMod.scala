package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.queryMod.Query
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@firebase/database/dist/src/core/util/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "INTEGER_REGEXP_")
  @js.native
  val INTEGER_REGEXP_ : RegExp = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "LUIDGenerator")
  @js.native
  def LUIDGenerator(): Double = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "MAX_NAME")
  @js.native
  val MAX_NAME: /* "[MAX_NAME]" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "MIN_NAME")
  @js.native
  val MIN_NAME: /* "[MIN_NAME]" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "ObjectToUniqueKey")
  @js.native
  def ObjectToUniqueKey(obj: js.Any): String = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "beingCrawled")
  @js.native
  def beingCrawled(): Boolean = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "bindCallback")
  @js.native
  def bindCallback(callback: js.Function1[/* a */ js.Any, Unit]): js.Function1[/* a */ js.Any, Unit] = js.native
  @JSImport("@firebase/database/dist/src/core/util/util", "bindCallback")
  @js.native
  def bindCallback(callback: js.Function1[/* a */ js.Any, Unit], context: js.Object): js.Function1[/* a */ js.Any, Unit] = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "callUserCallback")
  @js.native
  def callUserCallback(callback: js.UndefOr[scala.Nothing], varArgs: js.Any*): Unit = js.native
  @JSImport("@firebase/database/dist/src/core/util/util", "callUserCallback")
  @js.native
  def callUserCallback(callback: js.Function, varArgs: js.Any*): Unit = js.native
  @JSImport("@firebase/database/dist/src/core/util/util", "callUserCallback")
  @js.native
  def callUserCallback(callback: Null, varArgs: js.Any*): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "doubleToIEEE754String")
  @js.native
  def doubleToIEEE754String(v: Double): String = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "each")
  @js.native
  def each(obj: js.Object, fn: js.Function2[/* k */ String, /* v */ js.Any, Unit]): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "enableLogging")
  @js.native
  def enableLogging(): Unit = js.native
  @JSImport("@firebase/database/dist/src/core/util/util", "enableLogging")
  @js.native
  def enableLogging(logger_ : js.UndefOr[scala.Nothing], persistent: Boolean): Unit = js.native
  @JSImport("@firebase/database/dist/src/core/util/util", "enableLogging")
  @js.native
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit]): Unit = js.native
  @JSImport("@firebase/database/dist/src/core/util/util", "enableLogging")
  @js.native
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit], persistent: Boolean): Unit = js.native
  @JSImport("@firebase/database/dist/src/core/util/util", "enableLogging")
  @js.native
  def enableLogging(logger_ : Boolean): Unit = js.native
  @JSImport("@firebase/database/dist/src/core/util/util", "enableLogging")
  @js.native
  def enableLogging(logger_ : Boolean, persistent: Boolean): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "error")
  @js.native
  def error(varArgs: String*): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "errorForServerCode")
  @js.native
  def errorForServerCode(code: String, query: Query): Error = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "exceptionGuard")
  @js.native
  def exceptionGuard(fn: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "executeWhenDOMReady")
  @js.native
  def executeWhenDOMReady(fn: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "exportPropGetter")
  @js.native
  def exportPropGetter(`object`: js.Object, name: String, fnGet: js.Function0[_]): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "fatal")
  @js.native
  def fatal(varArgs: String*): scala.Nothing = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "isChromeExtensionContentScript")
  @js.native
  def isChromeExtensionContentScript(): Boolean = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "isInvalidJSONNumber")
  @js.native
  def isInvalidJSONNumber(data: js.Any): Boolean = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "isWindowsStoreApp")
  @js.native
  def isWindowsStoreApp(): Boolean = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "log")
  @js.native
  def log(varArgs: js.Any*): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "logWrapper")
  @js.native
  def logWrapper(prefix: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "logger")
  @js.native
  def logger: (js.Function1[/* a */ String, Unit]) | Null = js.native
  @scala.inline
  def logger_=(x: (js.Function1[/* a */ String, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/database/dist/src/core/util/util", "nameCompare")
  @js.native
  def nameCompare(a: String, b: String): Double = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "requireKey")
  @js.native
  def requireKey(key: String, obj: StringDictionary[js.Any]): js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "setTimeoutNonBlocking")
  @js.native
  def setTimeoutNonBlocking(fn: js.Function0[Unit], time: Double): Double | js.Object = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "sha1")
  @js.native
  def sha1(str: String): String = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "splitStringBySize")
  @js.native
  def splitStringBySize(str: String, segsize: Double): js.Array[String] = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "stringCompare")
  @js.native
  def stringCompare(a: String, b: String): Double = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "tryParseInt")
  @js.native
  def tryParseInt(str: String): Double | Null = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "warn")
  @js.native
  def warn(varArgs: js.Any*): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "warnAboutUnsupportedMethod")
  @js.native
  def warnAboutUnsupportedMethod(methodName: String): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "warnIfPageIsSecure")
  @js.native
  def warnIfPageIsSecure(): Unit = js.native
}
