package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.distNodeEsmSrcCoreViewEventRegistrationMod.QueryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreUtilUtilMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/util", "INTEGER_32_MAX")
  @js.native
  val INTEGER_32_MAX: /* 2147483647 */ Double = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/util", "INTEGER_32_MIN")
  @js.native
  val INTEGER_32_MIN: /* -2147483648 */ Double = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/util", "INTEGER_REGEXP_")
  @js.native
  val INTEGER_REGEXP_ : js.RegExp = js.native
  
  inline def LUIDGenerator(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("LUIDGenerator")().asInstanceOf[Double]
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/util", "MAX_NAME")
  @js.native
  val MAX_NAME: /* "[MAX_NAME]" */ String = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/util", "MIN_NAME")
  @js.native
  val MIN_NAME: /* "[MIN_NAME]" */ String = js.native
  
  inline def ObjectToUniqueKey(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectToUniqueKey")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def beingCrawled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("beingCrawled")().asInstanceOf[Boolean]
  
  inline def bindCallback(callback: js.Function1[/* a */ Any, Unit]): js.Function1[/* a */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, Unit]]
  inline def bindCallback(callback: js.Function1[/* a */ Any, Unit], context: js.Object): js.Function1[/* a */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindCallback")(callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ Any, Unit]]
  
  inline def callUserCallback(callback: js.Function, varArgs: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callUserCallback")(scala.List(callback.asInstanceOf[js.Any]).`++`(varArgs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def callUserCallback(callback: Null, varArgs: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callUserCallback")(scala.List(callback.asInstanceOf[js.Any]).`++`(varArgs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def callUserCallback(callback: Unit, varArgs: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callUserCallback")(scala.List(callback.asInstanceOf[js.Any]).`++`(varArgs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def doubleToIEEE754String(v: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleToIEEE754String")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def each(obj: js.Object, fn: js.Function2[/* k */ String, /* v */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")().asInstanceOf[Unit]
  inline def enableLogging(logger_ : js.Function1[/* a */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enableLogging(logger_ : js.Function1[/* a */ String, Unit], persistent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enableLogging(logger_ : Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enableLogging(logger_ : Boolean, persistent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enableLogging(logger_ : Unit, persistent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger_.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def error(varArgs: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(varArgs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def errorForServerCode(code: String, query: QueryContext): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("errorForServerCode")(code.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def exceptionGuard(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exceptionGuard")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def executeWhenDOMReady(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("executeWhenDOMReady")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def exportPropGetter(`object`: js.Object, name: String, fnGet: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exportPropGetter")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fnGet.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fatal(varArgs: String*): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(varArgs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[scala.Nothing]
  
  inline def isChromeExtensionContentScript(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChromeExtensionContentScript")().asInstanceOf[Boolean]
  
  inline def isInvalidJSONNumber(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInvalidJSONNumber")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isWindowsStoreApp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindowsStoreApp")().asInstanceOf[Boolean]
  
  inline def log(varArgs: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(varArgs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def logWrapper(prefix: String): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("logWrapper")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/util", "logger")
  @js.native
  def logger: (js.Function1[/* a */ String, Unit]) | Null = js.native
  inline def logger_=(x: (js.Function1[/* a */ String, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
  
  inline def nameCompare(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nameCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def requireKey(key: String, obj: StringDictionary[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requireKey")(key.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setTimeoutNonBlocking(fn: js.Function0[Unit], time: Double): Double | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeoutNonBlocking")(fn.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Double | js.Object]
  
  inline def sha1(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def splitStringBySize(str: String, segsize: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitStringBySize")(str.asInstanceOf[js.Any], segsize.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def stringCompare(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("stringCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def tryParseInt(str: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParseInt")(str.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  inline def warn(varArgs: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(varArgs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def warnAboutUnsupportedMethod(methodName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnAboutUnsupportedMethod")(methodName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warnIfPageIsSecure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnIfPageIsSecure")().asInstanceOf[Unit]
}
