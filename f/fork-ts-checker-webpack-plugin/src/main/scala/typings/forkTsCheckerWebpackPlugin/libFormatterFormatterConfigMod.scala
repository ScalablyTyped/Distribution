package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libFormatterFormatterMod.Formatter
import typings.forkTsCheckerWebpackPlugin.libFormatterFormatterMod.FormatterPathType
import typings.forkTsCheckerWebpackPlugin.libFormatterFormatterOptionsMod.FormatterOptions
import typings.forkTsCheckerWebpackPlugin.libIssueIssueMod.Issue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterFormatterConfigMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/formatter-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFormatterConfig(): FormatterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatterConfig")().asInstanceOf[FormatterConfig]
  inline def createFormatterConfig(options: FormatterOptions): FormatterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatterConfig")(options.asInstanceOf[js.Any]).asInstanceOf[FormatterConfig]
  
  trait FormatterConfig extends StObject {
    
    def format(issue: Issue): String
    @JSName("format")
    var format_Original: Formatter
    
    var pathType: FormatterPathType
  }
  object FormatterConfig {
    
    inline def apply(format: /* issue */ Issue => String, pathType: FormatterPathType): FormatterConfig = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), pathType = pathType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatterConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatterConfig] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: /* issue */ Issue => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setPathType(value: FormatterPathType): Self = StObject.set(x, "pathType", value.asInstanceOf[js.Any])
    }
  }
}
