package typings.egg.mod

import typings.egg.anon.PartialEggLoggerOptions
import typings.egg.eggStrings.duplicate
import typings.egg.eggStrings.ignore
import typings.egg.eggStrings.redirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent egg.egg.RemoveSpecProp<egg-logger.egg-logger.EggLoggersOptions, 'type'> */
trait EggLoggerConfig extends StObject {
  
  var agentLogName: String
  
  /** allow debug log at prod, defaults to `false` */
  var allowDebugAtProd: js.UndefOr[Boolean] = js.undefined
  
  var appLogName: String
  
  var buffer: js.UndefOr[Boolean] = js.undefined
  
  var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.undefined
  
  var consoleLevel: js.UndefOr[typings.eggLogger.mod.LoggerLevel] = js.undefined
  
  var coreLogName: String
  
  /** custom config of coreLogger */
  var coreLogger: js.UndefOr[PartialEggLoggerOptions] = js.undefined
  
  var dir: String
  
  /** disable logger console after app ready. defaults to `false` on local and unittest env, others is `true`. */
  var disableConsoleAfterReady: js.UndefOr[Boolean] = js.undefined
  
  /** using performance.now() timer instead of Date.now() for more more precise milliseconds, defaults to `false`. e.g.: logger will set 1.456ms instead of 1ms. */
  var enablePerformanceTimer: js.UndefOr[Boolean] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var env: js.UndefOr[String] = js.undefined
  
  var eol: js.UndefOr[String] = js.undefined
  
  var errorLogName: String
  
  var level: js.UndefOr[typings.eggLogger.mod.LoggerLevel] = js.undefined
  
  var outputJSON: js.UndefOr[Boolean] = js.undefined
}
object EggLoggerConfig {
  
  inline def apply(agentLogName: String, appLogName: String, coreLogName: String, dir: String, errorLogName: String): EggLoggerConfig = {
    val __obj = js.Dynamic.literal(agentLogName = agentLogName.asInstanceOf[js.Any], appLogName = appLogName.asInstanceOf[js.Any], coreLogName = coreLogName.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], errorLogName = errorLogName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EggLoggerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EggLoggerConfig] (val x: Self) extends AnyVal {
    
    inline def setAgentLogName(value: String): Self = StObject.set(x, "agentLogName", value.asInstanceOf[js.Any])
    
    inline def setAllowDebugAtProd(value: Boolean): Self = StObject.set(x, "allowDebugAtProd", value.asInstanceOf[js.Any])
    
    inline def setAllowDebugAtProdUndefined: Self = StObject.set(x, "allowDebugAtProd", js.undefined)
    
    inline def setAppLogName(value: String): Self = StObject.set(x, "appLogName", value.asInstanceOf[js.Any])
    
    inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setConcentrateError(value: duplicate | redirect | ignore): Self = StObject.set(x, "concentrateError", value.asInstanceOf[js.Any])
    
    inline def setConcentrateErrorUndefined: Self = StObject.set(x, "concentrateError", js.undefined)
    
    inline def setConsoleLevel(value: typings.eggLogger.mod.LoggerLevel): Self = StObject.set(x, "consoleLevel", value.asInstanceOf[js.Any])
    
    inline def setConsoleLevelUndefined: Self = StObject.set(x, "consoleLevel", js.undefined)
    
    inline def setCoreLogName(value: String): Self = StObject.set(x, "coreLogName", value.asInstanceOf[js.Any])
    
    inline def setCoreLogger(value: PartialEggLoggerOptions): Self = StObject.set(x, "coreLogger", value.asInstanceOf[js.Any])
    
    inline def setCoreLoggerUndefined: Self = StObject.set(x, "coreLogger", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDisableConsoleAfterReady(value: Boolean): Self = StObject.set(x, "disableConsoleAfterReady", value.asInstanceOf[js.Any])
    
    inline def setDisableConsoleAfterReadyUndefined: Self = StObject.set(x, "disableConsoleAfterReady", js.undefined)
    
    inline def setEnablePerformanceTimer(value: Boolean): Self = StObject.set(x, "enablePerformanceTimer", value.asInstanceOf[js.Any])
    
    inline def setEnablePerformanceTimerUndefined: Self = StObject.set(x, "enablePerformanceTimer", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
    
    inline def setErrorLogName(value: String): Self = StObject.set(x, "errorLogName", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: typings.eggLogger.mod.LoggerLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setOutputJSON(value: Boolean): Self = StObject.set(x, "outputJSON", value.asInstanceOf[js.Any])
    
    inline def setOutputJSONUndefined: Self = StObject.set(x, "outputJSON", js.undefined)
  }
}
