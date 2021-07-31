package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.queryMod.Query
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@firebase/database/dist/src/core/util/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "INTEGER_REGEXP_")
  @js.native
  val INTEGER_REGEXP_ : RegExp = js.native
  
  @scala.inline
  def LUIDGenerator(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("LUIDGenerator")().asInstanceOf[Double]
  
  @JSImport("@firebase/database/dist/src/core/util/util", "MAX_NAME")
  @js.native
  val MAX_NAME: /* "[MAX_NAME]" */ String = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/util", "MIN_NAME")
  @js.native
  val MIN_NAME: /* "[MIN_NAME]" */ String = js.native
  
  @scala.inline
  def ObjectToUniqueKey(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectToUniqueKey")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def beingCrawled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("beingCrawled")().asInstanceOf[Boolean]
  
  @scala.inline
  def bindCallback(callback: js.Function1[/* a */ js.Any, Unit]): js.Function1[/* a */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ js.Any, Unit]]
  @scala.inline
  def bindCallback(callback: js.Function1[/* a */ js.Any, Unit], context: js.Object): js.Function1[/* a */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ js.Any, Unit]]
  
  @scala.inline
  def callUserCallback(callback: js.Function, varArgs: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callUserCallback")(callback.asInstanceOf[js.Any], varArgs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def callUserCallback(callback: Null, varArgs: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callUserCallback")(callback.asInstanceOf[js.Any], varArgs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def callUserCallback(callback: Unit, varArgs: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callUserCallback")(callback.asInstanceOf[js.Any], varArgs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def doubleToIEEE754String(v: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleToIEEE754String")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def each(obj: js.Object, fn: js.Function2[/* k */ String, /* v */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def enableLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")().asInstanceOf[Unit]
  @scala.inline
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit], persistent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def enableLogging(logger_ : Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def enableLogging(logger_ : Boolean, persistent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def enableLogging(logger_ : Unit, persistent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def error(varArgs: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(varArgs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def errorForServerCode(code: String, query: Query): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("errorForServerCode")(code.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  @scala.inline
  def exceptionGuard(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exceptionGuard")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def executeWhenDOMReady(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("executeWhenDOMReady")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def exportPropGetter(`object`: js.Object, name: String, fnGet: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exportPropGetter")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fnGet.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fatal(varArgs: String*): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(varArgs.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def isChromeExtensionContentScript(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChromeExtensionContentScript")().asInstanceOf[Boolean]
  
  @scala.inline
  def isInvalidJSONNumber(data: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInvalidJSONNumber")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isWindowsStoreApp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindowsStoreApp")().asInstanceOf[Boolean]
  
  @scala.inline
  def log(varArgs: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(varArgs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def logWrapper(prefix: String): js.Function1[/* repeated */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("logWrapper")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, Unit]]
  
  @JSImport("@firebase/database/dist/src/core/util/util", "logger")
  @js.native
  def logger: (js.Function1[/* a */ String, Unit]) | Null = js.native
  @scala.inline
  def logger_=(x: (js.Function1[/* a */ String, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def nameCompare(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nameCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def requireKey(key: String, obj: StringDictionary[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requireKey")(key.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def setTimeoutNonBlocking(fn: js.Function0[Unit], time: Double): Double | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeoutNonBlocking")(fn.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Double | js.Object]
  
  @scala.inline
  def sha1(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def splitStringBySize(str: String, segsize: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitStringBySize")(str.asInstanceOf[js.Any], segsize.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def stringCompare(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("stringCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def tryParseInt(str: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParseInt")(str.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  @scala.inline
  def warn(varArgs: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(varArgs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def warnAboutUnsupportedMethod(methodName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnAboutUnsupportedMethod")(methodName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def warnIfPageIsSecure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnIfPageIsSecure")().asInstanceOf[Unit]
}
