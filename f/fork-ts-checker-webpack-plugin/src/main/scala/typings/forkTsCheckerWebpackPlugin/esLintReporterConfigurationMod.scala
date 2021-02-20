package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.esLintReporterOptionsMod.EsLintReporterOptions
import typings.forkTsCheckerWebpackPlugin.eslintMod.CLIEngineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLintReporterConfigurationMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/eslint-reporter/EsLintReporterConfiguration", "createEsLintReporterConfiguration")
  @js.native
  def createEsLintReporterConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): EsLintReporterConfiguration = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/eslint-reporter/EsLintReporterConfiguration", "createEsLintReporterConfiguration")
  @js.native
  def createEsLintReporterConfiguration(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    options: EsLintReporterOptions
  ): EsLintReporterConfiguration = js.native
  
  @js.native
  trait EsLintReporterConfiguration extends StObject {
    
    var enabled: Boolean = js.native
    
    var files: js.Array[String] = js.native
    
    var memoryLimit: Double = js.native
    
    var options: CLIEngineOptions = js.native
  }
  object EsLintReporterConfiguration {
    
    @scala.inline
    def apply(enabled: Boolean, files: js.Array[String], memoryLimit: Double, options: CLIEngineOptions): EsLintReporterConfiguration = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], memoryLimit = memoryLimit.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsLintReporterConfiguration]
    }
    
    @scala.inline
    implicit class EsLintReporterConfigurationMutableBuilder[Self <: EsLintReporterConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setMemoryLimit(value: Double): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: CLIEngineOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
