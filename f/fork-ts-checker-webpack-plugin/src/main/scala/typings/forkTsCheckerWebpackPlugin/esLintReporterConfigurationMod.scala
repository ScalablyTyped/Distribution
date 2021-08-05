package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.esLintReporterOptionsMod.EsLintReporterOptions
import typings.forkTsCheckerWebpackPlugin.eslintMod.CLIEngineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLintReporterConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/eslint-reporter/EsLintReporterConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEsLintReporterConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): EsLintReporterConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("createEsLintReporterConfiguration")(compiler.asInstanceOf[js.Any]).asInstanceOf[EsLintReporterConfiguration]
  inline def createEsLintReporterConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    options: EsLintReporterOptions
  ): EsLintReporterConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("createEsLintReporterConfiguration")(compiler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EsLintReporterConfiguration]
  
  trait EsLintReporterConfiguration extends StObject {
    
    var enabled: Boolean
    
    var files: js.Array[String]
    
    var memoryLimit: Double
    
    var options: CLIEngineOptions
  }
  object EsLintReporterConfiguration {
    
    inline def apply(enabled: Boolean, files: js.Array[String], memoryLimit: Double, options: CLIEngineOptions): EsLintReporterConfiguration = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsLintReporterConfiguration]
    }
    
    extension [Self <: EsLintReporterConfiguration](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setMemoryLimit(value: Double): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: CLIEngineOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
