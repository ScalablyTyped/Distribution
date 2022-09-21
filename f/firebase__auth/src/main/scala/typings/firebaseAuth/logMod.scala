package typings.firebaseAuth

import typings.firebaseLogger.srcLoggerMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/core/util/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/cordova/src/core/util/log", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.firebaseLogger.srcLoggerMod.LogLevel & Double] = js.native
    
    /* 0 */ val DEBUG: typings.firebaseLogger.srcLoggerMod.LogLevel.DEBUG & Double = js.native
    
    /* 4 */ val ERROR: typings.firebaseLogger.srcLoggerMod.LogLevel.ERROR & Double = js.native
    
    /* 2 */ val INFO: typings.firebaseLogger.srcLoggerMod.LogLevel.INFO & Double = js.native
    
    /* 5 */ val SILENT: typings.firebaseLogger.srcLoggerMod.LogLevel.SILENT & Double = js.native
    
    /* 1 */ val VERBOSE: typings.firebaseLogger.srcLoggerMod.LogLevel.VERBOSE & Double = js.native
    
    /* 3 */ val WARN: typings.firebaseLogger.srcLoggerMod.LogLevel.WARN & Double = js.native
  }
  
  inline def getLogLevel(): LogLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("_getLogLevel")().asInstanceOf[LogLevel]
  
  inline def logDebug(msg: String, args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_logDebug")(List(msg.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def logError(msg: String, args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_logError")(List(msg.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def setLogLevel(newLevel: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setLogLevel")(newLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
