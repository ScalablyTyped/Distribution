package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.eslintMod.CLIEngineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLintReporterOptionsMod {
  
  trait EsLintReporterOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var files: String | js.Array[String]
    
    var memoryLimit: js.UndefOr[Double] = js.undefined
    
    var options: js.UndefOr[CLIEngineOptions] = js.undefined
  }
  object EsLintReporterOptions {
    
    inline def apply(files: String | js.Array[String]): EsLintReporterOptions = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsLintReporterOptions]
    }
    
    extension [Self <: EsLintReporterOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setMemoryLimit(value: Double): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
      
      inline def setMemoryLimitUndefined: Self = StObject.set(x, "memoryLimit", js.undefined)
      
      inline def setOptions(value: CLIEngineOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
