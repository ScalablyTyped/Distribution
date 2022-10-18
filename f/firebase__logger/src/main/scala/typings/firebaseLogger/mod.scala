package typings.firebaseLogger

import typings.firebaseLogger.distSrcLoggerMod.LogCallback
import typings.firebaseLogger.distSrcLoggerMod.LogLevel
import typings.firebaseLogger.distSrcLoggerMod.LogLevelString
import typings.firebaseLogger.distSrcLoggerMod.LogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/logger", "LogLevel")
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
  
  @JSImport("@firebase/logger", "Logger")
  @js.native
  open class Logger protected ()
    extends typings.firebaseLogger.distSrcLoggerMod.Logger {
    /**
      * Gives you an instance of a Logger to capture messages according to
      * Firebase's logging scheme.
      *
      * @param name The name that the logs will be associated with
      */
    def this(name: String) = this()
  }
  
  inline def setLogLevel(level: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setLogLevel(level: LogLevelString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUserLogHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")().asInstanceOf[Unit]
  inline def setUserLogHandler(logCallback: Null, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUserLogHandler(logCallback: LogCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")(logCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setUserLogHandler(logCallback: LogCallback, options: LogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserLogHandler")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
