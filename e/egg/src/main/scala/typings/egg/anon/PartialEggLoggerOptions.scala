package typings.egg.anon

import typings.egg.eggStrings.duplicate
import typings.egg.eggStrings.ignore
import typings.egg.eggStrings.redirect
import typings.eggLogger.mod.LoggerLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<egg-logger.egg-logger.EggLoggerOptions> */
trait PartialEggLoggerOptions extends StObject {
  
  var allowDebugAtProd: js.UndefOr[Boolean] = js.undefined
  
  var buffer: js.UndefOr[Boolean] = js.undefined
  
  var concentrateError: js.UndefOr[duplicate | redirect | ignore] = js.undefined
  
  var consoleLevel: js.UndefOr[LoggerLevel] = js.undefined
  
  var contextFormatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var eol: js.UndefOr[String] = js.undefined
  
  var file: js.UndefOr[String] = js.undefined
  
  var formatter: js.UndefOr[js.Function1[/* meta */ js.UndefOr[js.Object], String]] = js.undefined
  
  var jsonFile: js.UndefOr[String] = js.undefined
  
  var level: js.UndefOr[LoggerLevel] = js.undefined
  
  var outputJSON: js.UndefOr[Boolean] = js.undefined
}
object PartialEggLoggerOptions {
  
  inline def apply(): PartialEggLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEggLoggerOptions]
  }
  
  extension [Self <: PartialEggLoggerOptions](x: Self) {
    
    inline def setAllowDebugAtProd(value: Boolean): Self = StObject.set(x, "allowDebugAtProd", value.asInstanceOf[js.Any])
    
    inline def setAllowDebugAtProdUndefined: Self = StObject.set(x, "allowDebugAtProd", js.undefined)
    
    inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setConcentrateError(value: duplicate | redirect | ignore): Self = StObject.set(x, "concentrateError", value.asInstanceOf[js.Any])
    
    inline def setConcentrateErrorUndefined: Self = StObject.set(x, "concentrateError", js.undefined)
    
    inline def setConsoleLevel(value: LoggerLevel): Self = StObject.set(x, "consoleLevel", value.asInstanceOf[js.Any])
    
    inline def setConsoleLevelUndefined: Self = StObject.set(x, "consoleLevel", js.undefined)
    
    inline def setContextFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "contextFormatter", js.Any.fromFunction1(value))
    
    inline def setContextFormatterUndefined: Self = StObject.set(x, "contextFormatter", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
    
    inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFormatter(value: /* meta */ js.UndefOr[js.Object] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setJsonFile(value: String): Self = StObject.set(x, "jsonFile", value.asInstanceOf[js.Any])
    
    inline def setJsonFileUndefined: Self = StObject.set(x, "jsonFile", js.undefined)
    
    inline def setLevel(value: LoggerLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setOutputJSON(value: Boolean): Self = StObject.set(x, "outputJSON", value.asInstanceOf[js.Any])
    
    inline def setOutputJSONUndefined: Self = StObject.set(x, "outputJSON", js.undefined)
  }
}
