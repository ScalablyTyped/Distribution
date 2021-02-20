package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.eslintMod.CLIEngineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLintReporterOptionsMod {
  
  @js.native
  trait EsLintReporterOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var files: String | js.Array[String] = js.native
    
    var memoryLimit: js.UndefOr[Double] = js.native
    
    var options: js.UndefOr[CLIEngineOptions] = js.native
  }
  object EsLintReporterOptions {
    
    @scala.inline
    def apply(files: String | js.Array[String]): EsLintReporterOptions = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsLintReporterOptions]
    }
    
    @scala.inline
    implicit class EsLintReporterOptionsMutableBuilder[Self <: EsLintReporterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setMemoryLimit(value: Double): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryLimitUndefined: Self = StObject.set(x, "memoryLimit", js.undefined)
      
      @scala.inline
      def setOptions(value: CLIEngineOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
