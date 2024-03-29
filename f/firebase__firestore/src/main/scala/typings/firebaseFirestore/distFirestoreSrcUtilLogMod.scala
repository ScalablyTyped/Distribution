package typings.firebaseFirestore

import typings.firebaseLogger.distSrcLoggerMod.LogLevel
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcUtilLogMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/util/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/util/log", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.firebaseLogger.distSrcLoggerMod.LogLevel & Double] = js.native
    
    /* 0 */ val DEBUG: typings.firebaseLogger.distSrcLoggerMod.LogLevel.DEBUG & Double = js.native
    
    /* 4 */ val ERROR: typings.firebaseLogger.distSrcLoggerMod.LogLevel.ERROR & Double = js.native
    
    /* 2 */ val INFO: typings.firebaseLogger.distSrcLoggerMod.LogLevel.INFO & Double = js.native
    
    /* 5 */ val SILENT: typings.firebaseLogger.distSrcLoggerMod.LogLevel.SILENT & Double = js.native
    
    /* 1 */ val VERBOSE: typings.firebaseLogger.distSrcLoggerMod.LogLevel.VERBOSE & Double = js.native
    
    /* 3 */ val WARN: typings.firebaseLogger.distSrcLoggerMod.LogLevel.WARN & Double = js.native
  }
  
  inline def getLogLevel(): LogLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogLevel")().asInstanceOf[LogLevel]
  
  inline def logDebug(msg: String, obj: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logDebug")(scala.List(msg.asInstanceOf[js.Any]).`++`(obj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def logError(msg: String, obj: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logError")(scala.List(msg.asInstanceOf[js.Any]).`++`(obj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def logWarn(msg: String, obj: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logWarn")(scala.List(msg.asInstanceOf[js.Any]).`++`(obj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def setLogLevel(logLevel: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
