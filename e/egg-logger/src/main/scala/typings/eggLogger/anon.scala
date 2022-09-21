package typings.eggLogger

import typings.eggLogger.mod.EggCustomLoggerOptions
import typings.eggLogger.mod.EggLoggersOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CustomLogger extends StObject {
    
    var customLogger: js.UndefOr[EggCustomLoggerOptions] = js.undefined
    
    var logger: EggLoggersOptions
  }
  object CustomLogger {
    
    inline def apply(logger: EggLoggersOptions): CustomLogger = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomLogger]
    }
    
    extension [Self <: CustomLogger](x: Self) {
      
      inline def setCustomLogger(value: EggCustomLoggerOptions): Self = StObject.set(x, "customLogger", value.asInstanceOf[js.Any])
      
      inline def setCustomLoggerUndefined: Self = StObject.set(x, "customLogger", js.undefined)
      
      inline def setLogger(value: EggLoggersOptions): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    }
  }
  
  trait Excludes extends StObject {
    
    var excludes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Excludes {
    
    inline def apply(): Excludes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Excludes]
    }
    
    extension [Self <: Excludes](x: Self) {
      
      inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
    }
  }
}
